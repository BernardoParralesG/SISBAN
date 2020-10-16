/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Impl;

import DAO.ClienteDAO;
import DAO.DAOException;
import MODELO.Clases.ClientesSisban;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAOImpl extends Conexion implements ClienteDAO {

    final String INSERT = "INSERT INTO CLIENTES_SISBAN(COD_CLIENTE,NUMERO_CEDULA,NOMBRES,APELLISDOS,FECHA_NACIMIENTO,DIRECCION,TELEFONO) values(?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE CLIENTES_SISBAN SET COD_CLIENTE = ?,NUMERO_CEDULA = ?,NOMBRES = ?,APELLISDOS = ?,FECHA_NACIMIENTO = ?,DIRECCION = ?,TELEFONO = ? where COD_CLIENTE=? ";
    final String DELETE = "DELETE FROM CLIENTES_SISBAN where COD_CLIENTE=? ";
    final String GETALL = "SELECT COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLISDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE FROM CLIENTES_SISBAN";
    final String GET0NE = "SELECT COD,CEDULA,NOMBRES,APELLISDOS,FECHA_NACIMIENTO,DIRECCION,TELEFONO FROM CLIENTES_SISBAN where COD_CLIENTE=?";
    private Connection cn;
    private PreparedStatement st;
    private ResultSet rs;
    @Override
    public void insertar(ClientesSisban a) throws DAOException {
        boolean val = false;
        Connection cn = null;
        Statement stn = null;
        String sql = "INSERT INTO CLIENTES_SISBAN(COD_CLIENTE,NUMERO_CEDULA,NOMBRES,APELLIDOS,FECHA_NACIMIENTO,DIRECCION,TELEFONO) values (" + 
                a.getCodCliente()+ ",'" + a.getNumeroCedula()
                + "','" + a.getNombres()+ "','" + a.getApellidos() + "',to_date('"+ a.getFechaNacimiento()+"','dd/mm/yyyy'),'"+a.getDireccion()
                + "','"+a.getTelefono()+"')";
        try {
            this.conectar();
            con = this.getCon();
            stn = con.createStatement();
            stn.execute(sql);
            val = true;
            //con.close();
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(ClientesSisban a) throws DAOException {
        boolean val = false;
        Connection cn = null;
        Statement st = null;
        String sql = "UPDATE CLIENTES_SISBAN SET COD_CLIENTE = "+a.getCodCliente()+",NUMERO_CEDULA = '"+a.getNumeroCedula()
                +"',NOMBRES = '"+a.getNombres()+"',APELLIDOS = '"+a.getApellidos()+"',FECHA_NACIMIENTO = to_date('"+ a.getFechaNacimiento()
                +"','dd/mm/yyyy'),DIRECCION = '"+a.getDireccion()+"',TELEFONO = '"+a.getTelefono()+"' where COD_CLIENTE= "+a.getCodCliente()+"";
        try {
            this.conectar(); //solo 1 vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
            val = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void eliminar(ClientesSisban a) throws DAOException {
        boolean val = false;
        Connection cn = null;
        Statement st = null;
        String sql = "DELETE FROM CLIENTES_SISBAN where COD_CLIENTE= " + a.getCodCliente();
        try {
            this.conectar(); //1 sola vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
            val = true;
        } catch (Exception e) {
            
        }
    }

    @Override
    public List<ClientesSisban> obtenerTodos() throws DAOException {
        List<ClientesSisban> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT COD_CLIENTE,NUMERO_CEDULA,NOMBRES,APELLIDOS,FECHA_NACIMIENTO,DIRECCION,TELEFONO FROM CLIENTES_SISBAN";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    ClientesSisban d = new ClientesSisban();
                    d.setCodCliente(rs.getInt(1));
                    d.setNumeroCedula(rs.getString(2));
                    d.setNombres(rs.getString(3));
                    d.setApellidos(rs.getString(4));
                    d.setFechaNacimiento(rs.getString(5));
                    d.setDireccion(rs.getString(6));
                    d.setTelefono(rs.getString(7));
                    listDep.add(d);
                }
                stn.close();
                rs.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < listDep.size(); i++) {
            System.out.println(listDep.get(i));
        }
        return listDep;
    }

    @Override
    public ClientesSisban obtener(Integer id) throws DAOException {
        return null;
        
    }
    
}
