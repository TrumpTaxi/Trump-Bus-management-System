/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author han
 */
public class updateMem extends javax.swing.JFrame {

    /**
     * Creates new form updateMem
     */
    public updateMem(String memID,String name,String gender,String hp,String username,String birth,String address) {
        initComponents();
        tf_memID.setText(memID);
        tf_name.setText(name);
        tf_hp.setText(hp);
        tf_address.setText(address);
        tf_gender.setText(gender);
        tf_birth.setText(birth);

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_name = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_gender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_hp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_birth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tf_memID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Personnel");
        setMinimumSize(new java.awt.Dimension(370, 460));
        getContentPane().setLayout(null);

        tf_name.setEditable(false);
        getContentPane().add(tf_name);
        tf_name.setBounds(120, 100, 132, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blue-ok-icon (1).png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 370, 110, 25);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Update Personnel Info");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 229, 28);

        jLabel2.setText("Member ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 70, 72, 16);

        tf_gender.setEditable(false);
        getContentPane().add(tf_gender);
        tf_gender.setBounds(120, 140, 70, 22);

        jLabel3.setText("Name :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 42, 16);

        tf_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_hpActionPerformed(evt);
            }
        });
        getContentPane().add(tf_hp);
        tf_hp.setBounds(120, 200, 111, 22);

        jLabel4.setText("Gender :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 50, 16);

        tf_birth.setEditable(false);
        getContentPane().add(tf_birth);
        tf_birth.setBounds(120, 170, 118, 22);

        jLabel5.setText("Handphone :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 200, 73, 16);

        jLabel6.setText("Address :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 240, 55, 16);

        tf_address.setColumns(20);
        tf_address.setRows(5);
        jScrollPane1.setViewportView(tf_address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 230, 180, 120);

        jLabel7.setText("Birthday :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 170, 55, 16);

        tf_memID.setEditable(false);
        getContentPane().add(tf_memID);
        tf_memID.setBounds(130, 70, 67, 22);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Button-Close-icon.png"))); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 370, 100, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Arrow-Back-icon (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 370, 90, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 350, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tf_hp.setText("");
        tf_address.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String MemId = tf_memID.getText();
        dispose();
        showMem sm = new showMem(MemId);
        sm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String memID = tf_memID.getText();
        String name = tf_name.getText();
        String gender = tf_gender.getText();
        String hp = tf_hp.getText();
        String birth = tf_birth.getText();
        String address = tf_address.getText();
        boolean valid = true;
        String invalid = "";
        
        //Handphone validation
        String handphone=tf_hp.getText();
        if(handphone.length()!=10){
            valid = false;
            invalid = "Handphone number should have 10 number";
        }
        for(int a=0;a<handphone.length();a++){
            char temp1 = handphone.charAt(a);
            if(Character.isLetter(temp1)==true){
                valid = false;
                invalid = "Please insert proper handphone number";
            }
        }
        
        if(valid){
        try{
            memberTier mt = new memberTier();
            boolean success = mt.updateMem(memID,name,gender,hp,address,birth);
                if (!success){
                    JOptionPane.showMessageDialog(this, "Error inserting new record");
                } else {
                    JOptionPane.showMessageDialog(this, "Update Success");
                    dispose();
                    String MemId = memID;
                    showMem sm = new showMem(MemId);
                    sm.setVisible(true);
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else
            JOptionPane.showMessageDialog(this,invalid);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_hpActionPerformed

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
            java.util.logging.Logger.getLogger(updateMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateMem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new updateMem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tf_address;
    private javax.swing.JTextField tf_birth;
    private javax.swing.JTextField tf_gender;
    private javax.swing.JTextField tf_hp;
    private javax.swing.JTextField tf_memID;
    private javax.swing.JTextField tf_name;
    // End of variables declaration//GEN-END:variables
}
