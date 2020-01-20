package ornament;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class Ornament extends javax.swing.JFrame {

    public Ornament() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        bs = new javax.swing.JButton();
        paste = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        copy = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        Firste = new javax.swing.JButton();
        Seconde = new javax.swing.JButton();
        thirde = new javax.swing.JButton();
        fourthe = new javax.swing.JButton();
        fifthe = new javax.swing.JButton();
        opene = new javax.swing.JButton();
        savee = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eback = new javax.swing.JButton();
        ebtxt = new javax.swing.JButton();
        etxt = new javax.swing.JButton();
        exite = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        bsa = new javax.swing.JButton();
        pastea = new javax.swing.JButton();
        cleara = new javax.swing.JButton();
        copya = new javax.swing.JButton();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        firstaa = new javax.swing.JButton();
        secondaa = new javax.swing.JButton();
        thirdaa = new javax.swing.JButton();
        fourthaa = new javax.swing.JButton();
        fifthaa = new javax.swing.JButton();
        atxt = new javax.swing.JButton();
        abtxt = new javax.swing.JButton();
        aback = new javax.swing.JButton();
        aopen = new javax.swing.JButton();
        asave = new javax.swing.JButton();
        jSlider2 = new javax.swing.JSlider();
        jLabel6 = new javax.swing.JLabel();
        aexit = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        deleta = new javax.swing.JButton();
        pastea1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        copy1 = new javax.swing.JButton();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        Firsta1 = new javax.swing.JButton();
        Seconda = new javax.swing.JButton();
        thirda = new javax.swing.JButton();
        fourtha = new javax.swing.JButton();
        fiftha = new javax.swing.JButton();
        opena = new javax.swing.JButton();
        savea = new javax.swing.JButton();
        jSlider3 = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        aback1 = new javax.swing.JButton();
        abtxt1 = new javax.swing.JButton();
        atxt1 = new javax.swing.JButton();
        exite1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ornament Text");
        setBounds(new java.awt.Rectangle(300, 35, 0, 0));
        setFocusTraversalPolicyProvider(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setOpacity(0.8F);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jTabbedPane1.setBackground(new java.awt.Color(255, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ornament", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        bs.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        bs.setText("Delete");
        bs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsActionPerformed(evt);
            }
        });

        paste.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        paste.setText("Paste");
        paste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        clear.setText("Clear");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        copy.setFont(new java.awt.Font("Lucida Calligraphy", 3, 18)); // NOI18N
        copy.setText("Copy");
        copy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(bs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paste, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paste, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane3.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(bs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(paste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(clear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(copy, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(10, 11, 501, 602);

        jLayeredPane4.setBackground(new java.awt.Color(0, 51, 255));
        jLayeredPane4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "English", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        Firste.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Firste.setText("ḞḮṞṦṰ");
        Firste.setBorder(null);
        Firste.setBorderPainted(false);
        Firste.setContentAreaFilled(false);
        Firste.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Firste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirsteActionPerformed(evt);
            }
        });

        Seconde.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Seconde.setText("ŠĘĆÔЍĎ");
        Seconde.setBorder(null);
        Seconde.setBorderPainted(false);
        Seconde.setContentAreaFilled(false);
        Seconde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seconde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondeActionPerformed(evt);
            }
        });

        thirde.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        thirde.setText("ȾĦȈƦĐ");
        thirde.setBorder(null);
        thirde.setBorderPainted(false);
        thirde.setContentAreaFilled(false);
        thirde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thirde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdeActionPerformed(evt);
            }
        });

        fourthe.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        fourthe.setText("₣ỞỮȐṰἮ");
        fourthe.setBorder(null);
        fourthe.setBorderPainted(false);
        fourthe.setContentAreaFilled(false);
        fourthe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourtheActionPerformed(evt);
            }
        });

        fifthe.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        fifthe.setText("ⒻⒾⒻⓉⒽ");
        fifthe.setBorder(null);
        fifthe.setBorderPainted(false);
        fifthe.setContentAreaFilled(false);
        fifthe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fifthe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fifthe, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(fourthe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Firste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(thirde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Seconde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Firste, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seconde, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirde, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourthe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fifthe, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane4.setLayer(Firste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(Seconde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(thirde, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fourthe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(fifthe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane1.add(jLayeredPane4);
        jLayeredPane4.setBounds(550, 10, 170, 330);
        jLayeredPane4.getAccessibleContext().setAccessibleName("Choose");

        opene.setBackground(new java.awt.Color(255, 255, 255));
        opene.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        opene.setText("Open");
        opene.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 255, 0)));
        opene.setContentAreaFilled(false);
        opene.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opene.setOpaque(true);
        opene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(opene);
        opene.setBounds(370, 620, 140, 40);

        savee.setBackground(new java.awt.Color(255, 255, 255));
        savee.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        savee.setText("Save");
        savee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 255, 0)));
        savee.setContentAreaFilled(false);
        savee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savee.setOpaque(true);
        savee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveeActionPerformed(evt);
            }
        });
        jLayeredPane1.add(savee);
        savee.setBounds(10, 619, 140, 40);

        jSlider1.setBackground(new java.awt.Color(255, 255, 255));
        jSlider1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 10)); // NOI18N
        jSlider1.setForeground(new java.awt.Color(0, 0, 0));
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setFocusCycleRoot(true);
        jSlider1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jSlider1AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider1MouseReleased(evt);
            }
        });
        jLayeredPane1.add(jSlider1);
        jSlider1.setBounds(160, 610, 200, 50);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Opiacity value");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(156, 655, 200, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        eback.setBackground(new java.awt.Color(255, 255, 255));
        eback.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        eback.setText("Form Back Color");
        eback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        eback.setContentAreaFilled(false);
        eback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebackActionPerformed(evt);
            }
        });

        ebtxt.setBackground(new java.awt.Color(255, 255, 255));
        ebtxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        ebtxt.setText("Text Back Color");
        ebtxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        ebtxt.setContentAreaFilled(false);
        ebtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ebtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ebtxtActionPerformed(evt);
            }
        });

        etxt.setBackground(new java.awt.Color(255, 255, 255));
        etxt.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        etxt.setText("Text Color");
        etxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        etxt.setContentAreaFilled(false);
        etxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ebtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(eback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(etxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ebtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eback, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel2);
        jPanel2.setBounds(550, 350, 170, 210);

        exite.setBackground(new java.awt.Color(255, 255, 255));
        exite.setFont(new java.awt.Font("Lucida Calligraphy", 0, 18)); // NOI18N
        exite.setText("Exit");
        exite.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        exite.setContentAreaFilled(false);
        exite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exite.setOpaque(true);
        exite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exiteActionPerformed(evt);
            }
        });
        jLayeredPane1.add(exite);
        exite.setBounds(550, 560, 170, 100);

        jTabbedPane1.addTab("English", jLayeredPane1);

        jLayeredPane5.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane5.setOpaque(true);
        
        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "زخرفة", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea5KeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        deleta.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        deleta.setText("مسح");
        deleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaActionPerformed(evt);
            }
        });

        pastea1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        pastea1.setText("لصق");
        pastea1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pastea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastea1ActionPerformed(evt);
            }
        });

        clear1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        clear1.setText("حذف");
        clear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });

        copy1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 18)); // NOI18N
        copy1.setText("نسخ");
        copy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        copy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(copy1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addComponent(deleta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pastea1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastea1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(copy1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane7.setLayer(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(deleta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(pastea1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(clear1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(copy1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.add(jLayeredPane7);
        jLayeredPane7.setBounds(10, 11, 501, 602);

        jLayeredPane8.setBackground(new java.awt.Color(0, 51, 255));
        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "عربى", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
	jLayeredPane8.setPreferredSize(new java.awt.Dimension(170, 330));

        Firsta1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Firsta1.setText("ٱﻟٱ̲ﯙﻟ̲ـ");
        Firsta1.setBorder(null);
        Firsta1.setBorderPainted(false);
        Firsta1.setContentAreaFilled(false);
        Firsta1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Firsta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Firsta1ActionPerformed(evt);
            }
        });

        Seconda.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Seconda.setText("ٵڸٽٵڼۓ");
        Seconda.setBorder(null);
        Seconda.setBorderPainted(false);
        Seconda.setContentAreaFilled(false);
        Seconda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Seconda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondaActionPerformed(evt);
            }
        });

        thirda.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        thirda.setText("ٵ ﻟ̶̭͠ ٽٵ ﻟ̶ ٽ ̭͠");
        thirda.setBorder(null);
        thirda.setBorderPainted(false);
        thirda.setContentAreaFilled(false);
        thirda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thirda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thirdaActionPerformed(evt);
            }
        });

        fourtha.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fourtha.setText("ٱٍڸٍږٱٍﮨـًّﻋً̲ﮱ");
        fourtha.setBorder(null);
        fourtha.setBorderPainted(false);
        fourtha.setContentAreaFilled(false);
        fourtha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fourtha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourthaActionPerformed(evt);
            }
        });

        fiftha.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        fiftha.setText("ٱـڵےڂےٱمےـﺳ̭͠ـے");
        fiftha.setBorder(null);
        fiftha.setBorderPainted(false);
        fiftha.setContentAreaFilled(false);
        fiftha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fiftha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fifthaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fiftha, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
            .addComponent(fourtha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Firsta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(thirda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Seconda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Firsta1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Seconda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fourtha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fiftha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jLayeredPane8.setLayer(Firsta1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(Seconda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(thirda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(fourtha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(fiftha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane2.add(jLayeredPane8);
        jLayeredPane8.setBounds(550, 10, 170, 330);

        opena.setBackground(new java.awt.Color(255, 255, 255));
        opena.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        opena.setText("فتح");
        opena.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 255, 0)));
        opena.setContentAreaFilled(false);
        opena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opena.setOpaque(true);
        opena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openaActionPerformed(evt);
            }
        });
        jLayeredPane2.add(opena);
        opena.setBounds(370, 620, 140, 40);

        savea.setBackground(new java.awt.Color(255, 255, 255));
        savea.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        savea.setText("حفظ");
        savea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 0), new java.awt.Color(153, 255, 0), new java.awt.Color(0, 255, 102), new java.awt.Color(0, 255, 0)));
        savea.setContentAreaFilled(false);
        savea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savea.setOpaque(true);
        savea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveaActionPerformed(evt);
            }
        });
        jLayeredPane2.add(savea);
        savea.setBounds(10, 619, 140, 40);

        jSlider3.setBackground(new java.awt.Color(255, 255, 255));
        jSlider3.setFont(new java.awt.Font("Traditional Arabic", 0, 10)); // NOI18N
        jSlider3.setForeground(new java.awt.Color(0, 0, 0));
        jSlider3.setMajorTickSpacing(10);
        jSlider3.setPaintLabels(true);
        jSlider3.setPaintTicks(true);
        jSlider3.setSnapToTicks(true);
        jSlider3.setFocusCycleRoot(true);
        jSlider3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jSlider3AncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider3StateChanged(evt);
            }
        });
        jSlider3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSlider3MouseReleased(evt);
            }
        });
        jLayeredPane2.add(jSlider3);
        jSlider3.setBounds(160, 610, 200, 50);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Sakkal Majalla", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("درجة الشفافية");
        jLayeredPane2.add(jLabel10);
        jLabel10.setBounds(156, 655, 200, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        aback1.setBackground(new java.awt.Color(255, 255, 255));
        aback1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        aback1.setText("لون خلفية البرنامج");
        aback1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        aback1.setContentAreaFilled(false);
        aback1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aback1ActionPerformed(evt);
            }
        });

        abtxt1.setBackground(new java.awt.Color(255, 255, 255));
        abtxt1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        abtxt1.setText("لون خلفية النص");
        abtxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        abtxt1.setContentAreaFilled(false);
        abtxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abtxt1ActionPerformed(evt);
            }
        });

        atxt1.setBackground(new java.awt.Color(255, 255, 255));
        atxt1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        atxt1.setText("لون النص");
        atxt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));
        atxt1.setContentAreaFilled(false);
        atxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atxt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(atxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abtxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(aback1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(atxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aback1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.add(jPanel3);
        jPanel3.setBounds(550, 350, 170, 210);

        exite1.setBackground(new java.awt.Color(255, 255, 255));
        exite1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        exite1.setText("إغلاق");
        exite1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        exite1.setContentAreaFilled(false);
        exite1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exite1.setOpaque(true);
        exite1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exite1ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(exite1);
        exite1.setBounds(550, 560, 170, 100);

        jTabbedPane1.addTab("عربى", jLayeredPane2);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Coded By :: A_Asaker");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Instructor : Ahmed Hermas");

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" Best wishes !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aexitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_aexitActionPerformed

    private void jSlider2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider2MouseReleased

    private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider2StateChanged
        float sl3=jSlider3.getValue();
        float z= sl3/100;
        this.setOpacity(z);
        jSlider1.setValue(jSlider3.getValue());
    }//GEN-LAST:event_jSlider2StateChanged

    private void jSlider2AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSlider2AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider2AncestorMoved

    private void asaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asaveActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save");
        chooser.showSaveDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try{
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            jTextArea6.write(bw);
            bw.close();
            jTextArea6.requestFocus();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_asaveActionPerformed

    private void aopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aopenActionPerformed
        //new open dialog
        JFileChooser chooser = new JFileChooser();
        //open dialog
        chooser.showOpenDialog(null);
        //choose file
        File f = chooser.getSelectedFile();
        //like a path
        String filename = f.getAbsolutePath();
        try{
            // read the path
            FileReader reader = new FileReader(filename);
            //read data in the file
            BufferedReader br = new BufferedReader(reader);

            jTextArea5.read(br,null);
            br.close();
            jTextArea5.requestFocus();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_aopenActionPerformed

    private void abackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abackActionPerformed
        colorfr1();        // TODO add your handling code here:
    }//GEN-LAST:event_abackActionPerformed

    private void abtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtxtActionPerformed
        colort();  // TODO add your handling code here:
    }//GEN-LAST:event_abtxtActionPerformed

    private void atxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atxtActionPerformed
        colorfn1();
        // TODO add your handling code here:
    }//GEN-LAST:event_atxtActionPerformed

    private void fifthaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthaaActionPerformed
        font1();
        String txt = jTextArea7.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱ");
        txt = txt.replace("ا", "ٱ");
        txt = txt.replace("ب", "ـپـﮱ");
        txt = txt.replace("ت", "ـٺـﮱ");
        txt = txt.replace("ث", "ـٽے");
        txt = txt.replace("ج", "ـڇے");
        txt = txt.replace("ح", "حے");
        txt = txt.replace("خ", "ڂے");
        txt = txt.replace("د", "ـڍ'");
        txt = txt.replace("ذ", "ـڐ");
        txt = txt.replace("ر", "ـڑ");
        txt = txt.replace("ز", "ـڙ");
        txt = txt.replace("س", "ـﺳ̭͠ـے");
        txt = txt.replace("ش", "ـﺸـے̷");
        txt = txt.replace("ص", "ـﺻـﮧ");
        txt = txt.replace("ض", "ـڞـﮧ");
        txt = txt.replace("ط", "ـطۜـ");
        txt = txt.replace("ظ", "ـڟۗـ");
        txt = txt.replace("ع", "ﻋ̝̚ـے");
        txt = txt.replace("غ", "ڠے");
        txt = txt.replace("ف", "ـڡّـ");
        txt = txt.replace("ق", "ــڦـ");
        txt = txt.replace("ك", "ڲے");
        txt = txt.replace("ل", "ـڵے");
        txt = txt.replace("م", "مے");
        txt = txt.replace("ن", "ڼۛـے");
        txt = txt.replace("ه", "ـﮩۧـے");
        txt = txt.replace("و", "'ۇ");
        txt = txt.replace("ى", "ـيے");
        jTextArea8.setText(txt);
    }//GEN-LAST:event_fifthaaActionPerformed

    private void fourthaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthaaActionPerformed
        font1();
        String txt = jTextArea7.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱٍۦ");
        txt = txt.replace("ا", "ٱٍ");
        txt = txt.replace("ب", "ﮨـًّ");
        txt = txt.replace("ت", "ﭠ̯ـَ");
        txt = txt.replace("ث", "ٿِ");
        txt = txt.replace("ج", "ڇـٌ");
        txt = txt.replace("ح", "ـﺢـ");
        txt = txt.replace("خ", "څـ’ـ,");
        txt = txt.replace("د", "ڍ");
        txt = txt.replace("ذ", "ڌ,");
        txt = txt.replace("ر", "ږ");
        txt = txt.replace("ز", "ڒْ");
        txt = txt.replace("س", "ﺳ̣̥̐ـﮧـ");
        txt = txt.replace("ش", "ڜـﮧـ");
        txt = txt.replace("ص", "ڝے");
        txt = txt.replace("ض", "ڞْـّ");
        txt = txt.replace("ط", "طٍـ");
        txt = txt.replace("ظ", "ڟ,");
        txt = txt.replace("ع", "ﻋً̲ﮱ");
        txt = txt.replace("غ", "ڠـﮱ");
        txt = txt.replace("ف", "ڣ");
        txt = txt.replace("ق", "ڨۧ");
        txt = txt.replace("ك", "ڳ̶͠ ");
        txt = txt.replace("ل", "ڸ");
        txt = txt.replace("م", "ﻣ̉");
        txt = txt.replace("ن", "ںّْـّۜ");
        txt = txt.replace("ه", "ـﮩۧـ");
        txt = txt.replace("و", "ۅۣۛ");
        txt = txt.replace("ى", "يے");
        jTextArea8.setText(txt);
    }//GEN-LAST:event_fourthaaActionPerformed

    private void thirdaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdaaActionPerformed
        font1();
        String txt = jTextArea7.getText();
        txt = txt.replace('1', '۱');
        txt = txt.replace('2', '۲');
        txt = txt.replace('3', '۳');
        txt = txt.replace('4', '٤');
        txt = txt.replace('5', '٥');
        txt = txt.replace('6', '٦');
        txt = txt.replace('7', '۷');
        txt = txt.replace('8', '۸');
        txt = txt.replace('9', '۹');
        txt = txt.replace('0', '۰');
        txt = txt.replace('أ', 'ٵ');
        txt = txt.replace('ا', 'ٵ');
        txt = txt.replace("ب", "ﺑ̷̉ـ ̭͠");
        txt = txt.replace('ت', 'ﭢ');
        txt = txt.replace('ث', 'ٽ');
        txt = txt.replace('ج', 'ڃ');
        txt = txt.replace('ح', 'ځ');
        txt = txt.replace('خ', 'ڂ');
        txt = txt.replace('د', 'ڋ');
        txt = txt.replace('ذ', 'ڐ');
        txt = txt.replace('ر', 'ڑ');
        txt = txt.replace('ز', 'ژ');
        txt = txt.replace('س', 'ښ');
        txt = txt.replace("ش", "ﺷ͠");
        txt = txt.replace("ص", "ﺻ̲");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "ﻃّْ");
        txt = txt.replace("ظ", "ڟّ");
        txt = txt.replace("ع", "ﻋ̲");
        txt = txt.replace("غ", "ﻏ̲ـّ");
        txt = txt.replace("ف", " ڡَّ");
        txt = txt.replace("ق", "ڨٍ");
        txt = txt.replace("ك", "ﮚ");
        txt = txt.replace("ل", "‏ﻟ̶̭͠ ");
        txt = txt.replace("م", "'ﻣ̣̥̐ـّ");
        txt = txt.replace('ن', 'ڻ');
        txt = txt.replace("ه", "ۂٍ");
        txt = txt.replace('و', 'ۋ');
        txt = txt.replace('ى', 'ﮱ');
        jTextArea8.setText(txt);
    }//GEN-LAST:event_thirdaaActionPerformed

    private void secondaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondaaActionPerformed
        font1();
        String txt = jTextArea7.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٵ");
        txt = txt.replace("ا", "ٵ");
        txt = txt.replace("ب", "ٻ");
        txt = txt.replace("ت", "ٺ");
        txt = txt.replace("ث", "ٽ");
        txt = txt.replace("ج", "ﺟ͠ـ");
        txt = txt.replace("ح", "ﺣ͠ـ");
        txt = txt.replace("خ", "څـ~");
        txt = txt.replace("د", "ﮨ");
        txt = txt.replace("ذ", "ڏ");
        txt = txt.replace("ر", "ړ");
        txt = txt.replace("ز", "ڗ");
        txt = txt.replace("س", "ﺳ̣̥̐");
        txt = txt.replace("ش", "ﺸ̷");
        txt = txt.replace("ص", "ﺼﮯ");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "طٌـً");
        txt = txt.replace("ظ", "ڟ");
        txt = txt.replace("ع", "‘عـً");
        txt = txt.replace("غ", "ݞ");
        txt = txt.replace("ف", "ڢ");
        txt = txt.replace("ق", "ﻗ̭͠");
        txt = txt.replace("ك", "ﮗ");
        txt = txt.replace("ل", "ڸ");
        txt = txt.replace("م", "ـ۾ـ");
        txt = txt.replace("ن", "ڼ");
        txt = txt.replace("ه", "ـﮧـ");
        txt = txt.replace("و", "ۅ");
        txt = txt.replace("ى", "ۓ");
        jTextArea8.setText(txt);
        // TODO add your handling code here:
    }//GEN-LAST:event_secondaaActionPerformed

    private void firstaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstaaActionPerformed
        font1();
        String txt = jTextArea7.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱ");
        txt = txt.replace("ا", "ٱ");
        txt = txt.replace("ب", "پ");
        txt = txt.replace("ت", "ټ");
        txt = txt.replace("ث", "ٿ");
        txt = txt.replace("ج", "ڃ");
        txt = txt.replace("ح", "ﺣ̲");
        txt = txt.replace("خ", "ڂ");
        txt = txt.replace("د", "ڋ");
        txt = txt.replace("ذ", "ڌ");
        txt = txt.replace("ر", "ڕ");
        txt = txt.replace("ز", "ژ");
        txt = txt.replace("س", "ـﺳ͠͠");
        txt = txt.replace("ش", "ڜ");
        txt = txt.replace("ص", "ﺻ̝");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "ﻁ̲");
        txt = txt.replace("ظ", "ڟ");
        txt = txt.replace("ع", "ﻋ̝̚");
        txt = txt.replace("غ", "ۼ");
        txt = txt.replace("ف", "ڣ");
        txt = txt.replace("ق", "ﭱ");
        txt = txt.replace("ك", "ـﮓ");
        txt = txt.replace("ل", "ﻟ̲ـ");
        txt = txt.replace("م", "ﻣ̝̚");
        txt = txt.replace("ن", "ڼ");
        txt = txt.replace("ه", "ـﮩ");
        txt = txt.replace("و", "ﯙ");
        txt = txt.replace("ى", "ێ");
        jTextArea8.setText(txt);
        // TODO add your handling code here:
    }//GEN-LAST:event_firstaaActionPerformed

    private void copyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyaActionPerformed
        jTextArea6.copy();
    }//GEN-LAST:event_copyaActionPerformed

    private void clearaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearaActionPerformed
        jTextArea5.setText("");
        jTextArea6.setText("");
    }//GEN-LAST:event_clearaActionPerformed

    private void pasteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteaActionPerformed
        jTextArea5.paste();
    }//GEN-LAST:event_pasteaActionPerformed

    private void bsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaActionPerformed
      jTextArea5.setText("");
        /*   //craete var for bs
        String bs =null;
        //if there text in txt area deleta the last char and
        if(jTextArea5.getText().length()>0){
            StringBuilder stbr = new StringBuilder(jTextArea5.getText());
            stbr.deleteCharAt(jTextArea5.getText().length()-1);
            bs = stbr.toString();
            jTextArea5.setText(bs);
        }*/
    }//GEN-LAST:event_bsaActionPerformed

    private void exiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exiteActionPerformed
        System.exit(0);          // TODO add your handling code here:
    }//GEN-LAST:event_exiteActionPerformed

    private void jSlider1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseReleased

    }//GEN-LAST:event_jSlider1MouseReleased

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        //create a
        float   sl1=jSlider1.getValue();
        float z= sl1/100;
        this.setOpacity(z);
        jSlider3.setValue(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSlider1AncestorMoved

    }//GEN-LAST:event_jSlider1AncestorMoved

    private void saveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveeActionPerformed
        //creat new open file
        JFileChooser chooser = new JFileChooser();
        //shaw it
        chooser.showSaveDialog(null);
        //set title dialog
        chooser.setDialogTitle("Save");
        //choose file
        File f = chooser.getSelectedFile();
        //set path
        String filename = f.getAbsolutePath();
        try{
            //mew file writer
            FileWriter writer = new FileWriter(filename);
            //new writing the data
            BufferedWriter bw = new BufferedWriter(writer);
            //write string in text area
            jTextArea4.write(bw);
            //stop writing from text area
            bw.close();
            //save
            jTextArea4.requestFocus();
        } catch (Exception e){
            //in error case
            JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_saveeActionPerformed
    }
    private void openeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openeActionPerformed
        //new open dialog
        JFileChooser chooser = new JFileChooser();
        //open dialog
        chooser.showOpenDialog(null);
        //choose file
        chooser.setDialogTitle("Open");
        File f = chooser.getSelectedFile();
        //like a path
        String filename = f.getAbsolutePath();
        try{
            // read the path
            FileReader reader = new FileReader(filename);
            //read data in the file
            BufferedReader br = new BufferedReader(reader);
            //read data in the textarea
            jTextArea3.read(br,null);
            //stop reading data
            br.close();
            //put chars in the textaera
            jTextArea3.requestFocus();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_openeActionPerformed

    private void etxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etxtActionPerformed
        colorfn();
    }//GEN-LAST:event_etxtActionPerformed

    private void ebackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebackActionPerformed
        colorfr();
    }//GEN-LAST:event_ebackActionPerformed

    private void fiftheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftheActionPerformed
        Font fifth = new Font("Meiryo UI", 0, 18);
        jTextArea4.setFont(fifth);
        String txt = jTextArea3.getText();
        txt = txt.replace("A", "Ⓐ");
        txt = txt.replace("B", "Ⓑ");
        txt = txt.replace("C", "Ⓒ");
        txt = txt.replace("D", "Ⓓ");
        txt = txt.replace("E", "Ⓔ");
        txt = txt.replace("F", "Ⓕ");
        txt = txt.replace("G", "Ⓖ");
        txt = txt.replace("H", "Ⓗ");
        txt = txt.replace("I", "Ⓘ");
        txt = txt.replace("J", "Ⓙ");
        txt = txt.replace("K", "Ⓚ");
        txt = txt.replace("L", "Ⓛ");
        txt = txt.replace("M", "Ⓜ");
        txt = txt.replace("N", "Ⓝ");
        txt = txt.replace("O", "Ⓞ");
        txt = txt.replace("P", "Ⓟ");
        txt = txt.replace("Q", "Ⓠ");
        txt = txt.replace("R", "Ⓡ");
        txt = txt.replace("S", "Ⓢ");
        txt = txt.replace("T", "Ⓣ");
        txt = txt.replace("U", "Ⓤ");
        txt = txt.replace("V", "Ⓥ");
        txt = txt.replace("W", "Ⓦ");
        txt = txt.replace("X", "Ⓧ");
        txt = txt.replace("Y", "Ⓨ");
        txt = txt.replace("Z", "Ⓩ");
        txt = txt.replace("a", "ⓐ");
        txt = txt.replace("b", "ⓑ");
        txt = txt.replace("c", "ⓒ");
        txt = txt.replace("d", "ⓓ");
        txt = txt.replace("e", "ⓔ");
        txt = txt.replace("f", "ⓕ");
        txt = txt.replace("g", "ⓖ");
        txt = txt.replace("h", "ⓗ");
        txt = txt.replace("i", "ⓘ");
        txt = txt.replace("j", "ⓙ");
        txt = txt.replace("k", "ⓚ");
        txt = txt.replace("l", "ⓛ");
        txt = txt.replace("m", "ⓜ");
        txt = txt.replace("n", "ⓝ");
        txt = txt.replace("o", "ⓞ");
        txt = txt.replace("p", "ⓟ");
        txt = txt.replace("q", "ⓠ");
        txt = txt.replace("r", "ⓡ");
        txt = txt.replace("s", "ⓢ");
        txt = txt.replace("t", "ⓣ");
        txt = txt.replace("u", "ⓤ");
        txt = txt.replace("v", "ⓥ");
        txt = txt.replace("w", "ⓦ");
        txt = txt.replace("x", "ⓧ");
        txt = txt.replace("y", "ⓨ");
        txt = txt.replace("z", "ⓩ");
        jTextArea4.setText(txt);
    }//GEN-LAST:event_fiftheActionPerformed

    private void fourtheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourtheActionPerformed
        font();
        String txt = jTextArea3.getText();
        txt = txt.replace("A", "Ẵ");
        txt = txt.replace("B", "ß");
        txt = txt.replace("C", "Ḉ");
        txt = txt.replace("D", "Ɗ");
        txt = txt.replace("E", "Ễ");
        txt = txt.replace("F", "₣");
        txt = txt.replace("G", "Ǥ");
        txt = txt.replace("H", "Ἦ");
        txt = txt.replace("I", "Ї");
        txt = txt.replace("J", "Ɉ");
        txt = txt.replace("K", "Ҟ");
        txt = txt.replace("L", "Ḽ");
        txt = txt.replace("M", "Ḿ");
        txt = txt.replace("N", "Ҋ");
        txt = txt.replace("O", "Ở");
        txt = txt.replace("P", "Ҏ");
        txt = txt.replace("Q", "Q");
        txt = txt.replace("R", "Ȑ");
        txt = txt.replace("S", "Ṥ");
        txt = txt.replace("T", "Ṱ");
        txt = txt.replace("U", "Ữ");
        txt = txt.replace("V", "Ṽ");
        txt = txt.replace("W", "Ẅ");
        txt = txt.replace("X", "Ӽ");
        txt = txt.replace("Y", "Ὓ");
        txt = txt.replace("Z", "Ƶ");
        txt = txt.replace("a", "ᾇ");
        txt = txt.replace("b", "ƀ");
        txt = txt.replace("c", "ḉ");
        txt = txt.replace("d", "₫");
        txt = txt.replace("e", "ễ");
        txt = txt.replace("f", "ƭ");
        txt = txt.replace("g", "ǧ");
        txt = txt.replace("h", "ȟ");
        txt = txt.replace("i", "ȋ");
        txt = txt.replace("j", "ɉ");
        txt = txt.replace("k", "ҝ");
        txt = txt.replace("l", "ƚ");
        txt = txt.replace("m", "ɱ");
        txt = txt.replace("n", "ἧ");
        txt = txt.replace("o", "ỡ");
        txt = txt.replace("p", "ῤ");
        txt = txt.replace("q", "Ϥ");
        txt = txt.replace("r", "ɤ");
        txt = txt.replace("s", "ʂ");
        txt = txt.replace("t", "ƫ");
        txt = txt.replace("u", "ὗ");
        txt = txt.replace("v", "ѵ");
        txt = txt.replace("w", "ὦ");
        txt = txt.replace("x", "ӽ");
        txt = txt.replace("y", "Ў");
        txt = txt.replace("z", "ʑ");
        jTextArea4.setText(txt);
        // TODO add your handling code here:
    }//GEN-LAST:event_fourtheActionPerformed

    private void thirdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdeActionPerformed
        font();
        String txt = jTextArea3.getText();
        txt = txt.replace("A", "₳");
        txt = txt.replace("B", "Ƀ");
        txt = txt.replace("C", "₡");
        txt = txt.replace("D", "Đ");
        txt = txt.replace("E", "Ɇ");
        txt = txt.replace("F", "₣");
        txt = txt.replace("G", "₲");
        txt = txt.replace("H", "Ħ");
        txt = txt.replace("I", "Ȉ");
        txt = txt.replace("J", "Ɉ");
        txt = txt.replace("K", "₭");
        txt = txt.replace("L", "Ł");
        txt = txt.replace("M", "Ӎ");
        txt = txt.replace("N", "₦");
        txt = txt.replace("O", "Ǿ");
        txt = txt.replace("P", "₱");
        txt = txt.replace("Q", "Q");
        txt = txt.replace("R", "Ʀ");
        txt = txt.replace("S", "$");
        txt = txt.replace("T", "Ⱦ");
        txt = txt.replace("U", "Ʉ");
        txt = txt.replace("V", "Ѷ");
        txt = txt.replace("W", "₩");
        txt = txt.replace("X", "Ӿ");
        txt = txt.replace("Y", "¥");
        txt = txt.replace("Z", "Ẕ");
        txt = txt.replace("a", "ắ");
        txt = txt.replace("b", "ᵬ");
        txt = txt.replace("c", "¢");
        txt = txt.replace("d", "ȡ");
        txt = txt.replace("e", "ɐ");
        txt = txt.replace("f", "ᵮ");
        txt = txt.replace("g", "ᶃ");
        txt = txt.replace("h", "ћ");
        txt = txt.replace("i", "ϊ");
        txt = txt.replace("j", "ǰ");
        txt = txt.replace("k", "ᶄ");
        txt = txt.replace("l", "ᶅ");
        txt = txt.replace("m", "ᵯ");
        txt = txt.replace("n", "ᵰ");
        txt = txt.replace("o", "ồ");
        txt = txt.replace("p", "ᵱ");
        txt = txt.replace("q", "ɋ");
        txt = txt.replace("r", "ɍ");
        txt = txt.replace("s", "ᵴ");
        txt = txt.replace("t", "ᵵ");
        txt = txt.replace("u", "ᵾ");
        txt = txt.replace("v", "ѷ");
        txt = txt.replace("w", "ὢ");
        txt = txt.replace("x", "ᶍ");
        txt = txt.replace("y", "ў");
        txt = txt.replace("z", "ᶎ");
        jTextArea4.setText(txt);
    }//GEN-LAST:event_thirdeActionPerformed

    private void SecondeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondeActionPerformed
        font();
        String txt  = jTextArea3.getText();
        txt = txt.replace('A', 'Ã');
        txt = txt.replace('B', 'Ɓ');
        txt = txt.replace('C', 'Ć');
        txt = txt.replace('D', 'Ď');
        txt = txt.replace('E', 'Ę');
        txt = txt.replace('F', 'Ƒ');
        txt = txt.replace('G', 'Ğ');
        txt = txt.replace('H', 'Ƕ');
        txt = txt.replace('I', 'ľ');
        txt = txt.replace('J', 'Ĵ');
        txt = txt.replace('K', 'ķ');
        txt = txt.replace('L', 'Ļ');
        txt = txt.replace('M', 'Ḿ');
        txt = txt.replace('N', 'Ѝ');
        txt = txt.replace('O', 'Ô');
        txt = txt.replace('P', 'Ƿ');
        txt = txt.replace('Q', 'Q');
        txt = txt.replace('R', 'Ř');
        txt = txt.replace('S', 'Š');
        txt = txt.replace('T', 'Ƭ');
        txt = txt.replace('U', 'Ũ');
        txt = txt.replace('V', 'ṿ');
        txt = txt.replace('W', 'Ŵ');
        txt = txt.replace('X', 'χ');
        txt = txt.replace('Y', 'ÿ');
        txt = txt.replace('Z', 'Ž');
        txt = txt.replace('a', 'ᾂ');
        txt = txt.replace('b', 'ƀ');
        txt = txt.replace('c', 'ƈ');
        txt = txt.replace('d', 'Ɗ');
        txt = txt.replace('e', 'ҿ');
        txt = txt.replace('f', 'ƒ');
        txt = txt.replace('g', 'ɠ');
        txt = txt.replace('h', 'ƕ');
        txt = txt.replace('i', 'ǐ');
        txt = txt.replace('j', 'ǰ');
        txt = txt.replace('k', 'ǩ');
        txt = txt.replace('l', 'ʅ');
        txt = txt.replace('m', 'ᶆ');
        txt = txt.replace('n', 'ᶇ');
        txt = txt.replace('o', 'ơ');
        txt = txt.replace('p', 'ᵱ');
        txt = txt.replace('q', 'q');
        txt = txt.replace('r', 'ȑ');
        txt = txt.replace('s', 'ᶊ');
        txt = txt.replace('t', 'Ϯ');
        txt = txt.replace('u', 'ȗ');
        txt = txt.replace('v', 'ṽ');
        txt = txt.replace('w', 'ɯ');
        txt = txt.replace('x', 'ӿ');
        txt = txt.replace('y', 'ŷ');
        txt = txt.replace('z', 'ʑ');
        jTextArea4.setText(txt);
    }//GEN-LAST:event_SecondeActionPerformed

    private void FirsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirsteActionPerformed
        font();
        String txt = jTextArea3.getText();
        txt = txt.replace("A", "Ḁ");
        txt = txt.replace("B", "Ḇ");
        txt = txt.replace("C", "Ḉ");
        txt = txt.replace("D", "Ḓ");
        txt = txt.replace("E", "Ḕ");
        txt = txt.replace("F", "Ḟ");
        txt = txt.replace("G", "Ḡ");
        txt = txt.replace("H", "Ḫ");
        txt = txt.replace("I", "Ḯ");
        txt = txt.replace("J", "ĵ");
        txt = txt.replace("K", "Ḵ");
        txt = txt.replace("L", "Ḹ");
        txt = txt.replace("M", "Ḿ");
        txt = txt.replace("N", "Ṋ");
        txt = txt.replace("O", "Ṏ");
        txt = txt.replace("P", "Ṕ");
        txt = txt.replace("Q", "Q");
        txt = txt.replace("R", "Ṟ");
        txt = txt.replace("S", "Ṧ");
        txt = txt.replace("T", "Ṱ");
        txt = txt.replace("U", "Ṹ");
        txt = txt.replace("V", "Ṽ");
        txt = txt.replace("W", "Ẃ");
        txt = txt.replace("X", "Ẍ");
        txt = txt.replace("Y", "Ỷ");
        txt = txt.replace("Z", "Ẑ");
        txt = txt.replace("a", "ặ");
        txt = txt.replace("b", "ḇ");
        txt = txt.replace("c", "ḉ");
        txt = txt.replace("d", "ḏ");
        txt = txt.replace("e", "ḗ");
        txt = txt.replace("f", "ḟ");
        txt = txt.replace("g", "ḡ");
        txt = txt.replace("h", "ḧ");
        txt = txt.replace("i", "ḭ");
        txt = txt.replace("j", "ǰ");
        txt = txt.replace("k", "ḱ");
        txt = txt.replace("l", "ḷ");
        txt = txt.replace("m", "ḿ");
        txt = txt.replace("n", "ṉ");
        txt = txt.replace("o", "ṏ");
        txt = txt.replace("p", "Ṕ");
        txt = txt.replace("q", "q");
        txt = txt.replace("r", "ṝ");
        txt = txt.replace("s", "ṧ");
        txt = txt.replace("t", "ṱ");
        txt = txt.replace("u", "ṹ");
        txt = txt.replace("v", "ṽ");
        txt = txt.replace("w", "ẅ");
        txt = txt.replace("x", "ẍ");
        txt = txt.replace("y", "ỹ");
        txt = txt.replace("z", "ẕ");
        jTextArea4.setText(txt);
    }//GEN-LAST:event_FirsteActionPerformed

    private void ebtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ebtxtActionPerformed
        colortxt();
    }//GEN-LAST:event_ebtxtActionPerformed

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
      String myString = jTextArea4.getText();
      StringSelection stringSelection = new StringSelection(myString);
      Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
      clpbrd.setContents(stringSelection, null);
    }//GEN-LAST:event_copyActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        jTextArea3.setText("");
        jTextArea4.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        jTextArea3.paste();
    }//GEN-LAST:event_pasteActionPerformed

    private void bsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsActionPerformed
      jTextArea3.setText("");
      /*  String bs =null;
        if(jTextArea3.getText().length()>0){
            StringBuilder stbr = new StringBuilder(jTextArea3.getText());
            stbr.deleteCharAt(jTextArea3.getText().length()-1);
            bs = stbr.toString();
            jTextArea3.setText(bs);
        }*/
    }//GEN-LAST:event_bsActionPerformed

    private void jTextArea3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea3KeyPressed

    }//GEN-LAST:event_jTextArea3KeyPressed

    private void jTextArea5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea5KeyPressed

    private void deletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaActionPerformed
  jTextArea5.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_deletaActionPerformed

    private void pastea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastea1ActionPerformed
   jTextArea5.paste();        // TODO add your handling code here:
    }//GEN-LAST:event_pastea1ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
 jTextArea5.setText("");
        jTextArea6.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_clear1ActionPerformed

    private void copy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copy1ActionPerformed
    String myString = jTextArea6.getText();
      StringSelection stringSelection = new StringSelection(myString);
      Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
      clpbrd.setContents(stringSelection, null);      // TODO add your handling code here:
    }//GEN-LAST:event_copy1ActionPerformed

    private void Firsta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Firsta1ActionPerformed
   font1();
        String txt = jTextArea5.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱ");
        txt = txt.replace("ا", "ٱ");
        txt = txt.replace("ب", "پ");
        txt = txt.replace("ت", "ټ");
        txt = txt.replace("ث", "ٿ");
        txt = txt.replace("ج", "ڃ");
        txt = txt.replace("ح", "ﺣ̲");
        txt = txt.replace("خ", "ڂ");
        txt = txt.replace("د", "ڋ");
        txt = txt.replace("ذ", "ڌ");
        txt = txt.replace("ر", "ڕ");
        txt = txt.replace("ز", "ژ");
        txt = txt.replace("س", "ـﺳ͠͠");
        txt = txt.replace("ش", "ڜ");
        txt = txt.replace("ص", "ﺻ̝");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "ﻁ̲");
        txt = txt.replace("ظ", "ڟ");
        txt = txt.replace("ع", "ﻋ̝̚");
        txt = txt.replace("غ", "ۼ");
        txt = txt.replace("ف", "ڣ");
        txt = txt.replace("ق", "ﭱ");
        txt = txt.replace("ك", "ـﮓ");
        txt = txt.replace("ل", "ﻟ̲ـ");
        txt = txt.replace("م", "ﻣ̝̚");
        txt = txt.replace("ن", "ڼ");
        txt = txt.replace("ه", "ـﮩ");
        txt = txt.replace("و", "ﯙ");
        txt = txt.replace("ى", "ێ");
        jTextArea6.setText(txt);        // TODO add your handling code here:
    }//GEN-LAST:event_Firsta1ActionPerformed

    private void SecondaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondaActionPerformed
 font1();
        String txt = jTextArea5.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٵ");
        txt = txt.replace("ا", "ٵ");
        txt = txt.replace("ب", "ٻ");
        txt = txt.replace("ت", "ٺ");
        txt = txt.replace("ث", "ٽ");
        txt = txt.replace("ج", "ﺟ͠ـ");
        txt = txt.replace("ح", "ﺣ͠ـ");
        txt = txt.replace("خ", "څـ~");
        txt = txt.replace("د", "ﮨ");
        txt = txt.replace("ذ", "ڏ");
        txt = txt.replace("ر", "ړ");
        txt = txt.replace("ز", "ڗ");
        txt = txt.replace("س", "ﺳ̣̥̐");
        txt = txt.replace("ش", "ﺸ̷");
        txt = txt.replace("ص", "ﺼﮯ");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "طٌـً");
        txt = txt.replace("ظ", "ڟ");
        txt = txt.replace("ع", "‘عـً");
        txt = txt.replace("غ", "ݞ");
        txt = txt.replace("ف", "ڢ");
        txt = txt.replace("ق", "ﻗ̭͠");
        txt = txt.replace("ك", "ﮗ");
        txt = txt.replace("ل", "ڸ");
        txt = txt.replace("م", "ـ۾ـ");
        txt = txt.replace("ن", "ڼ");
        txt = txt.replace("ه", "ـﮧـ");
        txt = txt.replace("و", "ۅ");
        txt = txt.replace("ى", "ۓ");
        jTextArea6.setText(txt);        // TODO add your handling code here:
    }//GEN-LAST:event_SecondaActionPerformed

    private void thirdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thirdaActionPerformed
 font1();
        String txt = jTextArea5.getText();
        txt = txt.replace('1', '۱');
        txt = txt.replace('2', '۲');
        txt = txt.replace('3', '۳');
        txt = txt.replace('4', '٤');
        txt = txt.replace('5', '٥');
        txt = txt.replace('6', '٦');
        txt = txt.replace('7', '۷');
        txt = txt.replace('8', '۸');
        txt = txt.replace('9', '۹');
        txt = txt.replace('0', '۰');
        txt = txt.replace('أ', 'ٵ');
        txt = txt.replace('ا', 'ٵ');
        txt = txt.replace("ب", "ﺑ̷̉ـ ̭͠");
        txt = txt.replace('ت', 'ﭢ');
        txt = txt.replace('ث', 'ٽ');
        txt = txt.replace('ج', 'ڃ');
        txt = txt.replace('ح', 'ځ');
        txt = txt.replace('خ', 'ڂ');
        txt = txt.replace('د', 'ڋ');
        txt = txt.replace('ذ', 'ڐ');
        txt = txt.replace('ر', 'ڑ');
        txt = txt.replace('ز', 'ژ');
        txt = txt.replace('س', 'ښ');
        txt = txt.replace("ش", "ﺷ͠");
        txt = txt.replace("ص", "ﺻ̲");
        txt = txt.replace("ض", "ﺿ̭͠");
        txt = txt.replace("ط", "ﻃّْ");
        txt = txt.replace("ظ", "ڟّ");
        txt = txt.replace("ع", "ﻋ̲");
        txt = txt.replace("غ", "ﻏ̲ـّ");
        txt = txt.replace("ف", " ڡَّ");
        txt = txt.replace("ق", "ڨٍ");
        txt = txt.replace("ك", "ﮚ");
        txt = txt.replace("ل", "‏ﻟ̶̭͠ ");
        txt = txt.replace("م", "'ﻣ̣̥̐ـّ");
        txt = txt.replace('ن', 'ڻ');
        txt = txt.replace("ه", "ۂٍ");
        txt = txt.replace('و', 'ۋ');
        txt = txt.replace('ى', 'ﮱ');
        jTextArea6.setText(txt);        // TODO add your handling code here:
    }//GEN-LAST:event_thirdaActionPerformed

    private void fourthaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourthaActionPerformed
  font1();
        String txt = jTextArea5.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱٍۦ");
        txt = txt.replace("ا", "ٱٍ");
        txt = txt.replace("ب", "ﮨـًّ");
        txt = txt.replace("ت", "ﭠ̯ـَ");
        txt = txt.replace("ث", "ٿِ");
        txt = txt.replace("ج", "ڇـٌ");
        txt = txt.replace("ح", "ـﺢـ");
        txt = txt.replace("خ", "څـ’ـ,");
        txt = txt.replace("د", "ڍ");
        txt = txt.replace("ذ", "ڌ,");
        txt = txt.replace("ر", "ږ");
        txt = txt.replace("ز", "ڒْ");
        txt = txt.replace("س", "ﺳ̣̥̐ـﮧـ");
        txt = txt.replace("ش", "ڜـﮧـ");
        txt = txt.replace("ص", "ڝے");
        txt = txt.replace("ض", "ڞْـّ");
        txt = txt.replace("ط", "طٍـ");
        txt = txt.replace("ظ", "ڟ,");
        txt = txt.replace("ع", "ﻋً̲ﮱ");
        txt = txt.replace("غ", "ڠـﮱ");
        txt = txt.replace("ف", "ڣ");
        txt = txt.replace("ق", "ڨۧ");
        txt = txt.replace("ك", "ڳ̶͠ ");
        txt = txt.replace("ل", "ڸ");
        txt = txt.replace("م", "ﻣ̉");
        txt = txt.replace("ن", "ںّْـّۜ");
        txt = txt.replace("ه", "ـﮩۧـ");
        txt = txt.replace("و", "ۅۣۛ");
        txt = txt.replace("ى", "يے");
        jTextArea6.setText(txt);        // TODO add your handling code here:
    }//GEN-LAST:event_fourthaActionPerformed

    private void fifthaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fifthaActionPerformed
     font1();
        String txt = jTextArea5.getText();
        txt = txt.replace("1", "۱");
        txt = txt.replace("2", "۲");
        txt = txt.replace("3", "۳");
        txt = txt.replace("4", "٤");
        txt = txt.replace("5", "٥");
        txt = txt.replace("6", "٦");
        txt = txt.replace("7", "۷");
        txt = txt.replace("8", "۸");
        txt = txt.replace("9", "۹");
        txt = txt.replace("0", "۰");
        txt = txt.replace("أ", "ٱ");
        txt = txt.replace("ا", "ٱ");
        txt = txt.replace("ب", "ـپـﮱ");
        txt = txt.replace("ت", "ـٺـﮱ");
        txt = txt.replace("ث", "ـٽے");
        txt = txt.replace("ج", "ـڇے");
        txt = txt.replace("ح", "حے");
        txt = txt.replace("خ", "ڂے");
        txt = txt.replace("د", "ـڍ'");
        txt = txt.replace("ذ", "ـڐ");
        txt = txt.replace("ر", "ـڑ");
        txt = txt.replace("ز", "ـڙ");
        txt = txt.replace("س", "ـﺳ̭͠ـے");
        txt = txt.replace("ش", "ـﺸـے̷");
        txt = txt.replace("ص", "ـﺻـﮧ");
        txt = txt.replace("ض", "ـڞـﮧ");
        txt = txt.replace("ط", "ـطۜـ");
        txt = txt.replace("ظ", "ـڟۗـ");
        txt = txt.replace("ع", "ﻋ̝̚ـے");
        txt = txt.replace("غ", "ڠے");
        txt = txt.replace("ف", "ـڡّـ");
        txt = txt.replace("ق", "ــڦـ");
        txt = txt.replace("ك", "ڲے");
        txt = txt.replace("ل", "ـڵے");
        txt = txt.replace("م", "مے");
        txt = txt.replace("ن", "ڼۛـے");
        txt = txt.replace("ه", "ـﮩۧـے");
        txt = txt.replace("و", "'ۇ");
        txt = txt.replace("ى", "ـيے");
        jTextArea6.setText(txt);        // TODO add your handling code here:
    }//GEN-LAST:event_fifthaActionPerformed

    private void openaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openaActionPerformed
  //new open dialog
        JFileChooser chooser = new JFileChooser();
        //open dialog
        chooser.showOpenDialog(null);
        //choose file
        File f = chooser.getSelectedFile();
        //like a path
        String filename = f.getAbsolutePath();
        try{
            // read the path
            FileReader reader = new FileReader(filename);
            //read data in the file
            BufferedReader br = new BufferedReader(reader);

            jTextArea5.read(br,null);
            br.close();
            jTextArea5.requestFocus();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_openaActionPerformed

    private void saveaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveaActionPerformed
  JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save");
        chooser.showSaveDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        try{
            FileWriter writer = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(writer);
            jTextArea6.write(bw);
            bw.close();
            jTextArea6.requestFocus();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveaActionPerformed

    private void jSlider3AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jSlider3AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider3AncestorMoved

    private void jSlider3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider3StateChanged
 float sl3=jSlider3.getValue();
        float z= sl3/100;
        this.setOpacity(z);
        jSlider1.setValue(jSlider3.getValue());        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider3StateChanged

    private void jSlider3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jSlider3MouseReleased

    private void aback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aback1ActionPerformed
colorfr1();             // TODO add your handling code here:
    }//GEN-LAST:event_aback1ActionPerformed

    private void abtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtxt1ActionPerformed
   colort();          // TODO add your handling code here:
    }//GEN-LAST:event_abtxt1ActionPerformed

    private void atxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atxt1ActionPerformed
   colorfn1();        // TODO add your handling code here:
    }//GEN-LAST:event_atxt1ActionPerformed

    private void exite1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exite1ActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_exite1ActionPerformed
public void colort (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jTextArea5.setBackground(newColor);
    jTextArea6.setBackground(newColor);
}
public void colorfr (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jLayeredPane1.setBackground(newColor);
    }
public void colorfn (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jTextArea3.setForeground(newColor);
    jTextArea4.setForeground(newColor);
    }
public void colort1 (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jTextArea5.setBackground(newColor);
    jTextArea6.setBackground(newColor);
}
public void colorfr1 (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jLayeredPane2.setBackground(newColor);
    }
public void colorfn1 (){
    Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jTextArea5.setForeground(newColor);
    jTextArea6.setForeground(newColor);
    }
public void font(){
    Font font= new Font("Arial", 0, 18);
       jTextArea4.setFont(font);
}
public void font1(){
    Font font= new Font("Arial", 0, 18);
       jTextArea6.setFont(font);
}
public void colortxt(){
   Color newColor = JColorChooser.showDialog(null, "Choose a color",Color.black);
    jTextArea3.setBackground(newColor);
    jTextArea4.setBackground(newColor);
}    
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Firsta1;
    private javax.swing.JButton Firste;
    private javax.swing.JButton Seconda;
    private javax.swing.JButton Seconde;
    private javax.swing.JButton aback;
    private javax.swing.JButton aback1;
    private javax.swing.JButton abtxt;
    private javax.swing.JButton abtxt1;
    private javax.swing.JButton aexit;
    private javax.swing.JButton aopen;
    private javax.swing.JButton asave;
    private javax.swing.JButton atxt;
    private javax.swing.JButton atxt1;
    private javax.swing.JButton bs;
    private javax.swing.JButton bsa;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear1;
    private javax.swing.JButton cleara;
    private javax.swing.JButton copy;
    private javax.swing.JButton copy1;
    private javax.swing.JButton copya;
    private javax.swing.JButton deleta;
    private javax.swing.JButton eback;
    private javax.swing.JButton ebtxt;
    private javax.swing.JButton etxt;
    private javax.swing.JButton exite;
    private javax.swing.JButton exite1;
    private javax.swing.JButton fiftha;
    private javax.swing.JButton fifthaa;
    private javax.swing.JButton fifthe;
    private javax.swing.JButton firstaa;
    private javax.swing.JButton fourtha;
    private javax.swing.JButton fourthaa;
    private javax.swing.JButton fourthe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JButton opena;
    private javax.swing.JButton opene;
    private javax.swing.JButton paste;
    private javax.swing.JButton pastea;
    private javax.swing.JButton pastea1;
    private javax.swing.JButton savea;
    private javax.swing.JButton savee;
    private javax.swing.JButton secondaa;
    private javax.swing.JButton thirda;
    private javax.swing.JButton thirdaa;
    private javax.swing.JButton thirde;
    // End of variables declaration//GEN-END:variables
}
