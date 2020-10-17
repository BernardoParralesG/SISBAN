package Controlador;
import Vista.*;
import java.awt.event.*;
public class Controlador implements ActionListener{
    private VentanaInicial vent = new VentanaInicial();
    
    public Controlador() {
        Iniciar();
    }
    public void Iniciar() {
        VentanaInicial.JBtnIngreso.addActionListener(this);
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        Object boton = a.getSource();
        if (boton.equals(vent.JBtnIngreso)) {   
            ControladorUsuario cu = new ControladorUsuario();
        }
    }
}