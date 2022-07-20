
package Vista;

public class FormStock extends javax.swing.JInternalFrame {

    public FormStock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDatos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jtxtModelo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnConsultar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jbtnActualizar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jtxtMarca = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jspStock = new javax.swing.JSpinner();
        jtxtCodigo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1260, 540));
        setMinimumSize(new java.awt.Dimension(1260, 540));
        setPreferredSize(new java.awt.Dimension(1250, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1260, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 173, 188));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, -30, 150, 160));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTROL Y GESTIÓN DE STOCK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 560, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N
        jLabel2.setText("INFOCOM SAC");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1240, 100));

        jScrollPane1.setViewportView(jtblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 1240, 250));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setText("STOCK");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel6.setText("CÓDIGO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 20));

        jtxtId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtId.setForeground(new java.awt.Color(153, 153, 153));
        jtxtId.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxtId.setEnabled(false);
        jtxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIdActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 400, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 400, 10));

        jLabel13.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel13.setText("MODELO");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 400, 20));

        jtxtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtModelo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtModelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxtModelo.setEnabled(false);
        jtxtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 400, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 400, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel7.setText("NOMBRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 810, 20));

        jtxtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(153, 153, 153));
        jtxtNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxtNombre.setEnabled(false);
        jtxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 810, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 810, 10));

        jbtnConsultar.setBackground(new java.awt.Color(47, 123, 123));
        jbtnConsultar.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnConsultar.setText("CONSULTAR");
        jbtnConsultar.setBorder(null);
        jPanel1.add(jbtnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 400, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel12.setText("ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 400, 20));

        jbtnActualizar.setBackground(new java.awt.Color(47, 123, 123));
        jbtnActualizar.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnActualizar.setText("ACTUALIZAR");
        jbtnActualizar.setBorder(null);
        jPanel1.add(jbtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 400, 30));

        jLabel14.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel14.setText("MARCA");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 400, 20));

        jtxtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtMarca.setForeground(new java.awt.Color(153, 153, 153));
        jtxtMarca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxtMarca.setEnabled(false);
        jtxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMarcaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 400, 20));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 400, 10));
        jPanel1.add(jspStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 400, 40));

        jtxtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtxtCodigo.setEnabled(false);
        jtxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 400, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtIdActionPerformed

    private void jtxtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtModeloActionPerformed

    private void jtxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreActionPerformed

    private void jtxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMarcaActionPerformed

    private void jtxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JButton jbtnActualizar;
    public javax.swing.JButton jbtnConsultar;
    public javax.swing.JSpinner jspStock;
    public javax.swing.JTable jtblDatos;
    public javax.swing.JTextField jtxtCodigo;
    public javax.swing.JTextField jtxtId;
    public javax.swing.JTextField jtxtMarca;
    public javax.swing.JTextField jtxtModelo;
    public javax.swing.JTextField jtxtNombre;
    // End of variables declaration//GEN-END:variables
}
