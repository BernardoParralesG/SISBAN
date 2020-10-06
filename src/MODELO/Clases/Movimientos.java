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
public class Movimientos {
    private int documento;
    private int caja;
    private int cuenta;
    private String concepto;
    private String tipo;
    private float monto;

    public Movimientos() {
    }

    public Movimientos(int documento, int caja, int cuenta, String concepto, String tipo, float monto) {
        this.documento = documento;
        this.caja = caja;
        this.cuenta = cuenta;
        this.concepto = concepto;
        this.tipo = tipo;
        this.monto = monto;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "documento=" + documento + ", caja=" + caja + ", cuenta=" + cuenta + ", concepto=" + concepto + ", tipo=" + tipo + ", monto=" + monto + '}';
    }
    
    
}
