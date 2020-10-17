package Controlador;
import Vista.*;
import Vista.Paneles.Nivel0.PanelAdministrador;
import Vista.Paneles.Nivel1.PanelClientes;
import Vista.Paneles.Nivel2.PanelTransacciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
public class ControladorLogin implements ActionListener{ 
    private javax.swing.JScrollPane scroll;
    private VentanaPrincipal vp = new VentanaPrincipal();
    PanelClientes pn=new PanelClientes();
    PanelAdministrador pa = new PanelAdministrador();
    PanelTransacciones pt = new PanelTransacciones();
    public ControladorLogin() {
        Iniciar();
    }
    public void Iniciar(){
        vp.menuCuentas.addActionListener(this);
        vp.jmenuClientes.addActionListener(this);
        vp.JTransa.addActionListener(this);
        vp.JUser.addActionListener(this);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if(boton.equals(vp.jmenuClientes)){
            vp.definirPanel(pn);
            ControladorClientes cc = new ControladorClientes();
        }else{
            vp.definirPanel(pt);
        }  
        if(boton.equals(vp.JUser)){
            vp.definirPanel(pa);
        }
    }

}
