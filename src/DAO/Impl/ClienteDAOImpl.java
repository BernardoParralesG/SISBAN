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
        try {
            this.conectar();
            st=cn.prepareStatement(UPDATE);
            st.setInt(1, a.getCodCliente());
            st.setString(3,a.getNumeroCedula());
            st.setString(4,a.getNombres());
            st.setString(5,a.getApellidos());
            st.setString(6,a.getFechaNacimiento());
            st.setString(7,a.getDireccion());
            st.setString(8,a.getTelefono());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void eliminar(ClientesSisban a) throws DAOException {
        
    }

    @Override
    public List<ClientesSisban> obtenerTodos() throws DAOException {
        return null;
    }

    @Override
    public ClientesSisban obtener(Integer id) throws DAOException {
        return null;
        
    }
    
}
