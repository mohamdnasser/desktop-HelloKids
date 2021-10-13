
import java.awt.Color;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Numbers extends javax.swing.JFrame {
    
    Main main;

    public Numbers(Main m) {
        this.setUndecorated(true);
        initComponents();
        getContentPane().setBackground(new Color(0, 168, 169));  //Color 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen

        main = m;
    }
    public Numbers() {
        this.setUndecorated(true);
        initComponents();
        getContentPane().setBackground(new Color(0, 168, 169));  //Color 
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); //FullScreen

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BodyPanel = new javax.swing.JPanel();
        four = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        five = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        nine = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        seven = new javax.swing.JLabel();
        six = new javax.swing.JLabel();
        ballona = new javax.swing.JLabel();
        logo123 = new javax.swing.JLabel();
        HeaderPanel = new javax.swing.JPanel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BodyPanel.setBackground(new java.awt.Color(77, 194, 195));

        four.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/4.png"))); // NOI18N
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fourMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fourMouseExited(evt);
            }
        });

        one.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/1.png"))); // NOI18N
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oneMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                oneMouseReleased(evt);
            }
        });

        two.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/2.png"))); // NOI18N
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                twoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                twoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                twoMouseReleased(evt);
            }
        });

        three.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/3.png"))); // NOI18N
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                threeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                threeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                threeMouseReleased(evt);
            }
        });

        five.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/5.png"))); // NOI18N
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fiveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fiveMouseExited(evt);
            }
        });

        ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/10.png"))); // NOI18N
        ten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tenMouseExited(evt);
            }
        });

        nine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/9.png"))); // NOI18N
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nineMouseExited(evt);
            }
        });

        eight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/8.png"))); // NOI18N
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eightMouseExited(evt);
            }
        });

        seven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/7.png"))); // NOI18N
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sevenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sevenMouseExited(evt);
            }
        });

        six.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/6.png"))); // NOI18N
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sixMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sixMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyPanelLayout.createSequentialGroup()
                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(five)
                    .addComponent(four)
                    .addComponent(one)
                    .addComponent(two)
                    .addComponent(three))
                .addGap(30, 30, 30)
                .addGroup(BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ten)
                    .addComponent(nine)
                    .addComponent(six)
                    .addComponent(seven)
                    .addComponent(eight))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ballona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo2.png"))); // NOI18N

        logo123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbersa.png"))); // NOI18N

        HeaderPanel.setBackground(new java.awt.Color(0, 136, 145));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left-arrow-key.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPanelLayout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logo123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ballona)))
                .addGap(82, 82, 82))
            .addComponent(HeaderPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(ballona))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo123)))
                .addGap(18, 18, 18)
                .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
NumberName n1 = new NumberName();
    private void oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseEntered
//        ImageIcon s = new ImageIcon(getClass().getResource("/Numbers/picture1.png"));
//        one.setIcon(s);

        n1.Titel.setText("One");
        n1.setLocation(one.getLocationOnScreen().x, one.getLocationOnScreen().y - 95);
        
        n1.setVisible(true);

    }//GEN-LAST:event_oneMouseEntered

    private void oneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseExited
//        ImageIcon s = new ImageIcon(getClass().getResource("/Numbers/1.png"));
//        one.setIcon(s);
        n1.dispose();
    }//GEN-LAST:event_oneMouseExited

    private void oneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseReleased
        
    }//GEN-LAST:event_oneMouseReleased

    private void oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneMouseClicked
        // TODO add your handling code here:
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("1.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_oneMouseClicked
    NumberName n2 = new NumberName();
    private void twoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseEntered
        // TODO add your handling code here:
//        ImageIcon num2 = new ImageIcon(getClass().getResource("/Numbers/picture 2.png"));
//        two.setIcon(num2);
        n2.Titel.setText("Two");
        n2.setLocation(two.getLocationOnScreen().x, two.getLocationOnScreen().y - 95);
        n2.setVisible(true);
    }//GEN-LAST:event_twoMouseEntered

    private void twoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseExited
        // TODO add your handling code here:
//        ImageIcon num2 = new ImageIcon(getClass().getResource("/Numbers/2.png"));
//        two.setIcon(num2);
        n2.dispose();
    }//GEN-LAST:event_twoMouseExited

    private void twoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseReleased
        
    }//GEN-LAST:event_twoMouseReleased

    private void twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoMouseClicked
        
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("2.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_twoMouseClicked
    NumberName n3 = new NumberName();
    private void threeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseEntered
        n3.Titel.setText("Three");
        n3.setLocation(three.getLocationOnScreen().x, three.getLocationOnScreen().y - 95);
        n3.setVisible(true);
        
    }//GEN-LAST:event_threeMouseEntered

    private void threeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseExited
        // TODO add your handling code here:
//        ImageIcon num3 = new ImageIcon(getClass().getResource("/Numbers/3.png"));
//        three.setIcon(num3);
        n3.dispose();
    }//GEN-LAST:event_threeMouseExited

    private void threeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseReleased
        
    }//GEN-LAST:event_threeMouseReleased

    private void threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeMouseClicked
        // TODO add your handling code here:
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("3.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_threeMouseClicked
    NumberName n4 = new NumberName();
    private void fourMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseEntered
        
        n4.Titel.setText("Four");
        n4.setLocation(four.getLocationOnScreen().x, four.getLocationOnScreen().y - 95);
        n4.setVisible(true);
        
    }//GEN-LAST:event_fourMouseEntered

    private void fourMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseExited
        n4.dispose();
    }//GEN-LAST:event_fourMouseExited

    private void fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourMouseClicked
        
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("4.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_fourMouseClicked
    NumberName n5 = new NumberName();
    private void fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("5.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_fiveMouseClicked

    private void fiveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseExited
        n5.dispose();
    }//GEN-LAST:event_fiveMouseExited

    private void fiveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveMouseEntered
        // TODO add your handling code here:
        n5.Titel.setText("Five");
        n5.setLocation(five.getLocationOnScreen().x, five.getLocationOnScreen().y - 95);
        n5.setVisible(true);
    }//GEN-LAST:event_fiveMouseEntered
    NumberName n6 = new NumberName();
    private void sixMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseEntered
        n6.Titel.setText("Six");
        n6.setLocation(six.getLocationOnScreen().x, six.getLocationOnScreen().y - 95);
        n6.setVisible(true);
    }//GEN-LAST:event_sixMouseEntered

    private void sixMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseExited
        
        n6.dispose();
    }//GEN-LAST:event_sixMouseExited

    private void sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("6.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_sixMouseClicked
    NumberName n7 = new NumberName();
    private void sevenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseEntered
        n7.Titel.setText("Seven");
        n7.setLocation(seven.getLocationOnScreen().x, seven.getLocationOnScreen().y - 95);
        n7.setVisible(true);
    }//GEN-LAST:event_sevenMouseEntered

    private void sevenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseExited
        n7.dispose();
    }//GEN-LAST:event_sevenMouseExited

    private void sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("7.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_sevenMouseClicked
    NumberName n8 = new NumberName();
    private void eightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseEntered
        n8.Titel.setText("Eight");
        n8.setLocation(eight.getLocationOnScreen().x, eight.getLocationOnScreen().y - 95);
        n8.setVisible(true);
    }//GEN-LAST:event_eightMouseEntered

    private void eightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseExited
        n8.dispose();
    }//GEN-LAST:event_eightMouseExited

    private void eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("8.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_eightMouseClicked
    NumberName n9 = new NumberName();
    private void nineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseEntered
        n9.Titel.setText("Nine");
        n9.setLocation(nine.getLocationOnScreen().x, nine.getLocationOnScreen().y - 95);
        n9.setVisible(true);
    }//GEN-LAST:event_nineMouseEntered

    private void nineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseExited
        n9.dispose();
    }//GEN-LAST:event_nineMouseExited

    private void nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("9.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_nineMouseClicked
    NumberName n10 = new NumberName();
    private void tenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenMouseEntered
        n10.Titel.setText("Ten");
        n10.setLocation(ten.getLocationOnScreen().x, ten.getLocationOnScreen().y - 95);
        n10.setVisible(true);
    }//GEN-LAST:event_tenMouseEntered

    private void tenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenMouseExited
        n10.dispose();
    }//GEN-LAST:event_tenMouseExited

    private void tenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenMouseClicked
        try {
            JFXPanel h = new JFXPanel();
            String uri = new File("10.mp3").toURI().toString();
            new MediaPlayer(new Media(uri)).play();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_tenMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        main.setVisible(true);
        main.sound();
    }//GEN-LAST:event_backMouseClicked
    
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
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numbers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel ballona;
    private javax.swing.JLabel eight;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel logo123;
    private javax.swing.JLabel nine;
    private javax.swing.JLabel one;
    private javax.swing.JLabel seven;
    private javax.swing.JLabel six;
    private javax.swing.JLabel ten;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    // End of variables declaration//GEN-END:variables
}
