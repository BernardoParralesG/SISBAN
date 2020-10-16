/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DAO.DAOException;
import DAO.Impl.ClienteDAOImpl;
import MODELO.Clases.ClientesSisban;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EQUINOX
 */
public class pruebas {
    public static void main(String[] args) throws ClassNotFoundException, DAOException {
        ClienteDAOImpl bd= new ClienteDAOImpl();
        ClientesSisban cliente= new ClientesSisban(3, "888", "VECTOR", "PARRALES", "12/12/2000", "guayaquil", "09435");
        try {
            bd.conectar();
            //bd.insertar(cliente);
            //bd.modificar(cliente);
            //bd.eliminar(cliente);
            bd.obtenerTodos();
        } catch (SQLException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
