/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.Clases;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EQUINOX
 */

public class ClientesSisban implements Serializable {
    private int codCliente;
    private String numeroCedula;
    private Serializable rostroCliente;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;

    public ClientesSisban() {
    }

    public ClientesSisban(int codCliente, String numeroCedula, String nombres, String apellidos, String fechaNacimiento, String direccion, String telefono) {
        this.codCliente = codCliente;
        this.numeroCedula = numeroCedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    public ClientesSisban(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public Serializable getRostroCliente() {
        return rostroCliente;
    }

    public void setRostroCliente(Serializable rostroCliente) {
        this.rostroCliente = rostroCliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    @Override
    public String toString() {
        return "MODELO.Clases.ClientesSisban[ codCliente=" + codCliente + " ]";
    }
    
}
