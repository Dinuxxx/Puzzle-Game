/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package slide.puzzle;


import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Options extends javax.swing.JFrame {

    /**
     * Creates new form Options
     */
    static String gameType ;
    
    public Options() {
        initComponents();
        this.SetgameType(gameType);
        setSize(800, 540);
        
        

    }
    public void SetgameType(String gameType){
        if(jRadioButton7.isSelected()== true){
            gameType = "normal";
        }
        else{
            gameType = "optional";
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(630, 430, 80, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maximum Movements  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 190, 260, 30);

        jLabel3.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Time Countdown");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 300, 210, 24);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton1.setText("200");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(170, 240, 60, 28);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton2.setText("300");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(340, 240, 60, 28);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton4.setText("180 S");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(170, 340, 70, 28);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton5.setText("300 S");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(340, 340, 98, 28);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton6.setText("450 S");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(510, 340, 98, 28);

        jRadioButton7.setFont(new java.awt.Font("Snap ITC", 1, 18)); // NOI18N
        jRadioButton7.setForeground(java.awt.SystemColor.controlLtHighlight);
        jRadioButton7.setText("Normal Level");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton7);
        jRadioButton7.setBounds(130, 120, 190, 29);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jRadioButton3.setText("400");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(500, 240, 60, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/puzzle/2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Audio audio2 = new Audio("gameJump.wav");
        if(!jRadioButton7.isSelected() && (!(jRadioButton1.isSelected()||jRadioButton2.isSelected()||jRadioButton3.isSelected())&&(!(jRadioButton4.isSelected()||jRadioButton5.isSelected()||jRadioButton6.isSelected())))){
            JOptionPane.showMessageDialog(rootPane, "Please select Level or Options that you want!", "Select Option", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(jRadioButton7.isSelected()== true){
            this.setVisible(false);
            Puzzle puzzle = new Puzzle();
            puzzle.setVisible(true);
        }
        else if(!(jRadioButton1.isSelected()||jRadioButton2.isSelected()||jRadioButton3.isSelected())){
            
            JOptionPane.showMessageDialog(rootPane, "Please select maximum movements as given here!", "Select Option", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!(jRadioButton4.isSelected()||jRadioButton5.isSelected()||jRadioButton6.isSelected())){
            
            JOptionPane.showMessageDialog(rootPane, "Please select Time countdown!", "Select Option", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            gameType = "optional";
            this.setVisible(false);
            Puzzle puzzle = new Puzzle();
            puzzle.setVisible(true);
            
            if (jRadioButton1.isSelected()){
                puzzle.count = 200;
            }
            else if(jRadioButton2.isSelected()){
                puzzle.count = 300;
            }
            else if(jRadioButton3.isSelected()){
                puzzle.count = 400;
            }

            if (jRadioButton4.isSelected()){
                puzzle.seconds = 180;
            }
            else if(jRadioButton5.isSelected()){
                puzzle.seconds = 300;
            }
            else if(jRadioButton6.isSelected()){
                puzzle.seconds = 450;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

        Audio audio4 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        Audio audio9 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        Audio audio5 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        Audio audio3 = new Audio("gameClick.wav");
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        jRadioButton4.setEnabled(false);
        jRadioButton5.setEnabled(false);
        jRadioButton6.setEnabled(false);
        gameType = "normal";   
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        Audio audio6 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        Audio audio7 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        Audio audio8 = new Audio("gameClick.wav");
    }//GEN-LAST:event_jRadioButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Options.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    // End of variables declaration//GEN-END:variables
}
