/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Impl;

import DAO.DAOException;
import DAO.MovimientoDao;
import MODELO.Clases.Movimientos;
import MODELO.Clases.Usuarios;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MovimientoDaoImpl extends Conexion implements MovimientoDao {

    @Override
    public boolean insertar(Movimientos a){
        Connection cn=null;
        Statement st=null;
        boolean val=false;
        String sql="insert into MOVIMIENTOS values ("+a.getDocumento()+","+a.getCaja()+","+a.getCuenta()
                +",'"+a.getConcepto()+"','"+a.getTipo()+"',"+a.getMonto()+")";
        try {
            this.conectar();
            con = this.getCon();
            st = con.createStatement();
            st.execute(sql);
            val=true;
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }

    @Override
    public boolean modificar(Movimientos a){
        return true;
    }

    @Override
    public boolean eliminar(Movimientos a){
        Connection cn = null;
        Statement st = null;
        boolean val=false;
        String sql = "DELETE FROM MOVIMIENTOS where DOCUMENTO= " + a.getDocumento();
        try {
            this.conectar(); //1 sola vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
            val=true;
        } catch (Exception e) {
            
        }
        return val;
    }

    @Override
    public List<Movimientos> obtenerTodos(){
        List<Movimientos> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT DOCUMENTO,CAJA,CUENTA,CONCEPTO,TIPO,MONTO FROM MOVIMIENTOS";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Movimientos d = new Movimientos();
                    d.setDocumento(rs.getInt(1));
                    d.setCaja(rs.getInt(2));
                    d.setCuenta(rs.getInt(3));
                    d.setConcepto(rs.getString(4));
                    d.setTipo(rs.getString(5));
                    d.setMonto(rs.getFloat(6));
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
