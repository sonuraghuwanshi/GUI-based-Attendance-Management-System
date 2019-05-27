package Codes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ViewAttendance extends javax.swing.JFrame 
{
    Connection connection=null;
    ResultSet rs=null;
    public ViewAttendance() 
    {
        initComponents();
        setLocationRelativeTo(null);
        connection=sqliteConnection.dbconnector();
        fetch();
    }
    
    
    
     public void fetch()
    {
        try
        {
            PreparedStatement pst = null;
            String query ="update fifthsem set attendet=os+dbms+cgmm+cyber+dc";
            pst = connection.prepareStatement(query);
            pst.executeUpdate();
            
            String que ="update fifthsem set total=ostotal+dbmstotal+cgmmtotal+cybertotal+dctotal";
            pst = connection.prepareStatement(que);
            pst.executeUpdate();
            
            String qu="update fifthsem set percentage=attendet*100/total";
            pst = connection.prepareStatement(qu);
            pst.executeUpdate();
            
            String q ="select name,roll,dbms,dbmstotal,os,ostotal,cgmm,cgmmtotal,dc,dctotal,cyber,cybertotal,percentage from fifthsem";
            //pst = connection.prepareStatement(q);
            pst=connection.prepareStatement(q);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonBackView = new javax.swing.JButton();
        jButtonLogoutView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Manager");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButtonBackView.setBackground(new java.awt.Color(0, 0, 0));
        jButtonBackView.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jButtonBackView.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBackView.setText("Back");
        jButtonBackView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackViewActionPerformed(evt);
            }
        });

        jButtonLogoutView.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogoutView.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        jButtonLogoutView.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogoutView.setText("Logout");
        jButtonLogoutView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutViewActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBackView, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 749, Short.MAX_VALUE)
                        .addComponent(jButtonLogoutView)
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLogoutView, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonBackView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackViewActionPerformed
        
        this.setVisible(false);
        AfterLogin aftlgn=new AfterLogin();
        aftlgn.setVisible(true);
    }//GEN-LAST:event_jButtonBackViewActionPerformed

    private void jButtonLogoutViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutViewActionPerformed
        
        this.setVisible(false);
        Login lgn=new Login();
        lgn.setVisible(true);
    }//GEN-LAST:event_jButtonLogoutViewActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackView;
    private javax.swing.JButton jButtonLogoutView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
