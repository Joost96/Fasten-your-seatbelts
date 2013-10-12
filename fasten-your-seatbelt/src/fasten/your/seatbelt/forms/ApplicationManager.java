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
        Logo = new javax.swing.JLabel();
        topBar = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        whiteBackground = new javax.swing.JLabel();
        accountManagementPanel = new javax.swing.JPanel();

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

        javax.swing.GroupLayout accountManagementPanelLayout = new javax.swing.GroupLayout(accountManagementPanel);
        accountManagementPanel.setLayout(accountManagementPanelLayout);
        accountManagementPanelLayout.setHorizontalGroup(
            accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        accountManagementPanelLayout.setVerticalGroup(
            accountManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(accountManagementPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));
        accountManagementPanel.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountManagementMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_accountManagementMouseClicked
    {//GEN-HEADEREND:event_accountManagementMouseClicked
        accountManagementPanel.setVisible(true);
        accountManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fasten/your/seatbelt/Images/ButtenReleased.png")));
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
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel accountManagement;
    private javax.swing.JPanel accountManagementPanel;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchBar;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
}
