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
public class lab extends javax.swing.JFrame {

    /**
     * Creates new form lab
     */
     Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement st=null;
    TableModel dataModel = null;
    public lab() {
        initComponents();
        tableall();
    }
 public void tableall(){
   // String sql="select time,mon,tue,wed,thu,fri,sat from ge.r where shift='"+tc2.getSelectedItem()+"' AND year1='"+tc3.getSelectedItem()+"' AND mon='"+ttt.getText()+"'";
//String sql ="select * from t05.fy1 where mon LIKE '%LAB' AND tue LIKE '%LAB' AND wed LIKE '%LAB' AND thu LIKE '%LAB' AND fri LIKE '%LAB' AND sat LIKE '%LAB'";    
String sql ="select time,year1,shift,mon,tue,wed,thu,fri,sat from t05.fy1 where mon LIKE '%LAB' AND sat LIKE '%LAB' ORDER BY time ASC";
        //+ "UNION select * from t05.fy1 where ORDER BY time ASC";
   try{
        pre=con.prepareStatement(sql);
        rs=pre.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
       // sql="select time,mon,tue,wed,thu,fri,sat from ge.r where shift='"+tc2.getSelectedItem()+"' AND year1='"+tc3.getSelectedItem()+"'";
             //   pre=con.prepareStatement(sql);
        //rs=pre.executeQuery();
        //table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
           } 
    
 }
/*public void all(){
        try{
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
             // String sql="select time,mon,tue,wed,thu,fri,sat from ge.r where shift='"+tc2.getSelectedItem()+"' AND year1='"+tc3.getSelectedItem()+"' AND mon='"+ttt.getText()+"'"; 
             //String sql ="select mon from ge.r where mon LIKE '%lab'"; 
             String sql ="select time,year1,shift,mon,tue,wed,thu,fri,sat from t05.fy1 where mon LIKE '%LAB' AND tue LIKE '%LAB' AND wed LIKE '%LAB' AND thu LIKE '%LAB' AND fri LIKE '%LAB' AND sat LIKE '%LAB'"; 
             pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
            
            
            
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
    }*/
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 100, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 700, 230));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 710, 430));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("LAB TIMETABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 10, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
             // String sql="select time,mon,tue,wed,thu,fri,sat from ge.r where shift = '"+tc2.getSelectedItem()+"' AND year1 = '"+tc3.getSelectedItem()+"' AND time='"+tt.getSelectedItem()+"' AND time='"+tt.getSelectedItem()+"'";
             String sql ="select time,year1,shift,mon,tue,wed,thu,fri,sat from t05.fy1 where mon LIKE '%LAB' AND sat LIKE '%LAB' ORDER BY time ASC";
                     //+ "UNION select * from t05.fy1 where ORDER BY time ASC";
             //AND tue LIKE '%LAB' AND wed LIKE '%LAB' AND thu LIKE '%LAB' AND fri LIKE '%LAB' AND sat LIKE '%LAB'";
             pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
         tableall();   
         //tableall1();
            
            
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
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
