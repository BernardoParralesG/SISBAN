package Controlador;
import MODELO.Clases.ClientesSisban;
import MODELO.Clases.Usuarios;
import Vista.*;
import Vista.Paneles.Nivel0.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class ControladorUsuario implements ActionListener{
    private VLogin log = new VLogin();
    private PanelAdministrador pa = new PanelAdministrador();
    public ControladorUsuario() {
        Iniciar();
    }

    public void Iniciar() {
        log.JBtnIngreso.addActionListener(this);
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        Object boton = a.getSource();
        if (boton.equals(log.JBtnIngreso)) {
            if(log.cajaUsuario.getText().equals("")||log.cajaContrasena.getPassword().equals("")){
                JOptionPane.showMessageDialog(null,"Debe llenar todos los campos ", " Mensaje de SISBAN ",JOptionPane.INFORMATION_MESSAGE);
            }else{
                VentanaPrincipal obj = new VentanaPrincipal ();
                obj.setLocationRelativeTo(null);
                obj.setVisible(true);
            }
        }
        if(boton.equals(pa.JBBuscar)){
            obtener(Integer.parseInt(pa.cajaCodigoPA.getText()));
        }
    }
    public Usuarios obtener(int id){
        return null;      
    }
}
