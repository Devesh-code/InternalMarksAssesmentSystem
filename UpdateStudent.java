/* Decompiler 135ms, total 574ms, lines 428 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class UpdateStudent extends JFrame {
   private JButton bback;
   private JButton bsearch;
   private JButton bupdate;
   private JLabel jLabel1;
   private JLabel jLabel10;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JLabel jLabel9;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JScrollPane jScrollPane1;
   private JTable jTable1;
   private JTextField set1;
   private JTextField set2;
   private JTextField set3;
   private JTextField tassign;
   private JTextField tattd;
   private JTextField tfirst;
   private JTextField tname;
   private JTextField troll;
   private JTextField tsecond;
   private JTextField tsub;
   Connection con;
   PreparedStatement ps;

   public UpdateStudent() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jLabel10 = new JLabel();
      this.jScrollPane1 = new JScrollPane();
      this.jTable1 = new JTable();
      this.jLabel2 = new JLabel();
      this.tsub = new JTextField();
      this.bsearch = new JButton();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      this.jLabel8 = new JLabel();
      this.jLabel9 = new JLabel();
      this.troll = new JTextField();
      this.tname = new JTextField();
      this.tfirst = new JTextField();
      this.tsecond = new JTextField();
      this.tattd = new JTextField();
      this.tassign = new JTextField();
      this.bupdate = new JButton();
      this.bback = new JButton();
      this.set1 = new JTextField();
      this.set3 = new JTextField();
      this.set2 = new JTextField();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(204, 255, 204));
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(255, 255, 153));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jLabel1.setFont(new Font("Verdana", 1, 18));
      this.jLabel1.setText("Update Student Details");
      this.jPanel2.add(this.jLabel1);
      this.jLabel1.setBounds(10, 3, 270, 40);
      this.jLabel10.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/refresh.png")));
      this.jPanel2.add(this.jLabel10);
      this.jLabel10.setBounds(1000, 0, 40, 50);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(0, 0, 1050, 50);
      this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[]{"Student id", "Name", "Subject", "1st Test Marks", "2nd Test Marks", "Attendance(%)", "Assignment Marks", "V/T(best of two)", "A/T(attd marks)l", "TAQ(total marks)"}));
      this.jTable1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            UpdateStudent.this.jTable1MouseClicked(evt);
         }
      });
      this.jScrollPane1.setViewportView(this.jTable1);
      this.jPanel1.add(this.jScrollPane1);
      this.jScrollPane1.setBounds(0, 350, 1060, 170);
      this.jLabel2.setFont(new Font("Verdana", 3, 18));
      this.jLabel2.setText("Subject :");
      this.jPanel1.add(this.jLabel2);
      this.jLabel2.setBounds(280, 60, 100, 30);
      this.jPanel1.add(this.tsub);
      this.tsub.setBounds(390, 60, 270, 30);
      this.bsearch.setBackground(new Color(0, 0, 0));
      this.bsearch.setFont(new Font("Verdana", 1, 14));
      this.bsearch.setForeground(new Color(255, 255, 255));
      this.bsearch.setText("Search");
      this.bsearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            UpdateStudent.this.bsearchActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bsearch);
      this.bsearch.setBounds(690, 60, 100, 27);
      this.jLabel3.setText("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      this.jPanel1.add(this.jLabel3);
      this.jLabel3.setBounds(5, 94, 1050, 30);
      this.jLabel4.setFont(new Font("Georgia", 3, 18));
      this.jLabel4.setText("Student id  :");
      this.jPanel1.add(this.jLabel4);
      this.jLabel4.setBounds(50, 130, 130, 20);
      this.jLabel5.setFont(new Font("Georgia", 3, 18));
      this.jLabel5.setText("Name :");
      this.jPanel1.add(this.jLabel5);
      this.jLabel5.setBounds(90, 190, 90, 21);
      this.jLabel6.setFont(new Font("Georgia", 3, 18));
      this.jLabel6.setText("1st Test Marks :");
      this.jPanel1.add(this.jLabel6);
      this.jLabel6.setBounds(10, 260, 150, 21);
      this.jLabel7.setFont(new Font("Georgia", 3, 18));
      this.jLabel7.setText("2nd Test Marks :");
      this.jPanel1.add(this.jLabel7);
      this.jLabel7.setBounds(608, 133, 180, 30);
      this.jLabel8.setFont(new Font("Georgia", 3, 18));
      this.jLabel8.setText("Attendance :");
      this.jPanel1.add(this.jLabel8);
      this.jLabel8.setBounds(640, 190, 140, 30);
      this.jLabel9.setFont(new Font("Georgia", 3, 18));
      this.jLabel9.setText("Assignment Marks :");
      this.jPanel1.add(this.jLabel9);
      this.jLabel9.setBounds(570, 253, 210, 40);
      this.jPanel1.add(this.troll);
      this.troll.setBounds(190, 130, 250, 30);
      this.jPanel1.add(this.tname);
      this.tname.setBounds(190, 190, 250, 30);
      this.jPanel1.add(this.tfirst);
      this.tfirst.setBounds(190, 260, 250, 30);
      this.jPanel1.add(this.tsecond);
      this.tsecond.setBounds(810, 130, 220, 30);
      this.tattd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            UpdateStudent.this.tattdActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tattd);
      this.tattd.setBounds(810, 190, 220, 30);
      this.jPanel1.add(this.tassign);
      this.tassign.setBounds(810, 260, 220, 30);
      this.bupdate.setBackground(new Color(0, 0, 153));
      this.bupdate.setFont(new Font("Georgia", 3, 18));
      this.bupdate.setText("Update");
      this.bupdate.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            UpdateStudent.this.bupdateActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bupdate);
      this.bupdate.setBounds(400, 310, 110, 30);
      this.bback.setBackground(new Color(255, 0, 0));
      this.bback.setFont(new Font("Georgia", 3, 18));
      this.bback.setText("Back");
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            UpdateStudent.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bback);
      this.bback.setBounds(560, 310, 120, 30);
      this.jPanel1.add(this.set1);
      this.set1.setBounds(940, 390, 7, 20);
      this.jPanel1.add(this.set3);
      this.set3.setBounds(950, 450, 7, 20);
      this.jPanel1.add(this.set2);
      this.set2.setBounds(950, 420, 7, 20);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 1054, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 520, 32767));
      this.pack();
   }

   private void bsearchActionPerformed(ActionEvent evt) {
      this.connectionhelp();
   }

   private void tattdActionPerformed(ActionEvent evt) {
   }

   private void bupdateActionPerformed(ActionEvent evt) {
      float asol = 0.0F;
      int first = Integer.parseInt(this.tfirst.getText());
      int second = Integer.parseInt(this.tsecond.getText());
      int attd = Integer.parseInt(this.tattd.getText());
      int assign = Integer.parseInt(this.tassign.getText());
      String roll = this.troll.getText();
      String name = this.tname.getText();
      String no1 = this.tfirst.getText();
      String no2 = this.tsecond.getText();
      String ano3 = this.tattd.getText();
      String assno4 = this.tassign.getText();
      String set4 = this.set1.getText();
      String set5 = this.set2.getText();
      String set6 = this.set3.getText();
      float vtn;
      float finalm;
      String vt;
      String att1;
      String finals;
      String[] var10000;
      DefaultTableModel s;
      if (second <= first) {
         vtn = this.finalmarks((float)first);
         vt = Float.toString(vtn);
         this.set1.setText(vt);
         asol = this.attendance((float)attd);
         att1 = Float.toString(asol);
         this.set2.setText(att1);
         finalm = asol + vtn + (float)assign;
         if (finalm >= 25.0F) {
            finalm = this.finalms(finalm);
         }

         finals = Float.toString(finalm);
         this.set3.setText(finals);
         var10000 = new String[]{this.troll.getText(), this.tname.getText(), this.tsub.getText(), this.tfirst.getText(), this.tsecond.getText(), this.tattd.getText(), this.tassign.getText(), this.set1.getText(), this.set2.getText(), this.set3.getText()};
         s = (DefaultTableModel)this.jTable1.getModel();
         s.setRowCount(0);
         this.connect(roll, name, no1, no2, ano3, assno4, vtn, asol, finalm);
         this.tname.setText("");
         this.tfirst.setText("");
         this.tsecond.setText("");
         this.tassign.setText("");
         this.tattd.setText("");
      } else {
         vtn = this.finalmarks((float)second);
         vt = Float.toString(vtn);
         this.set1.setText(vt);
         asol = this.attendance((float)attd);
         att1 = Float.toString(asol);
         this.set2.setText(att1);
         finalm = asol + vtn + (float)assign;
         if ((double)finalm >= 24.5D) {
            finalm = this.finalms(finalm);
         }

         finals = Float.toString(finalm);
         this.set3.setText(finals);
         var10000 = new String[]{this.troll.getText(), this.tname.getText(), this.tsub.getText(), this.tfirst.getText(), this.tsecond.getText(), this.tattd.getText(), this.tassign.getText(), this.set1.getText(), this.set2.getText(), this.set3.getText()};
         s = (DefaultTableModel)this.jTable1.getModel();
         s.setRowCount(0);
         this.connect(roll, name, no1, no2, ano3, assno4, vtn, asol, finalm);
         this.tname.setText("");
         this.tfirst.setText("");
         this.tsecond.setText("");
         this.tassign.setText("");
         this.tattd.setText("");
      }

   }

   private void bbackActionPerformed(ActionEvent evt) {
      (new MainMenu()).setVisible(true);
      this.setVisible(false);
   }

   private void jTable1MouseClicked(MouseEvent evt) {
      int i = this.jTable1.getSelectedRow();
      TableModel model = this.jTable1.getModel();
      this.troll.setText(model.getValueAt(i, 0).toString());
      this.tname.setText(model.getValueAt(i, 1).toString());
      this.tfirst.setText(model.getValueAt(i, 3).toString());
      this.tsecond.setText(model.getValueAt(i, 4).toString());
      this.tattd.setText(model.getValueAt(i, 5).toString());
      this.tassign.setText(model.getValueAt(i, 6).toString());
   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new UpdateStudent()).setVisible(true);
      });
   }

   private float finalmarks(float first) {
      first /= 2.0F;
      return first;
   }

   private float attendance(float attd) {
      int x;
      if (attd % 10.0F >= 5.0F) {
         x = (int)(attd / 10.0F);
         attd = (float)((int)((double)x + 0.5D));
         return attd;
      } else {
         x = (int)(attd / 10.0F);
         return (float)x;
      }
   }

   private float finalms(float finalm) {
      finalm = 25.0F;
      return finalm;
   }

   private void connectionhelp() {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String sub = this.tsub.getText();
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select * from addstudent where  sub = ?");
         this.ps.setString(1, sub);
         ResultSet rs = this.ps.executeQuery();

         while(rs.next()) {
            String s1 = rs.getString(1);
            String s2 = rs.getString(2);
            String s3 = rs.getString(3);
            String s4 = rs.getString(4);
            String s5 = rs.getString(5);
            String s6 = rs.getString(6);
            String s7 = rs.getString(7);
            float s8 = rs.getFloat(8);
            float s9 = rs.getFloat(9);
            float s10 = rs.getFloat(10);
            DefaultTableModel modal = (DefaultTableModel)this.jTable1.getModel();
            modal.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7, s8, s9, s10});
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var14) {
         System.out.println(var14);
      }

   }

   private void connect(String roll, String name, String no1, String no2, String ano3, String assno4, float vtn, float asol, float finalm) {
      String var10 = this.tsub.getText();

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         int x = false;
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("update addstudent  set roll = ? ,name = ? ,no1 = ?,no2 = ?,ano3 = ?,assno4 = ?,vtn = ? ,asol = ?,finalm =? where roll = ? ");
         this.ps.setString(1, roll);
         this.ps.setString(2, name);
         this.ps.setString(3, no1);
         this.ps.setString(4, no2);
         this.ps.setString(5, ano3);
         this.ps.setString(6, assno4);
         this.ps.setFloat(7, vtn);
         this.ps.setFloat(8, asol);
         this.ps.setFloat(9, finalm);
         this.ps.setString(10, roll);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, " Data Updated Successfully", "success", 1);
            this.connectionhelp();
         } else {
            JOptionPane.showMessageDialog((Component)null, "data not  Updated ", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | NumberFormatException | SQLException | HeadlessException var13) {
         System.out.println(var13);
      }

   }
}
