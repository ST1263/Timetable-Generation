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
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class dis extends javax.swing.JFrame {

    /**
     * Creates new form dis
     */
    Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement Connectionst=null;
    TableModel dataModel = null;
    public dis() {
        initComponents();
    }
public void tableall() {
    try{
        String sql="select time,year1,shift,mon,tue,wed,thu,fri,sat from t05.fy1 ORDER BY time ASC,year1 ASC,shift ASC";
     /*String sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00'"
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00'"
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00'"
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00'"
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00'"
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00' " +
      "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00' " +
     "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00'" +
          "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00'";
/*            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            " UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15'"+
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00'"+
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
           "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15'";
// sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00'";
             //  sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00'";
    
//String sql="select * from t05.fy1";
  */  
        pre=con.prepareStatement(sql);
        rs=pre.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/download.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, 130));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PES ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 70));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("MODERN COLLEGE OF ENGINEERING");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("SHIVAJI NAGER PUNE-05");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("DEPARTMENT OF MCA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 580, 230));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("MASTER TIMETABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 10, 120, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
           // java.lang.Class.forName("oracle.jdbc.driver.OracleDriver");
           
  
           
         con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
         String sql="select time,year1,shift,mon,tue,wed,thu,fri,sat from t05.fy1 ORDER BY time ASC, year1 ASC,shift ASC";
    /*     String sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00' "
            + "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00' " +
      "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00' " +
     "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00-11:00'" +
          "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00-11:00'";
           " UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            " UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%12:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%12:15'"+
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%04:00' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%04:00'"+
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
           "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%05:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15' " +
            "UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%06:15'";   
         
 // String sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%11:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%TY' AND shift LIKE '%SHIFT-2' AND time LIKE '%10:00'";            
//String sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00' UNION select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%11:00'";                        
//  String sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-1' AND time LIKE '%09:00-10:00'";
              // sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%FY' AND shift LIKE '%SHIFT-2' AND time LIKE '%09:00-10:00'";
              // sql="select year1,shift,time,mon,tue,wed,thu,fri,sat from t05.fy1 where year1 LIKE '%SY' AND shift LIKE '%SHIFT-1' AND time LIKE '%10:00'";
              
// String sql="select * from t05.fy1";*/
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
           //   tableall();
         
            tableall();
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
