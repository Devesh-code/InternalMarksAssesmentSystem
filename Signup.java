/* Decompiler 100ms, total 487ms, lines 301 */
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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
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

public class Signup extends JFrame {
   private JButton bback;
   private JButton bclear;
   private JButton bsignup;
   private JComboBox<String> cseq;
   private JDialog jDialog1;
   private JDialog jDialog2;
   private JDialog jDialog3;
   private JDialog jDialog4;
   private JLabel jLabel1;
   private JLabel jLabel4;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel3;
   private JTextField lchoose;
   private JLabel lconpas;
   private JLabel lcreate;
   private JLabel lfirst;
   private JLabel llast;
   private JLabel lpas;
   private JLabel lseq;
   private JLabel lsub;
   private JLabel luser;
   private JPasswordField tconpas;
   private JTextField tfirst;
   private JTextField tlast;
   private JPasswordField tpas;
   private JTextField tsub;
   private JTextField tuser;
   Connection con;
   Statement st;

   public Signup() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   public void connect(String namef, String namel, String usern, String pas, String cour, String sec, String value) {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         int x = 0;
         this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "password");
         this.st = this.con.createStatement();
         String str = "insert into table1 values('" + namef + "','" + namel + "','" + usern + "','" + pas + "','" + cour + "','" + sec + "','" + value + "')";
         this.st.executeUpdate(str);
         int x = x + 1;
         if (x > 0) {
            JOptionPane.showMessageDialog((Component)null, "Data saved Sucessfully");
         }

         this.con.close();
         this.st.close();
      } catch (ClassNotFoundException | SQLException | HeadlessException var10) {
         System.out.println(var10);
      }

   }

   private void initComponents() {
      this.jDialog1 = new JDialog();
      this.jDialog2 = new JDialog();
      this.jDialog3 = new JDialog();
      this.jDialog4 = new JDialog();
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.lcreate = new JLabel();
      this.lfirst = new JLabel();
      this.llast = new JLabel();
      this.luser = new JLabel();
      this.lpas = new JLabel();
      this.lconpas = new JLabel();
      this.lsub = new JLabel();
      this.lseq = new JLabel();
      this.cseq = new JComboBox();
      this.bsignup = new JButton();
      this.bclear = new JButton();
      this.tfirst = new JTextField();
      this.tlast = new JTextField();
      this.tuser = new JTextField();
      this.tsub = new JTextField();
      this.lchoose = new JTextField();
      this.tpas = new JPasswordField();
      this.tconpas = new JPasswordField();
      this.bback = new JButton();
      this.jLabel1 = new JLabel();
      this.jPanel3 = new JPanel();
      this.jLabel4 = new JLabel();
      GroupLayout jDialog1Layout = new GroupLayout(this.jDialog1.getContentPane());
      this.jDialog1.getContentPane().setLayout(jDialog1Layout);
      jDialog1Layout.setHorizontalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jDialog1Layout.setVerticalGroup(jDialog1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      GroupLayout jDialog2Layout = new GroupLayout(this.jDialog2.getContentPane());
      this.jDialog2.getContentPane().setLayout(jDialog2Layout);
      jDialog2Layout.setHorizontalGroup(jDialog2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jDialog2Layout.setVerticalGroup(jDialog2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      GroupLayout jDialog3Layout = new GroupLayout(this.jDialog3.getContentPane());
      this.jDialog3.getContentPane().setLayout(jDialog3Layout);
      jDialog3Layout.setHorizontalGroup(jDialog3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jDialog3Layout.setVerticalGroup(jDialog3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      GroupLayout jDialog4Layout = new GroupLayout(this.jDialog4.getContentPane());
      this.jDialog4.getContentPane().setLayout(jDialog4Layout);
      jDialog4Layout.setHorizontalGroup(jDialog4Layout.createParallelGroup(Alignment.LEADING).addGap(0, 400, 32767));
      jDialog4Layout.setVerticalGroup(jDialog4Layout.createParallelGroup(Alignment.LEADING).addGap(0, 300, 32767));
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jPanel2.setForeground(new Color(255, 102, 0));
      this.jPanel2.setLayout((LayoutManager)null);
      this.lcreate.setFont(new Font("Times New Roman", 3, 24));
      this.lcreate.setText("Create Account");
      this.jPanel2.add(this.lcreate);
      this.lcreate.setBounds(129, 11, 180, 40);
      this.lfirst.setFont(new Font("Times New Roman", 3, 18));
      this.lfirst.setText("First Name");
      this.jPanel2.add(this.lfirst);
      this.lfirst.setBounds(10, 70, 90, 21);
      this.llast.setFont(new Font("Times New Roman", 3, 18));
      this.llast.setText("Last Name");
      this.jPanel2.add(this.llast);
      this.llast.setBounds(210, 70, 81, 21);
      this.luser.setFont(new Font("Times New Roman", 3, 18));
      this.luser.setText("Username");
      this.jPanel2.add(this.luser);
      this.luser.setBounds(10, 120, 76, 21);
      this.lpas.setFont(new Font("Times New Roman", 3, 18));
      this.lpas.setText("Password");
      this.jPanel2.add(this.lpas);
      this.lpas.setBounds(10, 180, 71, 21);
      this.lconpas.setFont(new Font("Times New Roman", 3, 18));
      this.lconpas.setText("Confirm password");
      this.jPanel2.add(this.lconpas);
      this.lconpas.setBounds(0, 240, 137, 21);
      this.lsub.setFont(new Font("Times New Roman", 3, 18));
      this.lsub.setText("Subject");
      this.jPanel2.add(this.lsub);
      this.lsub.setBounds(0, 290, 55, 21);
      this.lseq.setFont(new Font("Times New Roman", 3, 18));
      this.lseq.setText("Security question");
      this.jPanel2.add(this.lseq);
      this.lseq.setBounds(10, 350, 129, 21);
      this.cseq.setModel(new DefaultComboBoxModel(new String[]{"which no. do you remember most in childhood", "who is your favourite actor/musicians/artist", "what is your favourite movie", "who is your favourite animal"}));
      this.jPanel2.add(this.cseq);
      this.cseq.setBounds(150, 350, 270, 30);
      this.bsignup.setBackground(new Color(51, 51, 255));
      this.bsignup.setFont(new Font("Times New Roman", 3, 18));
      this.bsignup.setText("Signup");
      this.bsignup.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Signup.this.bsignupActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bsignup);
      this.bsignup.setBounds(20, 450, 85, 29);
      this.bclear.setBackground(new Color(255, 51, 51));
      this.bclear.setFont(new Font("Times New Roman", 3, 18));
      this.bclear.setText("Clear");
      this.bclear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Signup.this.bclearActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bclear);
      this.bclear.setBounds(330, 450, 80, 29);
      this.jPanel2.add(this.tfirst);
      this.tfirst.setBounds(100, 70, 100, 30);
      this.jPanel2.add(this.tlast);
      this.tlast.setBounds(300, 70, 120, 30);
      this.jPanel2.add(this.tuser);
      this.tuser.setBounds(100, 120, 330, 30);
      this.jPanel2.add(this.tsub);
      this.tsub.setBounds(61, 290, 360, 30);
      this.jPanel2.add(this.lchoose);
      this.lchoose.setBounds(10, 400, 410, 30);
      this.jPanel2.add(this.tpas);
      this.tpas.setBounds(90, 180, 330, 30);
      this.jPanel2.add(this.tconpas);
      this.tconpas.setBounds(150, 240, 270, 30);
      this.bback.setBackground(new Color(0, 0, 204));
      this.bback.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/arrow-back-icon (2).png")));
      this.bback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Signup.this.bbackActionPerformed(evt);
         }
      });
      this.jPanel2.add(this.bback);
      this.bback.setBounds(190, 440, 60, 57);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(200, 10, 440, 520);
      this.jLabel1.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-3861969.jpeg")));
      this.jLabel1.setText("jLabel1");
      this.jPanel1.add(this.jLabel1);
      this.jLabel1.setBounds(0, 0, 890, 540);
      GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
      this.jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      this.jPanel1.add(this.jPanel3);
      this.jPanel3.setBounds(20, 20, 100, 100);
      this.jLabel4.setText("jLabel4");
      this.jPanel1.add(this.jLabel4);
      this.jLabel4.setBounds(50, 60, 35, 14);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 890, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, 540, 32767));
      this.pack();
   }

   private void bclearActionPerformed(ActionEvent evt) {
      this.tfirst.setText("");
      this.tlast.setText("");
      this.tuser.setText("");
      this.tpas.setText("");
      this.tconpas.setText("");
      this.lchoose.setText("");
      this.tsub.setText("");
   }

   private void bsignupActionPerformed(ActionEvent evt) {
      String namef = this.tfirst.getText();
      String namel = this.tlast.getText();
      String usern = this.tuser.getText();
      String pas = this.tpas.getText();
      String pas1 = this.tconpas.getText();
      String cour = this.tsub.getText();
      String sec = this.lchoose.getText();
      String value = this.cseq.getSelectedItem().toString();
      if (pas.equals(pas1)) {
         this.connect(namef, namel, usern, pas, cour, sec, value);
      } else {
         JOptionPane.showMessageDialog((Component)null, "Password Does Not Match");
      }

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
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new Signup()).setVisible(true);
      });
   }
}
