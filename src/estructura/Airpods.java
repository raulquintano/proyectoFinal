package estructura;
import java.io.Serializable;
/**
 * La clase Airpods representa un objeto de tipo Airpods con propiedades como modelo y personalización.
 * Implementa la interfaz Serializable, lo que permite que sus instancias se puedan convertir en una secuencia de bytes.
 */
public class Airpods implements Serializable
{
    private String modelo;  // Modelo de los Airpods
    private String personalizacion;   // Personalización de los Airpods

    /**
     * Establece el modelo de los Airpods.
     * @param modelo Modelo a establecer
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * Obtiene el modelo de los Airpods.
     * @return modelo de los Airpods
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Establece la personalización de los Airpods.
     * @param personalizacion Personalización a establecer
     */
    public void setPersonalizacion(String personalizacion)
    {
        this.personalizacion = personalizacion;
    }

    /**
     * Obtiene la personalización de los Airpods.
     * @return personalización de los Airpods
     */
    public String getPersonalizacion()
    {
        return personalizacion;
    }
    
    /**
     * Devuelve una representación en cadena del objeto Airpods.
     * @return una cadena que representa el objeto Airpods
     */
    public String toString()
    {
        return "Modelo -> ["+modelo+"]\nPersonalización -> ["+personalizacion+"]";
    }
}