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
public class generate extends javax.swing.JInternalFrame {

    /**
     * Creates new form generate
     */
    Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement st=null;
     TableModel dataModel = null;
     private String classid;
    private String acadamicyear;
    private String shift;
    private int roomno;
    private String theachername;
     private String theorysubject;
    private String practicalsubject;
    private String time;
    private String labname;
    private String days;
    private String reccesstime;
    public generate() {
        initComponents();
        all();
        tableall();
         sel();
         sel2();
         sel3();
         sel4();
         sel5();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        g4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        g6 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        g7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        g8 = new javax.swing.JComboBox<>();
        g5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        g9 = new javax.swing.JComboBox<>();
        g10 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        g11 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        g1 = new javax.swing.JComboBox<>();
        g2 = new javax.swing.JComboBox<>();
        g14 = new javax.swing.JComboBox<>();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("GENERATE TIMETABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 224, 39));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("CLASS ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 64, 83, 21));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("ACADAMIC YEAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 21));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("SHIFT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 83, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("ROOM NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 25));

        g4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", " " }));
        getContentPane().add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("TEACHER NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("THEORY SUBJECT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 93, 21));

        g6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--" }));
        getContentPane().add(g6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("PRACTICAL SUBJECT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, 21));

        g7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--" }));
        getContentPane().add(g7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("TIME");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 53, -1));

        g8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "9:00 -10:00", "10:00 -11:00", "11:00 -11:15", "11:15 -12:15", "12:15 -1:15", "1:15 -2:00", "2:00 -3:00", "3:00 -4:00", "4:00 -4:15", "4:15-5:15", "5:15-6:15" }));
        getContentPane().add(g8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, 30));

        g5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--" }));
        getContentPane().add(g5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 110, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("GENERATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, 34));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("DAYS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 70, 26));

        g9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "GL", "TL", "RL", "SL" }));
        g9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g9ActionPerformed(evt);
            }
        });
        getContentPane().add(g9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, 40));

        g10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "MON", "TUE", "WED", "THU", "FRI", "SAT", " " }));
        getContentPane().add(g10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("RECESS TIME");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, 26));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("LAB NAME");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 60, 30));

        g11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "11:00 - 11:15", "1:15 - 2:00", "4:00 - 4:15", " " }));
        getContentPane().add(g11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, 240));

        g1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--" }));
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 54, 90, 30));

        g2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "FY", "SY", "TY" }));
        getContentPane().add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 30));

        g14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        g14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECT--", "SHIFT-I", "SHIFT-II" }));
        getContentPane().add(g14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         try{
           
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
            String sql="insert into t05.generate(classid,acadamicyear,shift,roomno,teachername,theorysubject,practicalsubject,time,labname,days,reccesstime) values('"+g1.getSelectedItem()+"','"+g2.getSelectedItem()+"','"+g14.getSelectedItem()+"','"+g4.getSelectedItem()+"','"+g5.getSelectedItem()+"','"+g6.getSelectedItem()+"','"+g7.getSelectedItem()+"','"+g8.getSelectedItem()+"','"+g9.getSelectedItem()+"','"+g10.getSelectedItem()+"','"+g11.getSelectedItem()+"')";
      
            pre = con.prepareStatement(sql);
       
          pre.executeUpdate();
          JOptionPane.showMessageDialog(null, "inserted");
         
          
           tableall();
            
        
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_jButton1ActionPerformed
public void tableall(){
    String sql="select * from t05.generate";
    try{
        pre=con.prepareStatement(sql);
        rs=pre.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
           }
    }

public void sel(){
    try{
        String sql="select id from t05.classinfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            g1.addItem(rs.getString("id"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void sel3(){
    try{
        String sql="select teachername from t05.finfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            g5.addItem(rs.getString("teachername"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void sel4(){
    try{
        String sql="select theorysubject from t05.subinfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            g6.addItem(rs.getString("theorysubject"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void sel5(){
    try{
        String sql="select pracicalsubject from t05.pinfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            g7.addItem(rs.getString("pracicalsubject"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
public void sel2(){
    try{
        String sql="select roomno from t05.classinfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            g4.addItem(rs.getString("roomno"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}
    public void all(){
        try{
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
              String sql="select * from t05.generate";
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
            
            
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void g9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> g1;
    private javax.swing.JComboBox<String> g10;
    private javax.swing.JComboBox<String> g11;
    private javax.swing.JComboBox<String> g14;
    private javax.swing.JComboBox<String> g2;
    private javax.swing.JComboBox<String> g4;
    private javax.swing.JComboBox<String> g5;
    private javax.swing.JComboBox<String> g6;
    private javax.swing.JComboBox<String> g7;
    private javax.swing.JComboBox<String> g8;
    private javax.swing.JComboBox<String> g9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}