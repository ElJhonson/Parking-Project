public class InterfaceParking extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceParking
     */
    public InterfaceParking() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BEntrarEstacionamiento = new javax.swing.JButton();
        BVerRegistros = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        BNRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUdg (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/intfP.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 60, 610, 370));

        BEntrarEstacionamiento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BEntrarEstacionamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ingresar (1).png"))); // NOI18N
        BEntrarEstacionamiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estacionamiento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14))); // NOI18N
        BEntrarEstacionamiento.setContentAreaFilled(false);
        BEntrarEstacionamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BEntrarEstacionamiento.setFocusPainted(false);
        BEntrarEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarEstacionamientoActionPerformed(evt);
            }
        });
        jPanel1.add(BEntrarEstacionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 150, 170));

        BVerRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file.png"))); // NOI18N
        BVerRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ver Registros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14))); // NOI18N
        BVerRegistros.setContentAreaFilled(false);
        BVerRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BVerRegistros.setFocusPainted(false);
        BVerRegistros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BVerRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVerRegistrosActionPerformed(evt);
            }
        });
        jPanel1.add(BVerRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 150, 170));

        BSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton.png"))); // NOI18N
        BSalir.setBorderPainted(false);
        BSalir.setContentAreaFilled(false);
        BSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 50, 40));

        BNRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse.png"))); // NOI18N
        BNRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Registro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_BOTTOM, new java.awt.Font("Arial", 1, 14))); // NOI18N
        BNRegistro.setContentAreaFilled(false);
        BNRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BNRegistro.setFocusPainted(false);
        BNRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(BNRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 150, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_BSalirActionPerformed

    private void BEntrarEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarEstacionamientoActionPerformed
        EstacionamientoUdG est = new EstacionamientoUdG();
        this.setVisible(false);
        est.setVisible(true);
    }//GEN-LAST:event_BEntrarEstacionamientoActionPerformed

    private void BVerRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVerRegistrosActionPerformed
        Registros registros = new Registros();
        this.setVisible(false);
        registros.setVisible(true);
    }//GEN-LAST:event_BVerRegistrosActionPerformed

    private void BNRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNRegistroActionPerformed
        RegistroEstacionamiento rE = new RegistroEstacionamiento();
        this.setVisible(false);
        rE.setVisible(true);
    }//GEN-LAST:event_BNRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceParking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceParking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrarEstacionamiento;
    private javax.swing.JButton BNRegistro;
    private javax.swing.JButton BSalir;
    private javax.swing.JButton BVerRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
