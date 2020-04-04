
package streaming.soapclientadmin.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moviesAdd" type="{http://services.soapservice.streaming/}movies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMovie", propOrder = {
    "moviesAdd"
})
public class AddMovie {

    protected Movies moviesAdd;

    /**
     * Gets the value of the moviesAdd property.
     * 
     * @return
     *     possible object is
     *     {@link Movies }
     *     
     */
    public Movies getMoviesAdd() {
        return moviesAdd;
    }

    /**
     * Sets the value of the moviesAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Movies }
     *     
     */
    public void setMoviesAdd(Movies value) {
        this.moviesAdd = value;
    }

}
