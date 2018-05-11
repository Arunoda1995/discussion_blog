
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="editedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertMessage", propOrder = {
    "message",
    "threadid",
    "editedBy",
    "editedDate"
})
public class InsertMessage {

    protected String message;
    protected String threadid;
    protected String editedBy;
    protected String editedDate;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the threadid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadid() {
        return threadid;
    }

    /**
     * Sets the value of the threadid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadid(String value) {
        this.threadid = value;
    }

    /**
     * Gets the value of the editedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedBy() {
        return editedBy;
    }

    /**
     * Sets the value of the editedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedBy(String value) {
        this.editedBy = value;
    }

    /**
     * Gets the value of the editedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditedDate() {
        return editedDate;
    }

    /**
     * Sets the value of the editedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditedDate(String value) {
        this.editedDate = value;
    }

}
