/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EuropeBusBookingV2;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ishan
 */
public class AdminSignInForm extends javax.swing.JFrame {

    /**
     * Creates new form SignInForm
     */
    public AdminSignInForm() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel10.setBackground(new Color(0,0,0,0));
        AdminPassword.setBackground(new Color(0,0,0,0));
        AdminUsername.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        aloginsignbutton1 = new javax.swing.JLabel();
        UserLoginTitle = new javax.swing.JLabel();
        AdminLoginClose = new javax.swing.JButton();
        AdminLoginSignIn = new javax.swing.JButton();
        AdminUsername = new javax.swing.JTextField();
        UsernameSeparator3 = new javax.swing.JSeparator();
        ALoginUsername = new javax.swing.JLabel();
        PasswordSeperator3 = new javax.swing.JSeparator();
        AdminPassword = new javax.swing.JTextField();
        ALoginPassword = new javax.swing.JLabel();
        aloginsignbutton2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aloginsignbutton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(aloginsignbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, 40));

        UserLoginTitle.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 24)); // NOI18N
        UserLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLoginTitle.setText("ADMIN SIGN IN");
        jPanel10.add(UserLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, 40));

        AdminLoginClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseButton.png"))); // NOI18N
        AdminLoginClose.setBorderPainted(false);
        AdminLoginClose.setContentAreaFilled(false);
        AdminLoginClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminLoginClose.setFocusPainted(false);
        AdminLoginClose.setFocusable(false);
        AdminLoginClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginCloseActionPerformed(evt);
            }
        });
        jPanel10.add(AdminLoginClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 120, 40));

        AdminLoginSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuSignIn.png"))); // NOI18N
        AdminLoginSignIn.setBorderPainted(false);
        AdminLoginSignIn.setContentAreaFilled(false);
        AdminLoginSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminLoginSignIn.setFocusPainted(false);
        AdminLoginSignIn.setFocusable(false);
        AdminLoginSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginSignInActionPerformed(evt);
            }
        });
        jPanel10.add(AdminLoginSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 200, 70));

        AdminUsername.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        AdminUsername.setForeground(new java.awt.Color(204, 204, 204));
        AdminUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdminUsername.setText("example@gmail.com");
        AdminUsername.setBorder(null);
        AdminUsername.setOpaque(false);
        jPanel10.add(AdminUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 270, 30));

        UsernameSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        UsernameSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel10.add(UsernameSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 270, 40));

        ALoginUsername.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 18)); // NOI18N
        ALoginUsername.setForeground(new java.awt.Color(255, 255, 255));
        ALoginUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALoginUsername.setText("USERNAME");
        jPanel10.add(ALoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 170, 40));

        PasswordSeperator3.setBackground(new java.awt.Color(153, 153, 153));
        PasswordSeperator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel10.add(PasswordSeperator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 270, 40));

        AdminPassword.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        AdminPassword.setForeground(new java.awt.Color(204, 204, 204));
        AdminPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AdminPassword.setText("example@gmail.com");
        AdminPassword.setBorder(null);
        AdminPassword.setOpaque(false);
        jPanel10.add(AdminPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 270, 30));

        ALoginPassword.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 18)); // NOI18N
        ALoginPassword.setForeground(new java.awt.Color(255, 255, 255));
        ALoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ALoginPassword.setText("PASSWORD");
        jPanel10.add(ALoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 170, 40));

        aloginsignbutton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(aloginsignbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 120, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/form side.png"))); // NOI18N
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 470, 560));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo side.png"))); // NOI18N
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 470, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminLoginCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_AdminLoginCloseActionPerformed

    private void AdminLoginSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginSignInActionPerformed
        // TODO add your handling code here:
        String aUser = AdminUsername.getText();
        String aPass = AdminPassword.getText();
        try{
        if (aUser.equals("admin") || aPass.equals("admin123")) {
            
            AdminMenu a = new AdminMenu();
            a.setVisible(true);
            
            JOptionPane.showMessageDialog(null, "You have successfully logged in");
            dispose();
        
        }
        else{
                        JOptionPane.showMessageDialog(null, "Wrong username & password");
                    
                    }
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
        
        
        }
    }//GEN-LAST:event_AdminLoginSignInActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminSignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ALoginPassword;
    private javax.swing.JLabel ALoginUsername;
    private javax.swing.JButton AdminLoginClose;
    private javax.swing.JButton AdminLoginSignIn;
    private javax.swing.JTextField AdminPassword;
    private javax.swing.JTextField AdminUsername;
    private javax.swing.JSeparator PasswordSeperator3;
    private javax.swing.JLabel UserLoginTitle;
    private javax.swing.JSeparator UsernameSeparator3;
    private javax.swing.JLabel aloginsignbutton1;
    private javax.swing.JLabel aloginsignbutton2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    // End of variables declaration//GEN-END:variables
}
