/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EuropeBusBookingV2;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author ishan
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel3.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        MenuClose = new javax.swing.JButton();
        MenuAdmin = new javax.swing.JButton();
        MenuSignIn = new javax.swing.JButton();
        MenuSignUp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuClose.setBackground(new java.awt.Color(43, 6, 78));
        MenuClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseButton.png"))); // NOI18N
        MenuClose.setBorderPainted(false);
        MenuClose.setContentAreaFilled(false);
        MenuClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuClose.setFocusPainted(false);
        MenuClose.setFocusable(false);
        MenuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCloseActionPerformed(evt);
            }
        });
        jPanel3.add(MenuClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 120, 40));

        MenuAdmin.setBackground(new java.awt.Color(43, 6, 78));
        MenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuAdmin.png"))); // NOI18N
        MenuAdmin.setBorderPainted(false);
        MenuAdmin.setContentAreaFilled(false);
        MenuAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuAdmin.setFocusPainted(false);
        MenuAdmin.setFocusable(false);
        MenuAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAdminActionPerformed(evt);
            }
        });
        jPanel3.add(MenuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, 90, -1));

        MenuSignIn.setBackground(new java.awt.Color(43, 6, 78));
        MenuSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuSignIn.png"))); // NOI18N
        MenuSignIn.setBorderPainted(false);
        MenuSignIn.setContentAreaFilled(false);
        MenuSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuSignIn.setFocusPainted(false);
        MenuSignIn.setFocusable(false);
        MenuSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSignInActionPerformed(evt);
            }
        });
        jPanel3.add(MenuSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 190, 70));

        MenuSignUp.setBackground(new java.awt.Color(43, 6, 78));
        MenuSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuSignup.png"))); // NOI18N
        MenuSignUp.setBorderPainted(false);
        MenuSignUp.setContentAreaFilled(false);
        MenuSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuSignUp.setFocusPainted(false);
        MenuSignUp.setFocusable(false);
        MenuSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSignUpActionPerformed(evt);
            }
        });
        jPanel3.add(MenuSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 190, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuBack.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 790, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCloseActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_MenuCloseActionPerformed

    private void MenuSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSignUpActionPerformed
        // TODO add your handling code here:
        SignUpForm ul = new SignUpForm();
        ul.setVisible(true);
    }//GEN-LAST:event_MenuSignUpActionPerformed

    private void MenuSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSignInActionPerformed
        // TODO add your handling code here:
        SignInForm ul = new SignInForm();
        ul.setVisible(true);
    }//GEN-LAST:event_MenuSignInActionPerformed

    private void MenuAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAdminActionPerformed
        // TODO add your handling code here:
       AdminSignInForm al = new AdminSignInForm();
        al.setVisible(true);
    }//GEN-LAST:event_MenuAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuAdmin;
    private javax.swing.JButton MenuClose;
    private javax.swing.JButton MenuSignIn;
    private javax.swing.JButton MenuSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
