/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines;

import bussines.basedatos.MySQLBanco;

/**
 *
 * @author bsav157
 */
public class Negocio {
    
    private MySQLBanco mysql;
    
    public Negocio(){
        mysql = new MySQLBanco(false);
    }
    
    public Persona validarSesion(String usuario, char[] pass) throws Exception {
        String p = "";
        for (int i = 0; i < pass.length; i++) {
            p += pass[i];
        }
        return mysql.validarSesion(usuario, p);   
    }
    
    public boolean retirar(double monto, String cedula, boolean con) throws Exception {
        return mysql.retirar(monto, cedula, con);
    }
    
    public boolean depositar(double monto, String cedula, String cuenta) throws Exception{
        return mysql.depositar(monto, cedula, cuenta);
    }
}
