
package Validate;


public class Validate {
    
   private boolean pwdState;
    
   
   //Check The Two Passwords
  public boolean vaildatePasswords(String password,String conPassword)
   {
        if(password.equals(conPassword))
            pwdState = true;
        else
            pwdState = false;
      
       return pwdState;
   }
  
  
}
