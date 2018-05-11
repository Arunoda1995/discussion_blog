/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


import Server.ChatServer;

public class ViewEditUser {
   
    
    private String threadID;
    private String threadTitle;
    private String threadCreateDate;
    private String threadCreateBy;
    private String message;
    private String editdBy;
    private String editedDate;
    
    
    public void setThreadID(String threadID)
    {
        this.threadID = threadID;
    
    }
    public String getThreadID()
    {
    
        return this.threadID;
    
    }
    public void setThreadTitle(String threadTitle)
    {
        this.threadTitle = threadTitle;
    
    }
    public String getThreadTitle()
    {
    
        return this.threadTitle;
    
    }
    public void setThreadCreatedDate(String threadCreatedDate)
    {
        this.threadCreateDate = threadCreatedDate;
    
    }
    public String getThreadCreatedDate()
    {
    
        return this.threadCreateDate;
    
    }
    
    public void setThreadCreatedBy(String threadCreatedBy)
    {
        this.threadCreateBy = threadCreatedBy;
    
    }
    public String getThreadCreatedBy()
    {
    
        return this.threadCreateBy;
    
    }
    
    public void setThreadEditedBy(String threadEditedBy)
    {
        this.editdBy = threadEditedBy;
    
    }
    public String getThreadEditedBy()
    {
    
        return this.editdBy;
    
    }
    
     public void setThreadEditedDate(String threadEditedDate)
    {
        this.editedDate = threadEditedDate;
    
    }
    public String getThreadEditedDate()
    {
    
        return this.editedDate;
    
    }
    
     public void setMessage(String message)
    {
        this.message = message;
    
    }
    public String getMessage()
    {
    
        return this.message;
    
    }
    
    
}
