/* Decompiler 65ms, total 383ms, lines 204 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class Login extends JFrame {
   private JButton bcreate;
   private JButton blogin;
   private JLabel forgetlabel;
   private JLabel jLabel1;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JLabel limg;
   private JLabel lpass;
   private JLabel luser;
   private JTextField tlogin;
   private JPasswordField tpas;
   Connection con;
   PreparedStatement ps;

   public Login() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   public void showData() {
      String str1 = this.tlogin.getText();
      char[] p = this.tpas.getPassword();
      String str2 = new String(p);

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select  usern from table1 where usern=? and pas=?");
         this.ps.setString(1, str1);
         this.ps.setString(2, str2);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, "You have logged in sucessfully", "success", 1);
            (new MainMenu()).setVisible(true);
            this.setVisible(false);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Incorrect username or password", "failure", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (SQLException | ClassNotFoundException var5) {
         System.out.println(var5);
      }

   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.limg = new JLabel();
      this.luser = new JLabel();
      this.tlogin = new JTextField();
      this.lpass = new JLabel();
      this.tpas = new JPasswordField();
      this.blogin = new JButton();
      this.forgetlabel = new JLabel();
      this.bcreate = new JButton();
      this.jLabel1 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(0, 0, 0, 64));
      this.jPanel2.setLayout((LayoutManager)null);
      this.limg.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Apps-preferences-desktop-user-password-icon (3).png")));
      this.limg.setText("jLabel2");
      this.jPanel2.add(this.limg);
      this.limg.setBounds(90, 10, 140, 150);
      this.luser.setFont(new Font("Times New Roman", 3, 18));
      this.luser.setForeground(new Color(255, 255, 255));
      this.luser.setText("Username");
      this.jPanel2.add(this.luser);
      this.luser.setBounds(30, 190, 90, 21);
      this.jPanel2.add(this.tlogin);
      this.tlogin.setBounds(150, 190, 160, 30);
      this.lpass.setFont(new Font("Times New Roman", 3, 18));
      this.lpass.setForeground(new Color(255, 255, 255));
      this.lpass.setText("Password");
      this.jPanel2.add(this.lpass);
      this.lpass.setBounds(30, 240, 80, 20);
      this.jPanel2.add(this.tpas);
      this.tpas.setBounds(150, 240, 160, 30);
      this.blogin.setBackground(new Color(51, 51, 255));
      this.blogin.setFont(new Font("Times New Roman", 3, 18));
      this.blogin.setText("Log in");
      this.blogin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Login.this.bloginActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.blogin);
      this.blogin.setBounds(90, 290, 100, 30);
      this.forgetlabel.setFont(new Font("Times New Roman", 3, 18));
      this.forgetlabel.setForeground(new Color(51, 255, 255));
      this.forgetlabel.setText("forgotten your password");
      this.forgetlabel.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            Login.this.forgetlabelMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.forgetlabel);
      this.forgetlabel.setBounds(10, 380, 190, 20);
      this.bcreate.setBackground(new Color(102, 204, 0));
      this.bcreate.setFont(new Font("Times New Roman", 3, 18));
      this.bcreate.setForeground(new Color(255, 255, 255));
      this.bcreate.setText("Create New Account");
      this.bcreate.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Login.this.bcreateActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bcreate);
      this.bcreate.setBounds(40, 340, 190, 30);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(280, 40, 330, 410);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-1229861.jpeg")));
      this.jLabel1.setText("jLabel1");
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(0, 0, 870, 530);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 874, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 541, 32767));
      this.pack();
   }

   private void bloginActionPerformed(ActionEvent evt) {
      this.showData();
   }

   private void bcreateActionPerformed(ActionEvent evt) {
      (new Signup()).setVisible(true);
      this.setVisible(false);
   }

   private void forgetlabelMouseClicked(MouseEvent evt) {
      (new ForgetPass()).setVisible(true);
      this.setVisible(false);
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
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new Login()).setVisible(true);
      });
   }

   private void setOpacity(int i, float f) {
      throw new UnsupportedOperationException("Not supported yet.");
   }
}
