/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick
 */
public class Ausgabe extends javax.swing.JFrame {
    public String user = Launch.user;
    private int posX;
    private int posY;
    /**
     * Creates new form Ausgabe
     */
    public Ausgabe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Vorname = new javax.swing.JTextField();
        Nachname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        alter = new javax.swing.JTextField();
        gewicht = new javax.swing.JTextField();
        groesse = new javax.swing.JTextField();
        bmi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        hinweis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jButton1.setText("Werte ausgeben!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        Vorname.setEditable(false);
        Vorname.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        Vorname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Vorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, -1));

        Nachname.setEditable(false);
        Nachname.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        Nachname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Nachname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, -1));

        username.setEditable(false);
        username.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 120, -1));

        email.setEditable(false);
        email.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, -1));

        alter.setEditable(false);
        alter.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        alter.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 120, -1));

        gewicht.setEditable(false);
        gewicht.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        gewicht.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(gewicht, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 130, -1));

        groesse.setEditable(false);
        groesse.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        groesse.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(groesse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, -1));

        bmi.setEditable(false);
        bmi.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        bmi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(bmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 120, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Vorname");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Nachname");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Alter");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Gewicht");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Größe");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("BMI");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        hinweis.setEditable(false);
        hinweis.setFont(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        hinweis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(hinweis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 450, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/BMI-Rechnefr.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        exit.setText("jLabel10");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, -3, 40, 30));

        minimize.setText("jLabel10");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -3, 30, 30));

        jLabel10.setText("jLabel10");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel10MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Mysql sql = new Mysql();
            String vorname= sql.selectOne(user, "firstname");
            String nachname = sql.selectOne(user, "lastname");
            String usernamev = sql.selectOne(user, "username");
            String emailv = sql.selectOne(user, "email");
            String alterv = sql.selectOne(user, "age");
            String gewichtv = sql.selectOne(user, "weigth");
            String groessev = sql.selectOne(user, "height");
            String bmiv = sql.selectOne(user, "bmi");       
            
            Vorname.setText(vorname);
            Nachname.setText(nachname);
            username.setText(usernamev);
            email.setText(emailv);
            alter.setText(alterv);
            gewicht.setText(gewichtv);
            groesse.setText(groessev);
            bmi.setText(bmiv);
            
            double bmi = Double.parseDouble(bmiv);
            
            if(bmi<20){
                hinweis.setText("Du hast Untergewicht!");
                hinweis.setBackground(Color.red);
            }else if(bmi<25){
                hinweis.setText("Du hast Normalgewicht!");
                hinweis.setBackground(Color.WHITE);
            }else{
                hinweis.setText("Du hast Übergewicht!");
                hinweis.setBackground(Color.red);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "What?!");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here
        this.setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        posX=jLabel1.getX();
        posY=jLabel1.getY();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseDragged
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jLabel10MouseDragged

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
            java.util.logging.Logger.getLogger(Ausgabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ausgabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ausgabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ausgabe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ausgabe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nachname;
    private javax.swing.JTextField Vorname;
    private javax.swing.JTextField alter;
    public javax.swing.JTextField bmi;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField gewicht;
    private javax.swing.JTextField groesse;
    private javax.swing.JTextField hinweis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
