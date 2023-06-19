/* Decompiler 45ms, total 436ms, lines 212 */
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class ForgetFinal extends JFrame {
   private JButton bsave;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPasswordField pf2;
   private JPasswordField pf3;
   private JTextField t1;
   private JLabel uname;
   Connection con;
   PreparedStatement ps;

   public ForgetFinal() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   public void show(String ts1, String p2) {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("update table1 set pas = ? where usern =?");
         this.ps.setString(1, p2);
         this.ps.setString(2, ts1);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, "password changes sucessfully", "success", 1);
            (new Login()).setVisible(true);
            this.setVisible(false);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Incorrect username ", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var4) {
         System.out.println(var4);
      }

   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel2 = new JLabel();
      this.uname = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.t1 = new JTextField();
      this.pf2 = new JPasswordField();
      this.pf3 = new JPasswordField();
      this.bsave = new JButton();
      this.jLabel6 = new JLabel();
      this.jLabel1 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(0, 0, 0, 64));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/secrecy-icon (1).png")));
      this.jLabel2.setText("jLabel2");
      this.jPanel2.add(this.jLabel2);
      this.jLabel2.setBounds(90, 0, 140, 120);
      this.uname.setFont(new Font("Times New Roman", 3, 18));
      this.uname.setForeground(new Color(255, 255, 255));
      this.uname.setText("Enter Username");
      this.jPanel2.add(this.uname);
      this.uname.setBounds(10, 190, 130, 30);
      this.jLabel4.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel4.setForeground(new Color(255, 255, 255));
      this.jLabel4.setText("Enter Password");
      this.jPanel2.add(this.jLabel4);
      this.jLabel4.setBounds(10, 250, 118, 30);
      this.jLabel5.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel5.setForeground(new Color(255, 255, 255));
      this.jLabel5.setText("Re-Enter Password");
      this.jPanel2.add(this.jLabel5);
      this.jLabel5.setBounds(10, 310, 144, 40);
      this.t1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetFinal.this.t1ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.t1);
      this.t1.setBounds(170, 190, 170, 30);
      this.pf2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetFinal.this.pf2ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.pf2);
      this.pf2.setBounds(170, 250, 170, 30);
      this.pf3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetFinal.this.pf3ActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.pf3);
      this.pf3.setBounds(170, 310, 170, 30);
      this.bsave.setBackground(new Color(0, 0, 255));
      this.bsave.setFont(new Font("Times New Roman", 3, 18));
      this.bsave.setText("Save Changes");
      this.bsave.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetFinal.this.bsaveActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bsave);
      this.bsave.setBounds(80, 390, 180, 29);
      this.jLabel6.setBackground(new Color(255, 0, 0));
      this.jLabel6.setFont(new Font("Times New Roman", 3, 24));
      this.jLabel6.setForeground(new Color(255, 0, 0));
      this.jLabel6.setText("Forget password");
      this.jPanel2.add(this.jLabel6);
      this.jLabel6.setBounds(70, 120, 180, 40);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(320, 10, 350, 490);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-278887.jpeg")));
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(0, 0, 1000, 510);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 1004, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 507, 32767));
      this.pack();
   }

   private void pf3ActionPerformed(ActionEvent evt) {
   }

   private void pf2ActionPerformed(ActionEvent evt) {
   }

   private void t1ActionPerformed(ActionEvent evt) {
   }

   private void bsaveActionPerformed(ActionEvent evt) {
      String ts1 = this.t1.getText();
      String p2 = this.pf2.getText();
      String p3 = this.pf3.getText();
      if (p2.equals(p3)) {
         this.show(ts1, p2);
      } else {
         JOptionPane.showMessageDialog((Component)null, "Password Does Not Matched", "failed", 1);
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
         Logger.getLogger(ForgetFinal.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(ForgetFinal.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(ForgetFinal.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(ForgetFinal.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new ForgetFinal()).setVisible(true);
         }
      });
   }
}
