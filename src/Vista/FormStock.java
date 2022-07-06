
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
        jPanel4 = new javax.swing.JPanel();
        field_codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fiel_marca = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fied_nombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        field_modelo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        field_precio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jcbxCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, -30, 150, 160));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CONTROL DE STOCK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 560, 60));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/favicon.png"))); // NOI18N
        jLabel2.setText("INFOCOM SAC");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1230, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        field_codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        field_codigo.setForeground(new java.awt.Color(153, 153, 153));
        field_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        field_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_codigoActionPerformed(evt);
            }
        });
        jPanel4.add(field_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 29, 290, 40));

        jLabel10.setText("CODIGO:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, -1, -1));

        jLabel11.setText("MARCA:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 12, -1, -1));

        fiel_marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fiel_marca.setForeground(new java.awt.Color(153, 153, 153));
        fiel_marca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(fiel_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 29, 290, 40));

        jLabel12.setText("PRECIO:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 75, -1, -1));

        fied_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fied_nombre.setForeground(new java.awt.Color(153, 153, 153));
        fied_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(fied_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 92, 592, 40));

        jLabel13.setText("NOMBRE:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 75, -1, -1));

        field_modelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        field_modelo.setForeground(new java.awt.Color(153, 153, 153));
        field_modelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(field_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 29, 290, 40));

        jLabel14.setText("MODELO:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 12, -1, -1));

        field_precio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        field_precio.setForeground(new java.awt.Color(153, 153, 153));
        field_precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel4.add(field_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 92, 290, 40));

        jLabel15.setText("CATEGORIA:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 12, -1, -1));

        btn_buscar.setBackground(new java.awt.Color(0, 204, 204));
        btn_buscar.setFont(new java.awt.Font("Roboto Light", 3, 14)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(null);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        jPanel4.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(999, 90, 160, 40));

        jPanel4.add(jcbxCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 290, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1230, 140));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N°", "CODIGO", "NOMBRE", "MODELO", "MARCA", "CATEGORIA", "CANTIDAD", "PRECIO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 1230, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void field_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_codigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_buscar;
    public javax.swing.JTextField fied_nombre;
    public javax.swing.JTextField fiel_marca;
    public javax.swing.JTextField field_codigo;
    public javax.swing.JTextField field_modelo;
    public javax.swing.JTextField field_precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JComboBox<String> jcbxCategorias;
    // End of variables declaration//GEN-END:variables
}
