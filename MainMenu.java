/* Decompiler 99ms, total 431ms, lines 252 */
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class MainMenu extends JFrame {
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel4;
   private JLabel ladd;
   private JLabel ldelete;
   private JLabel ledit;
   private JLabel lhelp;
   private JLabel lnotes;
   private JLabel lpadd;
   private JLabel lpdelete;
   private JLabel lpedit;
   private JLabel lphelp;
   private JLabel lpnotes;
   private JLabel lpsearch;
   private JLabel lsearch;

   public MainMenu() {
      this.initComponents();
      this.setLocationRelativeTo((Component)null);
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jPanel4 = new JPanel();
      this.jLabel1 = new JLabel();
      this.lpadd = new JLabel();
      this.lpsearch = new JLabel();
      this.lpdelete = new JLabel();
      this.lpedit = new JLabel();
      this.lphelp = new JLabel();
      this.lpnotes = new JLabel();
      this.ladd = new JLabel();
      this.lsearch = new JLabel();
      this.ldelete = new JLabel();
      this.ledit = new JLabel();
      this.lnotes = new JLabel();
      this.lhelp = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setLayout((LayoutManager)null);
      this.jPanel2.setBackground(new Color(0, 0, 0));
      this.jPanel2.setLayout((LayoutManager)null);
      this.jPanel4.setBackground(new Color(0, 204, 0));
      this.jLabel1.setBackground(new Color(51, 204, 0));
      this.jLabel1.setFont(new Font("Georgia", 1, 24));
      this.jLabel1.setForeground(new Color(255, 255, 255));
      this.jLabel1.setText("MAIN MENU");
      GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
      this.jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 175, -2).addContainerGap(155, 32767)));
      jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 36, 32767).addContainerGap()));
      this.jPanel2.add(this.jPanel4);
      this.jPanel4.setBounds(0, 0, 340, 58);
      this.lpadd.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Actions-list-add-user-icon (1).png")));
      this.lpadd.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lpaddMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lpadd);
      this.lpadd.setBounds(30, 70, 90, 90);
      this.lpsearch.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/search-icon.png")));
      this.lpsearch.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lpsearchMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lpsearch);
      this.lpsearch.setBounds(180, 70, 80, 90);
      this.lpdelete.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Actions-list-remove-user-icon (1).png")));
      this.lpdelete.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lpdeleteMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lpdelete);
      this.lpdelete.setBounds(30, 200, 80, 80);
      this.lpedit.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/Actions-edit-redo-icon.png")));
      this.lpedit.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lpeditMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lpedit);
      this.lpedit.setBounds(190, 200, 90, 80);
      this.lphelp.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/about.png")));
      this.lphelp.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lphelpMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lphelp);
      this.lphelp.setBounds(180, 310, 90, 90);
      this.lpnotes.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/icons/A.png")));
      this.lpnotes.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.lpnotesMouseClicked(evt);
         }
      });
      this.jPanel2.add(this.lpnotes);
      this.lpnotes.setBounds(30, 310, 80, 90);
      this.ladd.setFont(new Font("Times New Roman", 1, 18));
      this.ladd.setForeground(new Color(255, 255, 255));
      this.ladd.setText("Add Students");
      this.jPanel2.add(this.ladd);
      this.ladd.setBounds(10, 160, 120, 30);
      this.lsearch.setFont(new Font("Times New Roman", 1, 18));
      this.lsearch.setForeground(new Color(255, 255, 255));
      this.lsearch.setText("Search Students");
      this.jPanel2.add(this.lsearch);
      this.lsearch.setBounds(150, 160, 130, 30);
      this.ldelete.setFont(new Font("Times New Roman", 1, 18));
      this.ldelete.setForeground(new Color(255, 255, 255));
      this.ldelete.setText("Delete Students");
      this.jPanel2.add(this.ldelete);
      this.ldelete.setBounds(10, 280, 120, 21);
      this.ledit.setFont(new Font("Times New Roman", 1, 18));
      this.ledit.setForeground(new Color(255, 255, 255));
      this.ledit.setText("Edit Students ");
      this.jPanel2.add(this.ledit);
      this.ledit.setBounds(160, 280, 120, 21);
      this.lnotes.setFont(new Font("Times New Roman", 1, 18));
      this.lnotes.setForeground(new Color(255, 255, 255));
      this.lnotes.setText("Make Notes");
      this.jPanel2.add(this.lnotes);
      this.lnotes.setBounds(20, 400, 92, 21);
      this.lhelp.setFont(new Font("Times New Roman", 1, 18));
      this.lhelp.setForeground(new Color(255, 255, 255));
      this.lhelp.setText("About Us");
      this.jPanel2.add(this.lhelp);
      this.lhelp.setBounds(170, 400, 120, 21);
      this.jLabel4.setBackground(new Color(255, 255, 255));
      this.jLabel4.setFont(new Font("Verdana", 1, 14));
      this.jLabel4.setForeground(new Color(255, 0, 0));
      this.jLabel4.setText("Logout *");
      this.jLabel4.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            MainMenu.this.jLabel4MouseClicked(evt);
         }
      });
      this.jPanel2.add(this.jLabel4);
      this.jLabel4.setBounds(110, 440, 80, 20);
      this.jPanel1.add(this.jPanel2);
      this.jPanel2.setBounds(340, 40, 300, 470);
      this.jLabel2.setIcon(new ImageIcon(this.getClass().getResource("/internalmarksassesmentsystem/background/pexels-photo-205316.jpeg")));
      this.jLabel2.setText("jLabel2");
      this.jPanel1.add(this.jLabel2);
      this.jLabel2.setBounds(-10, 0, 990, 600);
      this.jLabel3.setText("jLabel3");
      this.jPanel1.add(this.jLabel3);
      this.jLabel3.setBounds(30, 20, 35, 14);
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, 979, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 619, -2).addGap(0, 11, 32767)));
      this.pack();
   }

   private void lpaddMouseClicked(MouseEvent evt) {
      (new AddStudent()).setVisible(true);
      this.setVisible(false);
   }

   private void lpsearchMouseClicked(MouseEvent evt) {
      (new SearchStudent()).setVisible(true);
      this.setVisible(false);
   }

   private void lpdeleteMouseClicked(MouseEvent evt) {
      (new DeleteStudents()).setVisible(true);
      this.setVisible(false);
   }

   private void lpeditMouseClicked(MouseEvent evt) {
      (new UpdateStudent()).setVisible(true);
      this.setVisible(false);
   }

   private void lpnotesMouseClicked(MouseEvent evt) {
      (new Impnotes()).setVisible(true);
      this.setVisible(false);
   }

   private void lphelpMouseClicked(MouseEvent evt) {
      (new Help()).setVisible(true);
      this.setVisible(false);
   }

   private void jLabel4MouseClicked(MouseEvent evt) {
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
         Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new MainMenu()).setVisible(true);
         }
      });
   }
}
