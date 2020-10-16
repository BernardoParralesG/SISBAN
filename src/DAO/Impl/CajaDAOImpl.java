/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Impl;

import DAO.CajaDAO;
import DAO.DAOException;
import MODELO.Clases.Cajero;
import MODELO.Clases.Cuenta;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CajaDAOImpl extends Conexion implements CajaDAO {

    @Override
    public void insertar(Cajero a) throws DAOException {
        Connection cn=null;
        Statement st=null;
        String sql="insert into CAJERO values ("+a.getNumero()+","+a.getEmpleado()+","+a.getCliente()+")";
        try {
            this.conectar();
            con = this.getCon();
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Cajero a) throws DAOException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cajero a) throws DAOException {
        Connection cn = null;
        Statement st = null;
        String sql = "DELETE FROM CAJERO where NUMERO= " + a.getNumero();
        try {
            this.conectar();
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception e) {
            
        }
    }

    @Override
    public List<Cajero> obtenerTodos() throws DAOException {
        List<Cajero> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT NUMERO,EMPLEADO,CLIENTE FROM CAJERO";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Cajero d=new Cajero();
                    d.setNumero(rs.getInt(1));
                    d.setEmpleado(rs.getInt(2));
                    d.setCliente(rs.getInt(3));
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
