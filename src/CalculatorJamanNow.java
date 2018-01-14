import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class CalculatorJamanNow extends javax.swing.JFrame {
    
    private int diffX = -1, diffY = -1;
    private JLabel lblInfo;
    private String firstValue = "0";
    private String secondValue = "";
    private String op = "";
    private boolean alreadyEvaluated = false;
    private String leftDisplay = "", 
            opDisplay = "", 
            rightDisplay = "";

    public CalculatorJamanNow() {
        initComponents();
        this.setTitle("Calculator Jaman Now");
        this.setLocationRelativeTo(null);
        lblScreen.setText(firstValue);
        lblStatus.setText("");
        lblInfo = new JLabel(
            "<html>\n" +
            "  <head>\n" +
            "    <style type=\"text/css\">\n" +
            "      body {\n" +
            "        padding: 8px;\n" +
            "        font-family: arial;\n" +
            "        font-size: 10px;\n" +
            "        color: black;\n" +
            "        background-color: white;\n" +
            "        width: 600px;\n" +
            "      }\n" +
            "      table {border-collapse: collapse;}\n" +
            "      td {border: 1px solid black; padding: 1px 8px; font-size:10px;}\n" +
            "    </style>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <h1 style=\"text-align: center;\">\n" +
            "      Calculator <span style=\"color: rgb(17,214,214);\">Jaman Now</span>\n" +
            "    </h1>\n" +
            "    <p style=\"text-align: justify\">\n" +
            "      Calculator <span style=\"color: rgb(0,195,195);\">Jaman Now</span> adalah sebuah aplikasi kalkulator sederhana \n" +
            "      dengan fitur-fitur standar untuk operasi matematika dasar.\n" +
            "      Fitur-fitur aplikasi ini dibuat sedemikian rupa agar menyerupai\n" +
            "      kalkulator analog yang dimana tentunya semua orang sudah nyaman menggunakan\n" +
            "      kalkulator jenis ini.\n" +
            "      Aplikasi ini juga merupakan sebuah realisasi dari tugas yang\n" +
            "      diberikan oleh Pak Felix Valentine selaku dosen saya dalam mata kuliah \n" +
            "      \"Pengembangan Aplikasi\".\n" +
            "    </p>\n" +
            "    <br/>\n" +
            "    <p style=\"text-align: justify\">\n" +
            "      Cara menggunakan kalkulator ini tentu sudah sangat jelas, yaitu\n" +
            "      dengan mengklik tombol-tombol yang telah disediakan. Disamping itu, \n" +
            "      Calculator <span style=\"color: rgb(0,195,195);\">Jaman Now</span> juga mendukung input melalui keyboard. <br/>\n" +
            "    </p>\n" +
            "    <br/>\n" +
            "    <p>\n" +
            "      Berikut adalah relasi antara tombol keyboard dengan tombol kalkulator:\n" +
            "    </p>\n" +
            "    <br/>\n" +
            "    <table>\n" +
            "      <tr><td>0-9</td><td>angka 0-9</td></tr>\n" +
            "      <tr><td>.</td><td>tanda koma</td></tr>\n" +
            "      <tr><td>m, M</td><td>invers(positif/negatif)</td></tr>\n" +
            "      <tr><td>+</td><td>operasi pertambahan</td></tr>\n" +
            "      <tr><td>-</td><td>operasi pengurangan</td></tr>\n" +
            "      <tr><td>*, x, X</td><td>operasi perkalian</td></tr>\n" +
            "      <tr><td>/</td><td>operasi pembagian</td></tr>\n" +
            "      <tr><td>%</td><td>operasi modulo</td></tr>\n" +
            "      <tr><td>q, Q</td><td>operasi pemangkatan (pangkat n)</td></tr>\n" +
            "      <tr><td>w, W</td><td>operasi pemangkatan kuadrat (pangkat 2)</td></tr>\n" +
            "      <tr><td>e, E</td><td>operasi akar kuadrat (pangkat 2)</td></tr>\n" +
            "      <tr><td>r, R</td><td>operasi pengakaran (pangkat n)</td></tr>\n" +
            "      <tr><td>=, ENTER</td><td>perintah \"hitung\"</td></tr>\n" +
            "      <tr><td>c, C, DELETE</td><td>perintah \"hapus layar\"</td></tr>\n" +
            "      <tr><td>BACKSPACE</td><td>perintah \"hapus angka terakhir\"</td></tr>\n" +
            "    </table>\n" +
            "    <br/>\n" +
            "    <p style=\"text-align:right; font-weight:bold;\">\n" +
            "      Dibuat oleh: Irvin Delano (03081170007) - 17IS1 - github(delanobgt)\n" +
            "    </p>\n" +
            "  </body>\n" +
            "</html>"
        );
        //System.out.println(lblInfo.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        pnlTitle = new javax.swing.JPanel();
        lblJamanNow = new javax.swing.JLabel();
        lblCalculator = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        lblScreen = new javax.swing.JLabel();
        btnPlus = new javax.swing.JLabel();
        btn9 = new javax.swing.JLabel();
        btnDot = new javax.swing.JLabel();
        btn0 = new javax.swing.JLabel();
        btnEqual = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        btn5 = new javax.swing.JLabel();
        btn6 = new javax.swing.JLabel();
        btnMinus = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        btnDel = new javax.swing.JLabel();
        btn8 = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        btnXN = new javax.swing.JLabel();
        btnCross = new javax.swing.JLabel();
        btnSlash = new javax.swing.JLabel();
        btnRoot = new javax.swing.JLabel();
        btnSqrt = new javax.swing.JLabel();
        btnX2 = new javax.swing.JLabel();
        btn7 = new javax.swing.JLabel();
        btnClr = new javax.swing.JLabel();
        btnMod = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnToggle = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTextPane1);

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(320, 420));
        setMinimumSize(new java.awt.Dimension(320, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(320, 420));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlTitle.setBackground(new java.awt.Color(51, 51, 51));
        pnlTitle.setFocusable(false);
        pnlTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTitleMouseDragged(evt);
            }
        });
        pnlTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTitleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnlTitleMouseReleased(evt);
            }
        });
        pnlTitle.setLayout(null);

        lblJamanNow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblJamanNow.setForeground(new java.awt.Color(17, 214, 214));
        lblJamanNow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJamanNow.setText("Jaman Now");
        lblJamanNow.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlTitle.add(lblJamanNow);
        lblJamanNow.setBounds(74, 0, 98, 30);

        lblCalculator.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCalculator.setForeground(new java.awt.Color(255, 255, 255));
        lblCalculator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCalculator.setText("Calculator");
        lblCalculator.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlTitle.add(lblCalculator);
        lblCalculator.setBounds(0, 0, 88, 30);

        btnMinimize.setBackground(new java.awt.Color(51, 51, 51));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnMinimize.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setText("-");
        btnMinimize.setOpaque(true);
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titleButtonMouseClicked(evt);
            }
        });
        pnlTitle.add(btnMinimize);
        btnMinimize.setBounds(260, 0, 30, 30);

        btnClose.setBackground(new java.awt.Color(51, 51, 51));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titleButtonMouseClicked(evt);
            }
        });
        pnlTitle.add(btnClose);
        btnClose.setBounds(290, 0, 30, 30);

        btnAbout.setBackground(new java.awt.Color(51, 51, 51));
        btnAbout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAbout.setForeground(new java.awt.Color(255, 255, 255));
        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAbout.setText("?");
        btnAbout.setOpaque(true);
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titleButtonMouseClicked(evt);
            }
        });
        pnlTitle.add(btnAbout);
        btnAbout.setBounds(230, 0, 30, 30);

        getContentPane().add(pnlTitle);
        pnlTitle.setBounds(0, 0, 320, 30);

        lblScreen.setBackground(new java.awt.Color(255, 255, 255));
        lblScreen.setFont(new java.awt.Font("Tahoma", 0, 38)); // NOI18N
        lblScreen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblScreen.setText("0");
        lblScreen.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblScreen.setFocusable(false);
        lblScreen.setOpaque(true);
        getContentPane().add(lblScreen);
        lblScreen.setBounds(0, 30, 320, 60);

        btnPlus.setBackground(new java.awt.Color(17, 214, 214));
        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPlus.setText("+");
        btnPlus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPlus.setFocusable(false);
        btnPlus.setOpaque(true);
        btnPlus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnPlus);
        btnPlus.setBounds(240, 320, 80, 50);

        btn9.setBackground(new java.awt.Color(0, 195, 195));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn9.setFocusable(false);
        btn9.setOpaque(true);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(160, 220, 80, 50);

        btnDot.setBackground(new java.awt.Color(17, 214, 214));
        btnDot.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDot.setText(".");
        btnDot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDot.setFocusable(false);
        btnDot.setOpaque(true);
        btnDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btnDot);
        btnDot.setBounds(160, 370, 80, 50);

        btn0.setBackground(new java.awt.Color(0, 195, 195));
        btn0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn0.setFocusable(false);
        btn0.setOpaque(true);
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(80, 370, 80, 50);

        btnEqual.setBackground(new java.awt.Color(17, 214, 214));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(255, 255, 255));
        btnEqual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEqual.setText("=");
        btnEqual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEqual.setFocusable(false);
        btnEqual.setOpaque(true);
        btnEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEqualMouseClicked(evt);
            }
        });
        getContentPane().add(btnEqual);
        btnEqual.setBounds(240, 370, 80, 50);

        btn1.setBackground(new java.awt.Color(0, 195, 195));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn1.setFocusable(false);
        btn1.setOpaque(true);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(0, 320, 80, 50);

        btn4.setBackground(new java.awt.Color(0, 195, 195));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn4.setFocusable(false);
        btn4.setOpaque(true);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(0, 270, 80, 50);

        btn5.setBackground(new java.awt.Color(0, 195, 195));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn5.setFocusable(false);
        btn5.setOpaque(true);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(80, 270, 80, 50);

        btn6.setBackground(new java.awt.Color(0, 195, 195));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn6.setFocusable(false);
        btn6.setOpaque(true);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(160, 270, 80, 50);

        btnMinus.setBackground(new java.awt.Color(17, 214, 214));
        btnMinus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnMinus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinus.setText("-");
        btnMinus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnMinus.setFocusable(false);
        btnMinus.setOpaque(true);
        btnMinus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnMinus);
        btnMinus.setBounds(240, 270, 80, 50);

        btn2.setBackground(new java.awt.Color(0, 195, 195));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn2.setFocusable(false);
        btn2.setOpaque(true);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(80, 320, 80, 50);

        btnDel.setBackground(new java.awt.Color(17, 214, 214));
        btnDel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDel.setText("=>");
        btnDel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDel.setFocusable(false);
        btnDel.setOpaque(true);
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                delBtnClicked(evt);
            }
        });
        getContentPane().add(btnDel);
        btnDel.setBounds(160, 170, 80, 50);

        btn8.setBackground(new java.awt.Color(0, 195, 195));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn8.setFocusable(false);
        btn8.setOpaque(true);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(80, 220, 80, 50);

        btn3.setBackground(new java.awt.Color(0, 195, 195));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn3.setFocusable(false);
        btn3.setOpaque(true);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(160, 320, 80, 50);

        btnXN.setBackground(new java.awt.Color(17, 214, 214));
        btnXN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnXN.setForeground(new java.awt.Color(255, 255, 255));
        btnXN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnXN.setText("<html>" +
            "<body>" +
            "x<sup>n</sup>" +
            "</body>" +
            "</html>");
        btnXN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnXN.setFocusable(false);
        btnXN.setOpaque(true);
        btnXN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnXN);
        btnXN.setBounds(0, 120, 80, 50);

        btnCross.setBackground(new java.awt.Color(17, 214, 214));
        btnCross.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCross.setForeground(new java.awt.Color(255, 255, 255));
        btnCross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCross.setText("x");
        btnCross.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCross.setFocusable(false);
        btnCross.setOpaque(true);
        btnCross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnCross);
        btnCross.setBounds(240, 220, 80, 50);

        btnSlash.setBackground(new java.awt.Color(17, 214, 214));
        btnSlash.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnSlash.setForeground(new java.awt.Color(255, 255, 255));
        btnSlash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSlash.setText("/");
        btnSlash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSlash.setFocusable(false);
        btnSlash.setOpaque(true);
        btnSlash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnSlash);
        btnSlash.setBounds(240, 170, 80, 50);

        btnRoot.setBackground(new java.awt.Color(17, 214, 214));
        btnRoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRoot.setForeground(new java.awt.Color(255, 255, 255));
        btnRoot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRoot.setText("<html>" +
            "<body>" +
            "<sup>n</sup>&radic" +
            "</body>" +
            "</html>");
        btnRoot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRoot.setFocusable(false);
        btnRoot.setOpaque(true);
        btnRoot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnRoot);
        btnRoot.setBounds(240, 120, 80, 50);

        btnSqrt.setBackground(new java.awt.Color(17, 214, 214));
        btnSqrt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnSqrt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSqrt.setText("<html>" +
            "<body>" +
            "&radic" +
            "</body>" +
            "</html>");
        btnSqrt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSqrt.setFocusable(false);
        btnSqrt.setOpaque(true);
        btnSqrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                unaOpMouseReleased(evt);
            }
        });
        getContentPane().add(btnSqrt);
        btnSqrt.setBounds(160, 120, 80, 50);

        btnX2.setBackground(new java.awt.Color(17, 214, 214));
        btnX2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnX2.setForeground(new java.awt.Color(255, 255, 255));
        btnX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnX2.setText("<html>" +
            "<body>" +
            "x<sup>2</sup>" +
            "</body>" +
            "</html>");
        btnX2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnX2.setFocusable(false);
        btnX2.setOpaque(true);
        btnX2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                unaOpMouseReleased(evt);
            }
        });
        getContentPane().add(btnX2);
        btnX2.setBounds(80, 120, 80, 50);

        btn7.setBackground(new java.awt.Color(0, 195, 195));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn7.setText("7");
        btn7.setToolTipText("[14,205,205]");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn7.setFocusable(false);
        btn7.setOpaque(true);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                digitBtnMouseReleased(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(0, 220, 80, 50);

        btnClr.setBackground(new java.awt.Color(17, 214, 214));
        btnClr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClr.setForeground(new java.awt.Color(255, 255, 255));
        btnClr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClr.setText("CLR");
        btnClr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnClr.setFocusable(false);
        btnClr.setOpaque(true);
        btnClr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnClrMouseReleased(evt);
            }
        });
        getContentPane().add(btnClr);
        btnClr.setBounds(0, 170, 80, 50);

        btnMod.setBackground(new java.awt.Color(17, 214, 214));
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMod.setText("MOD");
        btnMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnMod.setFocusable(false);
        btnMod.setOpaque(true);
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                binOpButtonMouseClicked(evt);
            }
        });
        getContentPane().add(btnMod);
        btnMod.setBounds(80, 170, 80, 50);

        lblStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(153, 153, 153));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStatus.setText("jLabel1");
        lblStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lblStatus.setFocusable(false);
        lblStatus.setOpaque(true);
        lblStatus.setPreferredSize(new java.awt.Dimension(320, 30));
        getContentPane().add(lblStatus);
        lblStatus.setBounds(0, 90, 320, 30);

        btnToggle.setBackground(new java.awt.Color(17, 214, 214));
        btnToggle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnToggle.setForeground(new java.awt.Color(255, 255, 255));
        btnToggle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnToggle.setText("+/-");
        btnToggle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnToggle.setFocusable(false);
        btnToggle.setOpaque(true);
        btnToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnToggleMouseReleased(evt);
            }
        });
        getContentPane().add(btnToggle);
        btnToggle.setBounds(0, 370, 80, 50);

        pack();
    }// </editor-fold>                        

    //titleBar moving by dragging events
    private void pnlTitleMousePressed(java.awt.event.MouseEvent evt) {                                      
        diffX = evt.getX();
        diffY = evt.getY();
    }                                     
    private void pnlTitleMouseReleased(java.awt.event.MouseEvent evt) {                                       
        diffX = -1;
        diffY = -1;
    }                                      
    private void pnlTitleMouseDragged(java.awt.event.MouseEvent evt) {                                      
        this.setLocation(
                evt.getXOnScreen()-diffX,
                evt.getYOnScreen()-diffY
            );
    }                                     

    //titleBar buttons events
    private void titleButtonMouseEntered(java.awt.event.MouseEvent evt) {                                         
        JLabel titleBtn = (JLabel)evt.getSource();
        if (titleBtn == btnClose) {
            titleBtn.setBackground(new Color(232, 66, 66));
        } else if (titleBtn == btnMinimize || titleBtn == btnAbout) {
            titleBtn.setBackground(new Color(77, 77, 77));
        }
    }                                        
    private void titleButtonMouseExited(java.awt.event.MouseEvent evt) {                                        
        JLabel titleBtn = (JLabel)evt.getSource();
        titleBtn.setBackground(new Color(51, 51, 51));
    }                                       
    private void titleButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        JLabel titleBtn = (JLabel)evt.getSource();
        if (titleBtn == btnClose) {
            System.exit(0);
        } else if (titleBtn == btnMinimize) {
            this.setState(JFrame.ICONIFIED);
        } else if (titleBtn == btnAbout) {
            JOptionPane.showMessageDialog(
                    this,
                    lblInfo,
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }                                        

    //calculator button animation
    private void calcBtnMouseEntered(java.awt.event.MouseEvent evt) {                                     
        JLabel calcBtn = (JLabel)evt.getSource();
        calcBtn.setBackground(new Color(15, 176, 176));
    }                                    
    private void calcBtnMouseExited(java.awt.event.MouseEvent evt) {                                    
        JLabel calcBtn = (JLabel)evt.getSource();
        char ch = calcBtn.getText().charAt(0);
        if ('0' <= ch && ch <= '9') {
//            calcBtn.setBackground(new Color(17, 214, 214));
            calcBtn.setBackground(new Color(0, 195, 195));
        } else {
            calcBtn.setBackground(new Color(17, 214, 214));
        }
    }                                   
    
    // = button
    private void btnEqualMouseClicked(java.awt.event.MouseEvent evt) {                                      
        if (op.equals("") || secondValue.equals("")) {
            updateScreenFinal(Double.parseDouble(firstValue));
        } else {
            double resultValue = evaluateExpression();
            firstValue = String.valueOf(resultValue);
            alreadyEvaluated = true;
            updateScreenFinal(resultValue);
            updateExpStatus(firstValue, "", "");
        }
    }                                     
    
    //the beginning of suffering to add expression status feature
    // <= button
    private void delBtnClicked(java.awt.event.MouseEvent evt) {                               
        if (alreadyEvaluated) {
            alreadyEvaluated = false;
            op = "";
            secondValue = "";
            firstValue = prepareValueForScreen("0");
            updateScreen(firstValue);
            updateExpStatus(firstValue, op, secondValue);
        } else if (op.equals("")) {
            if (firstValue.length() == 0) return;
            firstValue = firstValue.substring(0, firstValue.length()-1);
            if (firstValue.equals("-")) firstValue = "";
            firstValue = prepareValueForScreen(firstValue);
            updateScreen(firstValue);
            updateExpStatus(firstValue, null, null);
        } else {
            if (secondValue.length() == 0) return;
            secondValue = secondValue.substring(0, secondValue.length()-1);
            if (secondValue.equals("-")) secondValue = "";
            secondValue = prepareValueForScreen(secondValue);
            updateScreen(secondValue);
            updateExpStatus(null, null, secondValue);
        }
    }                              

    //digit and dot button clicked event
    private void digitBtnMouseReleased(java.awt.event.MouseEvent evt) {                                       
        JLabel lbl = (JLabel)evt.getSource();
        String ch = lbl.getText().charAt(0)+"";
        if (alreadyEvaluated) {
            alreadyEvaluated = false;
            op = "";
            secondValue = "";
            firstValue = "0";
            updateExpStatus("0", "", "");
        }
        if (op.equals("")) {
            firstValue += ch;
            firstValue = prepareValueForScreen(firstValue);
            updateScreen(firstValue);
            updateExpStatus(firstValue, null, null);
        } else {
            secondValue += ch;
            secondValue = prepareValueForScreen(secondValue);
            updateScreen(secondValue);
            updateExpStatus(null, null, secondValue);
        }
    }                                      

    // binary operator clicked event
    private void binOpButtonMouseClicked(java.awt.event.MouseEvent evt) {                                         
        if (!secondValue.equals("")) {
            if (alreadyEvaluated) {
                alreadyEvaluated = false;
            } else if (!alreadyEvaluated) {
                double resultValue = evaluateExpression();
                firstValue = updateScreenFinal(resultValue);
            }
            secondValue = "";
        }
        JLabel btn = ((JLabel)evt.getSource());
        op = btn.getText();
        updateExpStatus(firstValue, op, secondValue);
    }                                        

    private void btnClrMouseReleased(java.awt.event.MouseEvent evt) {                                     
        alreadyEvaluated = false;
        op = "";
        secondValue = "";
        firstValue = prepareValueForScreen("0");
        updateScreen(firstValue);
        updateExpStatus("", "", "");
    }                                    

    private void btnToggleMouseReleased(java.awt.event.MouseEvent evt) {                                        
        if (alreadyEvaluated) {
            alreadyEvaluated = false;
            op = "";
            secondValue = "";
            if (firstValue.equals("0")) return;
            
            if (firstValue.charAt(0) == '-') firstValue = firstValue.substring(1);
            else firstValue = "-"+firstValue;
            
            if (!firstValue.equals("") && !firstValue.contains(","))
            firstValue = getScreenFinalFormat(Double.parseDouble(firstValue));
            
            updateScreen(firstValue);
            updateExpStatus(firstValue, op, secondValue);
        } else if (op.equals("")) {
            if (firstValue.equals("0")) return;
            if (firstValue.charAt(0) == '-') firstValue = firstValue.substring(1);
            else firstValue = "-"+firstValue;
            updateScreen(firstValue);
            updateExpStatus(firstValue, null, null);
        } else if (secondValue.equals("")) {
            return;
        } else {
            if (secondValue.equals("0")) return;
            if (secondValue.charAt(0) == '-') secondValue = secondValue.substring(1);
            else secondValue = "-"+secondValue;
            updateScreen(secondValue);
            updateExpStatus(null, null, secondValue);
        }
    }                                       

    private void unaOpMouseReleased(java.awt.event.MouseEvent evt) {                                    
        if (alreadyEvaluated) {
            alreadyEvaluated = false;
            op = "";
            secondValue = "";
            double resultValue = applyUnary(firstValue, evt.getSource());
            firstValue = updateScreenFinal(resultValue);
            updateExpStatus(firstValue, op, secondValue);
        } else if (op.equals("")) {            
            double resultValue = applyUnary(firstValue, evt.getSource());
            firstValue = updateScreenFinal(resultValue);
            updateExpStatus(firstValue, null, null);
        } else if (secondValue.equals("")) {
            op = "";
            double resultValue = applyUnary(firstValue, evt.getSource());
            firstValue = updateScreenFinal(resultValue);
            updateExpStatus(firstValue, null, null);
        } else {
            double resultValue = applyUnary(secondValue, evt.getSource());
            secondValue = updateScreenFinal(resultValue);
            updateExpStatus(null, null, secondValue);
        }
    }                                   

    private void formKeyPressed(java.awt.event.KeyEvent evt) {                                
        int code = evt.getKeyCode();
        char ch = evt.getKeyChar();
        
        if (ch == '0') invoke(btn0);
        else if (ch == '1') invoke(btn1);
        else if (ch == '2') invoke(btn2);
        else if (ch == '3') invoke(btn3);
        else if (ch == '4') invoke(btn4);
        else if (ch == '5') invoke(btn5);
        else if (ch == '6') invoke(btn6);
        else if (ch == '7') invoke(btn7);
        else if (ch == '8') invoke(btn8);
        else if (ch == '9') invoke(btn9);
        else if (ch == '.') invoke(btnDot);
        else if (ch == 'm' || ch == 'M') invoke(btnToggle);
        
        else if (ch == '/') invoke(btnSlash);
        else if (ch == '*' || ch == 'x' || ch == 'X') invoke(btnCross);
        else if (ch == '-') invoke(btnMinus);
        else if (ch == '+') invoke(btnPlus);
        else if (ch == '=' || ch == '\n') invoke(btnEqual);
        
        else if (ch=='c'||ch=='C'||code==KeyEvent.VK_DELETE) invoke(btnClr);
        else if (ch == '%') invoke(btnMod);
        else if (code == KeyEvent.VK_BACK_SPACE) invoke(btnDel);
        
        else if (ch == 'q' || ch == 'Q') invoke(btnXN);
        else if (ch == 'w' || ch == 'W') invoke(btnX2);
        else if (ch == 'e' || ch == 'E') invoke(btnSqrt);
        else if (ch == 'r' || ch == 'R') invoke(btnRoot);
    }                               

    //my private helper methods
    private void invoke(JLabel btn) {
        for (MouseListener ml : btn.getMouseListeners()) {
            ml.mouseReleased(
                new MouseEvent(btn, 0, 0, 0, 0, 0, 1, true)
            );
        }
    }
    private void updateExpStatus(String a, String b, String c) {
        if (a != null) leftDisplay = a;
        if (b != null) opDisplay = b;
        if (c != null) rightDisplay = c;
        if (!leftDisplay.equals("") && !leftDisplay.contains(","))
            leftDisplay = getScreenFinalFormat(Double.parseDouble(leftDisplay));
        if (!rightDisplay.equals("") && !rightDisplay.contains(","))
            rightDisplay = getScreenFinalFormat(Double.parseDouble(rightDisplay));
        if (opDisplay.contains("x<sup>n</sup>")) {
            lblStatus.setText(leftDisplay+"^"+rightDisplay);
            lblStatus.setText(String.format(
                    "(%s)^%s",
                    leftDisplay,
                    rightDisplay
            ));
        } else if (opDisplay.contains("<sup>n</sup>&radic")) {
            lblStatus.setText(String.format(
                    "root%s(%s)",
                    rightDisplay.length() == 0 ? "N" : rightDisplay,
                    leftDisplay
            ));
        } else {
            lblStatus.setText(leftDisplay+" "+opDisplay+" "+rightDisplay);
        }
    }
    private double applyUnary(String s, Object source) {
        s = s.replace(",", "");
        double first = Double.valueOf(s);        
        if (source == btnX2) {
            first = first*first;
        } else if (source == btnSqrt) {
            first = Math.sqrt(first);
        }
        return first;
    }
    private double evaluateExpression() {
        firstValue = firstValue.replace(",", "");
        secondValue = secondValue.replace(",", "");
        double first = Double.valueOf(firstValue);
        double second = Double.valueOf(secondValue);
        double finalValue = -1;
        if (op.equals("+")) {
            finalValue = first+second;
        } else if (op.equals("-")) {
            finalValue = first-second;
        } else if (op.equals("x")) {
            finalValue = first*second;
        } else if (op.equals("/")) {
            finalValue = first/second;
        } else if (op.equals("MOD")) {
            finalValue = first%second;
        } else if (op.contains("x")) {
            finalValue = Math.pow(first, second);
        } else if (op.contains("&radic")) {
            finalValue = Math.pow(first, 1.0/second);
        }
        return finalValue;
    }
    //temporary format when user is doing input
    private String prepareValueForScreen(String str) {
        //remove prefix zeros
        if (!str.contains(".")) {
            str = str.replaceFirst("^0+", "");
            if (str.length() == 0) str = "0";
        }
        //remove extra dot
        if (str.indexOf(".") != str.lastIndexOf("."))
            str = str.substring(0, str.length()-1);
        //limit the number of digits
        final int limit = 14;
        if (str.length() > limit)
            str = str.substring(0, limit);
        return str;
    }
    private void updateScreen(String str) {
        lblScreen.setText(str);
    }
    //display & return final format for displaying result
    private String updateScreenFinal(double d) {
        String str = String.format("%,.8f", d);
        
        int i = str.length()-1;
        while (str.charAt(i--) == '0');
        str = str.substring(0, i+2);
        
        int dotIndex = str.indexOf(".");
        if (dotIndex+1 == str.length())
            str = str.substring(0, dotIndex);
        lblScreen.setText(str);
        return str;
    }
    //return final format for displaying result
    private String getScreenFinalFormat(double d) {
        String str = String.format("%,.8f", d);
        
        int i = str.length()-1;
        while (str.charAt(i--) == '0');
        str = str.substring(0, i+2);
        
        int dotIndex = str.indexOf(".");
        if (dotIndex+1 == str.length())
            str = str.substring(0, dotIndex);
        return str;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorJamanNow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel btn0;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn5;
    private javax.swing.JLabel btn6;
    private javax.swing.JLabel btn7;
    private javax.swing.JLabel btn8;
    private javax.swing.JLabel btn9;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnClr;
    private javax.swing.JLabel btnCross;
    private javax.swing.JLabel btnDel;
    private javax.swing.JLabel btnDot;
    private javax.swing.JLabel btnEqual;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JLabel btnMinus;
    private javax.swing.JLabel btnMod;
    private javax.swing.JLabel btnPlus;
    private javax.swing.JLabel btnRoot;
    private javax.swing.JLabel btnSlash;
    private javax.swing.JLabel btnSqrt;
    private javax.swing.JLabel btnToggle;
    private javax.swing.JLabel btnX2;
    private javax.swing.JLabel btnXN;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblCalculator;
    private javax.swing.JLabel lblJamanNow;
    private javax.swing.JLabel lblScreen;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel pnlTitle;
    // End of variables declaration                   
}
