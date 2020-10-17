
package DAO.Impl;
import MODELO.Clases.*;
import DAO.DAOException;
import DAO.EmpleadoDAO;
import MODELO.Clases.Empleado;
import MODELO.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class EmpleadoDAOImpl extends Conexion implements EmpleadoDAO{

    @Override
    public boolean insertar(Empleado a){
        boolean val = false;
        Connection cn = null;
        Statement stn = null;
        String sql = "INSERT INTO EMPLEADO(COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLIDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE) values (" + 
                a.getCod()+ ",'" + a.getDepartamento()
                + "','" + a.getCedula()+ "','" + a.getNombre() + "','" + a.getApellidos() + "',to_date('"+ a.getFecha_nac()+"','dd/mm/yyyy'),'"+a.getDireccion()
                + "','"+a.getTelefono()+ "','" + a.getCargo() + "',to_date('"+ a.getFecha_ingre()+"','dd/mm/yyyy'),'" +"')";
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
        return val;
    }

    @Override
    public boolean modificar(Empleado a){
        boolean val = false;
        Connection cn = null;
        Statement st = null;
        String sql = "UPDATE EMPLEADO SET COD = "+a.getCod()+",DEPARTAMENTO = '"+a.getDepartamento()
                +"',CEDULA = '"+a.getCedula()+"',NOMBRES = '"+a.getNombre()+"',APELLIDOS = '"+a.getApellidos()+"',FECHA_NAC = to_date('"+ a.getFecha_nac()
                +"','dd/mm/yyyy'),DIRECCION = '"+a.getDireccion()+"',TELEFONO = '"+a.getTelefono()+"',CARGO = '"+a.getCargo()+"',FECHA_INGRE = to_date('"+ a.getFecha_ingre()
                +"','dd/mm/yyyy')"+"' where COD= "+a.getCod()+"";
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
    public boolean eliminar(Empleado a){
        boolean val = false;
        Connection cn = null;
        Statement st = null;
        String sql = "DELETE FROM EMPLEADO where COD= " + a.getCod();
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
    public List<Empleado> obtenerTodos(){
        List<Empleado> listDep = new ArrayList<>();
        Connection cn = null;
        Statement stn = null;
        ResultSet rs = null;
        String sql = "SELECT COD,DEPARTAMENTO,CEDULA,NOMBRES,APELLIDOS,FECHA_NAC,DIRECCION,TELEFONO,CARGO,FECHA_INGRE FROM EMPLEADO";
        try {
            this.conectar();
            cn = this.getCon();
            stn = cn.createStatement();
            rs = stn.executeQuery(sql);
            if (rs != null) {
                while (rs.next()) {
                    Empleado e = new Empleado();
                    e.setCod(rs.getInt(1));
                    e.setDepartamento(rs.getInt(2));
                    e.setCedula(rs.getString(3));
                    e.setNombre(rs.getString(4));
                    e.setFecha_nac(rs.getString(5));
                    e.setDireccion(rs.getString(6));
                    e.setTelefono(rs.getString(7));
                    e.setCargo(rs.getString(8));
                    e.setFecha_ingre(rs.getString(9));
                    listDep.add(e);
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

}
