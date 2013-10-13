/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fasten.your.seatbelt.forms;

/**
 *
 * @author Joost
 */
public class ApplicationManager extends javax.swing.JFrame
{

    /**
     * Creates new form ApplicationManager
     */
    public ApplicationManager()
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
        accountManagement = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        whiteBackground = new javax.swing.JLabel();
        accountManagementPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accounts = new javax.swing.JTable();
        edit = new javax.swing.JPanel();
        accountID = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        accountName = new javax.swing.JLabel();
        accountIdInput = new javax.swing.JTextField();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        accountNameInput = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        passwordConfirm = new javax.swing.JLabel();
        passwordConfirmInput = new javax.swing.JPasswordField();
        accountTypeInput = new javax.swing.JComboBox();
        accountType = new javax.swing.JLabel();
        comment = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentInput = new javax.swing.JTextArea();
        NextAccount = new javax.swing.JLabel();
        FirstAccount = new javax.swing.JLabel();
        PrevAccount = new javax.swing.JLabel();
        LastAccount = new javax.swing.JLabel();
        currentPageAccount = new javax.swing.JTextField();
        optionsPanel = new javax.swing.JPanel();
        password1 = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JLabel();
        passwordInput1 = new javax.swing.JPasswordField();
        confirmPasswordInput = new javax.swing.JPasswordField();
        savePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setToolTipText("");
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setName("Menu"); // NOI18N
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountManagement.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        accountManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountManagement.setText("Account Management");
        accountManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accountManagement.setFocusTraversalPolicyProvider(true);
        accountManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        accountManagement.setName(""); // NOI18N
        accountManagement.setPreferredSize(new java.awt.Dimension(100, 40));
        accountManagement.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                accountManagementMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                accountManagementMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                accountManagementMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                accountManagementMouseReleased(evt);
            }
        });
        Menu.add(accountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        options.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        options.setText("Options");
        options.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        options.setFocusTraversalPolicyProvider(true);
        options.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        options.setName(""); // NOI18N
        options.setPreferredSize(new java.awt.Dimension(100, 40));
        options.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                optionsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                optionsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                optionsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                optionsMouseReleased(evt);
            }
        });
        Menu.add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/Menu.png"))); // NOI18N
        Menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        topBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setText("*AccountName*");
        topBar.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 30));

        logoutButton.setText("(Logout)");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        getContentPane().add(topBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 800, 50));

        accountManagementPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        accounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Account ID", "Name", "Account Name", "Account type"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accounts);

        accountID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountID.setText("Account ID :");

        firstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstName.setText("First Name :");

        lastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastName.setText("Last Name :");

        accountName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountName.setText("Account Name :");

        firstNameInput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                firstNameInputActionPerformed(evt);
            }
        });

        password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password.setText("Password :");

        passwordInput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                passwordInputActionPerformed(evt);
            }
        });

        passwordConfirm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        passwordConfirm.setText("comfirm password :");

        accountTypeInput.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Counter assistant", "Manager", "Application manager" }));
        accountTypeInput.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                accountTypeInputActionPerformed(evt);
            }
        });

        accountType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountType.setText("Account type :");

        comment.setText("Comment :");

        commentInput.setColumns(20);
        commentInput.setRows(5);
        jScrollPane2.setViewportView(commentInput);

        javax.swing.GroupLayout editLayout = new javax.swing.GroupLayout(edit);
        edit.setLayout(editLayout);
        editLayout.setHorizontalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editLayout.createSequentialGroup()
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(accountName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(accountID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordInput, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(accountNameInput)
                            .addComponent(lastNameInput)
                            .addComponent(accountIdInput))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(passwordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountType, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(accountTypeInput, 0, 200, Short.MAX_VALUE)
                                    .addComponent(passwordConfirmInput)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editLayout.createSequentialGroup()
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(editLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comment, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        editLayout.setVerticalGroup(
            editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountID)
                    .addComponent(accountIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordConfirm)
                    .addComponent(passwordConfirmInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountType)
                    .addComponent(accountTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(comment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        NextAccount.setText("Next");

        FirstAccount.setText("First");

        PrevAccount.setText("Prev");

        LastAccount.setText("Last");

        currentPageAccount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentPageAccount.setText("1");

        javax.swing.GroupLayout accountManagementPanelLayout = new javax.swing.GroupLayout(accountManagementPanel);
        accountManagementPanel.setLayout(accountManagementPanelLayout);
        accountManagementPanelLayout.setHorizontalGroup(
            accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountManagementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountManagementPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, accountManagementPanelLayout.createSequentialGroup()
                        .addComponent(FirstAccount)
                        .addGap(9, 9, 9)
                        .addComponent(PrevAccount)
                        .addGap(8, 8, 8)
                        .addComponent(currentPageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(NextAccount)
                        .addGap(7, 7, 7)
                        .addComponent(LastAccount)
                        .addGap(31, 31, 31))))
        );
        accountManagementPanelLayout.setVerticalGroup(
            accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountManagementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(accountManagementPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrevAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentPageAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NextAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(accountManagementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        accountManagementPanel.setVisible(false);

        password1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password1.setText("Password :");

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
                            .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordInput1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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
                    .addComponent(password1)
                    .addComponent(passwordInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountManagementMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_accountManagementMouseClicked
    {//GEN-HEADEREND:event_accountManagementMouseClicked
        accountManagementPanel.setVisible(true);
        optionsPanel.setVisible(false);
        accountManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenReleased.png")));
        options.setIcon(null);
    }//GEN-LAST:event_accountManagementMouseClicked

    private void accountManagementMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_accountManagementMouseExited
    {//GEN-HEADEREND:event_accountManagementMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_accountManagementMouseExited

    private void accountManagementMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_accountManagementMousePressed
    {//GEN-HEADEREND:event_accountManagementMousePressed
        accountManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenPressed.png")));
    }//GEN-LAST:event_accountManagementMousePressed

    private void accountManagementMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_accountManagementMouseReleased
    {//GEN-HEADEREND:event_accountManagementMouseReleased
        accountManagement.setIcon(null);
    }//GEN-LAST:event_accountManagementMouseReleased

    private void searchBarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_searchBarActionPerformed
    {//GEN-HEADEREND:event_searchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarActionPerformed

    private void accountTypeInputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_accountTypeInputActionPerformed
    {//GEN-HEADEREND:event_accountTypeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountTypeInputActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_passwordInputActionPerformed
    {//GEN-HEADEREND:event_passwordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputActionPerformed

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_firstNameInputActionPerformed
    {//GEN-HEADEREND:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed

    private void optionsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_optionsMouseClicked
    {//GEN-HEADEREND:event_optionsMouseClicked
        accountManagementPanel.setVisible(false);
        optionsPanel.setVisible(true);
        accountManagement.setIcon(null);
        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenReleased.png")));
    }//GEN-LAST:event_optionsMouseClicked

    private void optionsMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_optionsMouseExited
    {//GEN-HEADEREND:event_optionsMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_optionsMouseExited

    private void optionsMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_optionsMousePressed
    {//GEN-HEADEREND:event_optionsMousePressed
        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenPressed.png")));
    }//GEN-LAST:event_optionsMousePressed

    private void optionsMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_optionsMouseReleased
    {//GEN-HEADEREND:event_optionsMouseReleased
        options.setIcon(null);
    }//GEN-LAST:event_optionsMouseReleased

    private void savePasswordActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_savePasswordActionPerformed
    {//GEN-HEADEREND:event_savePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ApplicationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ApplicationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ApplicationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ApplicationManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ApplicationManager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstAccount;
    private javax.swing.JLabel LastAccount;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel NextAccount;
    private javax.swing.JLabel PrevAccount;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel accountID;
    private javax.swing.JTextField accountIdInput;
    private javax.swing.JLabel accountManagement;
    private javax.swing.JPanel accountManagementPanel;
    private javax.swing.JLabel accountName;
    private javax.swing.JTextField accountNameInput;
    private javax.swing.JLabel accountType;
    private javax.swing.JComboBox accountTypeInput;
    private javax.swing.JTable accounts;
    private javax.swing.JLabel comment;
    private javax.swing.JTextArea commentInput;
    private javax.swing.JLabel confirmPassword;
    private javax.swing.JPasswordField confirmPasswordInput;
    private javax.swing.JTextField currentPageAccount;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel options;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel passwordConfirm;
    private javax.swing.JPasswordField passwordConfirmInput;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JPasswordField passwordInput1;
    private javax.swing.JButton savePassword;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
}
