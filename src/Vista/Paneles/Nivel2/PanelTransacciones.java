/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles.Nivel2;

/**
 *
 * @author EQUINOX
 */
public class PanelTransacciones extends javax.swing.JPanel {

    /**
     * Creates new form PanelTransacciones
     */
    public PanelTransacciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jRetirar = new javax.swing.JButton();
        JBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JCodigoTran = new javax.swing.JTextField();
        jConsultar = new javax.swing.JButton();
        jDepositar1 = new javax.swing.JButton();
        JCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 570, 150));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TRANSACCIONES");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        jRetirar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRetirar.setText("Retirar");
        add(jRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 90, 30));

        JBSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBSalir.setText("Salir");
        add(JBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("RETIRAR - DEPOSITAR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 30));

        JCodigoTran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(JCodigoTran, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 20));

        jConsultar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jConsultar.setText("Consultar");
        add(jConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jDepositar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jDepositar1.setText("Depositar");
        add(jDepositar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 30));

        JCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(JCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CANTIDAD");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CODIGO:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CONSULTAR");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSalir;
    private javax.swing.JTextField JCantidad;
    private javax.swing.JTextField JCodigoTran;
    private javax.swing.JButton jConsultar;
    private javax.swing.JButton jDepositar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jRetirar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
