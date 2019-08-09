/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ems_djmit;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sony
 */
public class Home extends javax.swing.JFrame {
   int c;
    /**
     * Creates new form Home
     */
    public Home() {
        
        initComponents(); 
        
    }
    public Home(int a)
    {
      initComponents();
      c=a;
      if(a==1)
      {
        
      login.setText("Log out");
      register.setVisible(false);
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

        hpanel = new javax.swing.JPanel();
        event = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        workshop = new javax.swing.JButton();
        seminar = new javax.swing.JButton();
        register = new javax.swing.JButton();
        program = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(0, 153, 153));
        setBounds(new java.awt.Rectangle(520, 150, 0, 0));
        setIconImages(null);
        setName("hframe"); // NOI18N

        hpanel.setBackground(new java.awt.Color(51, 204, 255));
        hpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Event Lab 0f DJMIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 1, 14), new java.awt.Color(102, 0, 102))); // NOI18N
        hpanel.setForeground(new java.awt.Color(102, 0, 102));
        hpanel.setToolTipText("Home");
        hpanel.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        hpanel.setName("Home"); // NOI18N

        event.setBackground(new java.awt.Color(255, 255, 153));
        event.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        event.setForeground(new java.awt.Color(102, 0, 0));
        event.setText("Event");
        event.setBorder(new javax.swing.border.MatteBorder(null));
        event.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText(" Please select the required option :-");

        workshop.setBackground(new java.awt.Color(255, 255, 153));
        workshop.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        workshop.setForeground(new java.awt.Color(102, 0, 51));
        workshop.setText("Workshop");
        workshop.setBorder(new javax.swing.border.MatteBorder(null));
        workshop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        workshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workshopActionPerformed(evt);
            }
        });

        seminar.setBackground(new java.awt.Color(255, 255, 153));
        seminar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        seminar.setForeground(new java.awt.Color(102, 0, 51));
        seminar.setText("Expert Lecture");
        seminar.setBorder(new javax.swing.border.MatteBorder(null));
        seminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seminarActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(255, 255, 153));
        register.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        register.setForeground(new java.awt.Color(102, 0, 51));
        register.setText("Register");
        register.setBorder(new javax.swing.border.MatteBorder(null));
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        program.setBackground(new java.awt.Color(255, 255, 153));
        program.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        program.setForeground(new java.awt.Color(102, 0, 51));
        program.setText("Program");
        program.setBorder(new javax.swing.border.MatteBorder(null));
        program.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(204, 255, 153));
        login.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Log In");
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("About us");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hpanelLayout = new javax.swing.GroupLayout(hpanel);
        hpanel.setLayout(hpanelLayout);
        hpanelLayout.setHorizontalGroup(
            hpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hpanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(hpanelLayout.createSequentialGroup()
                .addGroup(hpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hpanelLayout.createSequentialGroup()
                        .addGroup(hpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(hpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(workshop, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hpanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(hpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seminar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hpanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        hpanelLayout.setVerticalGroup(
            hpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hpanelLayout.createSequentialGroup()
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(event, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(workshop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(seminar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        hpanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventActionPerformed
            if(c==1)
            {
                event_data ed=new event_data();
                ed.setVisible(true);
                this.setVisible(false);
                ed.setTitle("Event Data");
            }
            else
            {
                try {
                    evntsrch ed=new evntsrch();
                    ed.setVisible(true); 
                    this.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            }
    }//GEN-LAST:event_eventActionPerformed

    private void workshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workshopActionPerformed
      if(c==1)
            {
                workshop ws=new workshop();
                ws.setVisible(true);
                this.setVisible(false);
                ws.setTitle("Workshop");
            }
            else
            {
                try {
           workshopsrch ws=new workshopsrch();
           ws.setVisible(true);
           setVisible(false);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }
            }
    }//GEN-LAST:event_workshopActionPerformed

    private void seminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seminarActionPerformed
       if(c==1)
            {
                Expert_lecture el=new Expert_lecture();
               el.setVisible(true);
                this.setVisible(false);
                el.setTitle("Expert Lecture");
            }
            else
            {
                try {
           Expert_lectures s=new Expert_lectures();
           s.setVisible(true);
           this.setVisible(false);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }
            }
       
    }//GEN-LAST:event_seminarActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       try {
           Register rg=new Register();
           rg.setVisible(true);
           this.setVisible(false);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_registerActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        about a1=new about(c);
        a1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        if(c==1)
            {
                Program pg=new Program();
                pg.setVisible(true);
                this.setVisible(false);
            }
            else
            {
                try {
                    Programsrch ed=new Programsrch();
                    ed.setVisible(true); 
                    this.setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
           
            }
        
    }//GEN-LAST:event_programActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        
        if(login.getText()=="Log out")
        {
            Home hm=new Home();
            hm.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            login l1=new login();
            l1.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton event;
    private javax.swing.JPanel hpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JButton program;
    private javax.swing.JButton register;
    private javax.swing.JButton seminar;
    private javax.swing.JButton workshop;
    // End of variables declaration//GEN-END:variables
}