package Vista;
import javax.swing.*;
public class VLogin extends javax.swing.JFrame {
    public VLogin() {
        initComponents();
        setSize(440,590);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContrasena = new javax.swing.JPasswordField();
        JBtnIngreso = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SISBAN");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 80, 140, 60);

        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 230, 100, 30);

        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 290, 120, 30);

        cajaUsuario.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(cajaUsuario);
        cajaUsuario.setBounds(170, 230, 180, 27);
        getContentPane().add(cajaContrasena);
        cajaContrasena.setBounds(170, 290, 180, 30);

        JBtnIngreso.setText("ACCEDER");
        JBtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(JBtnIngreso);
        JBtnIngreso.setBounds(160, 390, 90, 23);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        Fondo.setToolTipText("");
        getContentPane().add(Fondo);
        Fondo.setBounds(-20, -10, 450, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        
    }//GEN-LAST:event_cajaUsuarioActionPerformed

    private void JBtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnIngresoActionPerformed
        VentanaPrincipal nd = new VentanaPrincipal();
        nd.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBtnIngresoActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
        } catch (ClassNotFoundException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            //java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    public javax.swing.JButton JBtnIngreso;
    public static javax.swing.JPasswordField cajaContrasena;
    public static javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

}
