package adminpage;

import config.dbConnector;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class DashboardCreate extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public DashboardCreate() {
        initComponents();
    }
    
    public static String email, username;

    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM dashboard_database WHERE member_name " +create_nameField.getText() 
                    + " AND member_password " +create_emailField.getText() + "";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("member_email");
                if(email.equals(create_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    create_emailField.setText("");
                }
                username = resultSet.getString("member_name");
                if(email.equals(create_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    create_nameField.setText(""); 
                }
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ex){
            System.out.println("" +ex);
            return false;
        }
    }
    DashboardAdmin admin = new DashboardAdmin();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerContainer = new javax.swing.JPanel();
        create_imageContainer = new javax.swing.JPanel();
        create_formContainer = new javax.swing.JPanel();
        create_nameLabel = new javax.swing.JLabel();
        create_nameField = new javax.swing.JTextField();
        create_passwordLabel = new javax.swing.JLabel();
        create_passwordField = new javax.swing.JPasswordField();
        create_typeLabel = new javax.swing.JLabel();
        create_typeBox = new javax.swing.JComboBox<>();
        create_emailLabel = new javax.swing.JLabel();
        create_emailField = new javax.swing.JTextField();
        create_contactLabel = new javax.swing.JLabel();
        create_contactField = new javax.swing.JTextField();
        create_cancelButton = new javax.swing.JPanel();
        create_cancelLabel = new javax.swing.JLabel();
        create_addButton = new javax.swing.JPanel();
        create_addLabel = new javax.swing.JLabel();
        create_confirmLabel = new javax.swing.JLabel();
        create_confirmField = new javax.swing.JPasswordField();
        create_statusBox = new javax.swing.JComboBox<>();
        create_statusLabel = new javax.swing.JLabel();
        create_cancelButton1 = new javax.swing.JPanel();
        create_cancelLabel1 = new javax.swing.JLabel();
        create_addButton1 = new javax.swing.JPanel();
        create_addLabel1 = new javax.swing.JLabel();
        create_headerContainer = new javax.swing.JPanel();
        create_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        registerContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_imageContainer.setBackground(new java.awt.Color(132, 71, 71));
        create_imageContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        registerContainer.add(create_imageContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 420));

        create_formContainer.setBackground(new java.awt.Color(183, 71, 52));
        create_formContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_nameLabel.setText("Name:");
        create_formContainer.add(create_nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        create_nameField.setBackground(new java.awt.Color(192, 132, 139));
        create_nameField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(create_nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));

        create_passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_passwordLabel.setText("Password:");
        create_formContainer.add(create_passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        create_passwordField.setBackground(new java.awt.Color(192, 132, 139));
        create_passwordField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(create_passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 30));

        create_typeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_typeLabel.setText("User Type:");
        create_formContainer.add(create_typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        create_typeBox.setBackground(new java.awt.Color(192, 132, 139));
        create_typeBox.setForeground(new java.awt.Color(255, 255, 255));
        create_typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        create_formContainer.add(create_typeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 30));

        create_emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_emailLabel.setText("Email:");
        create_formContainer.add(create_emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        create_emailField.setBackground(new java.awt.Color(192, 132, 139));
        create_emailField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(create_emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 30));

        create_contactLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_contactLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_contactLabel.setText("Contact Number:");
        create_formContainer.add(create_contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        create_contactField.setBackground(new java.awt.Color(192, 132, 139));
        create_contactField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(create_contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 30));

        create_cancelButton.setBackground(new java.awt.Color(132, 72, 79));
        create_cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_cancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_cancelButtonMouseExited(evt);
            }
        });
        create_cancelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_cancelLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_cancelLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_cancelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_cancelLabel.setText("Cancel");
        create_cancelButton.add(create_cancelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, 20));

        create_addButton.setBackground(new java.awt.Color(132, 72, 79));
        create_addButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_addButtonMouseExited(evt);
            }
        });
        create_addButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_addLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_addLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_addLabel.setText("Add");
        create_addButton.add(create_addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 80, 20));

        create_confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_confirmLabel.setText("Confirm Password:");
        create_formContainer.add(create_confirmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        create_confirmField.setBackground(new java.awt.Color(192, 132, 139));
        create_confirmField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(create_confirmField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        create_statusBox.setBackground(new java.awt.Color(192, 132, 139));
        create_statusBox.setForeground(new java.awt.Color(255, 255, 255));
        create_statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        create_formContainer.add(create_statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 30));

        create_statusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_statusLabel.setText("Status");
        create_formContainer.add(create_statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        create_cancelButton1.setBackground(new java.awt.Color(132, 72, 79));
        create_cancelButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_cancelButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_cancelButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_cancelButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_cancelButton1MouseExited(evt);
            }
        });
        create_cancelButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_cancelLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_cancelLabel1.setForeground(new java.awt.Color(255, 255, 255));
        create_cancelLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_cancelLabel1.setText("Update");
        create_cancelButton1.add(create_cancelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_cancelButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 20));

        create_addButton1.setBackground(new java.awt.Color(132, 72, 79));
        create_addButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_addButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_addButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_addButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_addButton1MouseExited(evt);
            }
        });
        create_addButton1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_addLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_addLabel1.setForeground(new java.awt.Color(255, 255, 255));
        create_addLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_addLabel1.setText("Delete");
        create_addButton1.add(create_addLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_addButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 80, 20));

        registerContainer.add(create_formContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 190, 420));

        create_headerContainer.setBackground(new java.awt.Color(121, 51, 65));
        create_headerContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_title.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_title.setForeground(new java.awt.Color(255, 255, 255));
        create_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_title.setText("Create Account");
        create_headerContainer.add(create_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 100, 30));

        registerContainer.add(create_headerContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(registerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButtonMouseClicked
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_create_cancelButtonMouseClicked

    private void create_addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButtonMouseClicked
        if(create_nameField.getText().isEmpty() && create_passwordField.getPassword().length == 0 
                && create_emailField.getText().isEmpty() && create_contactField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }
        else if(create_passwordField.getPassword().length < 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
        }
        else if(duplicateCheck()){
            System.out.println("Duplicate exists");
        }
        else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO dashboard_members (member_name, member_password, member_position, member_email, member_contact, member_status) VALUES ('" + create_nameField.getText() + "', '" + create_passwordField.getText() + "', '" + create_typeBox.getSelectedItem() + "', '" + create_emailField.getText() + "', '" + create_contactField.getText() + "', 'Pending')")){
                JOptionPane.showMessageDialog(null, "Registered Successfully!");
                
                admin.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_create_addButtonMouseClicked

    private void create_cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButtonMouseEntered
        create_cancelButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_cancelButtonMouseEntered

    private void create_cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButtonMouseExited
        create_cancelButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_cancelButtonMouseExited

    private void create_addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButtonMouseEntered
        create_addButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_addButtonMouseEntered

    private void create_addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButtonMouseExited
        create_addButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_addButtonMouseExited

    private void create_addButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_addButton1MouseClicked

    private void create_addButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_create_addButton1MouseEntered

    private void create_addButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_create_addButton1MouseExited

    private void create_cancelButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_cancelButton1MouseClicked

    private void create_cancelButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_create_cancelButton1MouseEntered

    private void create_cancelButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButton1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_create_cancelButton1MouseExited

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
            java.util.logging.Logger.getLogger(DashboardCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCreate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardCreate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel create_addButton;
    private javax.swing.JPanel create_addButton1;
    private javax.swing.JLabel create_addLabel;
    private javax.swing.JLabel create_addLabel1;
    private javax.swing.JPanel create_cancelButton;
    private javax.swing.JPanel create_cancelButton1;
    private javax.swing.JLabel create_cancelLabel;
    private javax.swing.JLabel create_cancelLabel1;
    private javax.swing.JPasswordField create_confirmField;
    private javax.swing.JLabel create_confirmLabel;
    private javax.swing.JTextField create_contactField;
    private javax.swing.JLabel create_contactLabel;
    private javax.swing.JTextField create_emailField;
    private javax.swing.JLabel create_emailLabel;
    private javax.swing.JPanel create_formContainer;
    private javax.swing.JPanel create_headerContainer;
    private javax.swing.JPanel create_imageContainer;
    private javax.swing.JTextField create_nameField;
    private javax.swing.JLabel create_nameLabel;
    private javax.swing.JPasswordField create_passwordField;
    private javax.swing.JLabel create_passwordLabel;
    private javax.swing.JComboBox<String> create_statusBox;
    private javax.swing.JLabel create_statusLabel;
    private javax.swing.JLabel create_title;
    private javax.swing.JComboBox<String> create_typeBox;
    private javax.swing.JLabel create_typeLabel;
    private javax.swing.JPanel registerContainer;
    // End of variables declaration//GEN-END:variables
}
