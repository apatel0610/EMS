

package ems_djmit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Displaypg extends JDialog {

static String t1;
static String t2;
static String t3;
static String t4;
//static String t5;
//static String t6;
//static String t7;
//static String t8;
//static String t9;
//static String t10;
//static String t11;

private JTable table;

//-----------------------------------------------ROWS---------------------------
public static Vector rows() {

    Vector data = new Vector();
    
    ResultSet rset;
    if(!(t1.equals("Select ID")))
    {
        try {   
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //String querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where ID= '"+t1+"' ";
                rset = ss.executeQuery(querry);
                              
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rset.getObject(i));
                }

                data.addElement(row);

            }

            rset.close();
            ss.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    else if(!(t2.equals("Select Program")))
    {
        try {   
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //String querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where Title = '"+t2+"' ";
                rset = ss.executeQuery(querry);
                              
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rset.getObject(i));
                }

                data.addElement(row);

            }

            rset.close();
            ss.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    else if(!(t3.equals("Select Type")))
    {
        try {   
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //String querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where Type_of_program= '"+t3+"' ";
                rset = ss.executeQuery(querry);
                              
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rset.getObject(i));
                }
                data.addElement(row);

            }

            rset.close();
            ss.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }   
    }
    /*else if(!(t5.equals("")))
    {
        try {   
            
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con=DriverManager.getConnection("jdbc:odbc:clg");
		Statement ss=con.createStatement();
                //String querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from researchpaper where issn_no = '"+t5+"' ";
                rset = ss.executeQuery(querry);
                              
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rset.getObject(i));
                }

                data.addElement(row);

            }

            rset.close();
            ss.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } 
    }*/
    
    else if(!(t4.equals("Day-Month-Year")))
    {
        try {   
            
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //String querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg Start_date = '"+t4+"' ";
                rset = ss.executeQuery(querry);
                              
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();
            
            while (rset.next()) {
                Vector row = new Vector(columns);

                for (int i = 1; i <= columns; i++) {
                    row.addElement(rset.getObject(i));
                }

                data.addElement(row);

            }

            rset.close();
            ss.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
    return data;
}

//-----------------------------------------COLUMN-------------------------------
   public static Vector columns()
    {   
        
        Vector cols = new Vector ();
        ResultSet rset;
        if(!(t1.equals("Select ID")))
        {
        try { 
                   
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //tring querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where ID = '"+t1+"' ";
                rset = ss.executeQuery(querry);
   
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
            cols.addElement(md.getColumnName(i));
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        }
       else if (!(t2.equals("Select Program")))
        {
        try { 
                   
               Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //tring querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where Title = '"+t2+"' ";
                rset = ss.executeQuery(querry);
   
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
            cols.addElement(md.getColumnName(i));
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        }
       else if(!(t3.equals("Select Type")))
        {
        try { 
                   
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //tring querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where Type_of_program = '"+t3+"' ";
                rset = ss.executeQuery(querry);
   
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
            cols.addElement(md.getColumnName(i));
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        }
     /*  else if(!(t5.equals("")))
        {
        try { 
                   
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con=DriverManager.getConnection("jdbc:odbc:clg");
		Statement ss=con.createStatement();
                //tring querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from researchpaper where issn_no = '"+t5+"' ";
                rset = ss.executeQuery(querry);
   
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
            cols.addElement(md.getColumnName(i));
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        }
       */
        else if (!(t4.equals("Day-Month-Year")))
        {
        try { 
                   
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clg","root","admin");
		Statement ss=con.createStatement();
                //tring querry="insert into researchpaper(title,author_one,author_two,author_three,type_of_event,proceding,month_year_published,issn_no,impact_factor)values("+"\'"+s1+"\'"+","+"\'"+s2+"\'"+","+"\'"+s3+"\'"+","+"\'"+s4+"\'"+","+"\'"+s5+"\'"+","+"\'"+s6+"\'"+","+"\'"+s7+"\'"+","+"\'"+s8+"\'"+","+"\'"+s9+"\'"+")";
                
                String querry="select * from pg where Start_date = '"+t4+"' ";
                rset = ss.executeQuery(querry);
   
            ResultSetMetaData md = rset.getMetaData();
            int columns = md.getColumnCount();

            for (int i = 1; i <= columns; i++) {
            cols.addElement(md.getColumnName(i));
            }
           } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        }
        return cols;
    }

public static void main(String args[]) {
    try {
        
        Displaypg dialog = new Displaypg(null,null,null,null);
        dialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        dialog.setVisible(true);
    } catch (Exception e) {
        e.printStackTrace();
    }
}


  Displaypg(String a,String b,String c,String d) {
    super();
   
   t1=a;//title
   t2=b;//author
   t3=c;//month-year
   t4=d;//toe
 //  t5=e;//ISSN No
  
    getContentPane().setLayout(null);
    setTitle("Data Manipulation");
    setBounds(150, 50, 1100, 600);
    setResizable(false);

//    JLabel TableLabel = new JLabel();
//    TableLabel.setText("List Of Data...");
//    TableLabel.setBounds(10, 34, 274, 16);
//    getContentPane().add(TableLabel);

    
    final JButton btn1 = new JButton();
    btn1.addActionListener(new ActionListener() {
        public void actionPerformed(final ActionEvent arg0) {
            try {
                Programsrch p=new Programsrch();
                p.setVisible(true);
                setVisible(false);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Displaypg.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Displaypg.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    });
  
    //btn1.setText("Back");
    btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_djmit/Go-back-icon.png")));
    btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btn1.setBounds(10, 10, 35, 35);
    getContentPane().add(btn1);
//final JLabel label = new JLabel();
//  
//    label.setBounds(402, 18, 49, 48);
//    getContentPane().add(label);
//    
    final JButton okButton = new JButton();
    okButton.addActionListener(new ActionListener() {
        public void actionPerformed(final ActionEvent arg0) {
            dispose();
            setVisible(false);
        }


    });
  
    okButton.setText("Ok");
    okButton.setBounds(10, 500, 148, 32);
    getContentPane().add(okButton);
    dispose();
   
    final JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(10, 85, 1050, 400);
    getContentPane().add(scrollPane);

    table = new JTable(rows(), columns()); 
    scrollPane.setViewportView(table);

    final JButton printButton_1_1 = new JButton();
    printButton_1_1.addActionListener(new ActionListener() {
        public void actionPerformed(final ActionEvent arg0) {
            try {
                table.print();
            } catch (PrinterException e) {

                e.printStackTrace();
            }
        }
    });
    

    printButton_1_1.setText("Print");
    printButton_1_1.setBounds(910, 500, 148, 32);
    getContentPane().add(printButton_1_1);
    }

    Displaypg(String mystr1, String mystr2, String mystr3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}