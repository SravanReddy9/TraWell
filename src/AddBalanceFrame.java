
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author me
 */
public class AddBalanceFrame extends javax.swing.JFrame implements AllFrames{
    
    /**
     * Creates new form AddBalanceFrame
     */
        
    public AddBalanceFrame() {
        initComponents();
        System.gc();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enterMoneyLabel = new javax.swing.JLabel();
        enterMoneyTextField = new javax.swing.JTextField();
        addBalanceBackButton = new javax.swing.JButton();
        addBalanceButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        passwordtextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enterMoneyLabel.setText("Enter money to be added to wallet :               (INR)");

        enterMoneyTextField.setText("50");
        enterMoneyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterMoneyTextFieldActionPerformed(evt);
            }
        });

        addBalanceBackButton.setText("Back");
        addBalanceBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBalanceBackButtonActionPerformed(evt);
            }
        });

        addBalanceButton.setText("Add Balance");
        addBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBalanceButtonActionPerformed(evt);
            }
        });

        passwordLabel.setText("Enter Password : ");

        passwordtextField.setText("jPasswordField1");
        passwordtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addBalanceBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterMoneyLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addComponent(addBalanceButton))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBalanceBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterMoneyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterMoneyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addBalanceButton)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBalanceBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBalanceBackButtonActionPerformed
        // TODO add your handling code here:
        passwordtextField.setText("jPasswordField1");
        enterMoneyTextField.setText("50");
        this.setVisible(false);
//        if(hf == null)
//            hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_addBalanceBackButtonActionPerformed

    private void addBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBalanceButtonActionPerformed
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","OOPlite");
            
            String sql = "update user_info set Wallet = ? where UserID=?";
            String str = "select * from user_info where UserID=? and Password = ? ";
            PreparedStatement pstmt1 = conn.prepareStatement(sql);
            PreparedStatement pstmt2 = conn.prepareStatement(str);
            pstmt1.setString(2, Login_Frame.uid);
            pstmt2.setString(1, Login_Frame.uid);
            String abfpwd = passwordtextField.getText();
                String abfhpwd="";
                for(int x =0;x<abfpwd.length();x++){
                    abfhpwd = abfhpwd + (char)((int)abfpwd.charAt(x)+1); 
                }
            pstmt2.setString(2, abfhpwd);
            ResultSet rs = pstmt2.executeQuery();
                if(rs.next()){
                    pstmt1.setInt(1, Integer.parseInt(rs.getString("Wallet"))+Integer.parseInt(enterMoneyTextField.getText()));
                    pstmt1.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Wallet Balance updated successfully!");
                    passwordtextField.setText("jPasswordField1");
                    enterMoneyTextField.setText("50");
                    this.setVisible(false);
                    hf.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"INVALID PASSWORD!!");
                }
            conn.close();
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addBalanceButtonActionPerformed

    private void passwordtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextFieldActionPerformed

    private void enterMoneyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterMoneyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterMoneyTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddBalanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBalanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBalanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBalanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                abf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBalanceBackButton;
    private javax.swing.JButton addBalanceButton;
    private javax.swing.JLabel enterMoneyLabel;
    private javax.swing.JTextField enterMoneyTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordtextField;
    // End of variables declaration//GEN-END:variables
    
}