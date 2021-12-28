 
package testeav2;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import static javax.swing.UIManager.setLookAndFeel;
import javax.swing.UnsupportedLookAndFeelException;

 
public class NewJFrame extends javax.swing.JFrame { 
       Icon img1,img2,imgLogo;
       String nome; 
       //contrutor
    public NewJFrame() {
        initComponents();
        
        try {
            this.img1 = new ImageIcon(getClass().getResource("imgC.png"));
            this.img2 = new ImageIcon(getClass().getResource("imgE.png"));
            this.imgLogo = new ImageIcon(getClass().getResource("logo.jpg"));
        } catch (Exception e) {
            System.out.print(e);
        }
        imgCerto.setIcon(img1);
        imgErrado.setIcon(img2);
        Logo.setIcon(imgLogo);
         
        
          
       nome= JOptionPane.showInputDialog(null,"Digite seu nome","AV2-TECLADO VIRTUAL ",JOptionPane.PLAIN_MESSAGE);
       jogadorLabel.setText(String.valueOf (nome));  
        
    }
 //frase1[4]
 //cada índice armazena uma frase
    
    List <String> frase1 = Arrays.asList("Jackdaws love my big sphinx of quartz. ", 
                                     "Pack my box with five dozen liquor jugs. ",
                                     "A quick brown fox jumps over the lazy dog. ",
                                    "Xylophone wizard begets quick jive form. ",
                                    "Lazy movers quit hard packing of jewelry boxes. ");
    
    //pega uma frase aleatória e armazena dentro de uma array de char
   char [] pan1 = (frase1.get(new Random().nextInt(frase1.size()))).toCharArray();  
   int i=0; 
    
   double letraC=0.0;
   double letraE=0.0;
   
    
  
  
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        aspa = new javax.swing.JButton();
        Num1 = new javax.swing.JButton();
        Num2 = new javax.swing.JButton();
        Num3 = new javax.swing.JButton();
        Num4 = new javax.swing.JButton();
        Num5 = new javax.swing.JButton();
        Num6 = new javax.swing.JButton();
        Num7 = new javax.swing.JButton();
        Num8 = new javax.swing.JButton();
        Num9 = new javax.swing.JButton();
        Num0 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        back = new javax.swing.JButton();
        Tab = new javax.swing.JButton();
        LetraQ = new javax.swing.JButton();
        LetraW = new javax.swing.JButton();
        LetraE = new javax.swing.JButton();
        LetraR = new javax.swing.JButton();
        LetraT = new javax.swing.JButton();
        LetraY = new javax.swing.JButton();
        LetraU = new javax.swing.JButton();
        LetraI = new javax.swing.JButton();
        LetraO = new javax.swing.JButton();
        LetraP = new javax.swing.JButton();
        capslock = new javax.swing.JButton();
        LetraA = new javax.swing.JButton();
        LetraS = new javax.swing.JButton();
        LetraD = new javax.swing.JButton();
        LetraF = new javax.swing.JButton();
        LetraG = new javax.swing.JButton();
        LetraH = new javax.swing.JButton();
        LetraJ = new javax.swing.JButton();
        LetraK = new javax.swing.JButton();
        LetraL = new javax.swing.JButton();
        LetraÇ = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        shift = new javax.swing.JButton();
        LetraZ = new javax.swing.JButton();
        LetraX = new javax.swing.JButton();
        LetraC = new javax.swing.JButton();
        LetraV = new javax.swing.JButton();
        LetraB = new javax.swing.JButton();
        LetraN = new javax.swing.JButton();
        LetraM = new javax.swing.JButton();
        Virgula = new javax.swing.JButton();
        Ponto = new javax.swing.JButton();
        ctrl = new javax.swing.JButton();
        alt = new javax.swing.JButton();
        space = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Pangrama = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProxLetra = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DivImg1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jogadorLabel = new javax.swing.JLabel();
        Acerto = new javax.swing.JLabel();
        Erro = new javax.swing.JLabel();
        imgCerto = new javax.swing.JLabel();
        imgErrado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/testeav2/IMG44.jpg")))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Referência: Java COMO PROGRAMAR 10ºed");

        aspa.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aspa.setText("'");
        aspa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspaActionPerformed(evt);
            }
        });

        Num1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num1.setText("1");
        Num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num1ActionPerformed(evt);
            }
        });

        Num2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num2.setText("2");

        Num3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num3.setText("3");

        Num4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num4.setText("4");

        Num5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num5.setText("5");

        Num6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num6.setText("6");

        Num7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num7.setText("7");

        Num8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num8.setText("8");

        Num9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num9.setText("9");

        Num0.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Num0.setText("0");

        igual.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Calibri", 1, 10)); // NOI18N
        back.setText("BACKSPACE");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        Tab.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        Tab.setText("Tab");
        Tab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabActionPerformed(evt);
            }
        });

        LetraQ.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraQ.setText("q");
        LetraQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraQActionPerformed(evt);
            }
        });

        LetraW.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraW.setText("w");

        LetraE.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraE.setText("e");

        LetraR.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraR.setText("r");

        LetraT.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraT.setText("t");

        LetraY.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraY.setText("y");

        LetraU.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraU.setText("u");

        LetraI.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraI.setText("i");

        LetraO.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraO.setText("o");

        LetraP.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraP.setText("p");

        capslock.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        capslock.setText("Caps Lock");
        capslock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capslockActionPerformed(evt);
            }
        });

        LetraA.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraA.setText("a");
        LetraA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraAActionPerformed(evt);
            }
        });

        LetraS.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraS.setText("s");
        LetraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraSActionPerformed(evt);
            }
        });

        LetraD.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraD.setText("d");
        LetraD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraDActionPerformed(evt);
            }
        });

        LetraF.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraF.setText("f");
        LetraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraFActionPerformed(evt);
            }
        });

        LetraG.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraG.setText("g");

        LetraH.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraH.setText("h");

        LetraJ.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraJ.setText("j");

        LetraK.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraK.setText("k");

        LetraL.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraL.setText("l");

        LetraÇ.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraÇ.setText("ç");

        enter.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        enter.setText("Enter");

        shift.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        shift.setText("shift");
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });

        LetraZ.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraZ.setText("z");
        LetraZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LetraZActionPerformed(evt);
            }
        });

        LetraX.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraX.setText("x");

        LetraC.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        LetraC.setText("c");

        LetraV.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraV.setText("v");

        LetraB.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraB.setText("b");

        LetraN.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraN.setText("n");

        LetraM.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        LetraM.setText("m");

        Virgula.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Virgula.setText(",");

        Ponto.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        Ponto.setText(".");

        ctrl.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        ctrl.setText("Ctrl");

        alt.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        alt.setText("Alt");
        alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altActionPerformed(evt);
            }
        });

        space.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        space.setText("Space");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(aspa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Num0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(alt))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(shift)
                                .addGap(18, 18, 18)
                                .addComponent(LetraZ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LetraX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LetraM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Virgula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ponto))
                            .addComponent(space, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraW)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(capslock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraJ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetraÇ)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aspa)
                            .addComponent(Num1)
                            .addComponent(Num2)
                            .addComponent(Num3)
                            .addComponent(Num4)
                            .addComponent(Num5)
                            .addComponent(Num6)
                            .addComponent(Num7)
                            .addComponent(Num8)
                            .addComponent(Num9)
                            .addComponent(Num0)
                            .addComponent(igual)
                            .addComponent(back))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tab, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraQ)
                            .addComponent(LetraW)
                            .addComponent(LetraE)
                            .addComponent(LetraR)
                            .addComponent(LetraT)
                            .addComponent(LetraY)
                            .addComponent(LetraU)
                            .addComponent(LetraI)
                            .addComponent(LetraO)
                            .addComponent(LetraP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(capslock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetraA)
                            .addComponent(LetraS)
                            .addComponent(LetraD)
                            .addComponent(LetraF)
                            .addComponent(LetraG)
                            .addComponent(LetraH)
                            .addComponent(LetraJ)
                            .addComponent(LetraK)
                            .addComponent(LetraL)
                            .addComponent(LetraÇ)))
                    .addComponent(enter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shift, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LetraZ)
                    .addComponent(LetraX)
                    .addComponent(LetraC)
                    .addComponent(LetraV)
                    .addComponent(LetraB)
                    .addComponent(LetraN)
                    .addComponent(LetraM)
                    .addComponent(Virgula)
                    .addComponent(Ponto))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctrl)
                    .addComponent(space)
                    .addComponent(alt)))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setText("Frase:");

        Pangrama.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Pangrama.setForeground(new java.awt.Color(204, 0, 51));
        Pangrama.setText("<user Code>");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Proxima Letra:");

        ProxLetra.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        ProxLetra.setForeground(new java.awt.Color(0, 51, 255));
        ProxLetra.setText("<user Code>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Pangrama)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProxLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 67, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pangrama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProxLetra, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jLabel3)))
        );

        DivImg1.setText(" ");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Jogador:");

        jogadorLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jogadorLabel.setForeground(new java.awt.Color(51, 51, 255));
        jogadorLabel.setText("Nome");

        Acerto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Acerto.setText("Acerto");

        Erro.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Erro.setText("Erro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(imgCerto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Acerto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(imgErrado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Erro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jogadorLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jogadorLabel))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(imgCerto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgErrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Acerto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(Erro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DivImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(DivImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Virtual keyboard training  5.0");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//
    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
         
        //nao computar como erro: CapsLock, Shift, Enter, Backspace.
          if(evt.getKeyCode() != KeyEvent.VK_CAPS_LOCK && evt.getKeyCode() != KeyEvent.VK_SHIFT && evt.getKeyCode() != KeyEvent.VK_ENTER  && evt.getKeyCode() != KeyEvent.VK_BACK_SPACE )
        {
            //MOSTRA FRASE DO BANCO DE PANGRAMA
            Pangrama.setText(String.valueOf (pan1));  
            //ARMAZENA TECLA DIGITADA
            char letra = evt.getKeyChar();  
            
                //CASO ACERTE :compara a letra com o pangrama  
                if(letra == pan1[i]){  
                    String letra1 = String.valueOf(letra); // armazena a letra em uma string.
                    letra1 = letra1.toLowerCase();  //converte a letra1 para minusculo.
                    MudarCorBotaoC(letra1);  //chama a função mudar cor certa.
                    i++;        //incrementa o i para ir para a proxima letra.  
                    letraC++;  // incrementa a letra certa. 
                    Acerto.setText(Double.toString(letraC));   //mostrar na tela Acerto
                    ProxLetra.setText(String.valueOf(pan1[i])); //coloca a proxima letra na tela. 
                    if(' '== pan1[i]){  //mudar os espaços para "SPACE" para guiar melhor o usuario.
                    ProxLetra.setText(String.valueOf("SPACE"));
                    }
                    
                    //CASO ERRE UMA LETRA
                    }else{
                    String letra1 = String.valueOf(letra);
                    letra1 = letra1.toLowerCase();
                    MudarCorBotaoE(letra1); 
                    letraE++;  // incrementa a letra Errada.
                    Erro.setText(Double.toString(letraE));   //mostrar na tela Erro 
                    
                             //LIMITAÇÃO DE ERROS
                                //CASO NUMERO DE ERRO = TAMANHO DO PANGRAMA
                                if(letraE >= pan1.length - 1){     
                                JOptionPane.showMessageDialog(null,"FAÇA DE NOVO!\nVocê errou mais que devia" );
                                JOptionPane.showMessageDialog(null,"Concluido!\nResumo"
                                                  + "\nErros: " + letraE +
                                                    "\nCerto: " + letraC); 
                                int continuar = JOptionPane.showConfirmDialog(null, "deseja reinicar? ");
                                  if (continuar == JOptionPane.YES_OPTION) {
                                    pan1 = (frase1.get(new Random().nextInt(frase1.size()))).toCharArray();
                                    Pangrama.setText(String.valueOf (pan1));   
                                            i = 0;
                                            ProxLetra.setText(String.valueOf(pan1[0]));
                                            letraC = 0;
                                            Acerto.setText(Double.toString(letraC));
                                            letraE = 0;
                                            Erro.setText(Double.toString(letraE)); 
                                            jTextArea1.setText("");
                                    }else {
                                    JOptionPane.showMessageDialog(null, "Então até a proxima!");
                                    System.exit(0);
                                    }
                                } 
                         } 
                //CASO FINALIZE O PANGRAMA
                if(i >= pan1.length -1 ){ 
                  JOptionPane.showMessageDialog(null,"Concluido!\nPrecisão"
                                                  + "\nErros: " + letraE +
                                                    "\nCerto: " + letraC); 
                    Acerto.setText(Double.toString(letraC)); 
                    Erro.setText(Double.toString(letraE));
                    int continuar = JOptionPane.showConfirmDialog(null, "deseja reiniciar? ");
                                  if (continuar == JOptionPane.YES_OPTION) {
                                    pan1 = (frase1.get(new Random().nextInt(frase1.size()))).toCharArray();
                                    Pangrama.setText(String.valueOf (pan1));   
                                            i = 0;
                                            ProxLetra.setText(String.valueOf(pan1[0]));
                                            letraC = 0;
                                            Acerto.setText(Double.toString(letraC));
                                            letraE = 0;
                                            Erro.setText(Double.toString(letraE)); 
                                            jTextArea1.setText("");
                                    }else {
                                    JOptionPane.showMessageDialog(null, "Bye!");
                                    System.exit(0);
                                    }
                    }
            }        
    }//GEN-LAST:event_jTextArea1KeyPressed

    // Após a letra ser precionada e mudada a cor de acordo se esta certa ou errada, ao ser solta, 
//    // no keyReleased ela e comparada e volta para sua cor padrão. 
    private void jTextArea1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyReleased
         if(evt.getKeyCode() == KeyEvent.VK_A){
             LetraA.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_B){
             LetraB.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_C){
             LetraC.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_D){
             LetraD.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_E){
             LetraE.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_F){
             LetraF.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_G){
             LetraG.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_H){
             LetraH.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_I){
             LetraI.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_J){
             LetraJ.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_K){
             LetraK.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_L){
             LetraL.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_M){
             LetraM.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_N){
             LetraN.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_O){
             LetraO.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_P){
             LetraP.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_Q){
             LetraQ.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_R){
             LetraR.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_S){
             LetraS.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_T){
             LetraT.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_U){
             LetraU.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_V){
             LetraV.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_W){
             LetraW.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_X){
             LetraX.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_Y){
             LetraY.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_Z){
             LetraZ.setBackground(null);
      }
         if(evt.getKeyCode() == KeyEvent.VK_SPACE){
             space.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK){
          capslock.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_SHIFT){
          shift.setBackground(null);
      }
      if(evt.getKeyCode() == 0){
          LetraÇ.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_COMMA){
          Virgula.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_PERIOD){
          Ponto.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
          back.setBackground(null);
      }
      if(evt.getKeyCode() == 61){
          igual.setBackground(null);
      } 
      if(evt.getKeyCode() == 222){
          aspa.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_0){
          Num0.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_1){
          Num1.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_2){
          Num2.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_3){
          Num3.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_4){
          Num4.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_5){
          Num5.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_6){
          Num6.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_7){
          Num7.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_8){
          Num8.setBackground(null);
      }
      if(evt.getKeyCode() == KeyEvent.VK_9){
          Num9.setBackground(null);
      }
      if(evt.getKeyCode() == 9){
          Tab.setBackground(null);
      }
      if(evt.getKeyCode() == 17){
          ctrl.setBackground(null);
      }
      if(evt.getKeyCode() == 18){
          alt.setBackground(null);
      } 
      if(evt.getKeyCode() == KeyEvent.VK_ENTER){
          alt.setBackground(null);
      }
    }//GEN-LAST:event_jTextArea1KeyReleased

    private void LetraZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraZActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftActionPerformed

    private void LetraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraFActionPerformed

    private void LetraDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraDActionPerformed

    private void LetraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraSActionPerformed

    private void LetraAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraAActionPerformed

    private void capslockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capslockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capslockActionPerformed

    private void LetraQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LetraQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LetraQActionPerformed

    private void TabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TabActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_igualActionPerformed

    private void Num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num1ActionPerformed

    private void aspaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aspaActionPerformed

    private void altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altActionPerformed
    // função que mudar a cor da letra digitada pelo usuario para verde se ele acertou.    
    public void MudarCorBotaoC(String letra){
    switch(letra){
    case "a" :{
        LetraA.setBackground(Color.GREEN);
        break;}
    case "b" :{
        LetraB.setBackground(Color.GREEN);
        break;}
    case "c" :{
        LetraC.setBackground(Color.GREEN);
        break;}
      case "d" :{
        LetraD.setBackground(Color.GREEN);
        break;}
      case "e" :{
        LetraE.setBackground(Color.GREEN);
        break;}
      case "f" :{
        LetraF.setBackground(Color.GREEN);
        break;}
      case "g" :{
        LetraG.setBackground(Color.GREEN);
        break;}
      case "h" :{
        LetraH.setBackground(Color.GREEN);
        break;}
      case "i" :{
        LetraI.setBackground(Color.GREEN);
        break;}
      case "j" :{
        LetraJ.setBackground(Color.GREEN);
        break;}
      case "k" :{
        LetraK.setBackground(Color.GREEN);
        break;}
      case "l" :{
        LetraL.setBackground(Color.GREEN);
        break;}
      case "m" :{
        LetraM.setBackground(Color.GREEN);
        break;}
      case "n" :{
        LetraN.setBackground(Color.GREEN);
        break;}
      case "o" :{
        LetraO.setBackground(Color.GREEN);
        break;}
      case "p" :{
        LetraP.setBackground(Color.GREEN);
        break;}
      case "q" :{
        LetraQ.setBackground(Color.GREEN);
        break;}
      case "r" :{
        LetraR.setBackground(Color.GREEN);
        break;}
      case "s" :{
        LetraS.setBackground(Color.GREEN);
        break;}
      case "t" :{
        LetraT.setBackground(Color.GREEN);
        break;}
      case "u" :{
        LetraU.setBackground(Color.GREEN);
        break;}
      case "v" :{
        LetraV.setBackground(Color.GREEN);
        break;}
      case "w" :{
        LetraW.setBackground(Color.GREEN);
        break;}
      case "x" :{
        LetraX.setBackground(Color.GREEN);
        break;}
      case "y" :{
        LetraY.setBackground(Color.GREEN);
        break;}
      case "z" :{
        LetraZ.setBackground(Color.GREEN);
        break;}
      case " " :{
        space.setBackground(Color.GREEN);
        break;}
       case "," :{
        Virgula.setBackground(Color.GREEN);
        break;}
       case "." :{
        Ponto.setBackground(Color.GREEN);
        break;}
       case "ç" :{
        LetraÇ.setBackground(Color.GREEN);
        break;}
    } 
    }
    
    // função que mudar a cor da letra digitada pelo usuario para vermelho se ele errou 
    public void MudarCorBotaoE(String letra){
    switch(letra){
    case "a" :{
        LetraA.setBackground(Color.RED);
        break;}
    case "b" :{
        LetraB.setBackground(Color.RED);
        break;}
    case "c" :{
        LetraC.setBackground(Color.RED);
        break;}
      case "d" :{
        LetraD.setBackground(Color.RED);
        break;}
      case "e" :{
        LetraE.setBackground(Color.RED);
        break;}
      case "f" :{
        LetraF.setBackground(Color.RED);
        break;}
      case "g" :{
        LetraG.setBackground(Color.RED);
        break;}
      case "h" :{
        LetraH.setBackground(Color.RED);
        break;}
      case "i" :{
        LetraI.setBackground(Color.RED);
        break;}
      case "j" :{
        LetraJ.setBackground(Color.RED);
        break;}
      case "k" :{
        LetraK.setBackground(Color.RED);
        break;}
      case "l" :{
        LetraL.setBackground(Color.RED);
        break;}
      case "m" :{
        LetraM.setBackground(Color.RED);
        break;}
      case "n" :{
        LetraN.setBackground(Color.RED);
        break;}
      case "o" :{
        LetraO.setBackground(Color.RED);
        break;}
      case "p" :{
        LetraP.setBackground(Color.RED);
        break;}
      case "q" :{
        LetraQ.setBackground(Color.RED);
        break;}
      case "r" :{
        LetraR.setBackground(Color.RED);
        break;}
      case "s" :{
        LetraS.setBackground(Color.RED);
        break;}
      case "t" :{
        LetraT.setBackground(Color.RED);
        break;}
      case "u" :{
        LetraU.setBackground(Color.RED);
        break;}
      case "v" :{
        LetraV.setBackground(Color.RED);
        break;}
      case "w" :{
        LetraW.setBackground(Color.RED);
        break;}
      case "x" :{
        LetraX.setBackground(Color.RED);
        break;}
      case "y" :{
        LetraY.setBackground(Color.RED);
        break;}
      case "z" :{
        LetraZ.setBackground(Color.RED);
        break;}
      case " " :{
        space.setBackground(Color.RED);
        break;}
       case "," :{
        Virgula.setBackground(Color.RED);
        break;}
       case "." :{
        Ponto.setBackground(Color.RED);
        break;}
        case "ç" :{
        LetraÇ.setBackground(Color.RED);
        break;} 
        case "=" :{
        igual.setBackground(Color.RED);
        break;}
        case "+" :{
        igual.setBackground(Color.RED);
        break;}
        case "'" :{
        aspa.setBackground(Color.RED);
        break;}
        case "1" :{
        Num1.setBackground(Color.RED);
        break;}
        case "2" :{
        Num2.setBackground(Color.RED);
        break;}
        case "3" :{
        Num3.setBackground(Color.RED);
        break;}
        case "4" :{
        Num4.setBackground(Color.RED);
        break;}
        case "5" :{
        Num5.setBackground(Color.RED);
        break;}
        case "6" :{
        Num6.setBackground(Color.RED);
        break;}
        case "7" :{
        Num7.setBackground(Color.RED);
        break;}
        case "8" :{
        Num8.setBackground(Color.RED);
        break;}
        case "9" :{
        Num9.setBackground(Color.RED);
        break;}
        case "0" :{
        Num0.setBackground(Color.RED);
        break;}
    } 
    }
    String nomeJ = this.nome;
   
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { 
                
                                 
                      try {      
                                    //TEMA - AcrylLookAndFeel
                                    UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); 
                                    NewJFrame teclado = new NewJFrame(); 
                                    teclado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                    teclado.setSize(800, 700); 
                                    teclado.setVisible(true);
                            }
                            catch (Exception ex) {
                                ex.printStackTrace();
                            }        
                
                          
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Acerto;
    private javax.swing.JLabel DivImg1;
    private javax.swing.JLabel Erro;
    private javax.swing.JButton LetraA;
    private javax.swing.JButton LetraB;
    private javax.swing.JButton LetraC;
    private javax.swing.JButton LetraD;
    private javax.swing.JButton LetraE;
    private javax.swing.JButton LetraF;
    private javax.swing.JButton LetraG;
    private javax.swing.JButton LetraH;
    private javax.swing.JButton LetraI;
    private javax.swing.JButton LetraJ;
    private javax.swing.JButton LetraK;
    private javax.swing.JButton LetraL;
    private javax.swing.JButton LetraM;
    private javax.swing.JButton LetraN;
    private javax.swing.JButton LetraO;
    private javax.swing.JButton LetraP;
    private javax.swing.JButton LetraQ;
    private javax.swing.JButton LetraR;
    private javax.swing.JButton LetraS;
    private javax.swing.JButton LetraT;
    private javax.swing.JButton LetraU;
    private javax.swing.JButton LetraV;
    private javax.swing.JButton LetraW;
    private javax.swing.JButton LetraX;
    private javax.swing.JButton LetraY;
    private javax.swing.JButton LetraZ;
    private javax.swing.JButton LetraÇ;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Num0;
    private javax.swing.JButton Num1;
    private javax.swing.JButton Num2;
    private javax.swing.JButton Num3;
    private javax.swing.JButton Num4;
    private javax.swing.JButton Num5;
    private javax.swing.JButton Num6;
    private javax.swing.JButton Num7;
    private javax.swing.JButton Num8;
    private javax.swing.JButton Num9;
    private javax.swing.JLabel Pangrama;
    private javax.swing.JButton Ponto;
    private javax.swing.JLabel ProxLetra;
    private javax.swing.JButton Tab;
    private javax.swing.JButton Virgula;
    private javax.swing.JButton alt;
    private javax.swing.JButton aspa;
    private javax.swing.JButton back;
    private javax.swing.JButton capslock;
    private javax.swing.JButton ctrl;
    private javax.swing.JButton enter;
    private javax.swing.JButton igual;
    private javax.swing.JLabel imgCerto;
    private javax.swing.JLabel imgErrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jogadorLabel;
    private javax.swing.JButton shift;
    private javax.swing.JButton space;
    // End of variables declaration//GEN-END:variables
  
     
}
