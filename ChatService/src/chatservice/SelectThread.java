package chatservice;



import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import server.ViewEditUser;


public class SelectThread extends javax.swing.JFrame {

   DefaultTableModel model;
   public static String threadId = null;
   public static String threadCreateBy = null; 
   public static String threadCreateDate = null;
   public static String threadTitle = null;
    
    public SelectThread() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_thread = new javax.swing.JTable();
        btn_createNew = new javax.swing.JButton();
        btn_editSelected = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        lbl_loginTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(null);

        tbl_thread.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_thread.setFont(new java.awt.Font("MS Gothic", 1, 16)); // NOI18N
        tbl_thread.setForeground(new java.awt.Color(255, 51, 51));
        tbl_thread.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "threadID", "TITLE", "CREATED BY", "CREATED DATE", "LAST EDITED BY", "LAST EDITED DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_thread.setGridColor(new java.awt.Color(153, 204, 255));
        tbl_thread.setRowHeight(30);
        tbl_thread.setRowMargin(2);
        tbl_thread.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_threadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_thread);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 100, 1019, 180);

        btn_createNew.setBackground(new java.awt.Color(0, 51, 255));
        btn_createNew.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_createNew.setForeground(new java.awt.Color(255, 0, 0));
        btn_createNew.setText("CREATE NEW");
        btn_createNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createNewActionPerformed(evt);
            }
        });
        jPanel1.add(btn_createNew);
        btn_createNew.setBounds(510, 470, 160, 50);

        btn_editSelected.setBackground(new java.awt.Color(0, 51, 255));
        btn_editSelected.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_editSelected.setForeground(new java.awt.Color(255, 0, 0));
        btn_editSelected.setText("EDIT SELECTED");
        btn_editSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSelectedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_editSelected);
        btn_editSelected.setBounds(300, 470, 160, 50);

        btn_back.setBackground(new java.awt.Color(51, 51, 255));
        btn_back.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 51, 51));
        btn_back.setText("BACK");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(920, 520, 100, 50);

        lbl_loginTitle.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        lbl_loginTitle.setForeground(new java.awt.Color(204, 0, 204));
        lbl_loginTitle.setText("CHAT MORE SELECT THREAD PAGE");
        jPanel1.add(lbl_loginTitle);
        lbl_loginTitle.setBounds(270, 20, 470, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createNewActionPerformed
       
        Thread createthread = new Thread();
        createthread.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_createNewActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
     
        
         model = (DefaultTableModel) tbl_thread.getModel();
         model.setRowCount(0);
        
        
        
        
        List<ViewEditUser> viewedituser = new ArrayList<>();
        
        viewedituser = getEditedUser();
        
        int size = viewedituser.size();
        
        ViewEditUser[] viewedituserArray = new ViewEditUser[size];
        
        viewedituserArray = viewedituser.toArray(new ViewEditUser[size]);
        
        String[] threadId = new String[size];
        String[] threadTitle = new String[size];
        String[] threadCreatedBy = new String[size];
        String[] threadCreateDate = new String[size];
        String[] threadEditedBy = new String[size];
        String[] threadEditedDate = new String[size];
       
        
        for(int i=0; i<size; i++){
          threadId[i] = viewedituserArray[i].getThreadID();
          threadTitle[i] = viewedituserArray[i].getThreadTitle();
          threadCreatedBy[i] = viewedituserArray[i].getThreadCreatedBy();
          threadCreateDate[i] = viewedituserArray[i].getThreadCreatedDate();
          threadEditedBy[i] = viewedituserArray[i].getThreadEditedBy();
          threadEditedDate[i] = viewedituserArray[i].getThreadEditedDate();
          
           String row [] = {threadId[i],threadTitle[i],threadCreatedBy[i],threadCreateDate[i],threadEditedBy[i],threadEditedDate[i]};
           model.addRow(row);
      }
      
        tbl_thread.removeColumn(tbl_thread.getColumn("threadID"));
        
        
        
      
    }//GEN-LAST:event_formWindowOpened

    private void btn_editSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSelectedActionPerformed
           
       if(threadId == null)
       {
           JOptionPane.showMessageDialog(null,"Please Select a Thread");
       
       }
       
       else
       {
       
           Chat messagethread = new Chat();
           messagethread.setVisible(true);
           this.dispose();
       }
           
           
        
    }//GEN-LAST:event_btn_editSelectedActionPerformed

    private void tbl_threadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_threadMouseClicked
     
       
        DefaultTableModel model = (DefaultTableModel)tbl_thread.getModel();
        int selectedRowIndex = tbl_thread.getSelectedRow();
    
        threadId = model.getValueAt(selectedRowIndex,0).toString();
        threadTitle = model.getValueAt(selectedRowIndex,1).toString();
        threadCreateBy = model.getValueAt(selectedRowIndex,2).toString(); 
        threadCreateDate = model.getValueAt(selectedRowIndex,3).toString(); 
        
        
    }//GEN-LAST:event_tbl_threadMouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
      
        Login login = new Login();
        login.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(SelectThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectThread.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectThread().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_createNew;
    private javax.swing.JButton btn_editSelected;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_loginTitle;
    private javax.swing.JTable tbl_thread;
    // End of variables declaration//GEN-END:variables


    private static java.util.List<server.ViewEditUser> getEditedUser() {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.getEditedUser();
    }

   

   
  
}
