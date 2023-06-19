/* Decompiler 85ms, total 491ms, lines 261 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class ForgetPass extends JFrame {
   private JButton bback;
   private JButton bproceed;
   private JButton bsearch;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JPanel jPanel1;
   private JPanel jPanel4;
   private JTextField tsq;
   private JTextField tsub;
   private JTextField tu;
   Connection con;
   PreparedStatement ps;

   public ForgetPass() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   public void show(String su, String ssub) {
      try {
         int x = false;
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select * from table1 where usern=? and cour =?");
         this.ps.setString(1, su);
         this.ps.setString(2, ssub);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            String value = rs.getString(7);
            JLabel jLabel7 = new JLabel();
            jLabel7.setFont(new Font("Times New Roman", 2, 18));
            jLabel7.setText(value);
            this.jPanel4.add(jLabel7);
            jLabel7.setBounds(220, 300, 220, 20);
            JOptionPane.showMessageDialog((Component)null, "User search found", "success", 1);
         } else {
            JOptionPane.showMessageDialog((Component)null, "user not found", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var7) {
         System.out.println(var7);
      }

   }

   public void checkValue(String su, String ssub, String ssq) {
      try {
         int x = false;
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select * from table1 where usern=? and cour=? and sec=?");
         this.ps.setString(1, su);
         this.ps.setString(2, ssub);
         this.ps.setString(3, ssq);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, "you are valid user", "success", 1);
            (new ForgetFinal()).setVisible(true);
            this.setVisible(false);
         } else {
            JOptionPane.showMessageDialog((Component)null, "you are not valid user", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var6) {
         System.out.println(var6);
      }

   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel4 = new JPanel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.tu = new JTextField();
      this.tsub = new JTextField();
      this.bsearch = new JButton();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.bproceed = new JButton();
      this.tsq = new JTextField();
      this.bback = new JButton();
      this.jLabel1 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel4.setForeground(new Color(255, 255, 204));
      this.jPanel4.addPropertyChangeListener(new PropertyChangeListener() {
         public void propertyChange(PropertyChangeEvent evt) {
            ForgetPass.this.jPanel4PropertyChange(evt);
         }
      });
      this.jPanel4.setLayout((LayoutManager)null);
      this.jLabel2.setFont(new Font("Times New Roman", 3, 24));
      this.jLabel2.setText("Forget password");
      this.jPanel4.add(this.jLabel2);
      this.jLabel2.setBounds(130, 10, 190, 29);
      this.jLabel3.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel3.setText("Enter Username");
      this.jPanel4.add(this.jLabel3);
      this.jLabel3.setBounds(30, 70, 123, 21);
      this.jLabel4.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel4.setText("Enter Subject");
      this.jPanel4.add(this.jLabel4);
      this.jLabel4.setBounds(40, 120, 102, 21);
      this.jPanel4.add(this.tu);
      this.tu.setBounds(180, 60, 260, 30);
      this.tsub.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetPass.this.tsubActionPerformed(evt);
         }
      });
      this.jPanel4.add(this.tsub);
      this.tsub.setBounds(180, 110, 260, 30);
      this.bsearch.setBackground(new Color(51, 255, 51));
      this.bsearch.setFont(new Font("Times New Roman", 3, 18));
      this.bsearch.setText("Search");
      this.bsearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetPass.this.bsearchActionPerformed(evt);
         }
      });
      this.jPanel4.add(this.bsearch);
      this.bsearch.setBounds(150, 170, 85, 29);
      this.jLabel5.setFont(new Font("Times New Roman", 3, 24));
      this.jLabel5.setText("User Validation");
      this.jPanel4.add(this.jLabel5);
      this.jLabel5.setBounds(130, 240, 157, 29);
      this.jLabel6.setFont(new Font("Times New Roman", 3, 18));
      this.jLabel6.setText("Enter Security Question");
      this.jPanel4.add(this.jLabel6);
      this.jLabel6.setBounds(10, 300, 180, 21);
      this.bproceed.setBackground(new Color(51, 255, 51));
      this.bproceed.setFont(new Font("Times New Roman", 3, 18));
      this.bproceed.setText("Proceed");
      this.bproceed.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetPass.this.bproceedActionPerformed(evt);
         }
      });
      this.jPanel4.add(this.bproceed);
      this.bproceed.setBounds(270, 410, 93, 29);
      this.tsq.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetPass.this.tsqActionPerformed(evt);
         }
      });
      this.jPanel4.add(this.tsq);
      this.tsq.setBounds(10, 340, 440, 30);
      this.bback.setBackground(new Color(0, 0, 204));
      this.bback.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/arrow-back-icon (2).png")));
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            ForgetPass.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel4.add(this.bback);
      this.bback.setBounds(60, 390, 70, 60);
      this.jPanel1.add(this.jPanel4);
      this.jPanel4.setBounds(230, 20, 460, 460);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/security-protection-anti-virus-software-60504.jpeg")));
      this.jLabel1.setText("jLabel1");
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(10, -10, 930, 510);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 954, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 497, 32767));
      this.pack();
   }

   private void jPanel4PropertyChange(PropertyChangeEvent evt) {
   }

   private void tsqActionPerformed(ActionEvent evt) {
   }

   private void bproceedActionPerformed(ActionEvent evt) {
      String su = this.tu.getText();
      String ssub = this.tsub.getText();
      String ssq = this.tsq.getText();
      this.checkValue(su, ssub, ssq);
   }

   private void bsearchActionPerformed(ActionEvent evt) {
      String su = this.tu.getText();
      String ssub = this.tsub.getText();
      this.show(su, ssub);
   }

   private void tsubActionPerformed(ActionEvent evt) {
   }

   private void bbackActionPerformed(ActionEvent evt) {
      (new Login()).setVisible(true);
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
      } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | ClassNotFoundException var5) {
         Logger.getLogger(ForgetPass.class.getName()).log(Level.SEVERE, (String)null, var5);
      }

      EventQueue.invokeLater(() -> {
         (new ForgetPass()).setVisible(true);
      });
   }
}
