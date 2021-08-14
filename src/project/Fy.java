/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Fy extends javax.swing.JFrame {

    /**
     * Creates new form Fy
     */
    Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement st=null;
    public Fy() {
        initComponents();
        
        selcombo1();
        s();
        s2();
        s3();
        s4();
        s5();
                
    }
public void selcombo1(){
    try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t2.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t2.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s(){
     try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t3.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t3.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s2(){
     try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t4.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t4.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s3(){
     try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t5.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t5.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s4(){
     try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t6.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t6.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void s5(){
     try{
          con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select theorysubject from t05.subinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
      //  int i = 0;
     //   t2.removeAllItems();
        while(rs.next())
        {
            t7.addItem(rs.getString("theorysubject"));
    //        i++;
        }
         sql="select pracicalsubject from t05.pinfo"; 
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();              
        while(rs.next())
        {
            t7.addItem(rs.getString("pracicalsubject"));
  //          i++;
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t7 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JComboBox<>();
        t3 = new javax.swing.JComboBox<>();
        t4 = new javax.swing.JComboBox<>();
        t5 = new javax.swing.JComboBox<>();
        t6 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        t1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        t8 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tc3 = new javax.swing.JComboBox<>();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("TIMETABLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 130, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("FRIDAY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("SATURDAY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("WEDNESDAY");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("TUESDAY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("THURSDAY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("MONDAY");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));

        t7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "-" }));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 90, 30));

        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "-" }));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 90, 30));

        t3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "-" }));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, 30));

        t4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "RECESS" }));
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 90, 30));

        t5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "-" }));
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 90, 30));

        t6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "-" }));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 90, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("GENERATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("TIME");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, 30));

        t1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "09:00-10:00", "10:00-11:00", "11:00-11:15", "11:15-12:15", "12:15-1:15", "1:15-2:00", "2:00-3:00", "3:00-4:00", "4:00-4:15", "4:15-5:15", "5:15-6:15" }));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 100, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("SHIFT");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 60, 30));

        t8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "SHIFT-1", "SHIFT-2" }));
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        getContentPane().add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 570, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("YEAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 30));

        tc3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", "FY", "SY", "TY" }));
        tc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc3ActionPerformed(evt);
            }
        });
        getContentPane().add(tc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
           
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
            String sql="insert into t05.fy1(time,mon,tue,wed,thu,fri,sat,year1,shift) values('"+t1.getSelectedItem()+"','"+t2.getSelectedItem()+"','"+t3.getSelectedItem()+"','"+t4.getSelectedItem()+"','"+t5.getSelectedItem()+"','"+t6.getSelectedItem()+"','"+t7.getSelectedItem()+"','"+tc3.getSelectedItem()+"','"+t8.getSelectedItem()+"')";
      
            pre = con.prepareStatement(sql);
       
          pre.executeUpdate();
          JOptionPane.showMessageDialog(null, "inserted");
         
          /// inc();
           //tableall();
            
        
        }
        catch(SQLException  e){
           //e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);

            
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tc3ActionPerformed


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
            java.util.logging.Logger.getLogger(Fy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JComboBox<String> t3;
    private javax.swing.JComboBox<String> t4;
    private javax.swing.JComboBox<String> t5;
    private javax.swing.JComboBox<String> t6;
    private javax.swing.JComboBox<String> t7;
    private javax.swing.JComboBox<String> t8;
    private javax.swing.JComboBox<String> tc3;
    // End of variables declaration//GEN-END:variables
}
