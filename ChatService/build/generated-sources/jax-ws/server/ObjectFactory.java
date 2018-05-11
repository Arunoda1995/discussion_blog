
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdateEditUserResponse_QNAME = new QName("http://Server/", "updateEditUserResponse");
    private final static QName _ValidateUser_QNAME = new QName("http://Server/", "validateUser");
    private final static QName _ConnectDB_QNAME = new QName("http://Server/", "connectDB");
    private final static QName _CloseDB_QNAME = new QName("http://Server/", "closeDB");
    private final static QName _RegisterUserResponse_QNAME = new QName("http://Server/", "registerUserResponse");
    private final static QName _GetCurrentUserResponse_QNAME = new QName("http://Server/", "getCurrentUserResponse");
    private final static QName _InsertThread_QNAME = new QName("http://Server/", "insertThread");
    private final static QName _ValidateLoginID_QNAME = new QName("http://Server/", "validateLoginID");
    private final static QName _GetEditedUserResponse_QNAME = new QName("http://Server/", "getEditedUserResponse");
    private final static QName _InsertThreadResponse_QNAME = new QName("http://Server/", "insertThreadResponse");
    private final static QName _RegisterUser_QNAME = new QName("http://Server/", "registerUser");
    private final static QName _GetThreadMessage_QNAME = new QName("http://Server/", "getThreadMessage");
    private final static QName _GetThreadMessageResponse_QNAME = new QName("http://Server/", "getThreadMessageResponse");
    private final static QName _InsertMessageResponse_QNAME = new QName("http://Server/", "insertMessageResponse");
    private final static QName _UpdateEditUser_QNAME = new QName("http://Server/", "updateEditUser");
    private final static QName _GetCurrentUser_QNAME = new QName("http://Server/", "getCurrentUser");
    private final static QName _InsertMessage_QNAME = new QName("http://Server/", "insertMessage");
    private final static QName _CloseDBResponse_QNAME = new QName("http://Server/", "closeDBResponse");
    private final static QName _ValidateLoginIDResponse_QNAME = new QName("http://Server/", "validateLoginIDResponse");
    private final static QName _GetEditedUser_QNAME = new QName("http://Server/", "getEditedUser");
    private final static QName _ConnectDBResponse_QNAME = new QName("http://Server/", "connectDBResponse");
    private final static QName _ValidateUserResponse_QNAME = new QName("http://Server/", "validateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertMessage }
     * 
     */
    public InsertMessage createInsertMessage() {
        return new InsertMessage();
    }

    /**
     * Create an instance of {@link GetCurrentUser }
     * 
     */
    public GetCurrentUser createGetCurrentUser() {
        return new GetCurrentUser();
    }

    /**
     * Create an instance of {@link GetThreadMessage }
     * 
     */
    public GetThreadMessage createGetThreadMessage() {
        return new GetThreadMessage();
    }

    /**
     * Create an instance of {@link GetThreadMessageResponse }
     * 
     */
    public GetThreadMessageResponse createGetThreadMessageResponse() {
        return new GetThreadMessageResponse();
    }

    /**
     * Create an instance of {@link InsertMessageResponse }
     * 
     */
    public InsertMessageResponse createInsertMessageResponse() {
        return new InsertMessageResponse();
    }

    /**
     * Create an instance of {@link UpdateEditUser }
     * 
     */
    public UpdateEditUser createUpdateEditUser() {
        return new UpdateEditUser();
    }

    /**
     * Create an instance of {@link ConnectDBResponse }
     * 
     */
    public ConnectDBResponse createConnectDBResponse() {
        return new ConnectDBResponse();
    }

    /**
     * Create an instance of {@link ValidateUserResponse }
     * 
     */
    public ValidateUserResponse createValidateUserResponse() {
        return new ValidateUserResponse();
    }

    /**
     * Create an instance of {@link GetEditedUser }
     * 
     */
    public GetEditedUser createGetEditedUser() {
        return new GetEditedUser();
    }

    /**
     * Create an instance of {@link CloseDBResponse }
     * 
     */
    public CloseDBResponse createCloseDBResponse() {
        return new CloseDBResponse();
    }

    /**
     * Create an instance of {@link ValidateLoginIDResponse }
     * 
     */
    public ValidateLoginIDResponse createValidateLoginIDResponse() {
        return new ValidateLoginIDResponse();
    }

    /**
     * Create an instance of {@link CloseDB }
     * 
     */
    public CloseDB createCloseDB() {
        return new CloseDB();
    }

    /**
     * Create an instance of {@link ConnectDB }
     * 
     */
    public ConnectDB createConnectDB() {
        return new ConnectDB();
    }

    /**
     * Create an instance of {@link ValidateUser }
     * 
     */
    public ValidateUser createValidateUser() {
        return new ValidateUser();
    }

    /**
     * Create an instance of {@link UpdateEditUserResponse }
     * 
     */
    public UpdateEditUserResponse createUpdateEditUserResponse() {
        return new UpdateEditUserResponse();
    }

    /**
     * Create an instance of {@link InsertThreadResponse }
     * 
     */
    public InsertThreadResponse createInsertThreadResponse() {
        return new InsertThreadResponse();
    }

    /**
     * Create an instance of {@link RegisterUser }
     * 
     */
    public RegisterUser createRegisterUser() {
        return new RegisterUser();
    }

    /**
     * Create an instance of {@link GetEditedUserResponse }
     * 
     */
    public GetEditedUserResponse createGetEditedUserResponse() {
        return new GetEditedUserResponse();
    }

    /**
     * Create an instance of {@link ValidateLoginID }
     * 
     */
    public ValidateLoginID createValidateLoginID() {
        return new ValidateLoginID();
    }

    /**
     * Create an instance of {@link GetCurrentUserResponse }
     * 
     */
    public GetCurrentUserResponse createGetCurrentUserResponse() {
        return new GetCurrentUserResponse();
    }

    /**
     * Create an instance of {@link InsertThread }
     * 
     */
    public InsertThread createInsertThread() {
        return new InsertThread();
    }

    /**
     * Create an instance of {@link RegisterUserResponse }
     * 
     */
    public RegisterUserResponse createRegisterUserResponse() {
        return new RegisterUserResponse();
    }

    /**
     * Create an instance of {@link ViewEditUser }
     * 
     */
    public ViewEditUser createViewEditUser() {
        return new ViewEditUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEditUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "updateEditUserResponse")
    public JAXBElement<UpdateEditUserResponse> createUpdateEditUserResponse(UpdateEditUserResponse value) {
        return new JAXBElement<UpdateEditUserResponse>(_UpdateEditUserResponse_QNAME, UpdateEditUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateUser")
    public JAXBElement<ValidateUser> createValidateUser(ValidateUser value) {
        return new JAXBElement<ValidateUser>(_ValidateUser_QNAME, ValidateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "connectDB")
    public JAXBElement<ConnectDB> createConnectDB(ConnectDB value) {
        return new JAXBElement<ConnectDB>(_ConnectDB_QNAME, ConnectDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "closeDB")
    public JAXBElement<CloseDB> createCloseDB(CloseDB value) {
        return new JAXBElement<CloseDB>(_CloseDB_QNAME, CloseDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "registerUserResponse")
    public JAXBElement<RegisterUserResponse> createRegisterUserResponse(RegisterUserResponse value) {
        return new JAXBElement<RegisterUserResponse>(_RegisterUserResponse_QNAME, RegisterUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getCurrentUserResponse")
    public JAXBElement<GetCurrentUserResponse> createGetCurrentUserResponse(GetCurrentUserResponse value) {
        return new JAXBElement<GetCurrentUserResponse>(_GetCurrentUserResponse_QNAME, GetCurrentUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "insertThread")
    public JAXBElement<InsertThread> createInsertThread(InsertThread value) {
        return new JAXBElement<InsertThread>(_InsertThread_QNAME, InsertThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateLoginID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateLoginID")
    public JAXBElement<ValidateLoginID> createValidateLoginID(ValidateLoginID value) {
        return new JAXBElement<ValidateLoginID>(_ValidateLoginID_QNAME, ValidateLoginID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditedUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getEditedUserResponse")
    public JAXBElement<GetEditedUserResponse> createGetEditedUserResponse(GetEditedUserResponse value) {
        return new JAXBElement<GetEditedUserResponse>(_GetEditedUserResponse_QNAME, GetEditedUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "insertThreadResponse")
    public JAXBElement<InsertThreadResponse> createInsertThreadResponse(InsertThreadResponse value) {
        return new JAXBElement<InsertThreadResponse>(_InsertThreadResponse_QNAME, InsertThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "registerUser")
    public JAXBElement<RegisterUser> createRegisterUser(RegisterUser value) {
        return new JAXBElement<RegisterUser>(_RegisterUser_QNAME, RegisterUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getThreadMessage")
    public JAXBElement<GetThreadMessage> createGetThreadMessage(GetThreadMessage value) {
        return new JAXBElement<GetThreadMessage>(_GetThreadMessage_QNAME, GetThreadMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThreadMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getThreadMessageResponse")
    public JAXBElement<GetThreadMessageResponse> createGetThreadMessageResponse(GetThreadMessageResponse value) {
        return new JAXBElement<GetThreadMessageResponse>(_GetThreadMessageResponse_QNAME, GetThreadMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "insertMessageResponse")
    public JAXBElement<InsertMessageResponse> createInsertMessageResponse(InsertMessageResponse value) {
        return new JAXBElement<InsertMessageResponse>(_InsertMessageResponse_QNAME, InsertMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEditUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "updateEditUser")
    public JAXBElement<UpdateEditUser> createUpdateEditUser(UpdateEditUser value) {
        return new JAXBElement<UpdateEditUser>(_UpdateEditUser_QNAME, UpdateEditUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getCurrentUser")
    public JAXBElement<GetCurrentUser> createGetCurrentUser(GetCurrentUser value) {
        return new JAXBElement<GetCurrentUser>(_GetCurrentUser_QNAME, GetCurrentUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "insertMessage")
    public JAXBElement<InsertMessage> createInsertMessage(InsertMessage value) {
        return new JAXBElement<InsertMessage>(_InsertMessage_QNAME, InsertMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CloseDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "closeDBResponse")
    public JAXBElement<CloseDBResponse> createCloseDBResponse(CloseDBResponse value) {
        return new JAXBElement<CloseDBResponse>(_CloseDBResponse_QNAME, CloseDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateLoginIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateLoginIDResponse")
    public JAXBElement<ValidateLoginIDResponse> createValidateLoginIDResponse(ValidateLoginIDResponse value) {
        return new JAXBElement<ValidateLoginIDResponse>(_ValidateLoginIDResponse_QNAME, ValidateLoginIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditedUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getEditedUser")
    public JAXBElement<GetEditedUser> createGetEditedUser(GetEditedUser value) {
        return new JAXBElement<GetEditedUser>(_GetEditedUser_QNAME, GetEditedUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConnectDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "connectDBResponse")
    public JAXBElement<ConnectDBResponse> createConnectDBResponse(ConnectDBResponse value) {
        return new JAXBElement<ConnectDBResponse>(_ConnectDBResponse_QNAME, ConnectDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "validateUserResponse")
    public JAXBElement<ValidateUserResponse> createValidateUserResponse(ValidateUserResponse value) {
        return new JAXBElement<ValidateUserResponse>(_ValidateUserResponse_QNAME, ValidateUserResponse.class, null, value);
    }

}
