/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinesation;

import Data.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rionna
 */
public class Welcome extends javax.swing.JFrame {

    private  Data.EmpData emp;
    public  String idNumber;
    public Employee employ;

    /**
     * Creates new form Welcome
     */
    public Welcome() throws SQLException {
        initComponents();
        
       emp=new EmpData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        cbShowPassword = new javax.swing.JCheckBox();
        edtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        edtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label1.setText("label1");

        label3.setText("label3");

        textField1.setText("textField1");

        textField3.setText("textField3");

        cbShowPassword.setBackground(new java.awt.Color(0, 0, 0));
        cbShowPassword.setForeground(java.awt.Color.green);
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 241, 8));
        jLabel1.setText("ID Number:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.green);
        jLabel2.setText("Password");

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setForeground(java.awt.Color.green);
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel3.setForeground(java.awt.Color.green);
        jLabel3.setText("CineSation");

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setForeground(new java.awt.Color(51, 255, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addComponent(cbShowPassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtID)
                                    .addComponent(edtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        // TODO add your handling code here:
        
        if (cbShowPassword.isSelected())
        {
            edtPassword.setEchoChar((char) 0);
        }
        else
        {
            edtPassword.setEchoChar('•'); 
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       
            // TODO add your handling code here:
            idNumber= edtID.getText();
            
            String password= edtPassword.getText();
            
        
            
            employ= new Employee();
            List<Employee> empList= new ArrayList();
            empList=emp.getEmpArray();
            
            Boolean login=false;
            for(int i=0;i<empList.size();i++){
                employ=empList.get(i);
                
                //System.out.println(employ.toString());
                //System.out.println(employ.getEmpID().equals(idNumber));
                
            
               if(employ.getEmpID().equals(idNumber))
                {
                    //System.out.println(employ.getEmpPassword().equals(password));
                    if(employ.getEmpPassword().equals(password))
                    {
                        login=true;
                        try {
                            //new MainMenu(employ).setVisible(true);
                            //new MainMenu(password)
                        this.dispose();
                        new MainMenu(employ).setVisible(true);
                        } catch (SQLException ex) {
                            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
            
           if(login==true)
            {
                
            }
            else
           {
               JOptionPane.showMessageDialog(null,"Invalid Password","ERROR", JOptionPane.ERROR_MESSAGE);
                edtPassword.setText("");
                edtPassword.requestFocus();
            }
        
            
        
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Welcome().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JTextField edtID;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Panel panel1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
