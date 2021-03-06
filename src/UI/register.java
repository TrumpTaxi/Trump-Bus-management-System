package UI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        tf_birth = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_gender = new javax.swing.JComboBox<String>();
        tf_hp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_address = new javax.swing.JTextArea();
        tf_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        tf_password = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Member");
        setMinimumSize(new java.awt.Dimension(480, 480));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Register Member");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 180, 40);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-22, 70, 70, 16);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Handphone:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-21, 150, 100, 16);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-9, 180, 80, 16);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Birthday:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-19, 110, 80, 16);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Username:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-17, 300, 90, 16);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, 330, 90, 16);

        jLabel8.setText("Gender:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(220, 70, 46, 16);
        getContentPane().add(tf_name);
        tf_name.setBounds(60, 60, 152, 30);
        getContentPane().add(tf_birth);
        tf_birth.setBounds(70, 100, 79, 30);

        jLabel9.setText("(YYYY-MM-DD)");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 110, 84, 16);

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        getContentPane().add(cb_gender);
        cb_gender.setBounds(280, 60, 69, 22);
        getContentPane().add(tf_hp);
        tf_hp.setBounds(80, 140, 95, 30);

        jLabel10.setText("Example:0102222332");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 150, 123, 16);

        tf_address.setColumns(20);
        tf_address.setRows(5);
        jScrollPane1.setViewportView(tf_address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 180, 166, 96);
        getContentPane().add(tf_username);
        tf_username.setBounds(80, 292, 166, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Arrow-Back-icon.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(13, 370, 90, 33);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Button-Close-icon.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 370, 90, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Register-icon.png"))); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(210, 370, 110, 30);
        getContentPane().add(tf_password);
        tf_password.setBounds(80, 322, 170, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/q0YWfFw.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 460, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tf_name.setText("");
        tf_address.setText("");
        cb_gender.setSelectedIndex(0);
        tf_birth.setText("");
        tf_username.setText("");
        tf_password.setText("");
        tf_hp.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String name = tf_name.getText();
        String address = tf_address.getText();
        String gender = (String)cb_gender.getSelectedItem();
        String birth = tf_birth.getText();
        String username = tf_username.getText();
        String password = tf_password.getText();
        String hp = tf_hp.getText();
        
        boolean valid = true;
        String invalid = "";
        int tt = 0;
        int ttt = 0;
        //password validate
        for(int f=0;f<password.length();f++){
            char temp11 = password.charAt(f);
            if(Character.isLetter(temp11)==true){
                tt+=1;
            }
            if(Character.isDigit(temp11)==true){
                ttt+=1;                
            }
        }
        
        if(tt==0){
            valid=false;
        }
        if(ttt==0){
            valid=false;
        }
        
        if(password.length()<6)
            valid=false;
        
        //Birthday validation
        int day;
        int month;
        if (birth.matches("([0-9]{4})-([0-9]{2})-([0-9]{2})"))
            valid=true;
        else{
            valid=false;
            invalid="Invalid Birthday Date format";
        }
        if(valid){
            day = Integer.parseInt(birth.substring(8));
            month = Integer.parseInt(birth.substring(5,7));
            if(day>31){
                valid=false;
                invalid = "Invalid Date";
            }
            if(month>12){
                valid=false;
                invalid = "Invalid Month";
            }
            
        }
        
        try{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = sdf.parse(birth);
        Calendar cal = Calendar.getInstance();
        String today = sdf.format(cal.getTime());
        Date tod = sdf.parse(today);
        
        if(dd.after(tod))
            valid=false;
            invalid="Birthday Cannot be furture date";
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Fail to compare Date");
        }
                
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
            String success = mt.register(name,gender,hp,address,birth,username,password);
                if (success == null){
                    JOptionPane.showMessageDialog(this, "Error inserting new record");
                } else {
                    JOptionPane.showMessageDialog(this, "New record inserted, Returning to login page.");
                    
                    dispose();
                    login l = new login();
                    l.setVisible(true);
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
       }
       else
           JOptionPane.showMessageDialog(this, invalid);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
