package MODELO.Clases;
public class Cuenta {
    private int cod_cuenta;
    private int cliente;
    private String tipo;
    private String estado;
    private float saldo_contable;
    private float saldo_disponible;

    public Cuenta() {
    }

    public Cuenta(int cod_cuenta, int cliente, String tipo, String estado, float saldo_contable, float saldo_disponible) {
        this.cod_cuenta = cod_cuenta;
        this.cliente = cliente;
        this.tipo = tipo;
        this.estado = estado;
        this.saldo_contable = saldo_contable;
        this.saldo_disponible = saldo_disponible;
    }

    public int getCod_cuenta() {
        return cod_cuenta;
    }

    public void setCod_cuenta(int cod_cuenta) {
        this.cod_cuenta = cod_cuenta;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getSaldo_contable() {
        return saldo_contable;
    }

    public void setSaldo_contable(float saldo_contable) {
        this.saldo_contable = saldo_contable;
    }

    public float getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(float saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cod_cuenta=" + cod_cuenta + ", cliente=" + cliente + ", tipo=" + tipo + ", estado=" + estado + ", saldo_contable=" + saldo_contable + ", saldo_disponible=" + saldo_disponible + '}';
    }
    
    
    
}
