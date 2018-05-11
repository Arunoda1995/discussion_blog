
package chatservice;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    private String loginid;
    private char[] password_char;
    private String password;
    private boolean state;
    public static String currentUser;
    
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_register = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        txtbx_loginId = new javax.swing.JTextField();
        lbl_password = new javax.swing.JLabel();
        lbl_loginid = new javax.swing.JLabel();
        txtbx_password = new javax.swing.JPasswordField();
        lbl_loginTitle = new javax.swing.JLabel();
        lbl_loginImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_register.setBackground(new java.awt.Color(0, 0, 255));
        btn_register.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 51, 51));
        btn_register.setText("REGISTER");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_register);
        btn_register.setBounds(260, 360, 120, 40);

        btn_login.setBackground(new java.awt.Color(0, 0, 255));
        btn_login.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 51, 51));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(260, 280, 120, 40);
        jPanel1.add(txtbx_loginId);
        txtbx_loginId.setBounds(310, 130, 170, 30);

        lbl_password.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 0, 51));
        lbl_password.setText("PASSWORD");
        jPanel1.add(lbl_password);
        lbl_password.setBounds(140, 200, 100, 19);

        lbl_loginid.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        lbl_loginid.setForeground(new java.awt.Color(255, 0, 51));
        lbl_loginid.setText("LOGIN ID");
        jPanel1.add(lbl_loginid);
        lbl_loginid.setBounds(140, 130, 120, 19);
        jPanel1.add(txtbx_password);
        txtbx_password.setBounds(310, 190, 170, 30);

        lbl_loginTitle.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        lbl_loginTitle.setForeground(new java.awt.Color(204, 0, 204));
        lbl_loginTitle.setText("CHAT MORE LOGIN PAGE");
        jPanel1.add(lbl_loginTitle);
        lbl_loginTitle.setBounds(150, 40, 330, 29);

        lbl_loginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_page.jpg"))); // NOI18N
        jPanel1.add(lbl_loginImage);
        lbl_loginImage.setBounds(0, 0, 630, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
      
        try
        {
         if((txtbx_loginId.getText()).isEmpty())
            JOptionPane.showMessageDialog(null,"LoginId is Empty");
       else if((txtbx_password.getPassword()).length == 0)
            JOptionPane.showMessageDialog(null,"Passowrd is Empty");
            else
       {
       
           loginid = txtbx_loginId.getText();
           password_char = txtbx_password.getPassword();
           password = new String(password_char) ;
       
           state = validateUser(loginid,password);
           
           if(state)
           {
               currentUser = loginid;
               SelectThread selectthread = new SelectThread();
               selectthread.setVisible(true);
               this.dispose();
           }
           else
           {
           
                JOptionPane.showMessageDialog(null,"Login Id  or Password is Incorrect");
           
           }
           
       }
        
        }
        
        catch(StackOverflowError t)
        {
        
            System.out.println("Caught "+ t);
            t.printStackTrace();
        }
     
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
            User register = new User();
            register.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btn_registerActionPerformed

   
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_register;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_loginImage;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JLabel lbl_loginid;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JTextField txtbx_loginId;
    private javax.swing.JPasswordField txtbx_password;
    // End of variables declaration//GEN-END:variables

    private static boolean validateUser(java.lang.String loginID, java.lang.String password) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.validateUser(loginID, password);
    }
}
