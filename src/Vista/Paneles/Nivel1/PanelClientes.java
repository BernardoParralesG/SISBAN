package Vista.Paneles.Nivel1;

import MODELO.Clases.ClientesSisban;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PanelClientes extends javax.swing.JPanel {
    public PanelClientes() {
        initComponents();
        modeloTabla.addColumn("CODIGO");
        modeloTabla.addColumn("CEDULA");
        modeloTabla.addColumn("NOMBRES");
        modeloTabla.addColumn("APELLIDOS");
        modeloTabla.addColumn("FECHA NACIMIENTO");
        modeloTabla.addColumn("DIRECCION");
        modeloTabla.addColumn("TELEFONO");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JTextField();
        jNombres = new javax.swing.JTextField();
        jApellidos = new javax.swing.JTextField();
        jCedula = new javax.swing.JTextField();
        jFechaNac = new javax.swing.JTextField();
        jTelefono = new javax.swing.JTextField();
        jDireccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBSalir = new javax.swing.JButton();
        JBAgregar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBModificar = new javax.swing.JButton();
        JBBuscar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRES:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 100, 31));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel3.setText("APELLIDOS:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 100, 31));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel4.setText("CEDULA:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 31));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel5.setText("FECHA NACIMIENTO:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 31));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel6.setText("CODIGO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 31));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel7.setText("DIRECCION:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 194, 100, 31));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabel8.setText("TELEFONO:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, 31));

        jCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });
        add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 150, 20));

        jNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombresActionPerformed(evt);
            }
        });
        add(jNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 150, 20));

        jApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApellidosActionPerformed(evt);
            }
        });
        add(jApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 20));

        jCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCedulaActionPerformed(evt);
            }
        });
        add(jCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 150, 20));

        jFechaNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFechaNacActionPerformed(evt);
            }
        });
        add(jFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, 20));

        jTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTelefonoActionPerformed(evt);
            }
        });
        add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, 20));

        jDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDireccionActionPerformed(evt);
            }
        });
        add(jDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 20));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 619, 183));

        JBSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBSalir.setText("Salir");
        add(JBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        JBAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBAgregar.setText("Agregar");
        add(JBAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        JBEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBEliminar.setText("Eliminar");
        add(JBEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        JBModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBModificar.setText("Modificar");
        add(JBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        JBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBBuscar.setText("Buscar");
        add(JBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private DefaultTableModel modeloTabla = new DefaultTableModel();
        

    
    public boolean validarCampos(){
        boolean val=true;
        if(jCodigo.getText().equals("")||jNombres.getText().equals("")||jCedula.getText().equals("")||jApellidos.getText().equals("")||jFechaNac.getText().equals("")||jDireccion.getText().equals("")||jTelefono.getText().equals("")){
            val = false;
        }
        return val;
    }
    
    public void llenarTabla(List<ClientesSisban> cli){
        modeloTabla.setRowCount(0);
        Object[] dt = new Object[7];
        for (int i = 0; i < cli.size(); i++) {
            dt[0] = cli.get(i).getCodCliente();
            dt[1] = cli.get(i).getNumeroCedula();
            dt[2] = cli.get(i).getNombres();
            dt[3] = cli.get(i).getApellidos();
            dt[4] = cli.get(i).getFechaNacimiento();
            dt[5] = cli.get(i).getDireccion();
            dt[6] = cli.get(i).getTelefono();
            modeloTabla.addRow(dt);
        }
    }
    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoActionPerformed

    private void jNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombresActionPerformed

    private void jApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jApellidosActionPerformed

    private void jCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCedulaActionPerformed

    private void jFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFechaNacActionPerformed

    private void jTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTelefonoActionPerformed

    private void jDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBAgregar;
    public static javax.swing.JButton JBBuscar;
    public static javax.swing.JButton JBEliminar;
    public static javax.swing.JButton JBModificar;
    public static javax.swing.JButton JBSalir;
    public static javax.swing.JTextField jApellidos;
    public static javax.swing.JTextField jCedula;
    public static javax.swing.JTextField jCodigo;
    public static javax.swing.JTextField jDireccion;
    public static javax.swing.JTextField jFechaNac;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JTextField jNombres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTelefono;
    // End of variables declaration//GEN-END:variables
}
