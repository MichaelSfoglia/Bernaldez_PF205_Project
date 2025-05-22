package page.admin;

import config.dbConnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DashboardCreateUser extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public DashboardCreateUser() {
        initComponents();
    }
    
    public static String email, username;
    public String destination = "", oldpath, path;
    File selectedFile;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
        ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
        int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public boolean duplicateCheck(){
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM dashboard_members WHERE member_name " +createuser_nameField.getText() 
                    + " AND member_email " +createuser_emailField.getText() + "";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("member_email");
                if(email.equals(createuser_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    createuser_emailField.setText("");
                }
                username = resultSet.getString("member_name");
                if(email.equals(createuser_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    createuser_nameField.setText(""); 
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
    
    public boolean updateCheck(){
        dbConnector dbc = new dbConnector();
        try{
            String query = "SELECT * FROM dashboard_database WHERE (member_name " +createuser_nameField.getText() 
                    + " OR member_email " +createuser_emailField.getText() + ") AND member_id != " + createuser_idField.getText();
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("member_email");
                if(email.equals(createuser_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    createuser_emailField.setText("");
                }
                username = resultSet.getString("member_name");
                if(email.equals(createuser_emailField.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    createuser_nameField.setText(""); 
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
    DashboardMembers members = new DashboardMembers();
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
        create_imageArea = new javax.swing.JLabel();
        create_selectimageButton = new javax.swing.JPanel();
        create_selectimageLabel = new javax.swing.JLabel();
        create_removeimageButton = new javax.swing.JPanel();
        create_create_removeLabel = new javax.swing.JLabel();
        create_formContainer = new javax.swing.JPanel();
        create_nameLabel = new javax.swing.JLabel();
        createuser_nameField = new javax.swing.JTextField();
        create_passwordLabel = new javax.swing.JLabel();
        createuser_passwordField = new javax.swing.JPasswordField();
        create_typeLabel = new javax.swing.JLabel();
        createuser_typeBox = new javax.swing.JComboBox<>();
        create_emailLabel = new javax.swing.JLabel();
        createuser_emailField = new javax.swing.JTextField();
        create_contactLabel = new javax.swing.JLabel();
        createuser_contactField = new javax.swing.JTextField();
        create_cancelButton = new javax.swing.JPanel();
        create_cancelLabel = new javax.swing.JLabel();
        create_addButton = new javax.swing.JPanel();
        create_addLabel = new javax.swing.JLabel();
        create_confirmLabel = new javax.swing.JLabel();
        createuser_confirmField = new javax.swing.JPasswordField();
        createuser_statusBox = new javax.swing.JComboBox<>();
        create_statusLabel = new javax.swing.JLabel();
        create_updateButton = new javax.swing.JPanel();
        create_cancelLabel1 = new javax.swing.JLabel();
        create_deleteButton = new javax.swing.JPanel();
        create_deleteLabel = new javax.swing.JLabel();
        create_clearButton = new javax.swing.JPanel();
        create_clearLabel = new javax.swing.JLabel();
        create_refreshButton = new javax.swing.JPanel();
        create_refreshLabel = new javax.swing.JLabel();
        createuser_idField = new javax.swing.JTextField();
        create_idLabel = new javax.swing.JLabel();
        create_headerContainer = new javax.swing.JPanel();
        create_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        registerContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_imageContainer.setBackground(new java.awt.Color(132, 71, 71));
        create_imageContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_imageArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        create_imageArea.setForeground(new java.awt.Color(255, 255, 255));
        create_imageArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_imageArea.setText("[IMAGE HERE]");
        create_imageContainer.add(create_imageArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 180));

        create_selectimageButton.setBackground(new java.awt.Color(132, 72, 79));
        create_selectimageButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_selectimageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_selectimageButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_selectimageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_selectimageButtonMouseExited(evt);
            }
        });
        create_selectimageButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_selectimageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_selectimageLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_selectimageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_selectimageLabel.setText("Select");
        create_selectimageButton.add(create_selectimageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_imageContainer.add(create_selectimageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 80, 20));

        create_removeimageButton.setBackground(new java.awt.Color(132, 72, 79));
        create_removeimageButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_removeimageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_removeimageButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_removeimageButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_removeimageButtonMouseExited(evt);
            }
        });
        create_removeimageButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_create_removeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_create_removeLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_create_removeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_create_removeLabel.setText("Remove");
        create_removeimageButton.add(create_create_removeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_imageContainer.add(create_removeimageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 80, 20));

        registerContainer.add(create_imageContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 190, 500));

        create_formContainer.setBackground(new java.awt.Color(183, 71, 52));
        create_formContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_nameLabel.setText("Name:");
        create_formContainer.add(create_nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        createuser_nameField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_nameField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 30));

        create_passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_passwordLabel.setText("Password:");
        create_formContainer.add(create_passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        createuser_passwordField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_passwordField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        create_typeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_typeLabel.setText("User Type:");
        create_formContainer.add(create_typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        createuser_typeBox.setBackground(new java.awt.Color(192, 132, 139));
        createuser_typeBox.setForeground(new java.awt.Color(255, 255, 255));
        createuser_typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        create_formContainer.add(createuser_typeBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 30));

        create_emailLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_emailLabel.setText("Email:");
        create_formContainer.add(create_emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        createuser_emailField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_emailField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 30));

        create_contactLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_contactLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_contactLabel.setText("Contact Number:");
        create_formContainer.add(create_contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        createuser_contactField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_contactField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 170, 30));

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

        create_formContainer.add(create_cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 80, 20));

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

        create_formContainer.add(create_addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 80, 20));

        create_confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_confirmLabel.setText("Confirm Password:");
        create_formContainer.add(create_confirmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        createuser_confirmField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_confirmField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_confirmField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 30));

        createuser_statusBox.setBackground(new java.awt.Color(192, 132, 139));
        createuser_statusBox.setForeground(new java.awt.Color(255, 255, 255));
        createuser_statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        create_formContainer.add(createuser_statusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 30));

        create_statusLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_statusLabel.setText("Status");
        create_formContainer.add(create_statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        create_updateButton.setBackground(new java.awt.Color(132, 72, 79));
        create_updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_updateButtonMouseExited(evt);
            }
        });
        create_updateButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_cancelLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_cancelLabel1.setForeground(new java.awt.Color(255, 255, 255));
        create_cancelLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_cancelLabel1.setText("Update");
        create_updateButton.add(create_cancelLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 80, 20));

        create_deleteButton.setBackground(new java.awt.Color(132, 72, 79));
        create_deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_deleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_deleteButtonMouseExited(evt);
            }
        });
        create_deleteButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_deleteLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_deleteLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_deleteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_deleteLabel.setText("Delete");
        create_deleteButton.add(create_deleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 80, 20));

        create_clearButton.setBackground(new java.awt.Color(132, 72, 79));
        create_clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_clearButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_clearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_clearButtonMouseExited(evt);
            }
        });
        create_clearButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_clearLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_clearLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_clearLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_clearLabel.setText("Clear");
        create_clearButton.add(create_clearLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 80, 20));

        create_refreshButton.setBackground(new java.awt.Color(132, 72, 79));
        create_refreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 132, 139)));
        create_refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                create_refreshButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                create_refreshButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                create_refreshButtonMouseExited(evt);
            }
        });
        create_refreshButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_refreshLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_refreshLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_refreshLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_refreshLabel.setText("Refresh");
        create_refreshButton.add(create_refreshLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 20));

        create_formContainer.add(create_refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 80, 20));

        createuser_idField.setEditable(false);
        createuser_idField.setBackground(new java.awt.Color(192, 132, 139));
        createuser_idField.setForeground(new java.awt.Color(255, 255, 255));
        create_formContainer.add(createuser_idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 30));

        create_idLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_idLabel.setForeground(new java.awt.Color(255, 255, 255));
        create_idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        create_idLabel.setText("ID: ");
        create_formContainer.add(create_idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        registerContainer.add(create_formContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 190, 500));

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
            .addComponent(registerContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_cancelButtonMouseClicked
        members.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_create_cancelButtonMouseClicked

    private void create_addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_addButtonMouseClicked
        boolean isInteger = Pattern.matches("^\\d*$", createuser_contactField.getText());
        
        if(createuser_nameField.getText().isEmpty() && createuser_passwordField.getPassword().length == 0 
                && createuser_emailField.getText().isEmpty() && createuser_contactField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }
        else if(createuser_passwordField.getPassword().length < 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
        }
        else if(duplicateCheck()){
            System.out.println("Duplicate exists");
        }
        else if(isInteger == false){
            JOptionPane.showMessageDialog(null, "Contact number must be numberical");
        }
        else if(createuser_passwordField.getPassword().equals(createuser_confirmField.getPassword())){
            JOptionPane.showMessageDialog(null, "New password must match to confirm password");
        }
        else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO dashboard_members (member_name, member_password, member_position, member_email, member_contact, member_status) VALUES ('" + createuser_nameField.getText() + "', '" + createuser_passwordField.getText() + "', '" + createuser_typeBox.getSelectedItem() + "', '" + createuser_emailField.getText() + "', '" + createuser_contactField.getText() + "', 'Pending')")){
                JOptionPane.showMessageDialog(null, "Registered Successfully!");
                
                members.setVisible(true);
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

    private void create_deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_deleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_deleteButtonMouseClicked

    private void create_deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_deleteButtonMouseEntered
        create_deleteButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_deleteButtonMouseEntered

    private void create_deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_deleteButtonMouseExited
        create_deleteButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_deleteButtonMouseExited

    private void create_updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_updateButtonMouseClicked
        if(createuser_nameField.getText().isEmpty() && createuser_passwordField.getPassword().length == 0 
                && createuser_emailField.getText().isEmpty() && createuser_contactField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }
        else if(createuser_passwordField.getPassword().length < 8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 and above.");
        }
        else if(updateCheck()){
            System.out.println("Duplicate exists");
        }
        else{
            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE dashboard_members SET member_name = " +createuser_nameField.getText()+", member_password = " 
                +createuser_passwordField.getText()+ ", member_position = " +createuser_typeBox.getSelectedItem()+", member_email = " 
                +createuser_emailField.getText()+ ", member_contact = " +createuser_contactField.getText()+ ", member_status" 
                +createuser_statusBox.getSelectedItem()+ " WHERE member_id" +createuser_idField.getText());
        
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
                members.setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_create_updateButtonMouseClicked

    private void create_updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_updateButtonMouseEntered
        create_updateButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_updateButtonMouseEntered

    private void create_updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_updateButtonMouseExited
        create_updateButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_updateButtonMouseExited

    private void create_clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_clearButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_clearButtonMouseClicked

    private void create_clearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_clearButtonMouseEntered
        create_clearButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_clearButtonMouseEntered

    private void create_clearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_clearButtonMouseExited
        create_clearButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_clearButtonMouseExited

    private void create_refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_refreshButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_create_refreshButtonMouseClicked

    private void create_refreshButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_refreshButtonMouseEntered
        create_refreshButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_refreshButtonMouseEntered

    private void create_refreshButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_refreshButtonMouseExited
        create_refreshButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_refreshButtonMouseExited

    private void create_selectimageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_selectimageButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        try {
            selectedFile = fileChooser.getSelectedFile();
            destination = "src/images/" + selectedFile.getName();
            path  = selectedFile.getAbsolutePath();

            if(FileExistenceChecker(path) == 1){
                JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
               destination = "";
                path="";
            }else{
                create_imageArea.setIcon(ResizeImage(path, null, create_imageArea));
                create_selectimageButton.setEnabled(false);
                create_removeimageButton.setEnabled(true);
            }
        } catch (Exception ex) {
            System.out.println("File Error!");
        }
        }
    }//GEN-LAST:event_create_selectimageButtonMouseClicked

    private void create_selectimageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_selectimageButtonMouseEntered
        create_selectimageButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_selectimageButtonMouseEntered

    private void create_selectimageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_selectimageButtonMouseExited
        create_selectimageButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_selectimageButtonMouseExited

    private void create_removeimageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_removeimageButtonMouseClicked
        create_removeimageButton.setEnabled(false);
        create_selectimageButton.setEnabled(true);
        create_imageArea.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_create_removeimageButtonMouseClicked

    private void create_removeimageButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_removeimageButtonMouseEntered
        create_removeimageButton.setBackground(new Color(192, 132, 139));
    }//GEN-LAST:event_create_removeimageButtonMouseEntered

    private void create_removeimageButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_create_removeimageButtonMouseExited
        create_removeimageButton.setBackground(new Color(132, 72, 79));
    }//GEN-LAST:event_create_removeimageButtonMouseExited

    private void create_emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_emailFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new DashboardCreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel create_addButton;
    private javax.swing.JLabel create_addLabel;
    private javax.swing.JPanel create_cancelButton;
    private javax.swing.JLabel create_cancelLabel;
    private javax.swing.JLabel create_cancelLabel1;
    private javax.swing.JPanel create_clearButton;
    private javax.swing.JLabel create_clearLabel;
    private javax.swing.JLabel create_confirmLabel;
    private javax.swing.JLabel create_contactLabel;
    private javax.swing.JLabel create_create_removeLabel;
    private javax.swing.JPanel create_deleteButton;
    private javax.swing.JLabel create_deleteLabel;
    private javax.swing.JLabel create_emailLabel;
    private javax.swing.JPanel create_formContainer;
    private javax.swing.JPanel create_headerContainer;
    private javax.swing.JLabel create_idLabel;
    private javax.swing.JLabel create_imageArea;
    private javax.swing.JPanel create_imageContainer;
    private javax.swing.JLabel create_nameLabel;
    private javax.swing.JLabel create_passwordLabel;
    private javax.swing.JPanel create_refreshButton;
    private javax.swing.JLabel create_refreshLabel;
    public javax.swing.JPanel create_removeimageButton;
    public javax.swing.JPanel create_selectimageButton;
    private javax.swing.JLabel create_selectimageLabel;
    private javax.swing.JLabel create_statusLabel;
    private javax.swing.JLabel create_title;
    private javax.swing.JLabel create_typeLabel;
    public javax.swing.JPanel create_updateButton;
    private javax.swing.JPasswordField createuser_confirmField;
    public javax.swing.JTextField createuser_contactField;
    public javax.swing.JTextField createuser_emailField;
    public javax.swing.JTextField createuser_idField;
    public javax.swing.JTextField createuser_nameField;
    public javax.swing.JPasswordField createuser_passwordField;
    public javax.swing.JComboBox<String> createuser_statusBox;
    public javax.swing.JComboBox<String> createuser_typeBox;
    private javax.swing.JPanel registerContainer;
    // End of variables declaration//GEN-END:variables
}
