/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines.basedatos;

import bussines.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author bsav157
 */
public class MySQLBanco {

    private Connection conn;
    private String DRIVER = "com.mysql.jdbc.Driver";
    private String DBURL = "jdbc:mysql://127.0.0.1:3306/prueba";
    private String USER = "prueba";
    private String PASS = "probando";
    private boolean keepOpenConn;

    public MySQLBanco(boolean keepOpenConn) {
        this.keepOpenConn = keepOpenConn;
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DBURL, USER, PASS);
            System.out.println("Conexion establecida con equipo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Persona validarSesion(String cedula, String password) throws Exception {
        Persona p = null;
        try {
            String selectStatement = "SELECT * FROM banco b WHERE b.cedula='" + cedula + "' AND b.password='" + password + "'";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);
            ResultSet rs = prepStmt.executeQuery();
            if (rs.first()) {
                p = new Persona(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
                System.out.println(p);
            }
        } catch (SQLException e) {
            System.out.println("Pero que ha pasao");
        } finally {
            if (!keepOpenConn) {
                if (conn != null) {
//                    conn.close();
                }
            }
        }
        return p;
    }

    public boolean retirar(double monto, String cedula, boolean con) throws Exception {
        boolean exito = false;
        try {
            String selectStatement = "SELECT * FROM banco b WHERE b.cedula='" + cedula + "'";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);
            ResultSet rs = prepStmt.executeQuery();
            rs.first();
            if (rs.getDouble(3) >= monto) {
                exito = true;
                double montoNuevo = rs.getDouble(3) - monto;
                String update = "UPDATE banco SET saldo='" + montoNuevo + "' WHERE cedula='" + cedula + "'";
                System.out.println(update);
                PreparedStatement stmt = conn.prepareStatement(update);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(con){
                if (!keepOpenConn) {
                    if (conn != null) {
//                        conn.close();
                    }
                } 
            }
            
        }
        return exito;
    }

    public boolean depositar(double monto, String cedula, String cuenta) throws Exception {
        boolean exito = false;
        try {
            String stmt = "SELECT * FROM banco WHERE numeroCuenta='" + cuenta + "'";
            PreparedStatement prepStmt = conn.prepareStatement(stmt);
            ResultSet rs = prepStmt.executeQuery();
            if (rs.first()) {
                double montoAntiguo = rs.getDouble(3);
                exito = retirar(monto, cedula, false);
                if (exito) {
                    double montoNuevo = montoAntiguo + monto;
                    String update = "UPDATE banco SET saldo='" + montoNuevo + "' WHERE numeroCuenta='" + cuenta + "'";
                    System.out.println(update);
                    PreparedStatement stmt2 = conn.prepareStatement(update);
                    stmt2.executeUpdate();
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (!keepOpenConn) {
                if (conn != null) {
//                    conn.close();
                }
            }
        }
        return exito;
    }
}
