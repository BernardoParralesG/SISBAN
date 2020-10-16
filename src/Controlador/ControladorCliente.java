package Controlador;
import Vista.*;
import Vista.Paneles.Nivel0.*;
import Vista.Paneles.Nivel1.*;
import java.awt.event.*;
import javax.swing.*;

public class ControladorCliente implements ActionListener {
    private VentanaPruebas Vp = new VentanaPruebas();
    private javax.swing.JScrollPane scroll;
    private PanelDepartamentos pnd=new PanelDepartamentos();
    private PanelClientes pnc=new PanelClientes();
    public ControladorCliente() {
        Iniciar();
    }

    public void Iniciar() {
        Vp.botonCliente.addActionListener(this);
        Vp.setLocationRelativeTo(null);
        Vp.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {  
        Object boton = a.getSource();
        if (boton.equals(Vp.botonCliente)) {
            definirPanel(pnc);
        }
        if (boton.equals(Vp.botonDepartamento)) {
            definirPanel(pnd);
        }
    }
    private void definirPanel(JPanel pn){
        scroll.setViewportView(pn);
    }
}
