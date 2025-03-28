package page.user;

import java.awt.Color;
import page.authentication.LoginForm;
import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DashboardChangePass extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashboardChangePass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        details_account = new javax.swing.JPanel();
        details_header = new javax.swing.JPanel();
        details_idDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        details_container = new javax.swing.JPanel();
        details_userContainer = new javax.swing.JPanel();
        details_typeDisplay = new javax.swing.JLabel();
        details_nameDisplay = new javax.swing.JLabel();
        details_logoutButton = new javax.swing.JPanel();
        register_cancelLabel = new javax.swing.JLabel();
        details_passButton = new javax.swing.JPanel();
        register_passLabel = new javax.swing.JLabel();
        details_confirmLabel = new javax.swing.JLabel();
        details_passwordField = new javax.swing.JPasswordField();
        details_passwordLabel = new javax.swing.JLabel();
        details_confirmField = new javax.swing.JPasswordField();
        details_previousLabel = new javax.swing.JLabel();
        details_previousField = new javax.swing.JPasswordField();
        details_backButton = new javax.swing.JPanel();
        register_backLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        details_account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details_header.setBackground(new java.awt.Color(121, 51, 65));
        details_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details_idDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_idDisplay.setForeground(new java.awt.Color(255, 255, 255));
        details_idDisplay.setText("[ID]");
        details_header.add(details_idDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Account Information");
        details_header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        details_account.add(details_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        details_container.setBackground(new java.awt.Color(183, 71, 52));
        details_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details_userContainer.setBackground(new java.awt.Color(132, 72, 79));
        details_userContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 132, 139), 1, true));
        details_userContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details_typeDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_typeDisplay.setForeground(new java.awt.Color(255, 255, 255));
        details_typeDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details_typeDisplay.setText("User");
        details_userContainer.add(details_typeDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 30));

        details_nameDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_nameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        details_nameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details_nameDisplay.setText("[NAME]");
        details_userContainer.add(details_nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        details_container.add(details_userContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 360));

        details_logoutButton.setBackground(new java.awt.Color(132, 72, 79));
        details_logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        details_logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                details_logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                details_logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                details_logoutButtonMouseExited(evt);
            }
        });
        details_logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_cancelLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        register_cancelLabel.setForeground(new java.awt.Color(255, 255, 255));
        register_cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_cancelLabel.setText("Logout");
        details_logoutButton.add(register_cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 20));

        details_container.add(details_logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, -1));

        details_passButton.setBackground(new java.awt.Color(132, 72, 79));
        details_passButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        details_passButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                details_passButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                details_passButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                details_passButtonMouseExited(evt);
            }
        });
        details_passButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_passLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        register_passLabel.setForeground(new java.awt.Color(255, 255, 255));
        register_passLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_passLabel.setText("Confirm");
        details_passButton.add(register_passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 20));

        details_container.add(details_passButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 170, 20));

        details_confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        details_confirmLabel.setText("Confirm Password:");
        details_container.add(details_confirmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 20));

        details_passwordField.setBackground(new java.awt.Color(192, 132, 139));
        details_passwordField.setForeground(new java.awt.Color(255, 255, 255));
        details_container.add(details_passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 170, 30));

        details_passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        details_passwordLabel.setText("New Password:");
        details_container.add(details_passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, 20));

        details_confirmField.setBackground(new java.awt.Color(192, 132, 139));
        details_confirmField.setForeground(new java.awt.Color(255, 255, 255));
        details_container.add(details_confirmField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, 30));

        details_previousLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        details_previousLabel.setForeground(new java.awt.Color(255, 255, 255));
        details_previousLabel.setText("Previous Password: ");
        details_container.add(details_previousLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, 20));

        details_previousField.setBackground(new java.awt.Color(192, 132, 139));
        details_previousField.setForeground(new java.awt.Color(255, 255, 255));
        details_container.add(details_previousField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 170, 30));

        details_backButton.setBackground(new java.awt.Color(132, 72, 79));
        details_backButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        details_backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                details_backButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                details_backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                details_backButtonMouseExited(evt);
            }
        });
        details_backButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        register_backLabel.setForeground(new java.awt.Color(255, 255, 255));
        register_backLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_backLabel.setText("Back");
        details_backButton.add(register_backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 110, 20));

        details_container.add(details_backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 170, 20));

        details_account.add(details_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 380, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(details_account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(details_account, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        details_idDisplay.setText(""+sess.getId());
        details_nameDisplay.setText(""+sess.getName());

    }//GEN-LAST:event_formWindowActivated

    private void details_logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_logoutButtonMouseClicked
        LoginForm login = new LoginForm();

        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_details_logoutButtonMouseClicked

    private void details_logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_logoutButtonMouseEntered
        details_logoutButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_details_logoutButtonMouseEntered

    private void details_logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_logoutButtonMouseExited
        details_logoutButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_details_logoutButtonMouseExited

    private void details_passButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_passButtonMouseClicked
        try{
            dbConnector dbc = new dbConnector();
            Session sess = Session.getInstance();
            
            String query = "SELECT * FROM dashboard_members WHERE member_id" +sess.getId();
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                String olddbpass = resultSet.getString("member_password"), oldhash = passwordHasher.hashPassword(details_previousField.getText());
                
                
                if(olddbpass.equals(oldhash)){
                    String newPass = passwordHasher.hashPassword(details_passwordField.getText());
                    dbc.getData("UPDATE dashboard_members SET member_password = " +newPass);
                    JOptionPane.showMessageDialog(null, "Successfully Updated!");
                    LoginForm lg = new LoginForm();
                    lg.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Old Password is incorrect!");
                }
            }
        }
        catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_details_passButtonMouseClicked

    private void details_passButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_passButtonMouseEntered
        details_passButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_details_passButtonMouseEntered

    private void details_passButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_passButtonMouseExited
        details_passButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_details_passButtonMouseExited

    private void details_backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_backButtonMouseClicked
        DashboardDetails detailpage = new DashboardDetails();
        detailpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_details_backButtonMouseClicked

    private void details_backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_backButtonMouseEntered
        details_backButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_details_backButtonMouseEntered

    private void details_backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_details_backButtonMouseExited
        details_backButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_details_backButtonMouseExited

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
            java.util.logging.Logger.getLogger(DashboardChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel details_account;
    private javax.swing.JPanel details_backButton;
    private javax.swing.JPasswordField details_confirmField;
    private javax.swing.JLabel details_confirmLabel;
    private javax.swing.JPanel details_container;
    private javax.swing.JPanel details_header;
    private javax.swing.JLabel details_idDisplay;
    private javax.swing.JPanel details_logoutButton;
    private javax.swing.JLabel details_nameDisplay;
    private javax.swing.JPanel details_passButton;
    private javax.swing.JPasswordField details_passwordField;
    private javax.swing.JLabel details_passwordLabel;
    private javax.swing.JPasswordField details_previousField;
    private javax.swing.JLabel details_previousLabel;
    private javax.swing.JLabel details_typeDisplay;
    private javax.swing.JPanel details_userContainer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel register_backLabel;
    private javax.swing.JLabel register_cancelLabel;
    private javax.swing.JLabel register_passLabel;
    // End of variables declaration//GEN-END:variables
}
