package Controlador;
import Vista.*;
import MODELO.Clases.*;
import java.awt.event.*;
public class Controlador implements ActionListener{
    private VentanaInicial vent = new VentanaInicial();
    public Controlador() {
        Iniciar();
    }
    public void Iniciar() {
        vent.JBtnIngreso.addActionListener(this);
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
        Object boton = a.getSource();
        if (boton.equals(vent.JBtnIngreso)) {
            VLogin obj = new VLogin ();
            obj.setLocationRelativeTo(null);
            obj.setVisible(true);
        }
    }
}