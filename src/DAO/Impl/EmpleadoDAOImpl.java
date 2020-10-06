/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Impl;

import DAO.DAOException;
import DAO.EmpleadoDAO;
import MODELO.Clases.Empleado;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EQUINOX
 */
public class EmpleadoDAOImpl extends Conexion implements EmpleadoDAO{

    final String INSERT = "INSERT INTO EMPLEADO(COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLISDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE) values(?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE EMPLEADO SET COD = ?,DEPARTAMENTO = ?,CEDULA = ?,NOMBRES = ?,APELLISDOS = ?,FECHA_NAC = ?,DIRECCION = ?,TELEFONO = ?,CARGO = ?,FECHA_INGRE = ? where COD=? ";
    final String DELETE = "DELETE FROM EMPLEADO where COD=? ";
    final String GETALL = "SELECT COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLISDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE FROM EMPLEADO";
    final String GET0NE = "SELECT COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLISDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE FROM EMPLEADO where COD=?";
    private Connection cn;
    private PreparedStatement st;
    private ResultSet rs;
    @Override
    public void insertar(Empleado a) throws DAOException {
        try {
            this.conectar();
            st=cn.prepareStatement(INSERT);
            st.setInt(1, a.getCod());
            st.setInt(2, a.getDepartamento());
            st.setString(3,a.getCedula());
            st.setString(4,a.getNombre());
            st.setString(5,a.getApellidos());
            st.setString(6,a.getFecha_nac());
            st.setString(7,a.getDireccion());
            st.setString(8,a.getTelefono());
            st.setString(9,a.getCargo());
            st.setString(10,a.getFecha_ingre());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Empleado a) throws DAOException {
        try {
            this.conectar();
            st=cn.prepareStatement(UPDATE);
            st.setInt(1, a.getCod());
            st.setInt(2, a.getDepartamento());
            st.setString(3,a.getCedula());
            st.setString(4,a.getNombre());
            st.setString(5,a.getApellidos());
            st.setString(6,a.getFecha_nac());
            st.setString(7,a.getDireccion());
            st.setString(8,a.getTelefono());
            st.setString(9,a.getCargo());
            st.setString(10,a.getFecha_ingre());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Empleado a) throws DAOException {
        
    }

    @Override
    public List<Empleado> obtenerTodos() throws DAOException {
        List<Empleado> emp= new ArrayList<>();
        try{
            st=cn.prepareStatement(GETALL);
            rs=st.executeQuery();
            while(rs.next()){
                emp.add(convertir(rs));
            }
        }catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return emp;
    }

    @Override
    public Empleado obtener(Integer id) throws DAOException {
        return null;
    }
    
    private Empleado convertir(ResultSet rs) throws SQLException { 
        int codigo = rs.getInt("COD");
        int depar = rs.getInt("DEPARTAMENTO");
        String ced = rs.getString("CEDULA");
        String nom = rs.getString("NOMBRES");
        String ape = rs.getString("APELLIDOS");
        String f_nacimieno = rs.getString("FECHA_NAC");
        String direc = rs.getString("DIRECCION");
        String tele = rs.getString("TELEFONO");
        String cargo = rs.getString("CARGO");
        String fing = rs.getString("FECHA_INGRE");
        Empleado reg = new Empleado(codigo, depar, ced,nom,ape,f_nacimieno,direc,tele,cargo,fing);
        reg.setCod(rs.getInt("codigo"));//revisar
        return reg;
    }
}
