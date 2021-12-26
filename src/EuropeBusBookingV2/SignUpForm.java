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
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ishan
 */
public class SignUpForm extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
        
        
        this.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        RegFirstName.setBackground(new Color(0,0,0,0));
        RegSurname.setBackground(new Color(0,0,0,0));
        RegDOB.setBackground(new Color(0,0,0,0));
        RegEmail.setBackground(new Color(0,0,0,0));
        RegTelephone.setBackground(new Color(0,0,0,0));
        RegAddress.setBackground(new Color(0,0,0,0));
        RegPassword.setBackground(new Color(0,0,0,0));
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RegGender = new javax.swing.JComboBox<>();
        RegSignup = new javax.swing.JButton();
        RegClose = new javax.swing.JButton();
        RegAddress = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Address = new javax.swing.JLabel();
        RegTelephone = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Telephone = new javax.swing.JLabel();
        RegDOB = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        DateOfBirth = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        RegPassword = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        RegEmail = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Email = new javax.swing.JLabel();
        RegSurname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Surname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        RegFirstName = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        SignUpButton = new javax.swing.JLabel();
        SignInButton = new javax.swing.JLabel();
        FormSide = new javax.swing.JLabel();
        LogoSide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegGender.setBackground(new java.awt.Color(0, 0, 102));
        RegGender.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegGender.setForeground(new java.awt.Color(0, 0, 102));
        RegGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        RegGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegGenderActionPerformed(evt);
            }
        });
        jPanel1.add(RegGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        RegSignup.setBackground(new java.awt.Color(43, 6, 78));
        RegSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign up button.png"))); // NOI18N
        RegSignup.setBorder(null);
        RegSignup.setBorderPainted(false);
        RegSignup.setContentAreaFilled(false);
        RegSignup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegSignup.setFocusPainted(false);
        RegSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegSignupActionPerformed(evt);
            }
        });
        jPanel1.add(RegSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 120, 40));

        RegClose.setBackground(new java.awt.Color(43, 6, 78));
        RegClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseButton.png"))); // NOI18N
        RegClose.setBorder(null);
        RegClose.setBorderPainted(false);
        RegClose.setContentAreaFilled(false);
        RegClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegClose.setFocusPainted(false);
        RegClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCloseActionPerformed(evt);
            }
        });
        jPanel1.add(RegClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 120, 40));

        RegAddress.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegAddress.setForeground(new java.awt.Color(204, 204, 204));
        RegAddress.setText("Enter Your Address");
        RegAddress.setBorder(null);
        RegAddress.setOpaque(false);
        RegAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegAddressActionPerformed(evt);
            }
        });
        jPanel1.add(RegAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 460, 230, 30));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 220, 20));

        Address.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        Address.setForeground(new java.awt.Color(255, 255, 255));
        Address.setText("Address");
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 110, 30));

        RegTelephone.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegTelephone.setForeground(new java.awt.Color(204, 204, 204));
        RegTelephone.setText("0123456789");
        RegTelephone.setBorder(null);
        RegTelephone.setOpaque(false);
        RegTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegTelephoneActionPerformed(evt);
            }
        });
        jPanel1.add(RegTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 230, 30));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 430, 220, 20));

        Telephone.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        Telephone.setForeground(new java.awt.Color(255, 255, 255));
        Telephone.setText("Telephone");
        jPanel1.add(Telephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 110, 30));

        RegDOB.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegDOB.setForeground(new java.awt.Color(204, 204, 204));
        RegDOB.setText("DD/MM/YYYY");
        RegDOB.setBorder(null);
        RegDOB.setOpaque(false);
        RegDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegDOBActionPerformed(evt);
            }
        });
        jPanel1.add(RegDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 230, 30));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 220, 20));

        DateOfBirth.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        DateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirth.setText("Date Of Birth");
        jPanel1.add(DateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 110, 30));

        jSeparator8.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 220, 20));

        RegPassword.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegPassword.setForeground(new java.awt.Color(204, 204, 204));
        RegPassword.setText("example@gmail.com");
        RegPassword.setBorder(null);
        RegPassword.setOpaque(false);
        RegPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(RegPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 230, 30));

        Password.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 110, 30));

        RegEmail.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegEmail.setForeground(new java.awt.Color(204, 204, 204));
        RegEmail.setText("example@gmail.com");
        RegEmail.setBorder(null);
        RegEmail.setOpaque(false);
        RegEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegEmailActionPerformed(evt);
            }
        });
        jPanel1.add(RegEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 230, 30));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 220, 20));

        Email.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 110, 30));

        RegSurname.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegSurname.setForeground(new java.awt.Color(204, 204, 204));
        RegSurname.setText("Enter Your Surname");
        RegSurname.setBorder(null);
        RegSurname.setOpaque(false);
        RegSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegSurnameActionPerformed(evt);
            }
        });
        jPanel1.add(RegSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 230, 30));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 220, 20));

        Surname.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        Surname.setForeground(new java.awt.Color(255, 255, 255));
        Surname.setText("Surname");
        jPanel1.add(Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 110, 30));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 220, 20));

        RegFirstName.setFont(new java.awt.Font("Gilroy Light", 0, 12)); // NOI18N
        RegFirstName.setForeground(new java.awt.Color(204, 204, 204));
        RegFirstName.setText("Enter Your First Name");
        RegFirstName.setBorder(null);
        RegFirstName.setOpaque(false);
        RegFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(RegFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 230, 30));

        FirstName.setFont(new java.awt.Font("Gilroy Light", 1, 16)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");
        jPanel1.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 110, 30));

        SignUpButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign up button.png"))); // NOI18N
        jPanel1.add(SignUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 110, 40));

        SignInButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign in button.png"))); // NOI18N
        jPanel1.add(SignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 110, 40));

        FormSide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FormSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/form side.png"))); // NOI18N
        jPanel1.add(FormSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 460, 550));

        LogoSide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo side.png"))); // NOI18N
        jPanel1.add(LogoSide, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 460, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegGenderActionPerformed

    private void RegSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegSignupActionPerformed
        // TODO add your handling code here:
        
        try{
            String query = "INSERT INTO `userdetails`( `FirstName`, `Surname`, `Gender`, `Username`, `Password`, `Birthday`, `Telephone`, `Address`) VALUES (?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/eurobusbooking", "root", "");
            pst =  con.prepareStatement(query);
            pst.setString(1, RegFirstName.getText());
            pst.setString(2, RegSurname.getText());
            pst.setString(3, RegGender.getSelectedItem().toString());
            pst.setString(4, RegEmail.getText());
            pst.setString(5, RegPassword.getText());
            pst.setString(6, RegDOB.getText());
            pst.setString(7, RegTelephone.getText());
            pst.setString(8, RegAddress.getText());
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "YOU ARE SUCCESFULLY REGISTERED");
            dispose();
        
        
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null, ex);
        
        
        }
        

    }//GEN-LAST:event_RegSignupActionPerformed

    private void RegCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_RegCloseActionPerformed

    private void RegAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegAddressActionPerformed

    private void RegTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegTelephoneActionPerformed

    private void RegDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegDOBActionPerformed

    private void RegEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegEmailActionPerformed

    private void RegSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegSurnameActionPerformed

    private void RegFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegFirstNameActionPerformed

    private void RegPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel DateOfBirth;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel FormSide;
    private javax.swing.JLabel LogoSide;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField RegAddress;
    private javax.swing.JButton RegClose;
    private javax.swing.JTextField RegDOB;
    private javax.swing.JTextField RegEmail;
    private javax.swing.JTextField RegFirstName;
    private javax.swing.JComboBox<String> RegGender;
    private javax.swing.JTextField RegPassword;
    private javax.swing.JButton RegSignup;
    private javax.swing.JTextField RegSurname;
    private javax.swing.JTextField RegTelephone;
    private javax.swing.JLabel SignInButton;
    private javax.swing.JLabel SignUpButton;
    private javax.swing.JLabel Surname;
    private javax.swing.JLabel Telephone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
