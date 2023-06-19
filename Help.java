/* Decompiler 39ms, total 518ms, lines 128 */
package internalmarksassesmentsystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class Help extends JFrame {
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel5;
   private JPanel jPanel1;
   private JPanel jPanel5;
   private JPanel jPanel6;
   private JScrollPane jScrollPane1;
   private JTextArea jTextArea1;

   public Help() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel5 = new JPanel();
      this.jPanel6 = new JPanel();
      this.jLabel5 = new JLabel();
      this.jLabel1 = new JLabel();
      this.jPanel1 = new JPanel();
      this.jLabel2 = new JLabel();
      this.jScrollPane1 = new JScrollPane();
      this.jTextArea1 = new JTextArea();
      this.jLabel3 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel5.setBackground(new Color(51, 0, 204));
      this.jPanel5.setLayout((LayoutManager)null);
      this.jPanel6.setBackground(new Color(255, 255, 255));
      this.jPanel6.setLayout((LayoutManager)null);
      this.jLabel5.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Untitled-3.png")));
      this.jPanel6.add(this.jLabel5);
      this.jLabel5.setBounds(440, 0, 110, 110);
      this.jLabel1.setFont(new Font("Georgia", 3, 24));
      this.jLabel1.setText("Internal Marks Assessment System ");
      this.jPanel6.add(this.jLabel1);
      this.jLabel1.setBounds(260, 110, 470, 30);
      this.jPanel5.add(this.jPanel6);
      this.jPanel6.setBounds(0, 0, 1010, 150);
      this.jPanel1.setBackground(new Color(0, 0, 0));
      this.jPanel1.setLayout((LayoutManager)null);
      this.jLabel2.setFont(new Font("Georgia", 1, 18));
      this.jLabel2.setForeground(new Color(255, 51, 0));
      this.jLabel2.setText("Designed and Devloped by Abhishek Garg , Pintu kumar jha , Devesh Sharma and avinash kasyap");
      this.jPanel1.add(this.jLabel2);
      this.jLabel2.setBounds(57, 3, 940, 40);
      this.jPanel5.add(this.jPanel1);
      this.jPanel1.setBounds(0, 150, 1000, 50);
      this.jTextArea1.setEditable(false);
      this.jTextArea1.setColumns(20);
      this.jTextArea1.setFont(new Font("Georgia", 2, 18));
      this.jTextArea1.setRows(5);
      this.jTextArea1.setText("This software is basically designed for the teachers to remove the problem of calculating final marks.there we are providing \n some special module that helps teacher like teacher can make their own notes,searchstudent details , Easily update student\n detail etc....... \n-------------------------------------------------------------------------------------------------------------------------------------------\nContact us -: +91-9654482611      Abhishek Garg\n                          +91-7065952676      Pintu Kmuar jha\n                         +91-9627346483      Devesh Sharma\n                         +91-7210905779      Avinash Kasyap\n                             \n----------------------------------------For More detail visit : www.globalinst.com-----------------------------------------------------------\n\n\n\n");
      this.jScrollPane1.setViewportView(this.jTextArea1);
      this.jPanel5.add(this.jScrollPane1);
      this.jScrollPane1.setBounds(0, 210, 1000, 280);
      this.jLabel3.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Arrow-Back-3-icon.png")));
      this.jLabel3.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            Help.this.jLabel3MouseClicked(evt);
         }
      });
      this.jPanel5.add(this.jLabel3);
      this.jLabel3.setBounds(450, 494, 50, 50);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel5, Alignment.TRAILING, -1, 1003, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel5, -1, 545, 32767));
      this.pack();
   }

   private void jLabel3MouseClicked(MouseEvent evt) {
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
         Logger.getLogger(Help.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Help.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Help.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Help.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(() -> {
         (new Help()).setVisible(true);
      });
   }
}
