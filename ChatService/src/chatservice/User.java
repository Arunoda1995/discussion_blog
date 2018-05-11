package chatservice;

import javax.swing.JOptionPane;
import Validate.*;


public class User extends javax.swing.JFrame {

   
    private String nickname;
    private String loginId;
    private char[] password_char;
    private char[] conpassword_char;
    private String password;
    private String conpassword;
    private boolean state;
    private boolean pwdState;
    
    public User() {
        initComponents();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_nickname = new javax.swing.JLabel();
        lbl_loginid = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_confirmpassword = new javax.swing.JLabel();
        txtbx_nickname = new javax.swing.JTextField();
        txtbx_loginId = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        txtbx_password = new javax.swing.JPasswordField();
        txtbx_confirmpassword = new javax.swing.JPasswordField();
        lbl_pageTitle = new javax.swing.JLabel();
        btn_loginPage = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));

        jPanel1.setLayout(null);

        lbl_nickname.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_nickname.setForeground(new java.awt.Color(255, 51, 51));
        lbl_nickname.setText("NICKNAME");
        jPanel1.add(lbl_nickname);
        lbl_nickname.setBounds(310, 180, 120, 19);

        lbl_loginid.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_loginid.setForeground(new java.awt.Color(255, 51, 51));
        lbl_loginid.setText("LOGIN ID");
        jPanel1.add(lbl_loginid);
        lbl_loginid.setBounds(310, 130, 130, 19);

        lbl_password.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 51, 51));
        lbl_password.setText("PASSWORD");
        jPanel1.add(lbl_password);
        lbl_password.setBounds(310, 230, 110, 19);

        lbl_confirmpassword.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_confirmpassword.setForeground(new java.awt.Color(255, 51, 51));
        lbl_confirmpassword.setText("CONFIRM PASSWORD");
        jPanel1.add(lbl_confirmpassword);
        lbl_confirmpassword.setBounds(310, 290, 190, 19);
        jPanel1.add(txtbx_nickname);
        txtbx_nickname.setBounds(490, 170, 170, 30);
        jPanel1.add(txtbx_loginId);
        txtbx_loginId.setBounds(490, 120, 170, 30);

        btn_register.setBackground(new java.awt.Color(0, 0, 255));
        btn_register.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 0, 51));
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register);
        btn_register.setBounds(410, 380, 120, 50);
        jPanel1.add(txtbx_password);
        txtbx_password.setBounds(490, 220, 170, 30);
        jPanel1.add(txtbx_confirmpassword);
        txtbx_confirmpassword.setBounds(490, 280, 170, 30);

        lbl_pageTitle.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        lbl_pageTitle.setForeground(new java.awt.Color(204, 0, 204));
        lbl_pageTitle.setText("CHAT MORE REGISTRATION PAGE");
        jPanel1.add(lbl_pageTitle);
        lbl_pageTitle.setBounds(280, 60, 460, 29);

        btn_loginPage.setBackground(new java.awt.Color(0, 0, 255));
        btn_loginPage.setFont(new java.awt.Font("MS Gothic", 1, 13)); // NOI18N
        btn_loginPage.setForeground(new java.awt.Color(255, 0, 51));
        btn_loginPage.setText("Back To Login");
        btn_loginPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginPageActionPerformed(evt);
            }
        });
        jPanel1.add(btn_loginPage);
        btn_loginPage.setBounds(770, 530, 140, 40);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background-images-for-registration-page-1.jpg"))); // NOI18N
        jPanel1.add(image);
        image.setBounds(0, 0, 940, 590);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
       
          Login login = new Login();
          Validate validate = new Validate();
           
        if((txtbx_nickname.getText()).isEmpty())
            JOptionPane.showMessageDialog(null,"NickName is Empty");
        else if((txtbx_loginId.getText()).isEmpty())
            JOptionPane.showMessageDialog(null,"LoginId is Empty");
        else  if((txtbx_password.getPassword()).length == 0)
            JOptionPane.showMessageDialog(null,"Passowrd is Empty");
        else if((txtbx_confirmpassword.getPassword()).length ==0)
                 JOptionPane.showMessageDialog(null,"Confirm Passowrd is Empty");
        else
        {
       
             nickname = txtbx_nickname.getText(); 
             loginId = txtbx_loginId.getText();
             password_char = txtbx_password.getPassword();
             conpassword_char =  txtbx_confirmpassword.getPassword();
             password = new String(password_char) ;
             conpassword = new String(conpassword_char);
         
             state = validateLoginID(loginId);
             pwdState = validate.vaildatePasswords(password, conpassword);
            
             
             if(state)
             {
                 JOptionPane.showMessageDialog(null,"LoginId is Already Taken");
             }
             else
             {
               
                 if(pwdState == false)
                {
                  JOptionPane.showMessageDialog(null,"Two Passwords are not Matching");
                }
                else
                 {
                      int rowCount = registerUser(nickname,loginId,password);
                      
                      if(rowCount > 0)
                      {
                          
                          int selectOpt = JOptionPane.showConfirmDialog(null, "Registration Successfull.Click Okay to go to Login Page", "Login",JOptionPane.YES_NO_OPTION);
                          if (selectOpt == JOptionPane.YES_OPTION) 
                          {
                              login.setVisible(true);
                              this.dispose();
                          
                          } 
                          else if (selectOpt == JOptionPane.NO_OPTION) 
                          {
                              this.dispose();
                          } 
                      
                      }
                 }
             
             }
             
             
        }
        
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_loginPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginPageActionPerformed
       
        Login login = new Login();
        
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_loginPageActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_loginPage;
    private javax.swing.JButton btn_register;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_confirmpassword;
    private javax.swing.JLabel lbl_loginid;
    private javax.swing.JLabel lbl_nickname;
    private javax.swing.JLabel lbl_pageTitle;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JPasswordField txtbx_confirmpassword;
    private javax.swing.JTextField txtbx_loginId;
    private javax.swing.JTextField txtbx_nickname;
    private javax.swing.JPasswordField txtbx_password;
    // End of variables declaration//GEN-END:variables

 
    private static int registerUser(java.lang.String nickname, java.lang.String loginID, java.lang.String password) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.registerUser(nickname, loginID, password);
    }

    private static boolean validateLoginID(java.lang.String loginID) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.validateLoginID(loginID);
    }

   
  
}
