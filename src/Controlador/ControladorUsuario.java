package Controlador;
import Vista.*;
import java.awt.event.*;
public class ControladorUsuario implements ActionListener{
   private VLogin log = new VLogin();
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
            VentanaPruebas obj = new VentanaPruebas ();
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
        }
    } 
}
