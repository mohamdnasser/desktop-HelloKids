
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberClass extends JPanel {

    JLabel MyImage = new JLabel();

    public NumberClass(int i) {

        setPreferredSize(new java.awt.Dimension(130, 140));
        setBackground(new Color(0, 0, 0, 0));
        MyImage.setIcon(new ImageIcon(getClass().getResource("/Numbers/" + i + ".png")));

        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MyImage)
                                .addGap(0, 270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MyImage)
                                .addGap(0, 167, Short.MAX_VALUE))
        );

        
    }

}
