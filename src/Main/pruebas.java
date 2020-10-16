package Main;
import Controlador.*;
import DAO.Impl.*;
import MODELO.Clases.*;
import java.sql.SQLException;
import java.util.logging.*;
public class pruebas {
    public static void main(String[] args) throws ClassNotFoundException {
        ClienteDAOImpl bd= new ClienteDAOImpl();
        CuentaDAOImpl CuentaDao=new CuentaDAOImpl();
        UsuarioDAOImpl usuDao=new UsuarioDAOImpl();
        MovimientoDaoImpl moviDao=new MovimientoDaoImpl();
        CajaDAOImpl cajaDao=new CajaDAOImpl();
        Cajero caja=new Cajero(1, 1, 1);
        Movimientos movi=new Movimientos(1, 1, 1, "DEPOSITO", "PAGO", 20);
        
        Usuarios usu=new Usuarios(2, 1, "JUAN", "12345", 1);//CONTRASEÑA CORRECTA
        Usuarios usu2=new Usuarios(2, 1, "JUAN", "1245", 1);//CONTRASEÑA INCORRECTA
        
        Cuenta cuenta=new Cuenta(3, 1, "CORRIENTE", "ACTIVA", 454, 1000);
        ClientesSisban cliente= new ClientesSisban(3, "888", "VECTOR", "PARRALES", "12/12/2000", "guayaquil", "09435");
        try {
            bd.conectar();
            //bd.insertar(cliente);
            //bd.modificar(cliente);
            //bd.eliminar(cliente);
            //bd.obtenerTodos();
            //CuentaDao.insertar(cuenta);
            //CuentaDao.eliminar(cuenta);
            //CuentaDao.modificar(cuenta);
            //CuentaDao.obtenerTodos();
            //usuDao.insertar(usu);
            //usuDao.eliminar(usu);
            //usuDao.modificar(usu);
            //usuDao.obtenerTodos();
            boolean re=usuDao.validarSesion(usu);System.out.println(re);//CORRECTA
            boolean re2=usuDao.validarSesion(usu2);System.out.println(re2);//INCORRECTA
            //cajaDao.insertar(caja);
            //moviDao.insertar(movi);
            //cajaDao.obtenerTodos();
            //moviDao.obtenerTodos();
        } catch (SQLException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
        Controlador ctn = new Controlador();
    }
}
