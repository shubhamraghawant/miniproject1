package Login.Page;

import MainProcess.LoginService;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passwordlogo = new javax.swing.JLabel();
        useridlogo = new javax.swing.JLabel();
        resetbutton = new javax.swing.JButton();
        loginbutton = new javax.swing.JButton();
        userlogintitle = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        mainlogo = new javax.swing.JLabel();
        mainheading = new javax.swing.JLabel();
        rightimage = new javax.swing.JLabel();
        mainpanel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TRR Login-Page");
        setMinimumSize(new java.awt.Dimension(1000, 615));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 340, 130, 50);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" User ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 260, 130, 50);

        passwordlogo.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\icons8-password-16.png")); // NOI18N
        getContentPane().add(passwordlogo);
        passwordlogo.setBounds(220, 340, 50, 50);

        useridlogo.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\icons8-collaborator-male-16.png")); // NOI18N
        getContentPane().add(useridlogo);
        useridlogo.setBounds(220, 260, 50, 50);

        resetbutton.setBackground(new java.awt.Color(102, 102, 102));
        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetbutton.setForeground(new java.awt.Color(255, 255, 255));
        resetbutton.setText("RESET");
        resetbutton.setBorder(null);
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(resetbutton);
        resetbutton.setBounds(280, 430, 120, 50);

        loginbutton.setBackground(new java.awt.Color(102, 102, 102));
        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("LOGIN");
        loginbutton.setBorder(null);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton);
        loginbutton.setBounds(120, 430, 120, 50);

        userlogintitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userlogintitle.setForeground(new java.awt.Color(153, 153, 153));
        userlogintitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userlogintitle.setText("USER LOGIN");
        getContentPane().add(userlogintitle);
        userlogintitle.setBounds(80, 210, 360, 30);

        userid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userid.setForeground(new java.awt.Color(153, 153, 153));
        userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        getContentPane().add(userid);
        userid.setBounds(250, 260, 150, 50);

        password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        getContentPane().add(password);
        password.setBounds(250, 340, 150, 50);

        mainlogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainlogo.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\Logo.jpg")); // NOI18N
        getContentPane().add(mainlogo);
        mainlogo.setBounds(80, 110, 360, 90);

        mainheading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mainheading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainheading.setText("TRAFFIC RULE REMINDER");
        getContentPane().add(mainheading);
        mainheading.setBounds(80, 60, 360, 50);

        rightimage.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\Login Page Side .png")); // NOI18N
        rightimage.setText("jLabel3");
        getContentPane().add(rightimage);
        rightimage.setBounds(440, 50, 490, 480);

        mainpanel.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\white.jpg")); // NOI18N
        mainpanel.setText("jLabel2");
        getContentPane().add(mainpanel);
        mainpanel.setBounds(80, 50, 850, 480);

        background.setIcon(new javax.swing.ImageIcon("D:\\Mini Project\\Images\\yellow.jpg")); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background);
        background.setBounds(0, 0, 1000, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        int user = Integer.parseInt(userid.getText());
        int pass = Integer.parseInt(password.getText());
        LoginService ls = new LoginService();
        if (ls.login(user, pass) == 1)
        {
            JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL");
        } 
        else
            JOptionPane.showMessageDialog(null, "LOGIN FAILED");
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        userid.setText("");
        password.setText("");
    }//GEN-LAST:event_resetbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel mainheading;
    private javax.swing.JLabel mainlogo;
    private javax.swing.JLabel mainpanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordlogo;
    private javax.swing.JButton resetbutton;
    private javax.swing.JLabel rightimage;
    private javax.swing.JTextField userid;
    private javax.swing.JLabel useridlogo;
    private javax.swing.JLabel userlogintitle;
    // End of variables declaration//GEN-END:variables
}
