/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.Clases;

/**
 *
 * @author EQUINOX
 */
public class Cajero {
    private int numero;
    private int empleado;
    private int cliente;

    public Cajero() {
    }

    public Cajero(int numero, int empleado, int cliente) {
        this.numero = numero;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cajero{" + "numero=" + numero + ", empleado=" + empleado + ", cliente=" + cliente + '}';
    }
    
    
}
