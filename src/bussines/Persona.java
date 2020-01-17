/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussines;

/**
 *
 * @author bsav157
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private double saldo;
    private String numeroCuenta;

    public Persona(String nombre, String cedula, double saldo, String numeroCuenta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", cedula=" + cedula + ", saldo=" + saldo + ", numeroCuenta=" + numeroCuenta + '}';
    }
    
    
}
