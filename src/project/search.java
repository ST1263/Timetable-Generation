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
public class search extends javax.swing.JInternalFrame {

    /**
     * Creates new form search
     */
    Connection con =null;
    PreparedStatement pre = null;
    ResultSet rs = null;
    Statement st=null;
    TableModel dataModel = null;
    
    public search() {
        initComponents();
        tableall();
     //   all();
        selcombo();
    }
       public void tableall(){
    String sql="select * from t05.workinfo where teachername ='"+ts1.getSelectedItem()+"'";
    try{
        pre=con.prepareStatement(sql);
        rs=pre.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e){
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
        jButton1 = new javax.swing.JButton();
        ts1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Search");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("TEACHER NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 97, 25));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        ts1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-SELECT-", " " }));
        getContentPane().add(ts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 110, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 210));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SEARCH DETAILS");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
//            java.lang.Class.forName("oracle.jdbc.driver.OracleDriver");
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
              String sql="select * from t05.workinfo where teachername='"+ts1.getSelectedItem()+"'";
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
           tableall();
          
            
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
/*public void all(){
        try{
              con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
              String sql="select * from t05.workinfo";
              pre = con .prepareStatement(sql);
              rs = pre.executeQuery();
            
            
        }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
    }*/
public void selcombo(){
    try{
                  con = DriverManager.getConnection("jdbc:derby://localhost:1527/timetable05", "t05", "t05");
        String sql="select teachername from t05.finfo";
        pre = con.prepareStatement(sql);
        rs = pre.executeQuery();
        while(rs.next())
        {
            
            ts1.addItem(rs.getString("teachername"));
        }
    }
        catch(SQLException  e){
            JOptionPane.showMessageDialog(null, e);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> ts1;
    // End of variables declaration//GEN-END:variables
}