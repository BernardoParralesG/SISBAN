/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Impl;

import DAO.CuentaDAO;
import DAO.DAOException;
import MODELO.Clases.ClientesSisban;
import MODELO.Clases.Cuenta;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CuentaDAOImpl extends Conexion implements CuentaDAO {

    @Override
    public boolean insertar(Cuenta a){
        Connection cn = null;
        boolean val=false;
        Statement stn = null;
        String sql = "Insert into CUENTA values (" + a.getCod_cuenta()+ "," + a.getCliente()+ ",'" 
                + a.getTipo()+ "','" + a.getEstado()+"',"+a.getSaldo_contable()+","+a.getSaldo_disponible()+ ")";
        try {
            this.conectar();
            con = this.getCon();
            stn = con.createStatement();
            stn.execute(sql);
            val=true;
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }

    @Override
    public boolean modificar(Cuenta a){
        Connection cn = null;
        Statement st = null;
        boolean val=false;
        String sql = "update CUENTA set COD_CUENTA=" + a.getCod_cuenta()+ ",CLIENTE=" + a.getCliente()+ ",TIPO='" 
                + a.getTipo()+ "',ESTADO='" + a.getEstado()+"',SALDO_CONTABLE="+a.getSaldo_contable()
                +",SALDO_DISPONIBLE="+a.getSaldo_disponible()+ "where COD_CUENTA="+a.getCod_cuenta();
        int filas = 0;
        try {
            this.conectar(); 
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
            val=true;
        } catch (SQLException ex) {
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }

    @Override
    public boolean eliminar(Cuenta a){
        Connection cn = null;
        Statement st = null;
        boolean val=false;
        String sql = "DELETE FROM CUENTA where COD_CUENTA= " + a.getCod_cuenta();
        try {
            this.conectar(); //1 sola vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            val=true;
            st.close();
        } catch (Exception e) {
            
        }
        return val;
    }

    @Override
    public List<Cuenta> obtenerTodos(){
        List<Cuenta> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT COD_CUENTA,CLIENTE,TIPO,ESTADO,SALDO_CONTABLE,SALDO_DISPONIBLE FROM CUENTA";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Cuenta d = new Cuenta();
                    d.setCod_cuenta(rs.getInt(1));
                    d.setCliente(rs.getInt(2));
                    d.setTipo(rs.getString(3));
                    d.setEstado(rs.getString(4));
                    d.setSaldo_contable(rs.getFloat(5));
                    d.setSaldo_disponible(rs.getFloat(6));
                    listDep.add(d);
                }
                stn.close();
                rs.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*for (int i = 0; i < listDep.size(); i++) {
            System.out.println(listDep.get(i));
        }*/
        return listDep;
    }
    
}
