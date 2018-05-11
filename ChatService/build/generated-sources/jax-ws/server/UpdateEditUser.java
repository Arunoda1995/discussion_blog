
package server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateEditUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEditUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threadEditedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadEditedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="threadId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEditUser", propOrder = {
    "threadEditedBy",
    "threadEditedDate",
    "threadId"
})
public class UpdateEditUser {

    protected String threadEditedBy;
    protected String threadEditedDate;
    protected int threadId;

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
     * Gets the value of the threadId property.
     * 
     */
    public int getThreadId() {
        return threadId;
    }

    /**
     * Sets the value of the threadId property.
     * 
     */
    public void setThreadId(int value) {
        this.threadId = value;
    }

}
