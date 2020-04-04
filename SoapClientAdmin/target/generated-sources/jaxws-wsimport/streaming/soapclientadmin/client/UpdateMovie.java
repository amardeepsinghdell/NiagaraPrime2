
package streaming.soapclientadmin.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateMovie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateMovie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateMovie" type="{http://services.soapservice.streaming/}movies" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMovie", propOrder = {
    "updateMovie"
})
public class UpdateMovie {

    protected Movies updateMovie;

    /**
     * Gets the value of the updateMovie property.
     * 
     * @return
     *     possible object is
     *     {@link Movies }
     *     
     */
    public Movies getUpdateMovie() {
        return updateMovie;
    }

    /**
     * Sets the value of the updateMovie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Movies }
     *     
     */
    public void setUpdateMovie(Movies value) {
        this.updateMovie = value;
    }

}
