/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package EuropeBusBookingV2;


import java.sql.*;
import java.awt.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ishan
 */
public class AdminMenu extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu() {
        initComponents();
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
        ResetButton = new javax.swing.JButton();
        CapacityAdd = new javax.swing.JTextField();
        AddBusTitle = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PriceAdd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TimeAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DayAdd = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        DesCityAdd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DesCountryAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DepCityAdd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DepCountryAdd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        ShowData = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 6, 78));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResetButton.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 90, 40));

        CapacityAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CapacityAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(CapacityAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 180, 30));

        AddBusTitle.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 36)); // NOI18N
        AddBusTitle.setForeground(new java.awt.Color(223, 240, 247));
        AddBusTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddBusTitle.setText("ADD BUS");
        jPanel1.add(AddBusTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 50));

        jLabel8.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(223, 240, 247));
        jLabel8.setText("Capacity");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 120, 30));

        PriceAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PriceAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(PriceAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 180, 30));

        jLabel7.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(223, 240, 247));
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 120, 30));

        TimeAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TimeAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(TimeAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 180, 30));

        jLabel6.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(223, 240, 247));
        jLabel6.setText("Time");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 120, 30));

        DayAdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" }));
        DayAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayAddActionPerformed(evt);
            }
        });
        jPanel1.add(DayAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, 30));

        jLabel5.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(223, 240, 247));
        jLabel5.setText("Day of the week");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 120, 30));

        DesCityAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DesCityAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(DesCityAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, 30));

        jLabel4.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(223, 240, 247));
        jLabel4.setText("Destination City");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 30));

        DesCountryAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DesCountryAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(DesCountryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 180, 30));

        jLabel3.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(223, 240, 247));
        jLabel3.setText("Destination Country");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 30));

        DepCityAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DepCityAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(DepCityAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, 30));

        jLabel2.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(223, 240, 247));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Departure City");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 30));

        DepCountryAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DepCountryAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(DepCountryAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 30));

        jLabel1.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(223, 240, 247));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Departure Country");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BusNo", "DepCountry", "DepCity", "DestCountry", "DestCity", "Day", "Time", "Price", "Capacity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 730, 540));

        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 110, 40));

        ShowData.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        ShowData.setText("SHOW DATA");
        ShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataActionPerformed(evt);
            }
        });
        jPanel1.add(ShowData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1007, 45, 120, 40));

        RemoveButton.setFont(new java.awt.Font("Gilroy Light", 0, 14)); // NOI18N
        RemoveButton.setText("REMOVE");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RemoveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void DayAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DayAddActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            String query = "INSERT INTO `busregister`(`DepartureCountry`, `DepartureCity`, `DestinationCountry`, `DestinationCity`, `Day`, `Time`, `Price`, `Capacity`) VALUES (?,?,?,?,?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/eurobusbooking", "root", "");
            pst =  con.prepareStatement(query);
            pst.setString(1, DepCountryAdd.getText());
            pst.setString(2, DepCityAdd.getText());
            pst.setString(3, DesCountryAdd.getText());
            pst.setString(4, DesCityAdd.getText());
            pst.setString(5, DayAdd.getSelectedItem().toString());
            pst.setString(6, TimeAdd.getText());
            pst.setString(7, PriceAdd.getText());
            pst.setString(8, CapacityAdd.getText());
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "NEW BUS ADDED");
            
        
        
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null, ex);
        
        
        }
        
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataActionPerformed
        try {
            // TODO add your handling code here:
            
            String sql = "select * from busregister";
            con = DriverManager.getConnection("jdbc:mysql://localhost/eurobusbooking", "root", "");
            pst = con.prepareStatement(sql);
            
            ResultSet rs = pst.executeQuery(sql);
            System.out.println("here1");
            
            while(rs.next()){
                
                String BusNo = String.valueOf(rs.getInt("BusNo"));
                String DepartureCountry = rs.getString("DepartureCountry");
                String DepartureCity = rs.getString("DepartureCity");
                String DestinationCountry = rs.getString("DestinationCountry");
                String DestinationCity = rs.getString("DestinationCity");
                String Day = rs.getString("Day");
                String Time = rs.getString("Time");
                String Price = rs.getString("Price");
                String Capacity = String.valueOf(rs.getInt("Capacity"));
                
                String tbData[] = {BusNo,DepartureCountry,DepartureCity,DestinationCountry,DestinationCity,Day,Time,Price,Capacity};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                
                tblModel.addRow(tbData);
            
            
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ShowDataActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        try {
            // TODO add your handling code here:
            
            //int[] rows = jTable1.getSelectedRows();
            //DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

            //while(rows.length>0)
            //{
               // ((DefaultTableModel)tblModel).removeRow(jTable1.convertRowIndexToModel(rows[0]));
                
               // rows = jTable1.getSelectedRows();
            //}
            
            

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int row = jTable1.getSelectedRow();
            String eve = (String) jTable1.getModel().getValueAt(row, 0);
            String sql = "delete from busregister where BusNo= ?";
            con = DriverManager.getConnection("jdbc:mysql://localhost/eurobusbooking", "root", "");
            pst = con.prepareStatement(sql);
            pst.setString( 1, eve );
            pst.execute();
            JOptionPane.showMessageDialog(null, "ROW HAS REMOVED. RESET AND PRESS SHOW DATA TO UPDATE");
            
            
                
                //rows = jTable1.getSelectedRows();
            jTable1.clearSelection();
            
            
        
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(AdminMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
                
            
}
        
    

    {
    }//GEN-LAST:event_RemoveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddBusTitle;
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField CapacityAdd;
    private javax.swing.JComboBox<String> DayAdd;
    private javax.swing.JTextField DepCityAdd;
    private javax.swing.JTextField DepCountryAdd;
    private javax.swing.JTextField DesCityAdd;
    private javax.swing.JTextField DesCountryAdd;
    private javax.swing.JTextField PriceAdd;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton ShowData;
    private javax.swing.JTextField TimeAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
