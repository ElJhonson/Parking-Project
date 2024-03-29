
import com.jhonson.parking.models.Archivero;
import com.jhonson.parking.models.Auto;
import com.jhonson.parking.models.Conductor;
import com.jhonson.parking.models.Estacionamiento;
import com.jhonson.parking.models.Movimiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class Encontrado extends javax.swing.JFrame {

    String archivo = System.getProperty("user.dir") + "/personalRegistro.jhonson";
    String archivoMov = System.getProperty("user.dir") + "/movimientos.jhonson";
    Estacionamiento[] lugares = new Estacionamiento[54];
    ArrayList<Movimiento> movimientos = new ArrayList<>();

    public Encontrado() {
        initComponents();
        this.setLocationRelativeTo(null);
        lugares = (Estacionamiento[]) Archivero.leer(archivo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LApellido = new javax.swing.JLabel();
        LNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LCargo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BLlegada = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        LMarca = new javax.swing.JLabel();
        LEstacionam = new javax.swing.JLabel();
        LPlaca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro encontrado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 390, 60));

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
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Este lugar está registrado para: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 270, 60));

        LApellido.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(LApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 30));

        LNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(LNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estacionamiento (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Con cargo en: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 170, 20));

        LCargo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 170, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Marca");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("No. placa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("No. Estacionamiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 20));

        BLlegada.setBackground(new java.awt.Color(255, 51, 51));
        BLlegada.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        BLlegada.setForeground(new java.awt.Color(255, 255, 255));
        BLlegada.setText("Registrar Llegada");
        BLlegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLlegadaActionPerformed(evt);
            }
        });
        jPanel1.add(BLlegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 230, 60));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 90, 20));

        LMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LMarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 120, 30));

        LEstacionam.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LEstacionam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LEstacionam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 140, 30));

        LPlaca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_BVolverActionPerformed

    private void BLlegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLlegadaActionPerformed
        movimientos = (ArrayList<Movimiento>) Archivero.leer(archivoMov);

        Conductor conductor = new Conductor(LNombre.getText(), LApellido.getText(), LCargo.getText());
        Auto auto = new Auto(conductor, "", LMarca.getText(), LPlaca.getText());
        Estacionamiento estacionamiento = new Estacionamiento(auto, Integer.parseInt(LEstacionam.getText()));

        boolean lugarDisponible = true;

        for (Movimiento mov : movimientos) {
            if (mov.getAuto() != null && mov.getEstacionamiento().getLugar() == estacionamiento.getLugar()) {
                lugarDisponible = false;
                break;
            }
        }

        if (lugarDisponible) {
            movimientos.add(new Movimiento(conductor, auto, estacionamiento));
            Archivero.escribir(archivoMov, movimientos);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error en Registro: El lugar de estacionamiento ya está ocupado.");
            this.setVisible(false);
        }
    }//GEN-LAST:event_BLlegadaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encontrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLlegada;
    private javax.swing.JButton BVolver;
    private javax.swing.JLabel LApellido;
    private javax.swing.JLabel LCargo;
    private javax.swing.JLabel LEstacionam;
    private javax.swing.JLabel LMarca;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public void showInfo(int indice, String nombre, String apellido, String cargo,
            String marca, String placa, int lugar) {
        if (lugares[indice] != null) {
            LNombre.setText(nombre);
            LApellido.setText(apellido);
            LCargo.setText(cargo);
            LMarca.setText(marca);
            LPlaca.setText(placa);
            LEstacionam.setText(String.valueOf(lugar));
        }
    }

}
