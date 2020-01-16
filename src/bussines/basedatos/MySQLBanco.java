/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines.basedatos;

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
    
    public boolean validarSesion(String cedula, String password) throws Exception {
        boolean exito = false;
        try {
            String selectStatement = "SELECT * FROM banco b WHERE b.cedula='" + cedula + "' AND b.password='" + password + "'";
            PreparedStatement prepStmt = conn.prepareStatement(selectStatement);
            ResultSet rs = prepStmt.executeQuery();
            exito = rs.first();
        } catch (SQLException e) {
            System.out.println("Pero que ha pasao");
        } finally {
            if (!keepOpenConn) {
                if (conn != null) {
                    conn.close();
                }
            }
        }

        return exito;
    }
}
