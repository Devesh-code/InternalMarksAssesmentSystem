/* Decompiler 60ms, total 514ms, lines 172 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.LayoutManager;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class DeleteStudents extends JFrame {
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel3;
   private JLabel lback;
   private JLabel ldelete;
   private JTextField troll;
   private JTextField tsub;
   Connection con;
   PreparedStatement ps;

   public DeleteStudents() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jPanel3 = new JPanel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.troll = new JTextField();
      this.tsub = new JTextField();
      this.ldelete = new JLabel();
      this.lback = new JLabel();
      this.jLabel1 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(255, 255, 204));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jPanel3.setBackground(new Color(204, 0, 0));
      this.jPanel3.setLayout((LayoutManager)null);
      this.jLabel2.setFont(new Font("Verdana", 3, 24));
      this.jLabel2.setForeground(new Color(255, 255, 255));
      this.jLabel2.setText("Delete Student");
      this.jPanel3.add(this.jLabel2);
      this.jLabel2.setBounds(10, 20, 240, 40);
      this.jPanel2.add(this.jPanel3);
      this.jPanel3.setBounds(0, 0, 380, 70);
      this.jLabel3.setFont(new Font("Verdana", 3, 18));
      this.jLabel3.setText("Roll No :");
      this.jPanel2.add(this.jLabel3);
      this.jLabel3.setBounds(15, 123, 100, 40);
      this.jLabel4.setFont(new Font("Verdana", 3, 18));
      this.jLabel4.setText("Subject :");
      this.jPanel2.add(this.jLabel4);
      this.jLabel4.setBounds(17, 200, 120, 30);
      this.jPanel2.add(this.troll);
      this.troll.setBounds(181, 130, 190, 30);
      this.jPanel2.add(this.tsub);
      this.tsub.setBounds(181, 200, 190, 30);
      this.ldelete.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/remove.png")));
      this.ldelete.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            DeleteStudents.this.ldeleteMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.ldelete);
      this.ldelete.setBounds(70, 280, 70, 70);
      this.lback.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Arrow-Back-3-icon (1).png")));
      this.lback.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            DeleteStudents.this.lbackMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lback);
      this.lback.setBounds(240, 270, 70, 80);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(300, 90, 380, 370);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-132197.jpeg")));
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(0, 0, 990, 560);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 989, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 543, 32767));
      this.pack();
   }

   private void ldeleteMouseClicked(MouseEvent evt) {
      String rolls = this.troll.getText();
      String subs = this.tsub.getText();

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.ps = this.con.prepareStatement("delete from addstudent where roll=? and sub=?");
         this.ps.setString(1, rolls);
         this.ps.setString(2, subs);
         ResultSet rs = this.ps.executeQuery();
         if (rs.next()) {
            JOptionPane.showMessageDialog((Component)null, "Data Deleted Successfully", "success", 1);
         }

         this.con.close();
         this.ps.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var5) {
         JOptionPane.showMessageDialog((Component)null, "Incorrect roll no. or subject", "Failed", 1);
         System.out.println(var5);
      }

      this.troll.setText("");
   }

   private void lbackMouseClicked(MouseEvent evt) {
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
         Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(DeleteStudents.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new DeleteStudents()).setVisible(true);
      });
   }
}
