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
public class SignInForm extends javax.swing.JFrame {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form SignInForm
     */
    public SignInForm() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
        jPanel7.setBackground(new Color(0,0,0,0));
        username.setBackground(new Color(0,0,0,0));
        password.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        UserLoginTitle = new javax.swing.JLabel();
        UserLoginClose = new javax.swing.JButton();
        UserLoginSignIn = new javax.swing.JButton();
        password = new javax.swing.JTextField();
        UsernameSeparator = new javax.swing.JSeparator();
        ULoginUsername = new javax.swing.JLabel();
        PasswordSeperator = new javax.swing.JSeparator();
        username = new javax.swing.JTextField();
        ULoginPassword = new javax.swing.JLabel();
        uloginsignbutton1 = new javax.swing.JLabel();
        uloginsignbutton2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserLoginTitle.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 24)); // NOI18N
        UserLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLoginTitle.setText("USER SIGN IN");
        jPanel7.add(UserLoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 160, 40));

        UserLoginClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CloseButton.png"))); // NOI18N
        UserLoginClose.setBorderPainted(false);
        UserLoginClose.setContentAreaFilled(false);
        UserLoginClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserLoginClose.setFocusPainted(false);
        UserLoginClose.setFocusable(false);
        UserLoginClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginCloseActionPerformed(evt);
            }
        });
        jPanel7.add(UserLoginClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 120, 40));

        UserLoginSignIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainMenuSignIn.png"))); // NOI18N
        UserLoginSignIn.setBorderPainted(false);
        UserLoginSignIn.setContentAreaFilled(false);
        UserLoginSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserLoginSignIn.setFocusPainted(false);
        UserLoginSignIn.setFocusable(false);
        UserLoginSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginSignInActionPerformed(evt);
            }
        });
        jPanel7.add(UserLoginSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 200, 70));

        password.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("********");
        password.setBorder(null);
        password.setOpaque(false);
        jPanel7.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 270, 30));

        UsernameSeparator.setBackground(new java.awt.Color(153, 153, 153));
        UsernameSeparator.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(UsernameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 270, 40));

        ULoginUsername.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 18)); // NOI18N
        ULoginUsername.setForeground(new java.awt.Color(255, 255, 255));
        ULoginUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ULoginUsername.setText("USERNAME");
        jPanel7.add(ULoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 170, 40));

        PasswordSeperator.setBackground(new java.awt.Color(153, 153, 153));
        PasswordSeperator.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(PasswordSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 270, 40));

        username.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("example@gmail.com");
        username.setBorder(null);
        username.setOpaque(false);
        jPanel7.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 270, 30));

        ULoginPassword.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 18)); // NOI18N
        ULoginPassword.setForeground(new java.awt.Color(255, 255, 255));
        ULoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ULoginPassword.setText("PASSWORD");
        jPanel7.add(ULoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 170, 40));

        uloginsignbutton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uloginsignbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/NewSignIn.png"))); // NOI18N
        jPanel7.add(uloginsignbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, 40));

        uloginsignbutton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uloginsignbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BluredsignUpbutton.png"))); // NOI18N
        jPanel7.add(uloginsignbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 120, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/form side.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 470, 560));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo side.png"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 470, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_UserLoginCloseActionPerformed

    private void UserLoginSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginSignInActionPerformed
        // TODO add your handling code here:
        
        String User = username.getText();
        String Pass = password.getText();
        
        
                try{
                    con = DriverManager.getConnection("jdbc:mysql://localhost/eurobusbooking", "root", "");
                    //Statement stm =con.createStatement();
                    pst =  con.prepareStatement("select Username and Password from userdetails where Username=? and Password=?");
                    //String sql = "select * from userdetails where Username='"+User+"' Password='"+Pass+"'";
                    //ResultSet rs = pst.executeQuery();
                    
                    //Statement stmt = con.createStatement();
                    //ResultSet rs = stmt.executeQuery("select * from userdetails where Username='"+User+"' and Password='"+Pass+"'");
                    
                    
                    
                    
                    pst.setString(1, User);
                    pst.setString(2, Pass);
                    System.out.println(User);
                    System.out.println(Pass);
                    System.out.println("Here1");
                    rs = pst.executeQuery();
                    System.out.println("Here2");
                    
                    if (rs.next()){
                        System.out.println("here3");
                        
                        UserMenu b = new UserMenu();
                        b.setVisible(true);
                        JOptionPane.showMessageDialog(null, "You have successfully logged in");
                        
                        
                        
                        
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong username & password");
                    
                    }
            }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e);
            
                        dispose();
                        UserMenu a = new UserMenu();
                        a.setVisible(true);
        
        
        }
        
    }//GEN-LAST:event_UserLoginSignInActionPerformed

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
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignInForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignInForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator PasswordSeperator;
    private javax.swing.JLabel ULoginPassword;
    private javax.swing.JLabel ULoginUsername;
    private javax.swing.JButton UserLoginClose;
    private javax.swing.JButton UserLoginSignIn;
    private javax.swing.JLabel UserLoginTitle;
    private javax.swing.JSeparator UsernameSeparator;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField password;
    private javax.swing.JLabel uloginsignbutton1;
    private javax.swing.JLabel uloginsignbutton2;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
