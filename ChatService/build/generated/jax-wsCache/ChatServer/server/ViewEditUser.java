
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viewEditUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viewEditUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadEditedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadEditedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viewEditUser", propOrder = {
    "message",
    "threadCreatedBy",
    "threadCreatedDate",
    "threadEditedBy",
    "threadEditedDate",
    "threadID",
    "threadTitle"
})
public class ViewEditUser {

    protected String message;
    protected String threadCreatedBy;
    protected String threadCreatedDate;
    protected String threadEditedBy;
    protected String threadEditedDate;
    protected String threadID;
    protected String threadTitle;

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
     * Gets the value of the threadCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadCreatedBy() {
        return threadCreatedBy;
    }

    /**
     * Sets the value of the threadCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadCreatedBy(String value) {
        this.threadCreatedBy = value;
    }

    /**
     * Gets the value of the threadCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadCreatedDate() {
        return threadCreatedDate;
    }

    /**
     * Sets the value of the threadCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadCreatedDate(String value) {
        this.threadCreatedDate = value;
    }

    /**
     * Gets the value of the threadEditedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadEditedBy() {
        return threadEditedBy;
    }

    /**
     * Sets the value of the threadEditedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadEditedBy(String value) {
        this.threadEditedBy = value;
    }

    /**
     * Gets the value of the threadEditedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadEditedDate() {
        return threadEditedDate;
    }

    /**
     * Sets the value of the threadEditedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadEditedDate(String value) {
        this.threadEditedDate = value;
    }

    /**
     * Gets the value of the threadID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadID() {
        return threadID;
    }

    /**
     * Sets the value of the threadID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadID(String value) {
        this.threadID = value;
    }

    /**
     * Gets the value of the threadTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadTitle() {
        return threadTitle;
    }

    /**
     * Sets the value of the threadTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadTitle(String value) {
        this.threadTitle = value;
    }

}
