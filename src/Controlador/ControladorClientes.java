package Controlador;
import DAO.Impl.ClienteDAOImpl;
import MODELO.Clases.ClientesSisban;
import MODELO.Conexion;
import Vista.Paneles.Nivel1.PanelClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class ControladorClientes implements ActionListener{
    private PanelClientes pn = new PanelClientes();  
    private Conexion cn= new Conexion();
    private ClienteDAOImpl cdao = new ClienteDAOImpl();
    public ControladorClientes() {
        Iniciar();
    }
    
    public void Iniciar() {
        pn.JBAgregar.addActionListener(this);
    }
    public void insertar(ClientesSisban cli) {
        ClienteDAOImpl dao = new ClienteDAOImpl();
        dao.insertar(cli);
    }
    public void modificar(ClientesSisban cli) {
	ClienteDAOImpl dao = new ClienteDAOImpl();
        dao.insertar(cli);
    }
    public void eliminar(ClientesSisban cli) {
	ClienteDAOImpl dao = new ClienteDAOImpl();
	dao.eliminar(cli);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        ClientesSisban cli;
        Object boton = a.getSource();
        if (boton.equals(pn.JBAgregar)) {
            cli = new ClientesSisban(Integer.parseInt(pn.jCodigo.getText()),pn.jCedula.getText(),pn.jNombres.getText(),pn.jApellidos.getText(),pn.jFechaNac.getText(),pn.jDireccion.getText(),pn.jTelefono.getText());
            insertar(cli);
        }
        if(boton.equals(pn.JBConsultar)){
            ClienteDAOImpl dao = new ClienteDAOImpl();
            List<ClientesSisban> n= new ArrayList<>();
            n = dao.obtenerTodos();
            pn.llenarTabla(n);
        }
        if(boton.equals(pn.JBEliminar)){
            cli=new ClientesSisban(Integer.parseInt(pn.jCodigo.getText()));
            //eliminar(cli);
        }
    }
    
}

