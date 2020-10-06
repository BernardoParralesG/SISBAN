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
public class Empleado {
    private int cod;
    private int departamento;
    private String cedula;
    private Object rostro;
    private String nombre;
    private String apellidos;
    private String fecha_nac;
    private String direccion;
    private String telefono;
    private String cargo;
    private String fecha_ingre;

    public Empleado(int cod, int departamento, String numero_cedula, Object rostro, String nombre, String apellidos, String fecha_nac, String direccion, String telefono, String cargo, String fecha_ingre) {
        this.cod = cod;
        this.departamento = departamento;
        this.cedula = numero_cedula;
        this.rostro = rostro;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.fecha_ingre = fecha_ingre;
    }

    public Empleado(int cod, int departamento, String numero_cedula, String nombre, String apellidos, String fecha_nac, String direccion, String telefono, String cargo, String fecha_ingre) {
        this.cod = cod;
        this.departamento = departamento;
        this.cedula = numero_cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.fecha_ingre = fecha_ingre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public Object getRostro() {
        return rostro;
    }

    public void setRostro(Object rostro) {
        this.rostro = rostro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha_ingre() {
        return fecha_ingre;
    }

    public void setFecha_ingre(String fecha_ingre) {
        this.fecha_ingre = fecha_ingre;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cod=" + cod + ", departamento=" + departamento + ", numero_cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nac=" + fecha_nac + ", direccion=" + direccion + ", telefono=" + telefono + ", cargo=" + cargo + ", fecha_ingre=" + fecha_ingre + '}';
    }
    
    
}
