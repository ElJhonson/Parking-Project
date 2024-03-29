
import com.jhonson.parking.models.Archivero;
import com.jhonson.parking.models.Estacionamiento;
import com.jhonson.parking.models.Movimiento;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class LlegadaSalida extends javax.swing.JFrame {

    String archivoMov = System.getProperty("user.dir") + "/movimientos.jhonson";
    ArrayList<Movimiento> movimientos;

    public LlegadaSalida() {
        initComponents();
        this.setLocationRelativeTo(null);
        movimientos = new ArrayList();
        showInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TMovimientos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BVolver = new javax.swing.JButton();
        BNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Cargo", "Marca Vehiculo", "Placas", "No. Lugar", "Llegada", "Salida"
            }
        ));
        jScrollPane1.setViewportView(TMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 88, 800, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Llegadas y salidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 24, 423, 31));

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
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 90));

        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(BNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_BVolverActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        movimientos.clear();
        Archivero.escribir(archivoMov, movimientos);
        mostrarRegistro();
    }//GEN-LAST:event_BNuevoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LlegadaSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BVolver;
    private javax.swing.JTable TMovimientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void mostrarRegistro() {
        DefaultTableModel datos = (DefaultTableModel) TMovimientos.getModel();

        datos.setRowCount(0);
        for (Movimiento lg : movimientos) {
            if (lg != null && lg.getAuto() != null) {
                Object[] renglon = lg.toArray();
                datos.addRow(renglon);
            }
        }
    }

    public void showInfo() {
        movimientos = (ArrayList<Movimiento>) Archivero.leer(archivoMov);
        mostrarRegistro();
    }
}
