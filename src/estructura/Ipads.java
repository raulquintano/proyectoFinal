package estructura;
import java.io.Serializable;
/**
 * La clase Iphone representa un objeto de tipo Iphone con propiedades como modelo, color y capacidad.
 * Implementa la interfaz Serializable, lo que permite que sus instancias se puedan convertir en una secuencia de bytes.
 */
public class Ipads implements Serializable
{
    private String modelo;  // Modelo del iPad
    private String color;   // Color del iPad
    private int capacidad;  // Capacidad de almacenamiento del iPad en GB

    /**
     * Obtiene el modelo del iPad.
     * @return modelo del iPad
     */
    public String getModelo()
    {
        return modelo;
    }
    
    /**
     * Establece el modelo del iPad.
     * @param modelo Modelo a establecer
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    /**
     * Obtiene el color del iPad.
     * @return color del iPad
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del iPad.
     * @param color Color a establecer
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene la capacidad de almacenamiento del iPad.
     * @return capacidad de almacenamiento del iPad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad de almacenamiento del iPad.
     * @param capacidad Capacidad a establecer
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /**
     * Devuelve una representación en cadena del objeto iPad.
     * @return una cadena que representa el objeto iPad
     */
    public String toString()
    {
        return "Modelo -> ["+modelo+"] \nColor -> ["+color+"] \nCapacidad -> ["+capacidad+"GB]\n";
    }    
    
}
