/*
 * empLogFrame.java
 *
 * Created on December 29, 2003, 10:52 PM
 */

package server;

import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author  mfahim
 */
public class empLogFrame extends javax.swing.JFrame {

    /** Creates new form empLogFrame */
    public empLogFrame() {
        initComponents();
        emp = new Employee();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/images/icon.png"));
        this.setTitle(login.getText());
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();  
        Rectangle recframe = getBounds();  
        setLocation((screen.width - recframe.width)/2, (screen.height - recframe.height)/2);  
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choicePanel = new javax.swing.JPanel();
        gotoBack = new javax.swing.JButton();
        empLogo = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        logInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gotoBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        gotoBack.setText("Back");
        gotoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoBackActionPerformed(evt);
            }
        });

        empLogo.setFont(new java.awt.Font("Times New Roman", 3, 24));
        empLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empLogo.setText("Employee Login");

        pass.setFont(new java.awt.Font("Tahoma", 1, 11));
        pass.setText("Password : ");

        user.setFont(new java.awt.Font("Tahoma", 1, 11));
        user.setText("Username :");

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        logInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInfo.setText("Enter Username and Password to login.");

        org.jdesktop.layout.GroupLayout choicePanelLayout = new org.jdesktop.layout.GroupLayout(choicePanel);
        choicePanel.setLayout(choicePanelLayout);
        choicePanelLayout.setHorizontalGroup(
            choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, empLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .add(choicePanelLayout.createSequentialGroup()
                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, choicePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(gotoBack)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(logInfo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, choicePanelLayout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(choicePanelLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(pass))
                            .add(user))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(username, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .add(password, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .add(57, 57, 57)))
                .addContainerGap())
            .add(choicePanelLayout.createSequentialGroup()
                .add(194, 194, 194)
                .add(cancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(login, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        choicePanelLayout.setVerticalGroup(
            choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, choicePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(empLogo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 42, Short.MAX_VALUE)
                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(user)
                    .add(username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(22, 22, 22)
                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(pass)
                    .add(password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(37, 37, 37)
                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(login, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(24, 24, 24)
                .add(choicePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(gotoBack)
                    .add(logInfo))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(choicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(choicePanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void gotoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoBackActionPerformed
    choiceFrame cFrame = new choiceFrame(this);
    cFrame.setVisible(true);
}//GEN-LAST:event_gotoBackActionPerformed

private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
    rsEmp = emp.verify_employee(username.getText(),password.getPassword(),"Employee");
        try {
            if (rsEmp.next()) {
                newProduct pFrame = new newProduct(this,rsEmp.getString("status"),rsEmp.getString("employee_username"));
                pFrame.setVisible(true);
            }//GEN-LAST:event_loginActionPerformed
            else
                logInfo.setText("Error :: Incorrect  Name or Password ::");
        } catch (SQLException ex) {
            Logger.getLogger(empLogFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
}                                     

private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
username.setText("");
password.setText("");
}//GEN-LAST:event_cancelActionPerformed

private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_passwordActionPerformed

    private Employee emp;
    private ResultSet rsEmp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JPanel choicePanel;
    private javax.swing.JLabel empLogo;
    private javax.swing.JButton gotoBack;
    private javax.swing.JLabel logInfo;
    private javax.swing.JButton login;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel user;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
