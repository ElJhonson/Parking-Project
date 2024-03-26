
import com.jhonson.parking.models.Archivero;
import com.jhonson.parking.models.Estacionamiento;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class EstacionamientoUdG extends javax.swing.JFrame {

    String archivo = System.getProperty("user.dir") + "/personalRegistro.jhonson";
    Estacionamiento[] lugares = new Estacionamiento[54];
    JButton[] botones;

    ImageIcon[] vehiculos = new ImageIcon[]{
        new ImageIcon(getClass().getResource("/img/coche.png")),
        new ImageIcon(getClass().getResource("/img/camioneta.png")),
        new ImageIcon(getClass().getResource("/img/motocicleta.png"))
    };

    int indexV = 0;

    public EstacionamientoUdG() {
        setTitle("Estacionamiento UdG");
        initComponents();
        initBotones();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B13 = new javax.swing.JButton();
        B15 = new javax.swing.JButton();
        B14 = new javax.swing.JButton();
        B16 = new javax.swing.JButton();
        B17 = new javax.swing.JButton();
        B18 = new javax.swing.JButton();
        B19 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B26 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B34 = new javax.swing.JButton();
        B35 = new javax.swing.JButton();
        B36 = new javax.swing.JButton();
        B37 = new javax.swing.JButton();
        B38 = new javax.swing.JButton();
        B39 = new javax.swing.JButton();
        B40 = new javax.swing.JButton();
        B41 = new javax.swing.JButton();
        B42 = new javax.swing.JButton();
        B43 = new javax.swing.JButton();
        B44 = new javax.swing.JButton();
        B45 = new javax.swing.JButton();
        B46 = new javax.swing.JButton();
        B47 = new javax.swing.JButton();
        B48 = new javax.swing.JButton();
        B49 = new javax.swing.JButton();
        B50 = new javax.swing.JButton();
        B51 = new javax.swing.JButton();
        B52 = new javax.swing.JButton();
        B53 = new javax.swing.JButton();
        B54 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B1.setContentAreaFilled(false);
        B1.setFocusPainted(false);
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        B2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B2.setContentAreaFilled(false);
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        B3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B3.setContentAreaFilled(false);
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        B4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B4.setContentAreaFilled(false);
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        B5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B5.setContentAreaFilled(false);
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        B6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B6.setContentAreaFilled(false);
        jPanel1.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        B7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B7.setContentAreaFilled(false);
        jPanel1.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        B8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B8.setContentAreaFilled(false);
        jPanel1.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        B9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B9.setContentAreaFilled(false);
        jPanel1.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, -1, -1));

        B10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B10.setForeground(new java.awt.Color(255, 255, 255));
        B10.setText("10");
        B10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B10.setContentAreaFilled(false);
        jPanel1.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        B11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B11.setForeground(new java.awt.Color(255, 255, 255));
        B11.setText("11");
        B11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B11.setContentAreaFilled(false);
        jPanel1.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        B12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B12.setForeground(new java.awt.Color(255, 255, 255));
        B12.setText("12");
        B12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B12.setContentAreaFilled(false);
        jPanel1.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        B13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B13.setForeground(new java.awt.Color(255, 255, 255));
        B13.setText("13");
        B13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B13.setContentAreaFilled(false);
        jPanel1.add(B13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        B15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B15.setForeground(new java.awt.Color(255, 255, 255));
        B15.setText("15 ");
        B15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B15.setContentAreaFilled(false);
        jPanel1.add(B15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, -1, -1));

        B14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B14.setForeground(new java.awt.Color(255, 255, 255));
        B14.setText("14");
        B14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B14.setContentAreaFilled(false);
        jPanel1.add(B14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        B16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B16.setForeground(new java.awt.Color(255, 255, 255));
        B16.setText("16");
        B16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B16.setContentAreaFilled(false);
        jPanel1.add(B16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        B17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B17.setForeground(new java.awt.Color(255, 255, 255));
        B17.setText("17");
        B17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B17.setContentAreaFilled(false);
        jPanel1.add(B17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        B18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B18.setForeground(new java.awt.Color(255, 255, 255));
        B18.setText("18");
        B18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B18.setContentAreaFilled(false);
        jPanel1.add(B18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        B19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B19.setForeground(new java.awt.Color(255, 255, 255));
        B19.setText("19");
        B19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B19.setContentAreaFilled(false);
        jPanel1.add(B19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        B20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B20.setForeground(new java.awt.Color(255, 255, 255));
        B20.setText("20");
        B20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B20.setContentAreaFilled(false);
        jPanel1.add(B20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        B21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B21.setForeground(new java.awt.Color(255, 255, 255));
        B21.setText("21");
        B21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B21.setContentAreaFilled(false);
        jPanel1.add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        B22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B22.setForeground(new java.awt.Color(255, 255, 255));
        B22.setText("7");
        B22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B22.setContentAreaFilled(false);
        jPanel1.add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        B23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B23.setForeground(new java.awt.Color(255, 255, 255));
        B23.setText("8");
        B23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B23.setContentAreaFilled(false);
        jPanel1.add(B23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        B24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B24.setForeground(new java.awt.Color(255, 255, 255));
        B24.setText("9");
        B24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B24.setContentAreaFilled(false);
        jPanel1.add(B24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        B25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B25.setForeground(new java.awt.Color(255, 255, 255));
        B25.setText("10");
        B25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B25.setContentAreaFilled(false);
        jPanel1.add(B25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        B26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B26.setForeground(new java.awt.Color(255, 255, 255));
        B26.setText("11");
        B26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B26.setContentAreaFilled(false);
        jPanel1.add(B26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        B27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B27.setForeground(new java.awt.Color(255, 255, 255));
        B27.setText("12");
        B27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B27.setContentAreaFilled(false);
        jPanel1.add(B27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        B28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B28.setForeground(new java.awt.Color(255, 255, 255));
        B28.setText("1");
        B28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B28.setContentAreaFilled(false);
        jPanel1.add(B28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        B29.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B29.setForeground(new java.awt.Color(255, 255, 255));
        B29.setText("2");
        B29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B29.setContentAreaFilled(false);
        jPanel1.add(B29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        B30.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B30.setForeground(new java.awt.Color(255, 255, 255));
        B30.setText("3");
        B30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B30.setContentAreaFilled(false);
        jPanel1.add(B30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        B31.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B31.setForeground(new java.awt.Color(255, 255, 255));
        B31.setText("4");
        B31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B31.setContentAreaFilled(false);
        jPanel1.add(B31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        B32.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B32.setForeground(new java.awt.Color(255, 255, 255));
        B32.setText("5");
        B32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B32.setContentAreaFilled(false);
        jPanel1.add(B32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        B33.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B33.setForeground(new java.awt.Color(255, 255, 255));
        B33.setText("6");
        B33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B33.setContentAreaFilled(false);
        jPanel1.add(B33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        B34.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B34.setForeground(new java.awt.Color(255, 255, 255));
        B34.setText("7");
        B34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B34.setContentAreaFilled(false);
        jPanel1.add(B34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        B35.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B35.setForeground(new java.awt.Color(255, 255, 255));
        B35.setText("8");
        B35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B35.setContentAreaFilled(false);
        jPanel1.add(B35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        B36.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B36.setForeground(new java.awt.Color(255, 255, 255));
        B36.setText("9");
        B36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B36.setContentAreaFilled(false);
        jPanel1.add(B36, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        B37.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B37.setForeground(new java.awt.Color(255, 255, 255));
        B37.setText("10");
        B37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B37.setContentAreaFilled(false);
        jPanel1.add(B37, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));

        B38.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B38.setForeground(new java.awt.Color(255, 255, 255));
        B38.setText("11");
        B38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B38.setContentAreaFilled(false);
        jPanel1.add(B38, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        B39.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B39.setForeground(new java.awt.Color(255, 255, 255));
        B39.setText("12");
        B39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B39.setContentAreaFilled(false);
        jPanel1.add(B39, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        B40.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B40.setForeground(new java.awt.Color(255, 255, 255));
        B40.setText("13");
        B40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B40.setContentAreaFilled(false);
        jPanel1.add(B40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, -1, -1));

        B41.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B41.setForeground(new java.awt.Color(255, 255, 255));
        B41.setText("13");
        B41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B41.setContentAreaFilled(false);
        jPanel1.add(B41, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        B42.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B42.setForeground(new java.awt.Color(255, 255, 255));
        B42.setText("13");
        B42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B42.setContentAreaFilled(false);
        jPanel1.add(B42, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        B43.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B43.setForeground(new java.awt.Color(255, 255, 255));
        B43.setText("1");
        B43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B43.setContentAreaFilled(false);
        B43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B43ActionPerformed(evt);
            }
        });
        jPanel1.add(B43, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));

        B44.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B44.setForeground(new java.awt.Color(255, 255, 255));
        B44.setText("2");
        B44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B44.setContentAreaFilled(false);
        B44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B44ActionPerformed(evt);
            }
        });
        jPanel1.add(B44, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        B45.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B45.setForeground(new java.awt.Color(255, 255, 255));
        B45.setText("3");
        B45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B45.setContentAreaFilled(false);
        jPanel1.add(B45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        B46.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B46.setForeground(new java.awt.Color(255, 255, 255));
        B46.setText("4");
        B46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B46.setContentAreaFilled(false);
        jPanel1.add(B46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        B47.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B47.setForeground(new java.awt.Color(255, 255, 255));
        B47.setText("5");
        B47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B47.setContentAreaFilled(false);
        jPanel1.add(B47, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        B48.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B48.setForeground(new java.awt.Color(255, 255, 255));
        B48.setText("6");
        B48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B48.setContentAreaFilled(false);
        jPanel1.add(B48, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        B49.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B49.setForeground(new java.awt.Color(255, 255, 255));
        B49.setText("7");
        B49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B49.setContentAreaFilled(false);
        jPanel1.add(B49, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        B50.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B50.setForeground(new java.awt.Color(255, 255, 255));
        B50.setText("8");
        B50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B50.setContentAreaFilled(false);
        jPanel1.add(B50, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, -1, -1));

        B51.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B51.setForeground(new java.awt.Color(255, 255, 255));
        B51.setText("9");
        B51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B51.setContentAreaFilled(false);
        jPanel1.add(B51, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        B52.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B52.setForeground(new java.awt.Color(255, 255, 255));
        B52.setText("10");
        B52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B52.setContentAreaFilled(false);
        jPanel1.add(B52, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        B53.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B53.setForeground(new java.awt.Color(255, 255, 255));
        B53.setText("11");
        B53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B53.setContentAreaFilled(false);
        jPanel1.add(B53, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        B54.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        B54.setForeground(new java.awt.Color(255, 255, 255));
        B54.setText("12");
        B54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        B54.setContentAreaFilled(false);
        jPanel1.add(B54, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camara-de-seguridad.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arbol (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arbol (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 120, 10));

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 120, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 120, 10));

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 120, 10));

        jLabel8.setBackground(new java.awt.Color(255, 255, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 120, 10));

        jLabel9.setBackground(new java.awt.Color(255, 255, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 120, 10));

        BVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/girar-a-la-izquierda.png"))); // NOI18N
        BVolver.setBorderPainted(false);
        BVolver.setContentAreaFilled(false);
        BVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVolverActionPerformed(evt);
            }
        });
        jPanel1.add(BVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVolverActionPerformed
        this.setVisible(false);
        InterfaceParking iP = new InterfaceParking();
        iP.setVisible(true);
    }//GEN-LAST:event_BVolverActionPerformed

    private void B43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B43ActionPerformed

    private void B44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B44ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstacionamientoUdG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B13;
    private javax.swing.JButton B14;
    private javax.swing.JButton B15;
    private javax.swing.JButton B16;
    private javax.swing.JButton B17;
    private javax.swing.JButton B18;
    private javax.swing.JButton B19;
    private javax.swing.JButton B2;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B24;
    private javax.swing.JButton B25;
    private javax.swing.JButton B26;
    private javax.swing.JButton B27;
    private javax.swing.JButton B28;
    private javax.swing.JButton B29;
    private javax.swing.JButton B3;
    private javax.swing.JButton B30;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    private javax.swing.JButton B34;
    private javax.swing.JButton B35;
    private javax.swing.JButton B36;
    private javax.swing.JButton B37;
    private javax.swing.JButton B38;
    private javax.swing.JButton B39;
    private javax.swing.JButton B4;
    private javax.swing.JButton B40;
    private javax.swing.JButton B41;
    private javax.swing.JButton B42;
    private javax.swing.JButton B43;
    private javax.swing.JButton B44;
    private javax.swing.JButton B45;
    private javax.swing.JButton B46;
    private javax.swing.JButton B47;
    private javax.swing.JButton B48;
    private javax.swing.JButton B49;
    private javax.swing.JButton B5;
    private javax.swing.JButton B50;
    private javax.swing.JButton B51;
    private javax.swing.JButton B52;
    private javax.swing.JButton B53;
    private javax.swing.JButton B54;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BVolver;
    private javax.swing.JLabel jLabel1;
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

    private void ventanaEncontrado() {
        Encontrado encontrado = new Encontrado();
        encontrado.setVisible(true);

    }

    private void ventanaNoEncontrado() {
        NoEncontrado nE = new NoEncontrado();
        nE.setVisible(true);

    }

    private void initBotones() {
        lugares = (Estacionamiento[]) Archivero.leer(archivo);

        this.botones = new JButton[]{
            B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14,
            B15, B16, B17, B18, B19, B20, B21, B22, B23, B24, B25, B26,
            B27, B28, B29, B30, B31, B32, B33, B34, B35, B36, B37, B38,
            B39, B40, B41, B42, B43, B44, B45, B46, B47, B48, B49, B50,
            B51, B52, B53, B54
        };

        for (int i = 0; i < lugares.length; i++) {

            formatButtonsVoid(i);
            formatButtonsBusy(i);

        }

    }

    private void formatButtonsVoid(int indice) {

        botones[indice].setText("" + (indice + 1));
        botones[indice].setFocusPainted(false);
        botones[indice].setPreferredSize(new Dimension(40, 40));
    }

    private void formatButtonsBusy(int indice) {

        if (lugares[indice].getAuto() != null) {
            if (lugares[indice].getAuto().getTipoVehiculo().equals("Coche")) {
                indexV = 0;
            } else if (lugares[indice].getAuto().getTipoVehiculo().equals("Camioneta")) {
                indexV = 1;
            } else {
                indexV = 2;
            }
            botones[indice].setText("");
            botones[indice].setIcon(vehiculos[indexV]);
            botones[indice].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaEncontrado();
                }
            });
        } else {
            botones[indice].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaNoEncontrado();
                }
            });
        }
    }

}
