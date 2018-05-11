
package chatservice;

import ChatThread.ChatThread;
import static chatservice.SelectThread.threadId;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;
import server.ViewEditUser;


public class Chat extends javax.swing.JFrame {

    
    
    private String date;
    private String message;
    private String id ;
    private String Title ;
    private String CreateDate ;
    private String CreateBy ;
   
    
    public Chat() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_typeMessage = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_displayMessage = new javax.swing.JTextArea();
        btn_submit = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        txtarea_typeMessage.setColumns(20);
        txtarea_typeMessage.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txtarea_typeMessage.setRows(5);
        jScrollPane1.setViewportView(txtarea_typeMessage);

        txtarea_displayMessage.setColumns(20);
        txtarea_displayMessage.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        txtarea_displayMessage.setRows(5);
        jScrollPane2.setViewportView(txtarea_displayMessage);

        btn_submit.setBackground(new java.awt.Color(0, 0, 255));
        btn_submit.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_submit.setForeground(new java.awt.Color(255, 0, 0));
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(0, 0, 255));
        btn_back.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 0, 0));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(0, 0, 255));
        btn_logout.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 0, 0));
        btn_logout.setText("LOG OUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
       
        Login login = new Login();
        SelectThread selectthread = new SelectThread();
       
      
        if(txtarea_typeMessage.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Enter a Message");
        
        }
        else
        {
          
            String editedUsername = getCurrentUser(login.currentUser);
            String threadId = selectthread.threadId;
            
            date = new SimpleDateFormat("yyyy/MM/dd HH.mm.ss").format(Calendar.getInstance().getTime());
            message = txtarea_typeMessage.getText();
            
            insertMessage(message,threadId,editedUsername,date);
            
            updateEditUser(editedUsername,date,Integer.parseInt(threadId));
             
            
            txtarea_typeMessage.setText("");
            txtarea_displayMessage.setText("");
            
            ChatThread chat = new ChatThread();
        
            id = selectthread.threadId;
            Title = selectthread.threadTitle;
            CreateDate = selectthread.threadCreateDate;
            CreateBy = selectthread.threadCreateBy;
         
            StringBuilder sb =  chat.setThread(id, Title, CreateDate, CreateBy);
        
       
            txtarea_displayMessage.setText(sb.toString());
            
                
        }
        
     
    }//GEN-LAST:event_btn_submitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
        txtarea_displayMessage.setText("");
        
        SelectThread selectthread = new SelectThread();
        ChatThread chat = new ChatThread();
        
        id = selectthread.threadId;
        Title = selectthread.threadTitle;
        CreateDate = selectthread.threadCreateDate;
        CreateBy = selectthread.threadCreateBy;
         
        StringBuilder sb =  chat.setThread(id, Title, CreateDate, CreateBy);
        
        txtarea_displayMessage.setText(sb.toString());
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
      
        SelectThread selectthread = new SelectThread();
        selectthread.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_backActionPerformed

    
    
    
    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
       
      
         if(txtarea_typeMessage.getText().isEmpty())
       {
       
           this.dispose();
           
       }
       
       else
       {
           
             int selectOpt = JOptionPane.showConfirmDialog(null, "Changes Will not be Saved", "LOG OUT",JOptionPane.WARNING_MESSAGE,JOptionPane.OK_CANCEL_OPTION);
             if (selectOpt == JOptionPane.OK_OPTION) 
                  {
                    
                    this.dispose();
                      
                  } 
              else if (selectOpt == JOptionPane.CANCEL_OPTION) 
                  {
                      
                       
                       
                  }     
           
       
       }
        
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_submit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtarea_displayMessage;
    private javax.swing.JTextArea txtarea_typeMessage;
    // End of variables declaration//GEN-END:variables

   
 

    private static String getCurrentUser(java.lang.String loginID) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.getCurrentUser(loginID);
    }

    private static int insertMessage(java.lang.String message, java.lang.String threadid, java.lang.String editedBy, java.lang.String editedDate) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.insertMessage(message, threadid, editedBy, editedDate);
    }

    private static int updateEditUser(java.lang.String threadEditedBy, java.lang.String threadEditedDate, int threadId) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.updateEditUser(threadEditedBy, threadEditedDate, threadId);
    }

    
   

   

   

   
   
    
    
}
