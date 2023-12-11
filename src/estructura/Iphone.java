package estructura;
import java.io.Serializable;
public class Iphone implements Serializable
{
    private String modelo;
    private String color;
    private int capacidad;
    
    public String getModelo()
    {
        return modelo;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public String toString()
    {
        return "Modelo -> ["+modelo+"] \nColor -> ["+color+"] \nCapacidad -> ["+capacidad+"GB]\n";
    }    
    
}
