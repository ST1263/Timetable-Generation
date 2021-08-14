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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class subject extends javax.swing.JInternalFrame {

    /**
     * Creates new form subject
     */
    Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement st=null;
    private String theoryid;
    private String subject;
    private String subjectworkload;
    String a="";
    int b = 0;
    TableModel dataModel = null;
    
    public void tableall(){
    String sql="select * from t05.subinfo";
    try{
        pre=con.prepareStatement(sql);
        rs=pre.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
           }
    }
    public void inc(){
        try {
            
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
         
            st=con.createStatement();  
             rs = st.executeQuery("select * from t05.subinfo");
            while(rs.next())
            {
                a=rs.getString(1);
                 
            }
            if(a=="")
            {
                a="T0";
            }
            a=a.substring(1);
       
            b=Integer.parseInt(a);
            b++;
            a=String.valueOf(b);
            a="T".concat(a);
            
            tsub1.setText(a); 
        } catch (SQLException ex) {
            Logger.getLogger(subject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public subject() {
        initComponents();
        inc();
        tableall();
        all();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tsub1 = new javax.swing.JTextField();
        tsub3 = new javax.swing.JTextField();
        tsub4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Subject");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SUBJECT INFORMATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 11, 178, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("THEORY ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 67, 74, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("SUBJECT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 102, 70, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SUBJECT WORKLOAD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 131, -1, 25));
        getContentPane().add(tsub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 59, 89, 30));
        getContentPane().add(tsub3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 92, 89, 30));
        getContentPane().add(tsub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 123, 89, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, 85, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "theory_id", "subject", "subject_workload"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 38, 427, 283));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 198, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 198, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
           
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
            String sql="insert into t05.subinfo(theoryid,theorysubject,subjectworkload) values('"+tsub1.getText()+"','"+tsub3.getText()+"','"+tsub4.getText()+"')";
            pre = con.prepareStatement(sql);
      
          pre.executeUpdate();
          JOptionPane.showMessageDialog(null, "inserted");
        
           inc();
           tableall();
            
     
        }
        catch(SQLException  e){
           e.printStackTrace();
            
            
            
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        
         try{
             int row = table.getSelectedRow();
             String t = (table.getModel().getValueAt(row, 0).toString());
             String sql="select * from t05.subinfo where theoryid='"+t+"' ";
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
              if(rs.next())
              {
                  String a1 = rs.getString("theoryid");
                  tsub1.setText(a1);
                  String a2 = rs.getString("theorysubject");
                  tsub3.setText(a2);
                  String a3 = rs.getString("subjectworkload");
                  tsub4.setText(a3);
             
              }
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         try{
         
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
            String sql="update  t05.subinfo  set theorysubject='"+tsub3.getText()+"',subjectworkload='"+tsub4.getText()+"' where theoryid='"+tsub1.getText()+"'";
            pre = con.prepareStatement(sql);
        
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "updated");
              tableall();
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try{
           
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
            String sql="delete from  t05.subinfo where theoryid='"+tsub1.getText()+"'";
            pre = con.prepareStatement(sql);
       
            pre.executeUpdate();
            JOptionPane.showMessageDialog(null, "deleted");
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
            
            
            
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
public void all(){
        try{
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
              String sql="select * from t05.subinfo";
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
           
            
            
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tsub1;
    private javax.swing.JTextField tsub3;
    private javax.swing.JTextField tsub4;
    // End of variables declaration//GEN-END:variables
}