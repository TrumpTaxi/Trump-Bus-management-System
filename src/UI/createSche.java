/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Bus;
import domain.Scheduler;
import domain.Seat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author han
 */
public class createSche extends javax.swing.JFrame {

    /**
     * Creates new form createSche
     */
    public createSche(String newID) {
        initComponents();
        tf_scheID.setText(newID);
        try{
            busTier bt = new busTier();
            ArrayList busID = bt.getBusList();
            DefaultComboBoxModel model = (DefaultComboBoxModel)cb_busID.getModel();
            for(int i=0; i<busID.size();i++){
                String busId = (String) busID.get(i);
                model.addElement(busId);
            }
            driverTier dt = new driverTier();
            ArrayList driverID = dt.getDriverList();
            DefaultComboBoxModel model2 = (DefaultComboBoxModel)cb_driverID.getModel();
            for(int i=0; i<driverID.size();i++){
                String driverId = (String) driverID.get(i);
                model2.addElement(driverId);
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to retrieve record");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_scheID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_scheD = new javax.swing.JTextField();
        tf_scheT = new javax.swing.JTextField();
        tf_dest = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cb_busID = new javax.swing.JComboBox<String>();
        cb_driverID = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_vip = new javax.swing.JTextField();
        tf_normal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_seatP = new javax.swing.JTextField();
        tf_vipp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Schedule");
        setMinimumSize(new java.awt.Dimension(389, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Create New Schedule");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(115, 18, 219, 28);

        jLabel2.setText("Schedule ID :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(34, 62, 77, 16);

        tf_scheID.setEditable(false);
        getContentPane().add(tf_scheID);
        tf_scheID.setBounds(116, 59, 148, 22);

        jLabel3.setText("Schedule Date :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 97, 91, 16);

        jLabel4.setText("Time Departure :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 132, 99, 16);

        jLabel5.setText("Destination :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(39, 167, 72, 16);

        jLabel6.setText("Bus ID :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(66, 196, 45, 16);

        jLabel7.setText("Driver ID :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(52, 227, 59, 16);
        getContentPane().add(tf_scheD);
        tf_scheD.setBounds(116, 86, 148, 30);
        getContentPane().add(tf_scheT);
        tf_scheT.setBounds(116, 121, 47, 30);
        getContentPane().add(tf_dest);
        tf_dest.setBounds(116, 156, 244, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/blue-ok-icon (1).png"))); // NOI18N
        jButton1.setText("Add Schedule");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 340, 131, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Arrow-Back-icon (1).png"))); // NOI18N
        jButton2.setText("Back to Selection");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(200, 340, 160, 30);

        jLabel8.setText("(YYYY-MM-DD)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(276, 97, 84, 16);

        cb_busID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_busIDActionPerformed(evt);
            }
        });
        getContentPane().add(cb_busID);
        cb_busID.setBounds(116, 193, 80, 22);

        getContentPane().add(cb_driverID);
        cb_driverID.setBounds(116, 224, 80, 22);

        jLabel9.setText("Example : 1430");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(175, 132, 89, 16);

        jLabel10.setText("Number of Normal Seat :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(12, 267, 144, 16);

        jLabel11.setText("Number of VIP Seat :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(34, 302, 122, 16);

        tf_vip.setEditable(false);
        getContentPane().add(tf_vip);
        tf_vip.setBounds(168, 299, 33, 22);

        tf_normal.setEditable(false);
        getContentPane().add(tf_normal);
        tf_normal.setBounds(168, 264, 33, 22);

        jLabel12.setText("Price : RM");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(213, 267, 59, 16);

        jLabel13.setText("Price : RM");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(213, 302, 59, 16);
        getContentPane().add(tf_seatP);
        tf_seatP.setBounds(277, 264, 70, 30);
        getContentPane().add(tf_vipp);
        tf_vipp.setBounds(277, 299, 70, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 410, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_busIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_busIDActionPerformed
        String busID = (String) cb_busID.getSelectedItem();
        try{
            busTier bt = new busTier();
            Bus b = new Bus();
            b.setBusID(busID);
            b = bt.retrieveBus(b);
            if(b==null)
                JOptionPane.showMessageDialog(null, "Fail to retrieve bus record");
            else{
                tf_normal.setText(b.getSeat()+"");
                tf_vip.setText(b.getVip()+"");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to retrieve bus'seat  record");
        }
        
        
    }//GEN-LAST:event_cb_busIDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        scheChoice sc = new scheChoice();
        sc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String scheID = tf_scheID.getText();
        String scheD = tf_scheD.getText();
        String scheT = tf_scheT.getText();
        int seat = Integer.parseInt(tf_normal.getText());
        int vip = Integer.parseInt(tf_vip.getText());
        String busID = (String)cb_busID.getSelectedItem();
        String dest = tf_dest.getText();
        String driverID = (String)cb_driverID.getSelectedItem();
        String seatpp = tf_seatP.getText();
        String vippp = tf_vipp.getText();
        
        boolean valid = true;
        String invalid = "";
        
        int day;
        int month;
        if (scheD.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})"))
            valid=true;
        else{
            valid=false;
            invalid = "Invalid Schedule Date Format";
        }
        if(valid){
            day = Integer.parseInt(scheD.substring(8));
            month = Integer.parseInt(scheD.substring(5,7));
            if(day>31){
                valid=false;
                invalid = "Invalid Date";
            }
            if(month>12){
                valid=false;
                invalid = "Invalid Month";
            }
        }
        if(valid){
            try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            String today = sdf.format(cal.getTime());
            Date tod = sdf.parse(today);
            Date d = sdf.parse(scheD);
            if(d.before(tod)==true){
                valid=false;
                invalid = "Invalid Date, Cannot create Schedule for the past.";
            }
            
            }catch(Exception ex){
                System.out.println(ex);
            }
                
        }
        
        
        for(int a=0;a<seatpp.length();a++){
            char temp1 = seatpp.charAt(a);
            if(Character.isLetter(temp1)==true){
                valid = false;
                invalid = "Please insert only number for Seat Number";
            }
        }
        
        for(int i=0;i<vippp.length();i++){
            char temp = vippp.charAt(i);
            if(Character.isLetter(temp)==true){
                valid = false;
                invalid = "Please insert only number for Seat Number";
            }
        }
        
        
        for(int o=0;o<scheT.length();o++){
            char temp3 = scheT.charAt(o);
            if(Character.isLetter(temp3)){
                valid = false;
                invalid = "Invalid Time Format";
            }
        }
       
        if(scheT.length()!=4){
            valid = false;
            invalid = "Invalid Time Format.\nPlease Enter 24 hours Format";
        }else{
            String hh = scheT.substring(0,2);
            int h = Integer.parseInt(hh);
            String mm = scheT.substring(2);
            int m = Integer.parseInt(mm);
            if(h>23||m>59){
                valid = false;
                invalid = "Invalid Time\nPlease Enter 24 hours Format";
            }
        }
        
        
        if(valid){
        try{
        double seatP = Double.parseDouble(seatpp);
        double vipp = Double.parseDouble(vippp);
            Seat s = new Seat();
            s.setNormal(seat);
            s.setPriceN(seatP);
            s.setPriceVip(vipp);
            s.setScheID(scheID);
            s.setVip(vip);
                                    
            Scheduler sc = new Scheduler();
            sc.setBusID(busID);
            sc.setDeparture(scheT);
            sc.setDest(dest);
            sc.setDriverID(driverID);
            sc.setScheDate(scheD);
            sc.setScheID(scheID);            
            
            SeatTier st = new SeatTier();
            boolean success = st.addNewSeat(s);
            System.out.println("here2");
            if(!success)
                JOptionPane.showMessageDialog(null, "Fail to add Seat");
            else{
                scheTier sct = new scheTier();
                boolean success2 = sct.addSche(sc);
                if(!success2)
                    JOptionPane.showMessageDialog(null, "Fail to add schedule");
                else{
                    JOptionPane.showMessageDialog(null, "Schedule had added successfully.");
                    dispose();
                    scheChoice schoice = new scheChoice();
                    schoice.setVisible(true);
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fail to add new schedule");
        }
        }
        else
            JOptionPane.showMessageDialog(null, invalid);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(createSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createSche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new createSche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_busID;
    private javax.swing.JComboBox<String> cb_driverID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_dest;
    private javax.swing.JTextField tf_normal;
    private javax.swing.JTextField tf_scheD;
    private javax.swing.JTextField tf_scheID;
    private javax.swing.JTextField tf_scheT;
    private javax.swing.JTextField tf_seatP;
    private javax.swing.JTextField tf_vip;
    private javax.swing.JTextField tf_vipp;
    // End of variables declaration//GEN-END:variables
}
