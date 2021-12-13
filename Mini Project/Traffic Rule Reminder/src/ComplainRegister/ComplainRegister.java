
package ComplainRegister;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ComplainRegister extends javax.swing.JFrame {

    public ComplainRegister() {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        ridingtripleseat = new javax.swing.JCheckBox();
        nohelmet = new javax.swing.JCheckBox();
        zebracrossing = new javax.swing.JCheckBox();
        usingmobilephone = new javax.swing.JCheckBox();
        overspeeding = new javax.swing.JCheckBox();
        fancynumber = new javax.swing.JCheckBox();
        jumpingredlight = new javax.swing.JCheckBox();
        illegalmodification = new javax.swing.JCheckBox();
        drinkanddrive = new javax.swing.JCheckBox();
        enter = new javax.swing.JButton();
        finalnumber = new javax.swing.JTextField();
        fnumber = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        rtocode1 = new javax.swing.JLabel();
        series1 = new javax.swing.JLabel();
        vehiclenumber1 = new javax.swing.JLabel();
        statecode1 = new javax.swing.JLabel();
        rtocode = new javax.swing.JTextField();
        series = new javax.swing.JTextField();
        vehiclenumber = new javax.swing.JTextField();
        statecode = new javax.swing.JTextField();
        subheading2 = new javax.swing.JLabel();
        subheading = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        mainframe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 560));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 250, 940, 2);

        ridingtripleseat.setText("Riding Triple Seat");
        getContentPane().add(ridingtripleseat);
        ridingtripleseat.setBounds(60, 340, 160, 21);

        nohelmet.setText("No Helmet");
        getContentPane().add(nohelmet);
        nohelmet.setBounds(60, 370, 160, 21);

        zebracrossing.setText("Crossing Zebra Crossing");
        getContentPane().add(zebracrossing);
        zebracrossing.setBounds(490, 370, 150, 21);

        usingmobilephone.setText("Using Mobile Phone");
        getContentPane().add(usingmobilephone);
        usingmobilephone.setBounds(280, 310, 170, 21);

        overspeeding.setText("Over Speeding");
        getContentPane().add(overspeeding);
        overspeeding.setBounds(280, 340, 170, 21);

        fancynumber.setText("Fancy Number Plate & Fiming");
        getContentPane().add(fancynumber);
        fancynumber.setBounds(280, 370, 170, 21);

        jumpingredlight.setText("Jumping Red Light");
        getContentPane().add(jumpingredlight);
        jumpingredlight.setBounds(490, 310, 150, 21);

        illegalmodification.setText("Illegal Modification");
        getContentPane().add(illegalmodification);
        illegalmodification.setBounds(490, 340, 150, 21);

        drinkanddrive.setText("Drink and Drive");
        drinkanddrive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkanddriveActionPerformed(evt);
            }
        });
        getContentPane().add(drinkanddrive);
        drinkanddrive.setBounds(60, 310, 160, 21);

        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });
        getContentPane().add(enter);
        enter.setBounds(690, 210, 90, 30);

        finalnumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalnumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(finalnumber);
        finalnumber.setBounds(220, 210, 180, 30);

        fnumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnumber.setText("ENTERED NUMBER: ");
        getContentPane().add(fnumber);
        fnumber.setBounds(90, 210, 130, 30);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-complain-64.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(10, 0, 90, 80);

        cancel.setBackground(new java.awt.Color(102, 204, 255));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 102, 102));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);
        cancel.setBounds(550, 440, 140, 50);

        submit.setBackground(new java.awt.Color(102, 204, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submit.setForeground(new java.awt.Color(102, 102, 102));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(240, 440, 140, 50);

        rtocode1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rtocode1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rtocode1.setText("RTO Code");
        getContentPane().add(rtocode1);
        rtocode1.setBounds(270, 120, 140, 15);

        series1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        series1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        series1.setText("Series");
        getContentPane().add(series1);
        series1.setBounds(450, 120, 140, 15);

        vehiclenumber1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vehiclenumber1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehiclenumber1.setText("Vehicle Number");
        getContentPane().add(vehiclenumber1);
        vehiclenumber1.setBounds(640, 120, 140, 15);

        statecode1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        statecode1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statecode1.setText("State Code");
        getContentPane().add(statecode1);
        statecode1.setBounds(90, 120, 140, 15);
        getContentPane().add(rtocode);
        rtocode.setBounds(270, 140, 140, 50);
        getContentPane().add(series);
        series.setBounds(450, 140, 140, 50);
        getContentPane().add(vehiclenumber);
        vehiclenumber.setBounds(640, 140, 140, 50);

        statecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statecodeActionPerformed(evt);
            }
        });
        getContentPane().add(statecode);
        statecode.setBounds(90, 140, 140, 50);

        subheading2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        subheading2.setText("TYPE OF VIOLATION");
        getContentPane().add(subheading2);
        subheading2.setBounds(90, 240, 380, 50);

        subheading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        subheading.setText("VEHICLE REGISTRATION NUMBER");
        getContentPane().add(subheading);
        subheading.setBounds(90, 70, 380, 50);

        heading.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Register Your Complaint");
        getContentPane().add(heading);
        heading.setBounds(0, 13, 930, 50);

        mainframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundcomplain.png"))); // NOI18N
        getContentPane().add(mainframe);
        mainframe.setBounds(0, 0, 930, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statecodeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionPerformed
    DefaultListModel model=new DefaultListModel();
    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        String a=statecode.getText();
        String b=rtocode.getText();
        String c=series.getText();
        String d=vehiclenumber.getText();
        String e=a.concat(b);
        String f=e.concat(c);
        String g=f.concat(d);
        finalnumber.setText(g);
    }//GEN-LAST:event_enterActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String details=finalnumber.getText();
        Submitvalues sv=new Submitvalues();
        sv.submit(details);
        dispose();
    }//GEN-LAST:event_submitActionPerformed

    private void drinkanddriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkanddriveActionPerformed
        Submitvalues sv=new Submitvalues();
        int countdd=0;
        if(drinkanddrive.isEnabled());
        {
            countdd++;
        }
        sv.countdrink(countdd);
    }//GEN-LAST:event_drinkanddriveActionPerformed

    
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
            java.util.logging.Logger.getLogger(ComplainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplainRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplainRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JCheckBox drinkanddrive;
    private javax.swing.JButton enter;
    private javax.swing.JCheckBox fancynumber;
    private javax.swing.JTextField finalnumber;
    private javax.swing.JLabel fnumber;
    private javax.swing.JLabel heading;
    private javax.swing.JCheckBox illegalmodification;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jumpingredlight;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mainframe;
    private javax.swing.JCheckBox nohelmet;
    private javax.swing.JCheckBox overspeeding;
    private javax.swing.JCheckBox ridingtripleseat;
    private javax.swing.JTextField rtocode;
    private javax.swing.JLabel rtocode1;
    private javax.swing.JTextField series;
    private javax.swing.JLabel series1;
    private javax.swing.JTextField statecode;
    private javax.swing.JLabel statecode1;
    private javax.swing.JLabel subheading;
    private javax.swing.JLabel subheading2;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox usingmobilephone;
    private javax.swing.JTextField vehiclenumber;
    private javax.swing.JLabel vehiclenumber1;
    private javax.swing.JCheckBox zebracrossing;
    // End of variables declaration//GEN-END:variables
}
