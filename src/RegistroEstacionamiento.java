
import com.jhonson.parking.models.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistroEstacionamiento extends javax.swing.JFrame {

    ImageIcon echo = new ImageIcon(getClass().getResource("/img/cheque.png"));
    ImageIcon error = new ImageIcon(getClass().getResource("/img/advertenciaP.png"));
    String archivo = System.getProperty("user.dir") + "/personalRegistro.jhonson";
    Estacionamiento[] lugares = new Estacionamiento[54];
    Conductor conductor;
    Auto auto;

    public RegistroEstacionamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BVolver = new javax.swing.JButton();
        LLogo = new javax.swing.JLabel();
        LBanner = new javax.swing.JLabel();
        BRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CBVehiculo = new javax.swing.JComboBox<>();
        TFNPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFApellido = new javax.swing.JTextField();
        TFMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SNEstacionamiento = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TFCargo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(492, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(506, 540));
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
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 50, 50));

        LLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoUdg (1).png"))); // NOI18N
        jPanel1.add(LLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 90, 90));

        LBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/panoramica_cucsur_copia (1).jpg"))); // NOI18N
        jPanel1.add(LBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 510, -1));

        BRegistrar.setBackground(new java.awt.Color(255, 51, 51));
        BRegistrar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        BRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BRegistrar.setText("Registrar");
        BRegistrar.setFocusPainted(false);
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(BRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 160, 50));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Estacionamiento");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 270, -1));

        CBVehiculo.setEditable(true);
        CBVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CBVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coche", "Camioneta", "Motocicleta" }));
        jPanel1.add(CBVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 130, 30));
        jPanel1.add(TFNPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 130, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Datos del vehiculo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos del conductor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));
        jPanel1.add(TFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 130, 30));
        jPanel1.add(TFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 120, 30));
        jPanel1.add(TFMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 120, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Cargo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Tipo de Vehiculo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Marca");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 70, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("No. placa");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 70, -1));

        SNEstacionamiento.setModel(new javax.swing.SpinnerNumberModel(1, 1, 54, 1));
        jPanel1.add(SNEstacionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("No. Estacionamiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, 20));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));
        jPanel1.add(TFCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 492, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed
        InterfaceParking iP = new InterfaceParking();
        this.setVisible(false);
        iP.setVisible(true);
    }//GEN-LAST:event_BVolverActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        Archivero.leer(archivo);
        lugares = (Estacionamiento[]) Archivero.leer(archivo);

        String nombre = TFNombre.getText();
        String apellido = TFApellido.getText();
        String cargo = TFCargo.getText();
        String tVehiculo = String.valueOf(CBVehiculo.getSelectedItem());
        String marca = TFMarca.getText();
        String nPlaca = TFNPlaca.getText();
        int nEsta = (int) SNEstacionamiento.getValue();

        if (!nombre.isBlank()
                && !apellido.isBlank()
                && !cargo.isBlank()
                && !marca.isBlank()
                && !nPlaca.isBlank()) {
            conductor = new Conductor(nombre, apellido, cargo);
            auto = new Auto(conductor, tVehiculo, marca, nPlaca);
            lugares[nEsta - 1] = new Estacionamiento(auto, nEsta);
            Archivero.escribir(archivo, lugares);
            JOptionPane.showMessageDialog(null, "Datos registrados correctamente", "Echo", JOptionPane.WARNING_MESSAGE, echo);
        } else {
            JOptionPane.showMessageDialog(null, "Llena los datos solicitados", "Error", JOptionPane.WARNING_MESSAGE, error);
        }
        limpiarCampos();

    }//GEN-LAST:event_BRegistrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEstacionamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegistrar;
    private javax.swing.JButton BVolver;
    private javax.swing.JComboBox<String> CBVehiculo;
    private javax.swing.JLabel LBanner;
    private javax.swing.JLabel LLogo;
    private javax.swing.JSpinner SNEstacionamiento;
    private javax.swing.JTextField TFApellido;
    private javax.swing.JTextField TFCargo;
    private javax.swing.JTextField TFMarca;
    private javax.swing.JTextField TFNPlaca;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        TFNombre.setText("");
        TFApellido.setText("");
        TFCargo.setText("");
        TFMarca.setText("");
        TFNPlaca.setText("");
        SNEstacionamiento.setValue(1);
    }
}
