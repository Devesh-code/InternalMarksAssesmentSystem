/* Decompiler 377ms, total 889ms, lines 412 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class AddStudent extends JFrame {
   private JButton bback;
   private JButton bclear;
   private JButton bsavecal;
   private JLabel imgs;
   private JLabel jLabel1;
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

   public AddStudent() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jLabel8 = new JLabel();
      this.jPanel1 = new JPanel();
      this.jScrollPane1 = new JScrollPane();
      this.jTable1 = new JTable();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.imgs = new JLabel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      this.troll = new JTextField();
      this.tname = new JTextField();
      this.tsub = new JTextField();
      this.tsecond = new JTextField();
      this.tassign = new JTextField();
      this.tattd = new JTextField();
      this.bsavecal = new JButton();
      this.bclear = new JButton();
      this.bback = new JButton();
      this.jLabel9 = new JLabel();
      this.tfirst = new JTextField();
      this.set1 = new JTextField();
      this.set2 = new JTextField();
      this.set3 = new JTextField();
      this.jLabel8.setText("jLabel8");
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(153, 153, 153));
      this.jPanel1.setLayout((LayoutManager)null);
      this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[]{"Student id", "Name", "Subject", "1st Test Marks", "2nd Test Marks", "Attendance(%)", "Assignmet Marks", "V/T(best of two)", "A/T(attd marks)", "TAQ(total marks)"}));
      this.jScrollPane1.setViewportView(this.jTable1);
      this.jPanel1.add(this.jScrollPane1);
      this.jScrollPane1.setBounds(0, 360, 1100, 150);
      this.jPanel2.setBackground(new Color(255, 204, 153));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jLabel1.setFont(new Font("Georgia", 1, 36));
      this.jLabel1.setText("   Add Students");
      this.jPanel2.add(this.jLabel1);
      this.jLabel1.setBounds(0, 4, 300, 80);
      this.imgs.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Male-user-add-icon (2).png")));
      this.jPanel2.add(this.imgs);
      this.imgs.setBounds(1020, 0, 80, 80);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(0, 0, 1110, 80);
      this.jLabel2.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel2.setText("Enter Roll No.");
      this.jPanel1.add(this.jLabel2);
      this.jLabel2.setBounds(40, 90, 140, 30);
      this.jLabel3.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel3.setText("Enter Name");
      this.jPanel1.add(this.jLabel3);
      this.jLabel3.setBounds(40, 160, 91, 21);
      this.jLabel4.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel4.setText("First Sessional Marks");
      this.jPanel1.add(this.jLabel4);
      this.jLabel4.setBounds(10, 260, 164, 20);
      this.jLabel5.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel5.setText("Second Sessional Marks");
      this.jPanel1.add(this.jLabel5);
      this.jLabel5.setBounds(540, 100, 182, 21);
      this.jLabel6.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel6.setText("Attendance(%)");
      this.jPanel1.add(this.jLabel6);
      this.jLabel6.setBounds(541, 170, 160, 21);
      this.jLabel7.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel7.setText("Assignment Marks");
      this.jPanel1.add(this.jLabel7);
      this.jLabel7.setBounds(536, 241, 150, 30);
      this.jPanel1.add(this.troll);
      this.troll.setBounds(190, 90, 240, 30);
      this.tname.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.tnameActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tname);
      this.tname.setBounds(190, 150, 240, 30);
      this.jPanel1.add(this.tsub);
      this.tsub.setBounds(190, 200, 240, 30);
      this.jPanel1.add(this.tsecond);
      this.tsecond.setBounds(740, 90, 260, 30);
      this.tassign.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.tassignActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tassign);
      this.tassign.setBounds(740, 240, 260, 30);
      this.tattd.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.tattdActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tattd);
      this.tattd.setBounds(740, 160, 260, 30);
      this.bsavecal.setFont(new Font("Times New Roman", 3, 18));
      this.bsavecal.setText("Save & Calculate");
      this.bsavecal.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.bsavecalActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bsavecal);
      this.bsavecal.setBounds(200, 320, 180, 29);
      this.bclear.setFont(new Font("Times New Roman", 3, 18));
      this.bclear.setText("Clear");
      this.bclear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.bclearActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bclear);
      this.bclear.setBounds(490, 320, 80, 29);
      this.bback.setFont(new Font("Times New Roman", 3, 18));
      this.bback.setText("Back");
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bback);
      this.bback.setBounds(687, 320, 100, 29);
      this.jLabel9.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel9.setText("Enter Subject");
      this.jPanel1.add(this.jLabel9);
      this.jLabel9.setBounds(40, 200, 120, 30);
      this.tfirst.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.tfirstActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tfirst);
      this.tfirst.setBounds(190, 260, 240, 30);
      this.set1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            AddStudent.this.set1ActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.set1);
      this.set1.setBounds(1083, 470, 7, 20);
      this.jPanel1.add(this.set2);
      this.set2.setBounds(1093, 430, 7, 20);
      this.jPanel1.add(this.set3);
      this.set3.setBounds(1034, 480, 7, 20);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 1109, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 513, -2).addGap(0, 0, 32767)));
      this.pack();
   }

   private void tattdActionPerformed(ActionEvent evt) {
   }

   private void tassignActionPerformed(ActionEvent evt) {
   }

   private void tnameActionPerformed(ActionEvent evt) {
   }

   private void bclearActionPerformed(ActionEvent evt) {
      this.troll.setText("");
      this.tname.setText("");
      this.tfirst.setText("");
      this.tsub.setText("");
      this.tsecond.setText("");
      this.tassign.setText("");
      this.tattd.setText("");
   }

   private void bbackActionPerformed(ActionEvent evt) {
      (new MainMenu()).setVisible(true);
      this.setVisible(false);
   }

   private void tfirstActionPerformed(ActionEvent evt) {
   }

   private void bsavecalActionPerformed(ActionEvent evt) {
      if (!this.troll.getText().equals("") && !this.tname.getText().equals("") && !this.tfirst.getText().equals("") && !this.tsub.getText().equals("") && !this.tsecond.getText().equals("") && !this.tassign.getText().equals("") && !this.tattd.getText().equals("")) {
         float asol = 0.0F;
         int first = Integer.parseInt(this.tfirst.getText());
         int second = Integer.parseInt(this.tsecond.getText());
         int attd = Integer.parseInt(this.tattd.getText());
         int assign = Integer.parseInt(this.tassign.getText());
         String roll = this.troll.getText();
         String name = this.tname.getText();
         String sub = this.tsub.getText();
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
         String[] data;
         DefaultTableModel tblModel;
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
            data = new String[]{this.troll.getText(), this.tname.getText(), this.tsub.getText(), this.tfirst.getText(), this.tsecond.getText(), this.tattd.getText(), this.tassign.getText(), this.set1.getText(), this.set2.getText(), this.set3.getText()};
            tblModel = (DefaultTableModel)this.jTable1.getModel();
            tblModel.addRow(data);
            this.connect(roll, name, sub, no1, no2, ano3, assno4, vtn, asol, finalm);
            JOptionPane.showMessageDialog(this, "Add Data Successfully   !");
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
            data = new String[]{this.troll.getText(), this.tname.getText(), this.tsub.getText(), this.tfirst.getText(), this.tsecond.getText(), this.tattd.getText(), this.tassign.getText(), this.set1.getText(), this.set2.getText(), this.set3.getText()};
            tblModel = (DefaultTableModel)this.jTable1.getModel();
            tblModel.addRow(data);
            this.connect(roll, name, sub, no1, no2, ano3, assno4, vtn, asol, finalm);
            this.tname.setText("");
            this.tfirst.setText("");
            this.tsecond.setText("");
            this.tassign.setText("");
            this.tattd.setText("");
         }
      } else {
         JOptionPane.showMessageDialog(this, "Please Enter All Data  !");
      }

   }

   private void set1ActionPerformed(ActionEvent evt) {
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
         Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new AddStudent()).setVisible(true);
      });
   }

   private float attendance(float attd) {
      int x;
      if (attd % 10.0F >= 5.0F) {
         x = (int)(attd / 10.0F);
         attd = (float)((double)x + 0.5D);
         return attd;
      } else {
         x = (int)(attd / 10.0F);
         return (float)x;
      }
   }

   private float finalmarks(float first) {
      first /= 2.0F;
      return first;
   }

   private float finalms(float finalm) {
      finalm = 25.0F;
      return finalm;
   }

   private void connect(String roll, String name, String sub, String no1, String no2, String ano3, String assno4, float vtn, float asol, float finalm) {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         int x = false;
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("insert into  addstudent(roll,name,sub,no1,no2,ano3,assno4,vtn,asol,finalm)values(?,?,?,?,?,?,?,?,?,?)");
         this.ps.setString(1, roll);
         this.ps.setString(2, name);
         this.ps.setString(3, sub);
         this.ps.setString(4, no1);
         this.ps.setString(5, no2);
         this.ps.setString(6, ano3);
         this.ps.setString(7, assno4);
         this.ps.setFloat(8, vtn);
         this.ps.setFloat(9, asol);
         this.ps.setFloat(10, finalm);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, "Add Data Sucessfully", "success", 1);
         } else {
            JOptionPane.showMessageDialog((Component)null, "date not added", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | NumberFormatException | SQLException | HeadlessException var13) {
         System.out.println(var13);
      }

   }
}
