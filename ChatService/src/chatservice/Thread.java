package chatservice;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EventListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ACER
 */
public class Thread extends javax.swing.JFrame {

 // private static String currentUser;
  DefaultTableModel model;
  String timeStamp;
  String user;  
  String threadTitle = null;
 
  private int rowCount;
    public Thread() {
        initComponents();
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_threadTitle = new javax.swing.JLabel();
        txt_threadTitle = new javax.swing.JTextField();
        btn_createThread = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_createThread = new javax.swing.JTable();
        lbl_loginTitle = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(null);

        lbl_threadTitle.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        lbl_threadTitle.setText("THREAD TITLE");
        jPanel1.add(lbl_threadTitle);
        lbl_threadTitle.setBounds(70, 100, 104, 14);
        jPanel1.add(txt_threadTitle);
        txt_threadTitle.setBounds(190, 90, 170, 30);

        btn_createThread.setBackground(new java.awt.Color(51, 153, 255));
        btn_createThread.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_createThread.setForeground(new java.awt.Color(255, 51, 51));
        btn_createThread.setText("CREATE THREAD");
        btn_createThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createThreadActionPerformed(evt);
            }
        });
        jPanel1.add(btn_createThread);
        btn_createThread.setBounds(390, 90, 160, 40);

        tbl_createThread.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_createThread.setFont(new java.awt.Font("MS Gothic", 0, 14)); // NOI18N
        tbl_createThread.setForeground(new java.awt.Color(255, 51, 51));
        tbl_createThread.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "THREAD TITLE", "DATE CREATED", "CREATED BY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_createThread.setRowHeight(30);
        tbl_createThread.setRowMargin(2);
        jScrollPane1.setViewportView(tbl_createThread);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 230, 442, 140);

        lbl_loginTitle.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        lbl_loginTitle.setForeground(new java.awt.Color(204, 0, 204));
        lbl_loginTitle.setText("CHAT MORE CREATE THREAD PAGE");
        jPanel1.add(lbl_loginTitle);
        lbl_loginTitle.setBounds(70, 30, 490, 29);

        btn_login.setBackground(new java.awt.Color(51, 153, 255));
        btn_login.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 51, 51));
        btn_login.setText("BACK");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login);
        btn_login.setBounds(490, 410, 100, 40);

        btn_logout.setBackground(new java.awt.Color(51, 153, 255));
        btn_logout.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 51, 51));
        btn_logout.setText("LOG OUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(btn_logout);
        btn_logout.setBounds(10, 410, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_createThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createThreadActionPerformed
        
        Login login = new Login();
         SelectThread selectthread = new SelectThread();
         
       if((txt_threadTitle.getText()).isEmpty())
           JOptionPane.showMessageDialog(null,"Enter a Thread Title");
       else
       {  
         threadTitle = txt_threadTitle.getText();
         timeStamp = new SimpleDateFormat("yyyy/MM/dd HH.mm.ss").format(Calendar.getInstance().getTime());
         user = getCurrentUser(login.currentUser);
         String row [] = {threadTitle,timeStamp,user};
         model = (DefaultTableModel) tbl_createThread.getModel();
         model.addRow(row);
         
       
         
         rowCount = insertThread(Login.currentUser,timeStamp,threadTitle,user);
                   
         
         if(rowCount > 0)
         {
                int selectOpt = JOptionPane.showConfirmDialog(null, "Thread Created Successfully.Do you want to go to Select Thread Page ?", "Create Thread",JOptionPane.YES_NO_OPTION);
                if (selectOpt == JOptionPane.YES_OPTION) 
                     {
                         selectthread.setVisible(true);
                         this.dispose();
                     } 
                else if (selectOpt == JOptionPane.NO_OPTION) 
                      {
                          txt_threadTitle.setText(null);
                      }     
         
         }
              
           
       }
          
        txt_threadTitle.setText("");
       
    }//GEN-LAST:event_btn_createThreadActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
  
        this.dispose();
        
        SelectThread selectthread = new SelectThread();
        
        selectthread.setVisible(true);
        
        
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
         if(txt_threadTitle.getText().isEmpty())
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
       
   
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Thread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createThread;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_logout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JLabel lbl_threadTitle;
    private javax.swing.JTable tbl_createThread;
    private javax.swing.JTextField txt_threadTitle;
    // End of variables declaration//GEN-END:variables

    private static String getCurrentUser(java.lang.String loginID) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.getCurrentUser(loginID);
    }

    private static int insertThread(java.lang.String creatBy, java.lang.String createDate, java.lang.String title, java.lang.String userName) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.insertThread(creatBy, createDate, title, userName);
    }

  

   

   
}
