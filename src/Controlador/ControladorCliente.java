package Controlador;
import DAO.ClienteDAO;
import DAO.DAOException;
import DAO.Impl.ClienteDAOImpl;
import Vista.*;
import Vista.Paneles.Nivel0.*;
import Vista.Paneles.Nivel1.*;
import java.awt.event.*;
import MODELO.Clases.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ControladorCliente implements ActionListener {
    
    private VentanaPruebas Vp = new VentanaPruebas();
    private javax.swing.JScrollPane scroll;
    private PanelDepartamentos pnd=new PanelDepartamentos();
    private PanelClientes pnc=new PanelClientes();
    PanelClientes pen = new PanelClientes();
    public ControladorCliente() {
        Iniciar();
    }

    public void Iniciar() {
        Vp.botonCliente.addActionListener(this);
        Vp.setLocationRelativeTo(null);
        Vp.setVisible(true);
    }
    public void insertar(ClientesSisban cs) throws DAOException {
        ClienteDAO dao = new ClienteDAOImpl();
        dao.insertar(cs);
    }

    public void modificar(ClientesSisban cs) throws DAOException {
        ClienteDAO dao = new ClienteDAOImpl();
        dao.modificar(cs);
    }

    public void eliminar(ClientesSisban cs) throws DAOException {
        ClienteDAO dao = new ClienteDAOImpl();
        dao.eliminar(cs);
    }
    public void consultar() throws DAOException {
        ClienteDAOImpl sisdao = new ClienteDAOImpl();
        List<ClientesSisban> sisban= new ArrayList<>();
        sisban = sisdao.obtenerTodos();
        pen.llenarTabla(sisban);      
    }
    public ClientesSisban obtener(int id){
        return null;
        
    }
    @Override
    public void actionPerformed(ActionEvent a) {  
        ClientesSisban cli;
        Object boton = a.getSource();
        if (boton.equals(Vp.botonCliente)) {
            definirPanel(pnc);
        }
        if (boton.equals(Vp.botonDepartamento)) {
            definirPanel(pnd);
        }
        PanelClientes pn = new PanelClientes();
        if(boton.equals(pn.JBAgregar)){
            cli = new ClientesSisban(Integer.parseInt(pn.jCodigo.getText()),pn.jCedula.getText(),pn.jNombres.getName(),pn.jApellidos.getText(),pn.jFechaNac.getText(),pn.jDireccion.getText(),pn.jTelefono.getText());
            try {
                insertar(cli);
            } catch (DAOException ex) {
                Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (boton.equals(pn.JBModificar)) {
            cli = new ClientesSisban(Integer.parseInt(pn.jCodigo.getText()),pn.jCedula.getText(),pn.jNombres.getName(),pn.jApellidos.getText(),pn.jFechaNac.getText(),pn.jDireccion.getText(),pn.jTelefono.getText());
            try {
                modificar(cli);
            } catch (DAOException ex) {
                Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (boton.equals(pn.JBEliminar)) {
            /*eliminar(pn.jCodigo.getText()));
            System.out.println("x");*/
        }
        if (boton.equals(pn.JBAgregar)) {
            obtener(Integer.parseInt(pn.jCodigo.getText()));
        }
    }
    private void definirPanel(JPanel pn){
        scroll.setViewportView(pn);
    }
}
