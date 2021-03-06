
package server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ChatServer", targetNamespace = "http://Server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChatServer {


    /**
     * 
     * @param title
     * @param userName
     * @param creatBy
     * @param createDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertThread", targetNamespace = "http://Server/", className = "server.InsertThread")
    @ResponseWrapper(localName = "insertThreadResponse", targetNamespace = "http://Server/", className = "server.InsertThreadResponse")
    @Action(input = "http://Server/ChatServer/insertThreadRequest", output = "http://Server/ChatServer/insertThreadResponse")
    public int insertThread(
        @WebParam(name = "creatBy", targetNamespace = "")
        String creatBy,
        @WebParam(name = "createDate", targetNamespace = "")
        String createDate,
        @WebParam(name = "title", targetNamespace = "")
        String title,
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param loginID
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateLoginID", targetNamespace = "http://Server/", className = "server.ValidateLoginID")
    @ResponseWrapper(localName = "validateLoginIDResponse", targetNamespace = "http://Server/", className = "server.ValidateLoginIDResponse")
    @Action(input = "http://Server/ChatServer/validateLoginIDRequest", output = "http://Server/ChatServer/validateLoginIDResponse")
    public boolean validateLoginID(
        @WebParam(name = "loginID", targetNamespace = "")
        String loginID);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "closeDB", targetNamespace = "http://Server/", className = "server.CloseDB")
    @ResponseWrapper(localName = "closeDBResponse", targetNamespace = "http://Server/", className = "server.CloseDBResponse")
    @Action(input = "http://Server/ChatServer/closeDBRequest", output = "http://Server/ChatServer/closeDBResponse")
    public int closeDB();

    /**
     * 
     * @param password
     * @param loginID
     * @param nickname
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerUser", targetNamespace = "http://Server/", className = "server.RegisterUser")
    @ResponseWrapper(localName = "registerUserResponse", targetNamespace = "http://Server/", className = "server.RegisterUserResponse")
    @Action(input = "http://Server/ChatServer/registerUserRequest", output = "http://Server/ChatServer/registerUserResponse")
    public int registerUser(
        @WebParam(name = "nickname", targetNamespace = "")
        String nickname,
        @WebParam(name = "loginID", targetNamespace = "")
        String loginID,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "connectDB", targetNamespace = "http://Server/", className = "server.ConnectDB")
    @ResponseWrapper(localName = "connectDBResponse", targetNamespace = "http://Server/", className = "server.ConnectDBResponse")
    @Action(input = "http://Server/ChatServer/connectDBRequest", output = "http://Server/ChatServer/connectDBResponse")
    public int connectDB();

    /**
     * 
     * @param threadId
     * @param threadEditedBy
     * @param threadEditedDate
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEditUser", targetNamespace = "http://Server/", className = "server.UpdateEditUser")
    @ResponseWrapper(localName = "updateEditUserResponse", targetNamespace = "http://Server/", className = "server.UpdateEditUserResponse")
    @Action(input = "http://Server/ChatServer/updateEditUserRequest", output = "http://Server/ChatServer/updateEditUserResponse")
    public int updateEditUser(
        @WebParam(name = "threadEditedBy", targetNamespace = "")
        String threadEditedBy,
        @WebParam(name = "threadEditedDate", targetNamespace = "")
        String threadEditedDate,
        @WebParam(name = "threadId", targetNamespace = "")
        int threadId);

    /**
     * 
     * @return
     *     returns java.util.List<server.ViewEditUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEditedUser", targetNamespace = "http://Server/", className = "server.GetEditedUser")
    @ResponseWrapper(localName = "getEditedUserResponse", targetNamespace = "http://Server/", className = "server.GetEditedUserResponse")
    @Action(input = "http://Server/ChatServer/getEditedUserRequest", output = "http://Server/ChatServer/getEditedUserResponse")
    public List<ViewEditUser> getEditedUser();

    /**
     * 
     * @param threadId
     * @return
     *     returns java.util.List<server.ViewEditUser>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getThreadMessage", targetNamespace = "http://Server/", className = "server.GetThreadMessage")
    @ResponseWrapper(localName = "getThreadMessageResponse", targetNamespace = "http://Server/", className = "server.GetThreadMessageResponse")
    @Action(input = "http://Server/ChatServer/getThreadMessageRequest", output = "http://Server/ChatServer/getThreadMessageResponse")
    public List<ViewEditUser> getThreadMessage(
        @WebParam(name = "threadId", targetNamespace = "")
        String threadId);

    /**
     * 
     * @param threadid
     * @param editedBy
     * @param editedDate
     * @param message
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertMessage", targetNamespace = "http://Server/", className = "server.InsertMessage")
    @ResponseWrapper(localName = "insertMessageResponse", targetNamespace = "http://Server/", className = "server.InsertMessageResponse")
    @Action(input = "http://Server/ChatServer/insertMessageRequest", output = "http://Server/ChatServer/insertMessageResponse")
    public int insertMessage(
        @WebParam(name = "message", targetNamespace = "")
        String message,
        @WebParam(name = "threadid", targetNamespace = "")
        String threadid,
        @WebParam(name = "editedBy", targetNamespace = "")
        String editedBy,
        @WebParam(name = "editedDate", targetNamespace = "")
        String editedDate);

    /**
     * 
     * @param loginID
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCurrentUser", targetNamespace = "http://Server/", className = "server.GetCurrentUser")
    @ResponseWrapper(localName = "getCurrentUserResponse", targetNamespace = "http://Server/", className = "server.GetCurrentUserResponse")
    @Action(input = "http://Server/ChatServer/getCurrentUserRequest", output = "http://Server/ChatServer/getCurrentUserResponse")
    public String getCurrentUser(
        @WebParam(name = "loginID", targetNamespace = "")
        String loginID);

    /**
     * 
     * @param password
     * @param loginID
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateUser", targetNamespace = "http://Server/", className = "server.ValidateUser")
    @ResponseWrapper(localName = "validateUserResponse", targetNamespace = "http://Server/", className = "server.ValidateUserResponse")
    @Action(input = "http://Server/ChatServer/validateUserRequest", output = "http://Server/ChatServer/validateUserResponse")
    public boolean validateUser(
        @WebParam(name = "loginID", targetNamespace = "")
        String loginID,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
