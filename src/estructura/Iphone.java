package estructura;
import java.io.Serializable;
/**
 * La clase Iphone representa un objeto de tipo Iphone con propiedades como modelo, color y capacidad.
 * Implementa la interfaz Serializable, lo que permite que sus instancias se puedan convertir en una secuencia de bytes.
 */
public class Iphone implements Serializable
{
    private String modelo;// Modelo del iPhone
    private String color;// Color del iPhone
    private int capacidad;// Capacidad de almacenamiento del iPhone en GB
    
    /**
     * Obtiene el modelo del iPhone.
     * @return modelo del iPhone
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Establece el modelo del iPhone.
     * @param modelo Modelo a establecer
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * Obtiene el color del iPhone.
     * @return color del iPhone
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del iPhone.
     * @param color Color a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la capacidad de almacenamiento del iPhone.
     * @return capacidad de almacenamiento del iPhone
     */
    public int getCapacidad() {
        return capacidad;
    }

     /**
     * Establece la capacidad de almacenamiento del iPhone.
     * @param capacidad Capacidad a establecer
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * Devuelve una representación en cadena del objeto iPhone.
     * @return una cadena que representa el objeto iPhone
     */
    public String toString()
    {
        return "Modelo -> ["+modelo+"] \nColor -> ["+color+"] \nCapacidad -> ["+capacidad+"GB]\n";
    }    
    
}
