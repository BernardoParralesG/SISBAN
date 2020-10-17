package Vista;

import javax.swing.JPanel;

public class VentanaPrincipal extends javax.swing.JFrame {
    public VentanaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCuentas = new javax.swing.JMenu();
        jmenuClientes = new javax.swing.JMenuItem();
        JTransa = new javax.swing.JMenuItem();
        JAdministrador = new javax.swing.JMenu();
        JUser = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCuentas.setText("Cuentas");

        jmenuClientes.setText("Clientes");
        jmenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuClientesActionPerformed(evt);
            }
        });
        menuCuentas.add(jmenuClientes);

        JTransa.setText("Transacciones");
        JTransa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTransaActionPerformed(evt);
            }
        });
        menuCuentas.add(JTransa);

        jMenuBar1.add(menuCuentas);

        JAdministrador.setText("Administracion");
        JAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JAdministradorActionPerformed(evt);
            }
        });

        JUser.setText("Usuarios");
        JAdministrador.add(JUser);

        jMenuBar1.add(JAdministrador);

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
    public void definirPanel(JPanel pn){
        scroll.setViewportView(pn);
    }
    private void jmenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuClientesActionPerformed

    }//GEN-LAST:event_jmenuClientesActionPerformed

    private void JTransaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTransaActionPerformed

    }//GEN-LAST:event_JTransaActionPerformed

    private void JAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JAdministradorActionPerformed

    }//GEN-LAST:event_JAdministradorActionPerformed

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
    private javax.swing.JMenu JAdministrador;
    public javax.swing.JMenuItem JTransa;
    public javax.swing.JMenuItem JUser;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jmenuClientes;
    public javax.swing.JMenu menuCuentas;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
