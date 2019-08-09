/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems_djmit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class workshopsrch extends javax.swing.JFrame {

    /**
     * Creates new form expert_letures
     */
    public workshopsrch() throws SQLException, ClassNotFoundException {
        initComponents(); 
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
            Statement ss=con.createStatement();
                        
            String querry="select ID from ws";
                        
            ResultSet rset;
            rset = ss.executeQuery(querry);
            ResultSetMetaData md = rset.getMetaData();
        
            int columns = md.getColumnCount();
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.add(rset.getObject(i));
                }
                
                id.addItem(row);
            }
            
            rset.close();
            ss.close();
            con.close();
        }
        
        
        {
            ResultSet rset;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
            Statement ss=con.createStatement();
            
            String querry="select Title from ws";
            rset = ss.executeQuery(querry);
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.add(rset.getObject(i));
                }
                
                title.addItem(row);        
            }
            
            rset.close();
            ss.close();
            con.close();
        }      
        {
            ResultSet rset;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
            Statement ss=con.createStatement();
            
            String querry="select Faculty_name from ws";
            rset = ss.executeQuery(querry);
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.add(rset.getObject(i));
                }
                
                fname.addItem(row);        
            }
            
            rset.close();
            ss.close();
            con.close();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        search = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox();
        dept = new javax.swing.JComboBox();
        id = new javax.swing.JComboBox();
        title = new javax.swing.JComboBox();
        fname = new javax.swing.JComboBox();
        disp = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Workshop", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel1.setText("Title :");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel2.setText("Experter Name :");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel3.setText("Department :");

        month.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        month.setForeground(new java.awt.Color(102, 0, 51));
        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        month.setName("month"); // NOI18N

        year.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        year.setForeground(new java.awt.Color(102, 0, 51));
        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        year.setName("year"); // NOI18N

        search.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(102, 0, 51));
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel9.setText("ID :");

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jLabel10.setText("Date :");

        day.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        day.setForeground(new java.awt.Color(102, 0, 51));
        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        day.setName("day"); // NOI18N
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        dept.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        dept.setForeground(new java.awt.Color(102, 0, 51));
        dept.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mechanical Engineering", "Civil Engineering", "Computer Science & Engineering", "Electronics & Communication Engineering", "Electical Engineering" }));
        dept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(102, 0, 51));
        id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select ID" }));

        title.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        title.setForeground(new java.awt.Color(102, 0, 51));
        title.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Title", " " }));

        fname.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 0, 51));
        fname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Experter Name" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(search)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        disp.setBackground(new java.awt.Color(44, 44, 58));
        disp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 255), null, null));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_djmit/Go-back-icon.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(disp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String mystr0=id.getSelectedItem().toString();
        String mystr1=title.getSelectedItem().toString();
        String mystr2=fname.getSelectedItem().toString();
        String mystr3=day.getSelectedItem().toString()+"-"+month.getSelectedItem().toString()+"-"+year.getSelectedItem().toString();
        String mystr4=dept.getSelectedItem().toString();
       
        Displayws dp=new Displayws(mystr0,mystr1,mystr2,mystr3,mystr4);
        dp.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_searchActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Home hme=new Home();
        hme.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(workshopsrch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workshopsrch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workshopsrch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workshopsrch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new workshopsrch().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(workshopsrch.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(workshopsrch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox day;
    private javax.swing.JComboBox dept;
    private javax.swing.JLabel disp;
    private javax.swing.JComboBox fname;
    private javax.swing.JComboBox id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox month;
    public javax.swing.JButton search;
    private javax.swing.JComboBox title;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
