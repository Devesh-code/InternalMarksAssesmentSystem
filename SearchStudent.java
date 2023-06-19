/* Decompiler 84ms, total 471ms, lines 350 */
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
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class SearchStudent extends JFrame {
   private JButton bback;
   private JButton bclear;
   private JLabel jLabel1;
   private JLabel jLabel10;
   private JLabel jLabel11;
   private JLabel jLabel12;
   private JLabel jLabel13;
   private JLabel jLabel14;
   private JLabel jLabel15;
   private JLabel jLabel16;
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
   private JPanel jPanel3;
   private JLabel lassign;
   private JLabel lattd;
   private JLabel lattmarks;
   private JLabel lbest;
   private JLabel lfirst;
   private JLabel lname;
   private JLabel lroll;
   private JLabel lsecond;
   private JLabel lsub;
   private JLabel ltaq;
   private JTextField troll;
   private JTextField tsub;
   PreparedStatement ps;
   Connection con;

   public SearchStudent() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.troll = new JTextField();
      this.tsub = new JTextField();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      this.jLabel8 = new JLabel();
      this.jLabel9 = new JLabel();
      this.jLabel10 = new JLabel();
      this.jLabel11 = new JLabel();
      this.jLabel12 = new JLabel();
      this.jLabel13 = new JLabel();
      this.jLabel14 = new JLabel();
      this.jLabel15 = new JLabel();
      this.lroll = new JLabel();
      this.lname = new JLabel();
      this.lsub = new JLabel();
      this.lfirst = new JLabel();
      this.lsecond = new JLabel();
      this.lattd = new JLabel();
      this.lassign = new JLabel();
      this.lbest = new JLabel();
      this.lattmarks = new JLabel();
      this.ltaq = new JLabel();
      this.jLabel3 = new JLabel();
      this.bback = new JButton();
      this.bclear = new JButton();
      this.jPanel3 = new JPanel();
      this.jLabel2 = new JLabel();
      this.jLabel16 = new JLabel();
      this.jLabel1 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jLabel4.setFont(new Font("Verdana", 3, 14));
      this.jLabel4.setText("Roll no.");
      this.jPanel2.add(this.jLabel4);
      this.jLabel4.setBounds(10, 20, 70, 30);
      this.jLabel5.setFont(new Font("Verdana", 3, 14));
      this.jLabel5.setText("Subject");
      this.jPanel2.add(this.jLabel5);
      this.jLabel5.setBounds(250, 20, 60, 30);
      this.jPanel2.add(this.troll);
      this.troll.setBounds(81, 20, 160, 30);
      this.jPanel2.add(this.tsub);
      this.tsub.setBounds(321, 20, 200, 30);
      this.jLabel6.setFont(new Font("Verdana", 3, 14));
      this.jLabel6.setText("Roll no :");
      this.jPanel2.add(this.jLabel6);
      this.jLabel6.setBounds(10, 160, 70, 18);
      this.jLabel7.setFont(new Font("Verdana", 3, 14));
      this.jLabel7.setText("Name :");
      this.jPanel2.add(this.jLabel7);
      this.jLabel7.setBounds(10, 210, 60, 40);
      this.jLabel8.setFont(new Font("Verdana", 3, 14));
      this.jLabel8.setText("Subject :");
      this.jPanel2.add(this.jLabel8);
      this.jLabel8.setBounds(10, 280, 70, 18);
      this.jLabel9.setFont(new Font("Verdana", 3, 14));
      this.jLabel9.setText("First Test Marks :");
      this.jPanel2.add(this.jLabel9);
      this.jLabel9.setBounds(10, 340, 135, 18);
      this.jLabel10.setFont(new Font("Verdana", 3, 14));
      this.jLabel10.setText("Second Test Marks  :");
      this.jPanel2.add(this.jLabel10);
      this.jLabel10.setBounds(10, 400, 162, 18);
      this.jLabel11.setFont(new Font("Verdana", 3, 14));
      this.jLabel11.setText("Attendance(%) :");
      this.jPanel2.add(this.jLabel11);
      this.jLabel11.setBounds(240, 160, 140, 18);
      this.jLabel12.setFont(new Font("Verdana", 3, 14));
      this.jLabel12.setText("Assignment Marks :");
      this.jPanel2.add(this.jLabel12);
      this.jLabel12.setBounds(240, 230, 154, 18);
      this.jLabel13.setFont(new Font("Verdana", 3, 14));
      this.jLabel13.setText("V/T(best of two) :");
      this.jPanel2.add(this.jLabel13);
      this.jLabel13.setBounds(240, 290, 150, 14);
      this.jLabel14.setFont(new Font("Verdana", 3, 14));
      this.jLabel14.setText("TAQ(Total Marks) :");
      this.jPanel2.add(this.jLabel14);
      this.jLabel14.setBounds(240, 400, 160, 18);
      this.jLabel15.setFont(new Font("Verdana", 3, 14));
      this.jLabel15.setText("A/T(Attd Marks) :");
      this.jPanel2.add(this.jLabel15);
      this.jLabel15.setBounds(240, 340, 142, 18);
      this.lroll.setFont(new Font("Verdana", 1, 14));
      this.lroll.setForeground(new Color(0, 0, 153));
      this.jPanel2.add(this.lroll);
      this.lroll.setBounds(90, 160, 100, 30);
      this.lname.setFont(new Font("Verdana", 1, 14));
      this.lname.setForeground(new Color(0, 0, 153));
      this.jPanel2.add(this.lname);
      this.lname.setBounds(80, 220, 150, 30);
      this.lsub.setBackground(new Color(51, 0, 153));
      this.lsub.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lsub);
      this.lsub.setBounds(90, 270, 140, 40);
      this.lfirst.setBackground(new Color(51, 0, 153));
      this.lfirst.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lfirst);
      this.lfirst.setBounds(150, 330, 80, 40);
      this.lsecond.setBackground(new Color(51, 0, 153));
      this.lsecond.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lsecond);
      this.lsecond.setBounds(180, 390, 50, 30);
      this.lattd.setBackground(new Color(51, 0, 153));
      this.lattd.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lattd);
      this.lattd.setBounds(380, 150, 130, 40);
      this.lassign.setBackground(new Color(0, 0, 153));
      this.lassign.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lassign);
      this.lassign.setBounds(400, 220, 110, 40);
      this.lbest.setFont(new Font("Verdana", 1, 14));
      this.lbest.setForeground(new Color(0, 0, 153));
      this.jPanel2.add(this.lbest);
      this.lbest.setBounds(400, 280, 120, 30);
      this.lattmarks.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.lattmarks);
      this.lattmarks.setBounds(390, 330, 120, 30);
      this.ltaq.setFont(new Font("Verdana", 1, 14));
      this.jPanel2.add(this.ltaq);
      this.ltaq.setBounds(400, 390, 120, 40);
      this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/search-icon (2).png")));
      this.jLabel3.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            SearchStudent.this.jLabel3MouseClicked(evt);
         }
      });
      this.jPanel2.add(this.jLabel3);
      this.jLabel3.setBounds(220, 60, 70, 70);
      this.bback.setBackground(new Color(255, 51, 51));
      this.bback.setFont(new Font("Verdana", 3, 18));
      this.bback.setText("Back");
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            SearchStudent.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bback);
      this.bback.setBounds(120, 450, 90, 31);
      this.bclear.setBackground(new Color(255, 51, 51));
      this.bclear.setFont(new Font("Verdana", 3, 18));
      this.bclear.setText("Clear");
      this.bclear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            SearchStudent.this.bclearActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bclear);
      this.bclear.setBounds(260, 450, 85, 30);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(220, 50, 530, 500);
      this.jPanel3.setBackground(new Color(255, 255, 153));
      this.jPanel3.setLayout((LayoutManager)null);
      this.jLabel2.setFont(new Font("Verdana", 3, 24));
      this.jLabel2.setText("Search Student Marks");
      this.jPanel3.add(this.jLabel2);
      this.jLabel2.setBounds(10, 14, 360, 20);
      this.jLabel16.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/student (1).png")));
      this.jPanel3.add(this.jLabel16);
      this.jLabel16.setBounds(940, 0, 40, 50);
      this.jPanel1.add(this.jPanel3);
      this.jPanel3.setBounds(0, 0, 990, 50);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-326311.jpeg")));
      this.jLabel1.setText("jLabel1");
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(0, 0, 990, 550);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 990, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 549, 32767));
      this.pack();
   }

   private void jLabel3MouseClicked(MouseEvent evt) {
      String roll = this.troll.getText();
      String sub = this.tsub.getText();

      try {
         int x = false;
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("select * from addstudent where roll=? and sub=?");
         this.ps.setString(1, roll);
         this.ps.setString(2, sub);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            String name = rs.getString(2);
            String first = rs.getString(4);
            System.out.println(name);
            String second = rs.getString(5);
            String attd = rs.getString(6);
            String assignm = rs.getString(7);
            float vt = rs.getFloat(8);
            float at = rs.getFloat(9);
            float taq = rs.getFloat(10);
            this.lroll.setText(roll);
            System.out.println(roll);
            this.lname.setText(name);
            this.lsub.setText(sub);
            this.lfirst.setText(first);
            this.lsecond.setText(second);
            this.lattd.setText(attd);
            this.lassign.setText(assignm);
            String vts = String.valueOf(vt);
            String ats = String.valueOf(at);
            String taqs = String.valueOf(taq);
            this.lbest.setText(vts);
            this.lattmarks.setText(ats);
            this.ltaq.setText(taqs);
            JOptionPane.showMessageDialog((Component)null, "Student Found...!", "Success", 1);
         } else {
            JOptionPane.showMessageDialog((Component)null, "Student Not Found", "Failed", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (SQLException | ClassNotFoundException var17) {
         System.out.println(var17);
      }

   }

   private void bclearActionPerformed(ActionEvent evt) {
      this.troll.setText("");
      this.tsub.setText("");
      this.lroll.setText("");
      this.lname.setText("");
      this.lsub.setText("");
      this.lfirst.setText("");
      this.lsecond.setText("");
      this.lassign.setText("");
      this.lbest.setText("");
      this.lattd.setText("");
      this.lattmarks.setText("");
      this.ltaq.setText("");
   }

   private void bbackActionPerformed(ActionEvent evt) {
      (new MainMenu()).setVisible(true);
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
         Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(SearchStudent.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new SearchStudent()).setVisible(true);
      });
   }
}
