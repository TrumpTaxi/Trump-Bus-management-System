/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Domain.Driver;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tsang
 */
public class RetrieveDriver extends javax.swing.JFrame {

    /**
     * Creates new form RetrieveDriver
     */
    public RetrieveDriver() {
        initComponents();
        try{            
            driverTier dt = new driverTier();
            ArrayList driverID = dt.getDriverList();
            DefaultComboBoxModel model2 = (DefaultComboBoxModel)cb_driverID.getModel();
            for(int i=0; i<driverID.size();i++){
                String driverId = (String) driverID.get(i);
                model2.addElement(driverId);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to retrieve Driver ID");
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

        tf_hp = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        tf_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_birth = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextArea();
        tf_salary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cb_driverID = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Retrieve Driver");
        setMinimumSize(new java.awt.Dimension(370, 450));
        getContentPane().setLayout(null);

        tf_hp.setEditable(false);
        getContentPane().add(tf_hp);
        tf_hp.setBounds(98, 109, 112, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blue-ok-icon (1).png"))); // NOI18N
        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 360, 100, 25);

        tf_name.setEditable(false);
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        getContentPane().add(tf_name);
        tf_name.setBounds(76, 80, 168, 30);

        jLabel9.setText("Bus In Charge :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 321, 89, 16);

        jLabel7.setText("Handphone :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 120, 73, 16);

        jLabel6.setText("Salary : RM");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 178, 67, 16);

        jLabel5.setText("Address :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(29, 204, 55, 16);

        tf_birth.setEditable(false);
        getContentPane().add(tf_birth);
        tf_birth.setBounds(95, 138, 183, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Retrieve Driver");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(76, 13, 161, 28);

        tf_address.setEditable(false);
        tf_address.setColumns(20);
        tf_address.setRows(5);
        jScrollPane1.setViewportView(tf_address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(96, 204, 166, 96);

        tf_salary.setEditable(false);
        tf_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(tf_salary);
        tf_salary.setBounds(99, 167, 63, 30);

        jLabel4.setText("Driver ID :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 62, 59, 16);

        jLabel1.setText("Name :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(27, 91, 42, 16);

        cb_driverID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_driverIDActionPerformed(evt);
            }
        });
        getContentPane().add(cb_driverID);
        cb_driverID.setBounds(76, 59, 90, 22);

        jLabel3.setText("Brithday :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(28, 149, 55, 16);

        jTextField7.setEditable(false);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(106, 318, 80, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 350, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        DriverSelection ds= new DriverSelection();
        ds.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void tf_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_salaryActionPerformed

    private void cb_driverIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_driverIDActionPerformed
        String id = (String) cb_driverID.getSelectedItem();
                try{
                    driverTier dt= new driverTier();
                        Driver d = dt.retriveStaff(id);
                        if(d != null){
                            tf_name.setText(d.getDriverName());
                            tf_hp.setText(Integer.toString(d.getHp()));
                            tf_address.setText(d.getAddress());
                            tf_birth.setText(d.getBirth());
                            tf_salary.setText(Double.toString(d.getSalary()));
                            jTextField7.setText(d.getBusID());
                        }else
                            JOptionPane.showMessageDialog(this,"Driver not found");
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
    }//GEN-LAST:event_cb_driverIDActionPerformed

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
            java.util.logging.Logger.getLogger(RetrieveDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetrieveDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetrieveDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetrieveDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetrieveDriver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_driverID;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextArea tf_address;
    private javax.swing.JTextField tf_birth;
    private javax.swing.JTextField tf_hp;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_salary;
    // End of variables declaration//GEN-END:variables
}
