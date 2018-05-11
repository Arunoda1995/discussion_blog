
package ChatThread;

import java.util.ArrayList;
import java.util.List;
import server.ViewEditUser;



public class ChatThread {

    int size = 0;
    
    
    //Set the all messages for a particular Thread
    public StringBuilder setThread(String id,String title,String createDate,String createBy)
    {
     
        List<ViewEditUser> viewedituser = new ArrayList<>();
        
        viewedituser.clear();
        
        viewedituser = getThreadMessage(id);
        
        size = viewedituser.size();
        
        StringBuilder sb = new StringBuilder(size);
        
        ViewEditUser[] viewedituserArray = new ViewEditUser[size];
        
        viewedituserArray = viewedituser.toArray(new ViewEditUser[size]);
        
        String[] message = new String[size];
        String[] threadEditedBy = new String[size];
        String[] threadEditedDate = new String[size];
       
        for(int i=0; i<size; i++){
          
          message[i] = viewedituserArray[i].getMessage();
          threadEditedBy[i] = viewedituserArray[i].getThreadEditedBy();
          threadEditedDate[i] = viewedituserArray[i].getThreadEditedDate();
             
      }
        
        sb.append("Thread Title = " +title +'\n');
        sb.append("Thread Created By  = " +createBy +'\n');
        sb.append("Thread Created Date = " + createDate + '\n');
        sb.append('\n');
        sb.append('\n');
        
        for(int l=0;l<size; l++)
        {
        
            sb.append("Message Edited By : " + threadEditedBy[l]+'\n');
            sb.append("Message Edited Date : " + threadEditedDate[l]+'\n');
            sb.append("Message : " + message[l]+'\n');
            sb.append('\n');
            sb.append('\n');
            
        }
      
        return sb;
        
    }
    
    
    private static java.util.List<server.ViewEditUser> getThreadMessage(java.lang.String threadId) {
        server.ChatServer_Service service = new server.ChatServer_Service();
        server.ChatServer port = service.getChatServerPort();
        return port.getThreadMessage(threadId);
    }
    
    
    
}
