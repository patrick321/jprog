/*
 * Diese Klasse erstellt ein Fenster, in dem ein BMI berechnet werden kann.
 * 
 */
package Main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick L. Schubert
 */
public class BMIRechner extends javax.swing.JFrame {

    Launch launch = new Launch("abc");
    public static String user;
    public static String path;
    int posX=0,posY=0;
    Connection conn = DBConnect.ConnectDB(path);;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    
    
    
    
    
    public BMIRechner() {
        user = launch.usernameString;
        path = launch.
        conn = DBConnect.ConnectDB(launch.fullpath);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save = new javax.swing.JButton();
        kg = new javax.swing.JTextField();
        bmiout = new javax.swing.JTextField();
        meter = new javax.swing.JTextField();
        hinweis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        reset = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        save.setText("Speichern");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));
        getContentPane().add(kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 145, -1));

        bmiout.setEditable(false);
        bmiout.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        bmiout.setForeground(new java.awt.Color(1, 1, 1));
        bmiout.setText("Ergebnis");
        bmiout.setFocusable(false);
        getContentPane().add(bmiout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 180, -1));
        getContentPane().add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 145, -1));

        hinweis.setEditable(false);
        hinweis.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        hinweis.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hinweis.setText("Hinweis");
        hinweis.setFocusable(false);
        getContentPane().add(hinweis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 180, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Gewicht in KG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 110, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Größe in m");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 126, -1));

        close.setBorder(null);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.setEnabled(false);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 40, 20));

        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setEnabled(false);
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 110, 70));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.setEnabled(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, -3, 20, 20));

        play.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        play.setEnabled(false);
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });
        getContentPane().add(play, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 140, 70));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bmibg.png"))); // NOI18N
        jLabel5.setText("ddf");
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(BMIRechner.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        // TODO add your handling code here:
        if(kg.getText().equals("")||meter.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Bitte alle Felder ausfüllen!","Fehler!", JOptionPane.ERROR_MESSAGE);
            kg.setText("");
            meter.setText("");
            bmiout.setText("Ergebnis");
            hinweis.setText("Hinweis");
            hinweis.setBackground(Color.white);
            return;
        }
        
        String inputKG= kg.getText();
        String inputMeter= meter.getText();
        
        
        double gewicht = Double.parseDouble(inputKG);
        double groesse = Double.parseDouble(inputMeter);
        
        double bmi = gewicht/(Math.pow(groesse,2));
        
        bmi*=100;
        bmi=Math.round(bmi);
        bmi/=100;
        String out = String.valueOf(bmi);
        
        bmiout.setText(out);
        
        
        if (bmi<20){
                hinweis.setText("Sie haben untergewicht!");
                hinweis.setBackground(Color.red);
        }else if (bmi<25){
                hinweis.setText("Ihr Gewicht ist optimal!");
                hinweis.setBackground(Color.white);
        }else{
                hinweis.setText("Sie haben übergewicht!");
                hinweis.setBackground(Color.red);
        }
        
        if (groesse <1.00){
            hinweis.setText("Du passt nicht in die Skala!");
            hinweis.setBackground(Color.blue);
        }
    }//GEN-LAST:event_playMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        kg.setText("");
        meter.setText("");
        bmiout.setText("Ergebnis");
        hinweis.setText("Hinweis");
        hinweis.setBackground(Color.white);
    }//GEN-LAST:event_resetMouseClicked

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
        setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        posX=jLabel1.getX();
        posY=jLabel1.getY();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here
        if(bmiout.getText().equals("Ergebnis")){
            JOptionPane.showMessageDialog(null, "Bitte zunächst BMI berechnen!");
        }else{
        try{
            String sql = "UPDATE userdata SET bmi=24, weight=23, height=22 WHERE username='"+user+"'";
            ps = conn.prepareStatement(sql);
            //ps.setString(1, bmiout.getText());
            //ps.setString(2, kg.getText());
            //ps.setString(3, meter.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Daten gespeicher!");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        finally{
            try{
                rs.close();
                ps.close();

            }
            catch(Exception e){

            }

        }
        }
        
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String [] args) {
      
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
            java.util.logging.Logger.getLogger(BMIRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIRechner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BMIRechner bmir = new BMIRechner();
                bmir.setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bmiout;
    private javax.swing.JLabel close;
    private javax.swing.JTextField hinweis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kg;
    private javax.swing.JTextField meter;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel play;
    private javax.swing.JLabel reset;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
