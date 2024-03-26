
import com.jhonson.parking.models.Archivero;
import com.jhonson.parking.models.Estacionamiento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Registros extends javax.swing.JFrame {

    String archivo = System.getProperty("user.dir") + "/personalRegistro.jhonson";
    Estacionamiento[] lugares = new Estacionamiento[54];

    public Registros() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TRegistros = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BNuevo = new javax.swing.JButton();
        SNBorrar = new javax.swing.JSpinner();
        BBorrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        TRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cargo", "Fecha", "Vehículo", "Placas", "No. Lugar"
            }
        ));
        jScrollPane1.setViewportView(TRegistros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 730, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BVolver.setForeground(new java.awt.Color(255, 255, 255));
        BVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volver (3).png"))); // NOI18N
        BVolver.setBorderPainted(false);
        BVolver.setContentAreaFilled(false);
        BVolver.setFocusPainted(false);
        BVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Registro  de Estacionamiento UdeG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 350, 90));

        BNuevo.setBackground(new java.awt.Color(153, 153, 153));
        BNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BNuevo.setForeground(new java.awt.Color(255, 255, 255));
        BNuevo.setText("Nuevo");
        BNuevo.setFocusPainted(false);
        BNuevo.setMaximumSize(new java.awt.Dimension(100, 80));
        BNuevo.setPreferredSize(new java.awt.Dimension(60, 120));
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(BNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 110, 50));

        SNBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SNBorrar.setModel(new javax.swing.SpinnerNumberModel(1, 1, 54, 1));
        SNBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SNBorrar.setMaximumSize(new java.awt.Dimension(90, 70));
        SNBorrar.setMinimumSize(new java.awt.Dimension(30, 22));
        SNBorrar.setOpaque(true);
        SNBorrar.setPreferredSize(new java.awt.Dimension(5, 5));
        SNBorrar.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(SNBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 30));

        BBorrar.setBackground(new java.awt.Color(255, 102, 102));
        BBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BBorrar.setForeground(new java.awt.Color(255, 255, 255));
        BBorrar.setText("Borrar");
        BBorrar.setFocusPainted(false);
        BBorrar.setMaximumSize(new java.awt.Dimension(80, 100));
        BBorrar.setPreferredSize(new java.awt.Dimension(43, 50));
        BBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(BBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 80, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Lugar a borrar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 130, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panoramica_cucsur.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed
        InterfaceParking iP = new InterfaceParking();
        this.setVisible(false);
        iP.setVisible(true);
    }//GEN-LAST:event_BVolverActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        for (int l = 0; l < lugares.length; l++) {
            lugares[l] = new Estacionamiento();
        }
        Archivero.escribir(archivo, lugares);
        mostrarRegistro();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBorrarActionPerformed
        int numBorrar = (int) SNBorrar.getValue();
        for (int l = 0; l < lugares.length; l++) {
            if (lugares[l].getLugar() == numBorrar) {
                lugares[l] = new Estacionamiento();
                JOptionPane.showMessageDialog(null, "Borrado con éxito");
                break;
            }
        }
        Archivero.escribir(archivo, lugares);
        mostrarRegistro();

    }//GEN-LAST:event_BBorrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBorrar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BVolver;
    private javax.swing.JSpinner SNBorrar;
    private javax.swing.JTable TRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    private void mostrarRegistro() {
        DefaultTableModel datos = (DefaultTableModel) TRegistros.getModel();

        datos.setRowCount(0);
        for (Estacionamiento lg : lugares) {
            if (lg.getAuto() != null) {
                Object[] renglon = lg.toArray();
                datos.addRow(renglon);
            }
        }
    }

    private void mostrarInfo() {
        Archivero.leer(archivo);
        lugares = (Estacionamiento[]) Archivero.leer(archivo);
        mostrarRegistro();
    }
}
