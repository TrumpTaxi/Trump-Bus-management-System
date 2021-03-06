/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Staff;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author han
 */
public class deleteStaff extends javax.swing.JFrame {

    /**
     * Creates new form deleteStaff
     */
    public deleteStaff() {
        initComponents();
        try{
            staffTier st = new staffTier();
            ArrayList staffID = st.getStaffList();
            DefaultComboBoxModel model = (DefaultComboBoxModel)cb_staffID.getModel();
            for(int i=0; i<staffID.size();i++){
                String staffId = (String) staffID.get(i);
                model.addElement(staffId);
            }
                        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to retrieve Staff ID");
        }
        
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_staffID = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tf_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_hp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_birth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_salary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Staff");
        setMinimumSize(new java.awt.Dimension(360, 470));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Delete Staff");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(86, 29, 118, 28);

        cb_staffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_staffIDActionPerformed(evt);
            }
        });
        getContentPane().add(cb_staffID);
        cb_staffID.setBounds(100, 60, 90, 22);

        jLabel2.setText("Staff ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 52, 16);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blue-ok-icon (1).png"))); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 370, 97, 25);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Arrow-Back-icon (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 370, 80, 25);

        tf_name.setEditable(false);
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_name);
        tf_name.setBounds(95, 82, 168, 30);

        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(41, 93, 42, 16);

        jLabel7.setText("Handphone :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(12, 122, 73, 16);

        tf_hp.setEditable(false);
        getContentPane().add(tf_hp);
        tf_hp.setBounds(97, 111, 112, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Example : 016228776");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(214, 125, 92, 13);

        tf_birth.setEditable(false);
        getContentPane().add(tf_birth);
        tf_birth.setBounds(97, 140, 199, 30);

        jLabel5.setText("Brithday :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 151, 55, 16);

        jLabel6.setText("Salary : RM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(18, 177, 67, 16);

        tf_salary.setEditable(false);
        tf_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(tf_salary);
        tf_salary.setBounds(97, 169, 63, 30);

        tf_address.setEditable(false);
        tf_address.setColumns(20);
        tf_address.setRows(5);
        jScrollPane1.setViewportView(tf_address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(95, 206, 166, 96);

        jLabel8.setText("Address :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(28, 206, 55, 16);

        jLabel9.setText("Username :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(24, 312, 67, 16);

        jLabel11.setText("Password :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(24, 341, 64, 16);

        tf_username.setEditable(false);
        getContentPane().add(tf_username);
        tf_username.setBounds(96, 301, 209, 30);

        tf_password.setEditable(false);
        getContentPane().add(tf_password);
        tf_password.setBounds(93, 338, 211, 22);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 390, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = (String) cb_staffID.getSelectedItem();
        try{
            staffTier st = new staffTier();
            boolean success = st.deleteStaff(id);
            if (success){
                JOptionPane.showMessageDialog(this,"Record Staff's id "+id+" had been deleted.");
            }else
            JOptionPane.showMessageDialog(this, "Cannot found the record. Delete Failed.");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        staffSelect sds= new staffSelect();
        sds.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_salaryActionPerformed

    private void cb_staffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_staffIDActionPerformed
        try{
            staffTier st = new staffTier();
            String staffId = (String) cb_staffID.getSelectedItem();
            Staff s = new Staff();
            s.setStaffID(staffId);
            s = st.retrieveStaff(s);
            if(s==null)
            JOptionPane.showMessageDialog(null, "Fail to retrieve Staff record");
            else{
                tf_name.setText(s.getStaffName());
                tf_hp.setText(s.getHp());
                tf_birth.setText(s.getBirth());
                tf_salary.setText(s.getSalary()+"");
                tf_address.setText(s.getAddress());
                tf_username.setText(s.getUsername());
                tf_password.setText(s.getPassword());

            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to retrieve Bus details");
        }
    }//GEN-LAST:event_cb_staffIDActionPerformed

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
            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_staffID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tf_address;
    private javax.swing.JTextField tf_birth;
    private javax.swing.JTextField tf_hp;
    private javax.swing.JTextField tf_name;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_salary;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
