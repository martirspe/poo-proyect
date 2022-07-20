
package Vista;



public class FormReporteVentas extends javax.swing.JInternalFrame {

    
 
    
    public FormReporteVentas() {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fecha_inicio = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboMoneda = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        fecha_final = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        btn_getVentas = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO","PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL",
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 850, 260));

        jPanel1.setBackground(new java.awt.Color(0, 173, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -40, 150, 160));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REPORTE DE VENTAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 300, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N
        jLabel2.setText("INFOCOM SAC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 850, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fecha_inicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha_inicio.setForeground(new java.awt.Color(153, 153, 153));
        fecha_inicio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fecha_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_inicioActionPerformed(evt);
            }
        });
        jPanel3.add(fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 270, -1));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel17.setText("FECHA DE INICIO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel8.setText("MONEDA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 170, 20));

        comboMoneda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboMoneda.setForeground(new java.awt.Color(153, 153, 153));
        comboMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEN", "USD" }));
        comboMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMonedaActionPerformed(evt);
            }
        });
        jPanel3.add(comboMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 270, 30));

        jButton8.setBackground(new java.awt.Color(47, 123, 123));
        jButton8.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("VENTAS POR VENDEDOR");
        jButton8.setBorder(null);
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 270, 30));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 270, 10));

        fecha_final.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fecha_final.setForeground(new java.awt.Color(153, 153, 153));
        fecha_final.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fecha_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_finalActionPerformed(evt);
            }
        });
        jPanel3.add(fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 270, -1));

        jLabel18.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel18.setText("FECHA DE FIN");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 250, -1));

        jButton10.setBackground(new java.awt.Color(47, 123, 123));
        jButton10.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("VENTAS POR CLIENTE");
        jButton10.setBorder(null);
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 30));

        jButton11.setBackground(new java.awt.Color(47, 123, 123));
        jButton11.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("VENTAS POR PRODUCTO");
        jButton11.setBorder(null);
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 270, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 850, 160));

        btn_getVentas.setBackground(new java.awt.Color(47, 123, 123));
        btn_getVentas.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        btn_getVentas.setForeground(new java.awt.Color(255, 255, 255));
        btn_getVentas.setText("CONSULTAR VENTAS");
        btn_getVentas.setBorder(null);
        jPanel2.add(btn_getVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 770, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMonedaActionPerformed

    private void fecha_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_inicioActionPerformed

    private void fecha_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_finalActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormReporteVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormReporteVentas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_getVentas;
    public javax.swing.JComboBox<String> comboMoneda;
    public javax.swing.JTextField fecha_final;
    public javax.swing.JTextField fecha_inicio;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
