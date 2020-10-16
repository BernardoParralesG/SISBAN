package DAO.Impl;
import Vista.Paneles.Nivel0.*;
import DAO.DAOException;
import DAO.UsuarioDAO;
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

public class UsuarioDAOImpl extends Conexion implements UsuarioDAO {

    @Override
    public void insertar(Usuarios a) throws DAOException {
        Connection cn = null;
        Statement stn = null;
        String sql ="Insert into USUARIOS values (" + a.getCod_usu()+ "," + a.getEmpleado()+ ",'" 
                + a.getNombre()+ "','" + a.getContrasena()+"',"+a.getNivel_acceso()+ ")";
        try {
            this.conectar();
            con = this.getCon();
            stn = con.createStatement();
            stn.execute(sql);
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Usuarios a) throws DAOException {
        Connection cn = null;
        Statement st = null;
        String sql = "update USUARIOS set COD_USU=" +a.getCod_usu()+ ",EMPLEADO=" + a.getEmpleado()+ ",NOMBRE='" 
                + a.getNombre()+ "',CONTRASENA='" + a.getContrasena()+"',NIVEL_ACCESO="+a.getNivel_acceso()+" where COD_USU="+a.getCod_usu();
        try {
            this.conectar(); //solo 1 vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CuentaDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(Usuarios a) throws DAOException {
        Connection cn = null;
        Statement st = null;
        String sql = "DELETE FROM USUARIOS where COD_USU= " + a.getCod_usu();
        try {
            this.conectar(); //1 sola vez
            cn = this.getCon();
            st = cn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception e) {
            
        }
    }

    @Override
    public List<Usuarios> obtenerTodos() throws DAOException {
       List<Usuarios> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT COD_USU,EMPLEADO,NOMBRE,CONTRASENA,NIVEL_ACCESO FROM CUENTA";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Usuarios d = new Usuarios();
                    d.setCod_usu(rs.getInt(1));
                    d.setEmpleado(rs.getInt(2));
                    d.setNombre(rs.getString(3));
                    d.setContrasena(rs.getString(4));
                    d.setNivel_acceso(rs.getInt(5));
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
    public Usuarios obtener(Integer id) throws DAOException {
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        Usuarios n;
        String sql = "SELECT NOMBRE FROM USUARIOS WHERE COD_USU ="+id;
        try{
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    PanelAdministrador pn = new PanelAdministrador();
                    pn.cajaNombrePA.setText(rs.getString(3));
                }
                stn.close();
                rs.close();
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }    
        return null;
    }
}
