package DAO.Impl;
import DAO.ClienteDAO;
import MODELO.Clases.ClientesSisban;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClienteDAOImpl extends Conexion implements ClienteDAO {
    
    @Override
    public boolean insertar(ClientesSisban a){
        boolean val = false;
        Connection cn = null;
        Statement stn = null;
        String sql = "INSERT INTO CLIENTES_SISBAN (COD_CLIENTE, NUMERO_CEDULA, NOMBRES, APELLIDOS, FECHA_NACIMIENTO, DIRECCION, TELEFONO) values (" + 
                a.getCodCliente()+ ",'" + a.getNumeroCedula()
                + "','" + a.getNombres()+ "','" + a.getApellidos() + "',to_date('"+ a.getFechaNacimiento()+"','dd/mm/yyyy'),'"+a.getDireccion()
                + "','"+a.getTelefono()+"')";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            stn.execute(sql);
            val = true;
            //con.close();
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
    }

    @Override
    public boolean modificar(ClientesSisban a){
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
        return val;
    }
    
    @Override
    public boolean eliminar(ClientesSisban a){
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
        return val;
    }

    @Override
    public List<ClientesSisban> obtenerTodos(){
        List<ClientesSisban> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT COD_CLIENTE, NUMERO_CEDULA, NOMBRES, APELLIDOS, FECHA_NACIMIENTO, DIRECCION, TELEFONO FROM CLIENTES_SISBAN";
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
            else{
            }
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDep;
    }

    
    
}
