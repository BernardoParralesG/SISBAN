package Controlador;
import DAO.Impl.UsuarioDAOImpl;
import MODELO.Clases.Usuarios;
import Vista.*;
import Vista.Paneles.Nivel0.*;
import static Vista.VLogin.cajaContrasena;
import static Vista.VLogin.cajaUsuario;
import java.awt.event.*;
import javax.swing.JOptionPane;
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
            if(log.cajaUsuario.getText().equals("")||log.cajaContrasena.getPassword().equals("")){
                JOptionPane.showMessageDialog(null,"Debe llenar todos los campos ", " Mensaje de SISBAN ",JOptionPane.INFORMATION_MESSAGE);
            }else{
                String contraseña = "";
                for (int i = 0; i < cajaContrasena.getPassword().length; i++) {
                    contraseña += cajaContrasena.getPassword()[i];
                }
                UsuarioDAOImpl login = new UsuarioDAOImpl();
                Usuarios usuario = new Usuarios();
                usuario.setNombre(cajaUsuario.getText());
                usuario.setContrasena(contraseña);
                if (cajaUsuario.getText().equals("") || contraseña.equals("")) {
                    JOptionPane.showMessageDialog(null, "Rellene los campos");
                } else if (login.validarSesion(usuario)) {
                    ControladorLogin ns = new ControladorLogin();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
                    
            }
        }
    }
}
