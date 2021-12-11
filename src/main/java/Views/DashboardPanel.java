/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Admin;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author vedan
 */
public class DashboardPanel extends javax.swing.JPanel {

    private JPanel mainContainer;
    private Admin admin;

    /**
     * Creates new form DashboardPanel
     */
    public DashboardPanel(JPanel mainContainer, Admin admin) {
        initComponents();
        this.mainContainer = mainContainer;
        this.admin = admin;
        userGreetingLabel.setText("Hello, " + admin.getName());
        // teacherLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/teacher64.png")));
    }

    private void tileMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.setBackground(new Color(195, 205, 219));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        userGreetingLabel = new javax.swing.JLabel();
        daycareLabel = new javax.swing.JLabel();
        dashboardContainer = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        teachersTile = new javax.swing.JPanel();
        teacherLabelIcon = new javax.swing.JLabel();
        teachersLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        teachersLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        teachersLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        userGreetingLabel.setText("Hello, ");

        daycareLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        daycareLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daycareLabel.setText("Daycare");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(daycareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userGreetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(userGreetingLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(daycareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        dashboardContainer.setLayout(new java.awt.CardLayout());

        homePanel.setLayout(new java.awt.GridLayout(2, 3, 10, 10));

        teachersTile.setBackground(java.awt.SystemColor.inactiveCaption);
        teachersTile.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        teachersTile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teachersTileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teachersTileMouseExited(evt);
            }
        });

        teacherLabelIcon.setToolTipText("");

        teachersLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teachersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teachersLabel.setText("Teachers");

        javax.swing.GroupLayout teachersTileLayout = new javax.swing.GroupLayout(teachersTile);
        teachersTile.setLayout(teachersTileLayout);
        teachersTileLayout.setHorizontalGroup(
            teachersTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersTileLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(teacherLabelIcon)
                .addContainerGap(128, Short.MAX_VALUE))
            .addComponent(teachersLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teachersTileLayout.setVerticalGroup(
            teachersTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teachersTileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(teacherLabelIcon)
                .addGap(35, 35, 35)
                .addComponent(teachersLabel)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        homePanel.add(teachersTile);

        jPanel3.setBackground(java.awt.SystemColor.inactiveCaption);

        teachersLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teachersLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teachersLabel1.setText("Students");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachersLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(teachersLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        homePanel.add(jPanel3);

        jPanel4.setBackground(java.awt.SystemColor.inactiveCaption);

        teachersLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        teachersLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teachersLabel2.setText("Groups");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachersLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(teachersLabel2)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        homePanel.add(jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        homePanel.add(jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        homePanel.add(jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        homePanel.add(jPanel7);

        dashboardContainer.add(homePanel, "card2");

        jSplitPane1.setRightComponent(dashboardContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        mainContainer.remove(this);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.previous(mainContainer);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void teachersTileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTileMouseEntered
        // TODO add your handling code here:
        teachersTile.setBackground(Color.WHITE);
    }//GEN-LAST:event_teachersTileMouseEntered

    private void teachersTileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teachersTileMouseExited
        // TODO add your handling code here:
        teachersTile.setBackground(new Color(195, 205, 219));
    }//GEN-LAST:event_teachersTileMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashboardContainer;
    private javax.swing.JLabel daycareLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel teacherLabelIcon;
    private javax.swing.JLabel teachersLabel;
    private javax.swing.JLabel teachersLabel1;
    private javax.swing.JLabel teachersLabel2;
    private javax.swing.JPanel teachersTile;
    private javax.swing.JLabel userGreetingLabel;
    // End of variables declaration//GEN-END:variables
}