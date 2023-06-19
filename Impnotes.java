/* Decompiler 85ms, total 431ms, lines 284 */
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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.MatteBorder;

public class Impnotes extends JFrame {
   private JButton bback;
   private JButton bcheck;
   private JButton bclear;
   private JButton bsave;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JScrollPane jScrollPane1;
   private JTextArea tmsg;
   private JTextField tname;
   private JTextField tsub;
   Connection con;
   Statement st;
   PreparedStatement ps;

   public Impnotes() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.jScrollPane1 = new JScrollPane();
      this.tmsg = new JTextArea();
      this.bsave = new JButton();
      this.bclear = new JButton();
      this.bback = new JButton();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.tname = new JTextField();
      this.tsub = new JTextField();
      this.bcheck = new JButton();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(0, 204, 204));
      this.jPanel1.setBorder(new MatteBorder((Icon)null));
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(0, 204, 0));
      this.jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jLabel1.setFont(new Font("Georgia", 3, 24));
      this.jLabel1.setText("IMPORTENT NOTES");
      this.jPanel2.add(this.jLabel1);
      this.jLabel1.setBounds(17, 30, 270, 50);
      this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/notes-icon.png")));
      this.jPanel2.add(this.jLabel2);
      this.jLabel2.setBounds(840, 10, 80, 90);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(0, 0, 940, 100);
      this.tmsg.setColumns(20);
      this.tmsg.setRows(5);
      this.jScrollPane1.setViewportView(this.tmsg);
      this.jPanel1.add(this.jScrollPane1);
      this.jScrollPane1.setBounds(10, 180, 920, 290);
      this.bsave.setBackground(new Color(0, 0, 255));
      this.bsave.setFont(new Font("Verdana", 1, 18));
      this.bsave.setText("Save");
      this.bsave.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.bsaveActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bsave);
      this.bsave.setBounds(440, 490, 90, 40);
      this.bclear.setBackground(new Color(255, 51, 0));
      this.bclear.setFont(new Font("Verdana", 1, 18));
      this.bclear.setText("Clear");
      this.bclear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.bclearActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bclear);
      this.bclear.setBounds(660, 490, 90, 40);
      this.bback.setBackground(new Color(255, 0, 0));
      this.bback.setFont(new Font("Verdana", 1, 18));
      this.bback.setText("back");
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bback);
      this.bback.setBounds(220, 491, 100, 40);
      this.jLabel3.setFont(new Font("Verdana", 3, 18));
      this.jLabel3.setText("Name :");
      this.jPanel1.add(this.jLabel3);
      this.jLabel3.setBounds(50, 120, 80, 30);
      this.jLabel4.setFont(new Font("Verdana", 3, 18));
      this.jLabel4.setText("Subject :");
      this.jPanel1.add(this.jLabel4);
      this.jLabel4.setBounds(390, 120, 90, 30);
      this.tname.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.tnameActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tname);
      this.tname.setBounds(130, 120, 230, 30);
      this.tsub.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.tsubActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.tsub);
      this.tsub.setBounds(500, 120, 260, 30);
      this.bcheck.setBackground(new Color(0, 0, 153));
      this.bcheck.setFont(new Font("Verdana", 1, 18));
      this.bcheck.setText("Check");
      this.bcheck.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Impnotes.this.bcheckActionPerformed(evt);
         }
      });
      this.jPanel1.add(this.bcheck);
      this.bcheck.setBounds(803, 123, 100, 30);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 938, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -1, 538, 32767));
      this.pack();
   }

   private void bsaveActionPerformed(ActionEvent evt) {
      String name = this.tname.getText();
      String sub = this.tsub.getText();
      String msg = this.tmsg.getText();

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         int x = 0;
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.st = this.con.createStatement();
         String str = "insert into impnotes values('" + name + "','" + sub + "','" + msg + "')";
         this.st.executeUpdate(str);
         int x = x + 1;
         if (x > 0) {
            JOptionPane.showMessageDialog((Component)null, "Message saved Sucessfully");
         }

         this.con.close();
         this.st.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var7) {
         System.out.println(var7);
      }

   }

   private void bbackActionPerformed(ActionEvent evt) {
      (new MainMenu()).setVisible(true);
      this.setVisible(false);
   }

   private void bclearActionPerformed(ActionEvent evt) {
      this.tname.setText("");
      this.tsub.setText("");
      this.tmsg.setText("");
   }

   private void tnameActionPerformed(ActionEvent evt) {
   }

   private void tsubActionPerformed(ActionEvent evt) {
   }

   private void bcheckActionPerformed(ActionEvent evt) {
      String names = this.tname.getText();
      String subs = this.tsub.getText();

      boolean x;
      ResultSet rs;
      String value;
      try {
         x = false;
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select msg from impnotes where name= ?  and sub = ? ");
         this.ps.setString(1, names);
         this.ps.setString(2, subs);
         rs = this.ps.executeQuery();
         if (rs.next()) {
            value = rs.getString(1);
            this.tmsg.setText(value);
            JOptionPane.showMessageDialog((Component)null, "Previous Notes Available", "success", 1);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Previous Notes Not Found", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var8) {
         System.out.println(var8);
      }

      try {
         x = false;
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("delete  from impnotes where name= ?  and sub = ? ");
         this.ps.setString(1, names);
         this.ps.setString(2, subs);
         rs = this.ps.executeQuery();
         if (rs.next()) {
            value = rs.getString(1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var7) {
         System.out.println(var7);
      }

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
         Logger.getLogger(Impnotes.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Impnotes.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Impnotes.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Impnotes.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new Impnotes()).setVisible(true);
      });
   }
}
