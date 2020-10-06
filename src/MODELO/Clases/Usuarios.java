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
public class Usuarios {
    private int cod_usu;
    private int empleado;
    private String nombre;
    private String contrasena;
    private int nivel_acceso;

    public Usuarios() {
    }

    public Usuarios(int cod_usu, int empleado, String nombre, String contrasena, int nivel_acceso) {
        this.cod_usu = cod_usu;
        this.empleado = empleado;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.nivel_acceso = nivel_acceso;
    }

    public int getCod_usu() {
        return cod_usu;
    }

    public void setCod_usu(int cod_usu) {
        this.cod_usu = cod_usu;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(int nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "cod_usu=" + cod_usu + ", empleado=" + empleado + ", nombre=" + nombre + ", contrasena=" + contrasena + ", nivel_acceso=" + nivel_acceso + '}';
    }
    
    
}
