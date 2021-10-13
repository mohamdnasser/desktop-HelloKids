
import java.awt.Color;




public class NumberName extends javax.swing.JFrame {
    public NumberName() {
        initComponents();
        setBackground(new Color(0, 0, 0,0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titel = new javax.swing.JLabel();
        Om_El_Sora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(130, 93));
        setResizable(false);
        getContentPane().setLayout(null);

        Titel.setFont(new java.awt.Font("Bauhaus 93", 1, 18)); // NOI18N
        Titel.setForeground(new java.awt.Color(229, 99, 83));
        Titel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titel.setText("jLabel2");
        getContentPane().add(Titel);
        Titel.setBounds(0, 10, 130, 40);

        Om_El_Sora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Numbers/Picture6.png"))); // NOI18N
        getContentPane().add(Om_El_Sora);
        Om_El_Sora.setBounds(0, 0, 130, 93);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Om_El_Sora;
    public javax.swing.JLabel Titel;
    // End of variables declaration//GEN-END:variables
}
