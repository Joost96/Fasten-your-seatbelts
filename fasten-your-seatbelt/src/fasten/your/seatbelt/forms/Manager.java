/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasten.your.seatbelt.forms;

/**
 *
 * @author Joost
 */
public class Manager extends javax.swing.JFrame
{

    /**
     * Creates new form Manager
     */
    public Manager()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Menu = new javax.swing.JPanel();
        managerOverview = new javax.swing.JLabel();
        Options = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        whiteBackground = new javax.swing.JLabel();
        optionsPanel = new javax.swing.JPanel();
        password = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        confirmPasswordInput = new javax.swing.JPasswordField();
        savePassword = new javax.swing.JButton();
        overviewPanel = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setToolTipText("");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setName("Menu"); // NOI18N
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        managerOverview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerOverview.setText("Overviews");
        managerOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managerOverview.setFocusTraversalPolicyProvider(true);
        managerOverview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        managerOverview.setName(""); // NOI18N
        managerOverview.setPreferredSize(new java.awt.Dimension(100, 40));
        managerOverview.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                managerOverviewMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                managerOverviewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                managerOverviewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                managerOverviewMouseReleased(evt);
            }
        });
        Menu.add(managerOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        Options.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Options.setText("Options");
        Options.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Options.setFocusTraversalPolicyProvider(true);
        Options.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Options.setName(""); // NOI18N
        Options.setPreferredSize(new java.awt.Dimension(100, 40));
        Options.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                OptionsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                OptionsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                OptionsMouseReleased(evt);
            }
        });
        Menu.add(Options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/Menu.png"))); // NOI18N
        Menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setText("*AccountName*");
        topBar.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 30));

        logoutButton.setText("(Logout)");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                logoutButtonMouseClicked(evt);
            }
        });
        topBar.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 30));

        search.setText("Search:");
        topBar.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        searchBar.setPreferredSize(new java.awt.Dimension(8, 20));
        searchBar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                searchBarActionPerformed(evt);
            }
        });
        topBar.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 30));

        whiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/TopBar.png"))); // NOI18N
        topBar.add(whiteBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        getContentPane().add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password.setText("Password :");

        confirmPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmPassword.setText("Confirm Password :");

        savePassword.setText("Save Password");
        savePassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                savePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(confirmPasswordInput)))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(savePassword)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassword)
                    .addComponent(confirmPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(savePassword)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        getContentPane().add(optionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 800, 600));
        optionsPanel.setVisible(false);

        jPanel15.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Sunday, 13 October"));
        jPanel16.setPreferredSize(new java.awt.Dimension(600, 135));

        jLabel29.setText("195");

        jLabel30.setText("Total:");

        jLabel31.setText("56");

        jLabel11.setText("Amount of baggage found:");

        jLabel6.setText("Amount of baggage missing:");

        jLabel32.setText("251");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel30))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/piechart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        overviewPanel.addTab("Current Stats", jPanel15);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Overview"));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 135));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2013", "2012", "2011", "2010", "2009", "2008", "2007" }));

        jLabel12.setText("Select year");

        jLabel34.setText("Amount of baggage processed:");

        jLabel35.setText("56");

        jLabel36.setText("Amount of baggage found:");

        jLabel37.setText("Total:");

        jLabel38.setText("274");

        jLabel39.setText("Amount of baggage missing:");

        jLabel40.setText("195");

        jLabel41.setText("23");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel37)
                    .addComponent(jLabel39)
                    .addComponent(jLabel36))
                .addGap(100, 100, 100)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel12)
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/linechart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        overviewPanel.addTab("Year Overview", jPanel19);

        getContentPane().add(overviewPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 800, 600));
        overviewPanel.setVisible(false);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/CorendonLogo.png"))); // NOI18N

        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/Flower.png"))); // NOI18N

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(jLabel44))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void managerOverviewMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_managerOverviewMouseClicked
    {//GEN-HEADEREND:event_managerOverviewMouseClicked
        overviewPanel.setVisible(true);
        optionsPanel.setVisible(false);
        managerOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenReleased.png")));
        Options.setIcon(null);
    }//GEN-LAST:event_managerOverviewMouseClicked

    private void managerOverviewMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_managerOverviewMouseExited
    {//GEN-HEADEREND:event_managerOverviewMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_managerOverviewMouseExited

    private void managerOverviewMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_managerOverviewMousePressed
    {//GEN-HEADEREND:event_managerOverviewMousePressed
        managerOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenPressed.png")));
    }//GEN-LAST:event_managerOverviewMousePressed

    private void managerOverviewMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_managerOverviewMouseReleased
    {//GEN-HEADEREND:event_managerOverviewMouseReleased
        managerOverview.setIcon(null);
    }//GEN-LAST:event_managerOverviewMouseReleased

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_searchBarActionPerformed
    {//GEN-HEADEREND:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void OptionsMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_OptionsMouseReleased
    {//GEN-HEADEREND:event_OptionsMouseReleased
        Options.setIcon(null);
    }//GEN-LAST:event_OptionsMouseReleased

    private void OptionsMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_OptionsMousePressed
    {//GEN-HEADEREND:event_OptionsMousePressed
        Options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenPressed.png")));
    }//GEN-LAST:event_OptionsMousePressed

    private void OptionsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_OptionsMouseClicked
    {//GEN-HEADEREND:event_OptionsMouseClicked
        overviewPanel.setVisible(false);
        optionsPanel.setVisible(true);
        Options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenReleased.png")));
        managerOverview.setIcon(null);
    }//GEN-LAST:event_OptionsMouseClicked

    private void savePasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_savePasswordActionPerformed
    {//GEN-HEADEREND:event_savePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savePasswordActionPerformed

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_logoutButtonMouseClicked
    {//GEN-HEADEREND:event_logoutButtonMouseClicked
        dispose();
        LogIn logIn = new LogIn();
        logIn.setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Manager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Options;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JPasswordField confirmPasswordInput;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel managerOverview;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JTabbedPane overviewPanel;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JButton savePassword;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
}
