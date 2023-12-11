package estructura;

public class Airpods {
    
    private String modelo;
    private String personalizacion;
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public String getModelo()
    {
        return modelo;
    }
    
    public void setPersonalizacion(String personalizacion)
    {
        this.personalizacion = personalizacion;
    }
    public String getPersonalizacion()
    {
        return personalizacion;
    }
    
    public String toString()
    {
        return "Modelo -> ["+modelo+"]\nPersonalización -> ["+personalizacion+"]";
    }
}
