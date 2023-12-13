package principal;
import estructura.Carrito;
import interfaz.*;


/**
 * La clase Main es la clase principal del programa.
 * Contiene el método main que inicia el programa.
 */
public class Main {

    /**
     * Método main que inicia el programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Interfaz interfaz = new Interfaz();
        interfaz.leer();
        interfaz.mostrarCatalogo();
    }
    
}
