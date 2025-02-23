/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adminpage;

import java.awt.Color;
import authentication.LoginForm;

/**
 *
 * @author champ
 */
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

        dashboard_members = new javax.swing.JPanel();
        members_header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        members_container = new javax.swing.JPanel();
        adminhome_membersButton = new javax.swing.JPanel();
        adminhome_membersLabel = new javax.swing.JLabel();
        adminhome_filler = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        adminhome_productsButton = new javax.swing.JPanel();
        adminhome_productsLabel = new javax.swing.JLabel();
        adminhome_unnamedButton2 = new javax.swing.JPanel();
        adminhome_unnamedLabel2 = new javax.swing.JLabel();
        adminhome_unnamedButton3 = new javax.swing.JPanel();
        adminhome_unnamedLabel3 = new javax.swing.JLabel();
        adminhome_logoutButton = new javax.swing.JPanel();
        adminhome_logoutLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard_members.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        members_header.setBackground(new java.awt.Color(121, 51, 65));
        members_header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin");
        members_header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 170, 10));

        dashboard_members.add(members_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 30));

        members_container.setBackground(new java.awt.Color(183, 71, 52));
        members_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        members_container.add(adminhome_membersButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 50));
        members_container.add(adminhome_filler, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, -30, 10, 410));

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

        members_container.add(adminhome_productsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 130, 50));

        adminhome_unnamedButton2.setBackground(new java.awt.Color(132, 72, 79));
        adminhome_unnamedButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        adminhome_unnamedButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton2MouseExited(evt);
            }
        });
        adminhome_unnamedButton2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_unnamedLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_unnamedLabel2.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_unnamedLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_unnamedLabel2.setText("-");
        adminhome_unnamedButton2.add(adminhome_unnamedLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        members_container.add(adminhome_unnamedButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 130, 50));

        adminhome_unnamedButton3.setBackground(new java.awt.Color(132, 72, 79));
        adminhome_unnamedButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        adminhome_unnamedButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminhome_unnamedButton3MouseExited(evt);
            }
        });
        adminhome_unnamedButton3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminhome_unnamedLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminhome_unnamedLabel3.setForeground(new java.awt.Color(255, 255, 255));
        adminhome_unnamedLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminhome_unnamedLabel3.setText("-");
        adminhome_unnamedButton3.add(adminhome_unnamedLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        members_container.add(adminhome_unnamedButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 130, 50));

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

        members_container.add(adminhome_logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 130, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome Admin!");
        members_container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 210, 40));

        dashboard_members.add(members_container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 710, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_members, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dashboard_members, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void adminhome_unnamedButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton2MouseClicked
        
    }//GEN-LAST:event_adminhome_unnamedButton2MouseClicked

    private void adminhome_unnamedButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton2MouseEntered
        adminhome_unnamedButton2.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_adminhome_unnamedButton2MouseEntered

    private void adminhome_unnamedButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton2MouseExited
        adminhome_unnamedButton2.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_adminhome_unnamedButton2MouseExited

    private void adminhome_unnamedButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminhome_unnamedButton3MouseClicked

    private void adminhome_unnamedButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton3MouseEntered
        adminhome_unnamedButton3.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_adminhome_unnamedButton3MouseEntered

    private void adminhome_unnamedButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminhome_unnamedButton3MouseExited
        adminhome_unnamedButton3.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_adminhome_unnamedButton3MouseExited

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
    private javax.swing.Box.Filler adminhome_filler;
    private javax.swing.JPanel adminhome_logoutButton;
    private javax.swing.JLabel adminhome_logoutLabel;
    private javax.swing.JPanel adminhome_membersButton;
    private javax.swing.JLabel adminhome_membersLabel;
    private javax.swing.JPanel adminhome_productsButton;
    private javax.swing.JLabel adminhome_productsLabel;
    private javax.swing.JPanel adminhome_unnamedButton2;
    private javax.swing.JPanel adminhome_unnamedButton3;
    private javax.swing.JLabel adminhome_unnamedLabel2;
    private javax.swing.JLabel adminhome_unnamedLabel3;
    private javax.swing.JPanel dashboard_members;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel members_container;
    private javax.swing.JPanel members_header;
    // End of variables declaration//GEN-END:variables
}
