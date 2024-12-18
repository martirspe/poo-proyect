
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
        jtblDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jbntVVendedor = new javax.swing.JButton();
        jbntVCliente = new javax.swing.JButton();
        jbntVProducto = new javax.swing.JButton();
        jdcFFin = new com.toedter.calendar.JDateChooser();
        jdcFInicio = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        jbtnCVentas = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jtblDatos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1000, 410));

        jPanel1.setBackground(new java.awt.Color(0, 173, 188));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, -40, 150, 160));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REPORTE DE VENTAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 300, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N
        jLabel2.setText("INFOCOM SAC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1000, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel17.setText("FECHA DE INICIO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 250, -1));

        jbntVVendedor.setBackground(new java.awt.Color(47, 123, 123));
        jbntVVendedor.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbntVVendedor.setForeground(new java.awt.Color(255, 255, 255));
        jbntVVendedor.setText("VENTAS POR VENDEDOR");
        jbntVVendedor.setBorder(null);
        jPanel3.add(jbntVVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 270, 30));

        jbntVCliente.setBackground(new java.awt.Color(47, 123, 123));
        jbntVCliente.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbntVCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbntVCliente.setText("VENTAS POR CLIENTE");
        jbntVCliente.setBorder(null);
        jPanel3.add(jbntVCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 270, 30));

        jbntVProducto.setBackground(new java.awt.Color(47, 123, 123));
        jbntVProducto.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbntVProducto.setForeground(new java.awt.Color(255, 255, 255));
        jbntVProducto.setText("VENTAS POR PRODUCTO");
        jbntVProducto.setBorder(null);
        jPanel3.add(jbntVProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 270, 30));
        jPanel3.add(jdcFFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 270, -1));
        jPanel3.add(jdcFInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 270, -1));

        jLabel19.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel19.setText("FECHA DE FIN");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 250, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1000, 160));

        jbtnCVentas.setBackground(new java.awt.Color(47, 123, 123));
        jbtnCVentas.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        jbtnCVentas.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCVentas.setText("CONSULTAR VENTAS");
        jbtnCVentas.setBorder(null);
        jPanel2.add(jbtnCVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 1000, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1030, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbntVCliente;
    public javax.swing.JButton jbntVProducto;
    public javax.swing.JButton jbntVVendedor;
    public javax.swing.JButton jbtnCVentas;
    public com.toedter.calendar.JDateChooser jdcFFin;
    public com.toedter.calendar.JDateChooser jdcFInicio;
    public javax.swing.JTable jtblDatos;
    // End of variables declaration//GEN-END:variables
}
