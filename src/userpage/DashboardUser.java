package userpage;

import adminpage.*;
import java.awt.Color;
import authentication.LoginForm;
import config.Session;
import javax.swing.JOptionPane;

public class DashboardUser extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashboardUser() {
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

        dashboard_members = new javax.swing.JPanel();
        users_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        users_container = new javax.swing.JPanel();
        users_membersButton = new javax.swing.JPanel();
        users_accountLabel = new javax.swing.JLabel();
        adminhome_filler = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        users_productsButton = new javax.swing.JPanel();
        users_productsLabel = new javax.swing.JLabel();
        users_unnamedButton3 = new javax.swing.JPanel();
        users_unnamedLabel3 = new javax.swing.JLabel();
        users_logoutButton = new javax.swing.JPanel();
        users_logoutLabel = new javax.swing.JLabel();
        users_imageContainer = new javax.swing.JPanel();
        users_nameDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dashboard_members.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_header.setBackground(new java.awt.Color(121, 51, 65));
        users_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");
        users_header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 10));

        dashboard_members.add(users_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        users_container.setBackground(new java.awt.Color(183, 71, 52));
        users_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_membersButton.setBackground(new java.awt.Color(132, 72, 79));
        users_membersButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        users_membersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users_membersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users_membersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users_membersButtonMouseExited(evt);
            }
        });
        users_membersButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_accountLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users_accountLabel.setForeground(new java.awt.Color(255, 255, 255));
        users_accountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_accountLabel.setText("Account");
        users_membersButton.add(users_accountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        users_container.add(users_membersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 50));
        users_container.add(adminhome_filler, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, -30, 10, 410));

        users_productsButton.setBackground(new java.awt.Color(132, 72, 79));
        users_productsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        users_productsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users_productsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users_productsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users_productsButtonMouseExited(evt);
            }
        });
        users_productsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_productsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users_productsLabel.setForeground(new java.awt.Color(255, 255, 255));
        users_productsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_productsLabel.setText("Products");
        users_productsButton.add(users_productsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        users_container.add(users_productsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 50));

        users_unnamedButton3.setBackground(new java.awt.Color(132, 72, 79));
        users_unnamedButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        users_unnamedButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users_unnamedButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users_unnamedButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users_unnamedButton3MouseExited(evt);
            }
        });
        users_unnamedButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_unnamedLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users_unnamedLabel3.setForeground(new java.awt.Color(255, 255, 255));
        users_unnamedLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_unnamedLabel3.setText("-");
        users_unnamedButton3.add(users_unnamedLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        users_container.add(users_unnamedButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 130, 50));

        users_logoutButton.setBackground(new java.awt.Color(132, 72, 79));
        users_logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        users_logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users_logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                users_logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                users_logoutButtonMouseExited(evt);
            }
        });
        users_logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_logoutLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users_logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        users_logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_logoutLabel.setText("Logout");
        users_logoutButton.add(users_logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        users_container.add(users_logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 50));

        users_imageContainer.setBackground(new java.awt.Color(132, 72, 79));
        users_imageContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 132, 139), 1, true));
        users_imageContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users_nameDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        users_nameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        users_nameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users_nameDisplay.setText("[NAME]");
        users_imageContainer.add(users_nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        users_container.add(users_imageContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 360));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome User!");
        users_container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, -1));

        dashboard_members.add(users_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_members, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_members, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void users_membersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_membersButtonMouseExited
        users_membersButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_users_membersButtonMouseExited

    private void users_membersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_membersButtonMouseEntered
        users_membersButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_users_membersButtonMouseEntered

    private void users_membersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_membersButtonMouseClicked
        DashboardDetails accountPage = new DashboardDetails();
        accountPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_users_membersButtonMouseClicked

    private void users_productsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_productsButtonMouseClicked
        
    }//GEN-LAST:event_users_productsButtonMouseClicked

    private void users_productsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_productsButtonMouseEntered
        users_productsButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_users_productsButtonMouseEntered

    private void users_productsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_productsButtonMouseExited
        users_productsButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_users_productsButtonMouseExited

    private void users_unnamedButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_unnamedButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_users_unnamedButton3MouseClicked

    private void users_unnamedButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_unnamedButton3MouseEntered
        users_unnamedButton3.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_users_unnamedButton3MouseEntered

    private void users_unnamedButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_unnamedButton3MouseExited
        users_unnamedButton3.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_users_unnamedButton3MouseExited

    private void users_logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_logoutButtonMouseClicked
        LoginForm loginPage = new LoginForm();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_users_logoutButtonMouseClicked

    private void users_logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_logoutButtonMouseEntered
        users_logoutButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_users_logoutButtonMouseEntered

    private void users_logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_logoutButtonMouseExited
        users_logoutButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_users_logoutButtonMouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        int member_id = sess.getId();
        if(member_id == 0){
            JOptionPane.showMessageDialog(null, "No account, login first!");
            LoginForm lf = new LoginForm();
            lf.setVisible(true);
            this.dispose();
        }
        else{
            users_nameDisplay.setText(""+sess.getName());
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler adminhome_filler;
    private javax.swing.JPanel dashboard_members;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel users_accountLabel;
    private javax.swing.JPanel users_container;
    private javax.swing.JPanel users_header;
    private javax.swing.JPanel users_imageContainer;
    private javax.swing.JPanel users_logoutButton;
    private javax.swing.JLabel users_logoutLabel;
    private javax.swing.JPanel users_membersButton;
    private javax.swing.JLabel users_nameDisplay;
    private javax.swing.JPanel users_productsButton;
    private javax.swing.JLabel users_productsLabel;
    private javax.swing.JPanel users_unnamedButton3;
    private javax.swing.JLabel users_unnamedLabel3;
    // End of variables declaration//GEN-END:variables
}
