package Vista;
import Vista.Paneles.Nivel0.*;
import Vista.Paneles.Nivel1.*;
import javax.swing.JPanel;
public class VentanaPrincipal extends javax.swing.JFrame {

    PanelClientes pn=new PanelClientes();
    PanelAdministrador pa = new PanelAdministrador();
    public VentanaPrincipal() {
        initComponents();
    }

    private void definirPanel(JPanel pn){
        scroll.setViewportView(pn);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCuentas = new javax.swing.JMenu();
        jmenuClientes = new javax.swing.JMenuItem();
        jmenuUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCuentas.setText("Cuentas");

        jmenuClientes.setText("Clientes");
        jmenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuClientesActionPerformed(evt);
            }
        });
        menuCuentas.add(jmenuClientes);

        jmenuUsuario.setText("Usuarios");
        jmenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuUsuarioActionPerformed(evt);
            }
        });
        menuCuentas.add(jmenuUsuario);

        jMenuBar1.add(menuCuentas);

        jMenu2.setText("Administracion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuClientesActionPerformed
        definirPanel(pn);
    }//GEN-LAST:event_jmenuClientesActionPerformed

    private void jmenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuUsuarioActionPerformed
        definirPanel(pa);
    }//GEN-LAST:event_jmenuUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmenuClientes;
    private javax.swing.JMenuItem jmenuUsuario;
    private javax.swing.JMenu menuCuentas;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
