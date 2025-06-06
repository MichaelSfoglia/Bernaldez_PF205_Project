package page.admin;

import java.awt.Color;
import page.authentication.LoginForm;
import config.Session;
import javax.swing.JOptionPane;

public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashboardAdmin() {
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

        dashboard_admin = new javax.swing.JPanel();
        admin_header = new javax.swing.JPanel();
        admin_title = new javax.swing.JLabel();
        admin_container = new javax.swing.JPanel();
        adminhome_membersButton = new javax.swing.JPanel();
        adminhome_membersLabel = new javax.swing.JLabel();
        adminhome_productsButton = new javax.swing.JPanel();
        adminhome_productsLabel = new javax.swing.JLabel();
        adminhome_logoutButton = new javax.swing.JPanel();
        adminhome_logoutLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        adminhome_nameDisplay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        dashboard_admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_header.setBackground(new java.awt.Color(121, 51, 65));
        admin_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admin_title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        admin_title.setForeground(new java.awt.Color(255, 255, 255));
        admin_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin_title.setText("Home");
        admin_header.add(admin_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 10));

        dashboard_admin.add(admin_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        admin_container.setBackground(new java.awt.Color(183, 71, 52));
        admin_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_membersButton.setBackground(new java.awt.Color(132, 72, 79));
        adminhome_membersButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        adminhome_membersButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminhome_membersButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminhome_membersButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminhome_membersButtonMouseExited(evt);
            }
        });
        adminhome_membersButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_membersLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_membersLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_membersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_membersLabel.setText("Members");
        adminhome_membersButton.add(adminhome_membersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        admin_container.add(adminhome_membersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 130, 50));

        adminhome_productsButton.setBackground(new java.awt.Color(132, 72, 79));
        adminhome_productsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        adminhome_productsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminhome_productsButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminhome_productsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminhome_productsButtonMouseExited(evt);
            }
        });
        adminhome_productsButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_productsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_productsLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_productsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_productsLabel.setText("Products");
        adminhome_productsButton.add(adminhome_productsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        admin_container.add(adminhome_productsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 50));

        adminhome_logoutButton.setBackground(new java.awt.Color(132, 72, 79));
        adminhome_logoutButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        adminhome_logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminhome_logoutButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminhome_logoutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminhome_logoutButtonMouseExited(evt);
            }
        });
        adminhome_logoutButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_logoutLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_logoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_logoutLabel.setText("Logout");
        adminhome_logoutButton.add(adminhome_logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        admin_container.add(adminhome_logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 130, 50));

        jPanel1.setBackground(new java.awt.Color(132, 72, 79));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 132, 139), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_nameDisplay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_nameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_nameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_nameDisplay.setText("[NAME]");
        jPanel1.add(adminhome_nameDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 30));

        admin_container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 360));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome Admin!");
        admin_container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 130, -1));

        dashboard_admin.add(admin_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 340, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminhome_membersButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_membersButtonMouseExited
        adminhome_membersButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_adminhome_membersButtonMouseExited

    private void adminhome_membersButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_membersButtonMouseEntered
        adminhome_membersButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_adminhome_membersButtonMouseEntered

    private void adminhome_membersButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_membersButtonMouseClicked
        DashboardMembers membersPage = new DashboardMembers();
        membersPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminhome_membersButtonMouseClicked

    private void adminhome_productsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_productsButtonMouseClicked
        
    }//GEN-LAST:event_adminhome_productsButtonMouseClicked

    private void adminhome_productsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_productsButtonMouseEntered
        adminhome_productsButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_adminhome_productsButtonMouseEntered

    private void adminhome_productsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_productsButtonMouseExited
        adminhome_productsButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_adminhome_productsButtonMouseExited

    private void adminhome_logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_logoutButtonMouseClicked
        LoginForm loginPage = new LoginForm();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminhome_logoutButtonMouseClicked

    private void adminhome_logoutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_logoutButtonMouseEntered
        adminhome_logoutButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_adminhome_logoutButtonMouseEntered

    private void adminhome_logoutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_logoutButtonMouseExited
        adminhome_logoutButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_adminhome_logoutButtonMouseExited

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
            adminhome_nameDisplay.setText(""+sess.getName());
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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel admin_container;
    private javax.swing.JPanel admin_header;
    private javax.swing.JLabel admin_title;
    private javax.swing.JPanel adminhome_logoutButton;
    private javax.swing.JLabel adminhome_logoutLabel;
    private javax.swing.JPanel adminhome_membersButton;
    private javax.swing.JLabel adminhome_membersLabel;
    private javax.swing.JLabel adminhome_nameDisplay;
    private javax.swing.JPanel adminhome_productsButton;
    private javax.swing.JLabel adminhome_productsLabel;
    private javax.swing.JPanel dashboard_admin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
