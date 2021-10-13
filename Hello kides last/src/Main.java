
import alphabet.alphabet_frame;
import brickbreaker.Gameplay;
import draw.SwingPaint;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.util.TimerTask;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    int GrassW, GrassH;
    int i, DefaultI;
    private MediaPlayer testMedia;

    public Main() {
        Dimension MyScreen = Toolkit.getDefaultToolkit().getScreenSize();
        GrassW = MyScreen.width;
        GrassH = 60;
        initComponents();
        getContentPane().setBackground(new Color(0, 168, 169));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        sound();
        FlyBird();
        Cursor();

    }

    void sound() {
        try {
            JFXPanel j = new JFXPanel();
            String uri = new File("YouTube Happy Music Pack - Upbeat Instrumental Background Music for Video.mp3").toURI().toString();
            testMedia = new MediaPlayer(new Media(uri));
            testMedia.play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    void Cursor() {
        //  this is the current frame you are using .
        //  You can change the this keyword with your frame name .

        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("clicker.png");
        Cursor a = toolkit.createCustomCursor(image, new Point(this.getX(), this.getY()), "");
        this.setCursor(a);
    }

    void FlyBird() {
        DefaultI = Bird.getX();
        i = Bird.getX();
        java.util.Timer t = new java.util.Timer();
        TimerTask tsk = new TimerTask() {

            @Override
            public void run() {
                if (i == 0 - Bird.getWidth()) {
                    Bird.setLocation(DefaultI + Bird.getWidth(), Bird.getLocation().y);
                    //Bird.setLocation(1280, Bird.getLocation().y);
                    i = DefaultI;
                }
                i--;
                Bird.setLocation(i, Bird.getLocation().y);

            }
        };
        t.schedule(tsk, 0, 5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Bird = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        insidePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_alphapet = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jbtn_numbers = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton_draw = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton_game = new javax.swing.JButton();
        Shadow = new javax.swing.JLabel();
        jLabeL_Girl = new javax.swing.JLabel();
        Tree = new javax.swing.JLabel();
        GrassLabel = new javax.swing.JLabel();
        Sun = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(0, 168, 169));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        Bird.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bird.setForeground(new java.awt.Color(255, 255, 255));
        Bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bird2_zpsc43abec4.gif"))); // NOI18N

        Menu.setBackground(new java.awt.Color(0, 168, 169));
        Menu.setLayout(null);

        insidePanel.setBackground(new java.awt.Color(0, 168, 169));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        jButton_alphapet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ABC.png"))); // NOI18N
        jButton_alphapet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alphapetActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_alphapet, "card2");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.CardLayout());

        jbtn_numbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1233.png"))); // NOI18N
        jbtn_numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_numbersActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_numbers, "card2");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.CardLayout());

        jButton_draw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP.png"))); // NOI18N
        jButton_draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_drawActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_draw, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        jButton_game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Games.png"))); // NOI18N
        jButton_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_gameActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_game, "card2");

        javax.swing.GroupLayout insidePanelLayout = new javax.swing.GroupLayout(insidePanel);
        insidePanel.setLayout(insidePanelLayout);
        insidePanelLayout.setHorizontalGroup(
            insidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insidePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(insidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insidePanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(insidePanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        insidePanelLayout.setVerticalGroup(
            insidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insidePanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(insidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(insidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        Menu.add(insidePanel);
        insidePanel.setBounds(30, 30, 250, 250);

        Shadow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinking.png"))); // NOI18N
        Shadow.setFocusTraversalPolicyProvider(true);
        Menu.add(Shadow);
        Shadow.setBounds(20, 0, 330, 310);

        jLabeL_Girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/girl.png"))); // NOI18N
        jLabeL_Girl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Tree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tree.png"))); // NOI18N
        Tree.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabeL_Girl)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Bird)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tree))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 87, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 163, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(Bird, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tree))
                            .addComponent(jLabeL_Girl, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        GrassLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/grass2.png")).getImage().getScaledInstance(GrassW, GrassH ,Image.SCALE_SMOOTH)));

        Sun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sun.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 136, 145));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete_48px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GrassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 285, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Sun)
                        .addGap(114, 114, 114))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Sun, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(524, 524, 524))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(GrassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // set cursor for frame and its component

    }//GEN-LAST:event_jPanel6MouseEntered

    private void jbtn_numbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_numbersActionPerformed
        Numbers n = new Numbers(this);
        testMedia.stop();
        n.setDefaultCloseOperation(Numbers.EXIT_ON_CLOSE);
        n.setVisible(true);
        //setVisible(false);

    }//GEN-LAST:event_jbtn_numbersActionPerformed

    private void jButton_alphapetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alphapetActionPerformed
        alphabet.alphabet_frame n = new alphabet_frame();
        testMedia.stop();
        n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        n.setVisible(true);
    }//GEN-LAST:event_jButton_alphapetActionPerformed

    private void jButton_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_gameActionPerformed
        JFrame obj = new JFrame();
        Gameplay gameplay = new Gameplay();
        //  mapgenerator map = new mapgenerator(3, 7);

        obj.setBounds(10, 10, 700, 600);
        obj.setTitle("Brick Breaker");
        obj.setResizable(true);

        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        obj.add(gameplay);
    }//GEN-LAST:event_jButton_gameActionPerformed

    private void jButton_drawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_drawActionPerformed

        SwingPaint n = new SwingPaint();
        n.show();


    }//GEN-LAST:event_jButton_drawActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);

    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bird;
    private javax.swing.JLabel GrassLabel;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Shadow;
    private javax.swing.JLabel Sun;
    private javax.swing.JLabel Tree;
    private javax.swing.JPanel insidePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_alphapet;
    private javax.swing.JButton jButton_draw;
    private javax.swing.JButton jButton_game;
    private javax.swing.JLabel jLabeL_Girl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtn_numbers;
    // End of variables declaration//GEN-END:variables
}
