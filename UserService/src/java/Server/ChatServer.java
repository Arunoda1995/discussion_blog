package Server;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import Server.ViewEditUser;
import java.sql.PreparedStatement;

@WebService(serviceName = "ChatServer")
public class ChatServer {
    @Resource(name = "Chat_DB")
    private DataSource chat_DB;
    
    Connection con = null;
    String sql;
    String sql1;
    Statement stmt = null;
    ResultSet rs;
    private String log_id;
    private int check;
    private boolean state;
    private String originalPassword;
    private int rowCount;
    private int logCheck = 0;
    private int pwdCheck = 0;
    private String currentUser;
  
    
    
    //ArrayList to store Thread Edit User Details
    private ArrayList<ViewEditUser> threads = new ArrayList<>(); 
    
  //Connect to database using "chat_DB" data source
    @WebMethod(operationName = "connectDB")
    public int connectDB() {
        try {
            con = chat_DB.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    
    //Close Database Connection
 @WebMethod(operationName = "closeDB")
    public int closeDB() {
          try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    //Enter Details of a User to the database
    @WebMethod(operationName = "registerUser")
    public int registerUser(@WebParam(name = "nickname") String nickname, @WebParam(name = "loginID") String loginID, @WebParam(name = "password") String password) {
       
        connectDB() ;
        sql = "INSERT INTO `register`(`user_nickname`, `user_loginId`, `user_password`) VALUE ('"+nickname+"','"+loginID+"','"+password+"')";
        try {
            stmt = con.createStatement();
            rowCount =   stmt.executeUpdate(sql);
        } catch (SQLException ex) {
          
        }
        
        closeDB();
        
        return rowCount;
    }

    //Check the User login Id is already use by another user when a new user register
    @WebMethod(operationName = "validateLoginID")
    public boolean validateLoginID(@WebParam(name = "loginID") String loginID) {
       try
       {
       
             connectDB();
             
             stmt = con.createStatement();
       
             rs = stmt.executeQuery("select user_loginId from register");
       
             while(rs.next())
              {
                    log_id = rs.getString("user_loginId");
           
                    if(log_id.equals(loginID))
                        {
                            check = 1;
                            break;
                        }
                    else
                    {
                        check = 0;
                    
                    }
           
              }
       
       
             if(check == 1)
                 state =  true;
             else
                 state =  false;
          
             
       }
       
       catch(SQLException | NullPointerException e)
       {
       
          JOptionPane.showMessageDialog(null,e.getMessage());
       
       }
       
        return state;
    }

    //Check user login Id with the corresponding user password
    @WebMethod(operationName = "validateUser")
    public boolean validateUser(@WebParam(name = "loginID") String loginID, @WebParam(name = "password") String password) {
        
         try
       {
       
           connectDB();
             
             stmt = con.createStatement();
       
             rs = stmt.executeQuery("select user_password,user_loginId from register" );
       
             while(rs.next())
              {
                    log_id = rs.getString("user_loginId");
                    originalPassword = rs.getString("user_password");
                    
                    
                    if(log_id.equals(loginID))
                    {
                        logCheck = 1;
                        
                        if(originalPassword.equals(password))
                        {
                             pwdCheck = 1;
                             break;
                        }
                         else
                           pwdCheck = 0;
                    
                    }
                    else
                         logCheck = 0;
            
              }
       
             if(logCheck == 1)
             {
                 if(pwdCheck == 1)
                      state = true;
                 else
                     state = false;    
             }
             else
                 state = false;
                     
       }
       
       catch(SQLException | NullPointerException e)
       {
       
          JOptionPane.showMessageDialog(null,e.getMessage());
       
       }
       
      
         closeDB();
       
         return state;
        
      
    }

   
    //Get the User nickname from the Database 
    @WebMethod(operationName = "getCurrentUser")
    public String getCurrentUser(@WebParam(name = "loginID") String loginID) {
      
        try
       {
       
             connectDB();
             
             stmt = con.createStatement();
       
             rs = stmt.executeQuery("select user_nickname from register where user_loginId = '"+loginID+"' ");
       
             while(rs.next())
              {
                    currentUser = rs.getString("user_nickname");
      
              }
      
             
       }
       
       catch(SQLException | NullPointerException e)
       {
       
          JOptionPane.showMessageDialog(null,e.getMessage());
       
       }
        
        closeDB();
        return currentUser;
    }

   
    //Insert a new Thread to the database 
    @WebMethod(operationName = "insertThread")
    public int insertThread(@WebParam(name = "creatBy") String creatBy, @WebParam(name = "createDate") String createDate, @WebParam(name = "title") String title,@WebParam(name = "userName") String userName) {
     
        connectDB() ;
        sql =  "INSERT INTO `thread`(`thread_createBy`, `thread_createDate`, `thread_title`,`thread_createUser`) VALUE ('"+creatBy+"','"+createDate+"','"+title+"','"+userName+"')";
        
        sql1 = "INSERT INTO `editeduser`(`thread_id`) VALUES (LAST_INSERT_ID())";
       
       try {
            stmt = con.createStatement();
            rowCount =   stmt.executeUpdate(sql);
                         stmt.executeUpdate(sql1);
        } catch (SQLException ex) {
          
        }
        
        closeDB();
        
        return rowCount;
    }
    
 
   
   

    //Insert new Message 
    @WebMethod(operationName = "insertMessage")
    public int insertMessage(@WebParam(name = "message") String message, @WebParam(name = "threadid") String threadid,@WebParam(name = "editedBy") String editedBy,@WebParam(name = "editedDate") String editedDate) {
        connectDB() ;
        sql = "INSERT INTO `chat`(`chat_message`,`editedBy`,`editedDate`,`thread_id`) VALUE ('"+message+"','"+editedBy+"','"+editedDate+"','"+threadid+"')";
        
        try {
            stmt = con.createStatement();
            rowCount =   stmt.executeUpdate(sql);
        } catch (SQLException ex) {
          
        }
        
        closeDB();
        
        return rowCount;
    }

   
    @WebMethod(operationName = "updateEditUser")
    public int updateEditUser(@WebParam(name = "threadEditedBy") String threadEditedBy,@WebParam(name = "threadEditedDate") String threadEditedDate,@WebParam(name = "threadId") int threadId) {
       
        connectDB() ;
      
        
        try
        {
            con.createStatement();
            PreparedStatement ps = con.prepareStatement("UPDATE editeduser SET editedBy = ?, editedDate = ? WHERE thread_id = ?");
            ps.setString(1,threadEditedBy);
            ps.setString(2,threadEditedDate);
            ps.setInt(3,threadId);
            ps.executeUpdate();
    
        }
        catch(SQLException ex)
         {
         
         }
        
        
        
        return rowCount;
    }

  
    
   //Return an  ArrayList of users who edit Threads 
    @WebMethod(operationName = "getEditedUser")
    public ArrayList<ViewEditUser> getEditedUser() {
          
        threads.clear();
        
    sql = "select * from selectedituser";
        
    try
       {
       
             connectDB();
             
             stmt = con.createStatement();
       
             rs = stmt.executeQuery(sql);
             
    
             while(rs.next())
              {
                  
                  ViewEditUser viewedituser = new ViewEditUser();
                  viewedituser.setThreadID(rs.getString("thread_id"));
                  viewedituser.setThreadTitle(rs.getString("thread_title"));
                  viewedituser.setThreadCreatedBy(rs.getString("thread_createUser"));
                  viewedituser.setThreadCreatedDate(rs.getString("thread_createDate"));
                  viewedituser.setThreadEditedDate(rs.getString("editedDate"));
                  viewedituser.setThreadEditedBy(rs.getString("editedBy"));
                  threads.add(viewedituser);
                      
              }
          
             
       }
       catch(SQLException | NullPointerException e)
       {
       
          JOptionPane.showMessageDialog(null,e.getMessage());
       
       }
        
        closeDB();
        
        return threads;
        
        
    }

    
  //Return an ArrayList of Users who edit a particular Thread
 @WebMethod(operationName = "getThreadMessage")
    public ArrayList<ViewEditUser> getThreadMessage(@WebParam(name = "threadId") String threadId) {
          
        threads.clear();
        
        sql = "select editedBy,editedDate,chat_message from chat_details where thread_id = '"+threadId+"'";
        
    try
       {
       
             connectDB();
             
             stmt = con.createStatement();
       
             rs = stmt.executeQuery(sql);
             
    
             while(rs.next())
              {
                  
                  ViewEditUser viewedituser = new ViewEditUser();
                  viewedituser.setThreadEditedDate(rs.getString("editedDate"));
                  viewedituser.setThreadEditedBy(rs.getString("editedBy"));
                  viewedituser.setMessage(rs.getString("chat_message"));
                  threads.add(viewedituser);
                      
              }
          
             
       }
       catch(SQLException | NullPointerException e)
       {
       
          JOptionPane.showMessageDialog(null,e.getMessage());
       
       }
        
        closeDB();
        
        return threads;
        
        
    }
    
  
   
}
