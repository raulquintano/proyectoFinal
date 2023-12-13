package interfaz;
import estructura.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * La clase Interfaz proporciona una interfaz de usuario para interactuar con el catálogo de productos de Apple.
 * Permite al usuario seleccionar productos y agregarlos a un carrito de compras.
 */
public class Interfaz {
    Iphone iphone = new Iphone();
    Ipads ipad = new Ipads();
    Airpods airpods = new Airpods();
    Carrito carrito = new Carrito();

    Scanner lector = new Scanner(System.in);
    Scanner lectorString = new Scanner(System.in);
     
    /**
     * Muestra el catálogo de productos y proporciona un menú para que el usuario interactúe con el catálogo.
     * El usuario puede seleccionar productos para agregar al carrito de compras.
     */
    public void mostrarCatalogo()
    {
        int opcion;
        boolean salir = true;
        
            System.out.println("-------------------------------");
            System.out.println("BIENVENIDO AL CATALOGO DE APPLE");
            System.out.println("-------------------------------");
            System.out.println("1) Iphones");
            System.out.println("2) Ipads");
            System.out.println("3) Airpods");
            System.out.println("4) Carrito");
            System.out.println("5) Gestionar carrito");
            System.out.println("6) Salir");
            System.out.println("");
            opcion = lector.nextInt();
            
            switch(opcion)
            {
                case 1:        
                    iphone = new Iphone();
                    System.out.println("Modelos disponibles:");
                    System.out.println("");
                    System.out.println("-> Iphone 15 pro");
                    System.out.println("-> Iphone 15");
                    System.out.println("-> Iphone XR");
                    System.out.println("-> Iphone SE");
                    System.out.println("--teclee el modelo que desea--");
                    iphone.setModelo(lectorString.nextLine());
                    carrito.addIphone(iphone);
                    mostrarCatalogo();
                    break;
                
                case 2:                    
                    ipad = new Ipads();
                    System.out.println("Modelos disponibles:");
                    System.out.println("");
                    System.out.println("-> Ipad Pro");
                    System.out.println("-> Ipad Mini");
                    System.out.println("-> Ipad Air");
                    System.out.println("--teclee el modelo que desea--");
                    ipad.setModelo(lectorString.nextLine());
                    carrito.addIpad(ipad);
                    mostrarCatalogo();
                    break;
                case 3:
                    airpods = new Airpods();
                    System.out.println("Modelos disponibles:");
                    System.out.println("-> Airpods 3");
                    System.out.println("-> Airpods pro");
                    System.out.println("-> Airpods Max");
                    System.out.println("--teclee el modelo que desea--");
                    airpods.setModelo(lectorString.nextLine());
                    carrito.addAirpods(airpods);
                    mostrarCatalogo();
                    break;


                case 4:
                    carrito.mostrarCarrito();
                    mostrarCatalogo();
                    break;
                
                case 5:
                    carrito.eliminarProducto(iphone, ipad, airpods);
                    mostrarCatalogo();
                    break;
                case 6:
                    System.out.println("----------------------------");
                    System.out.println("Gracias por usar el catálogo");
                    System.out.println("----------------------------");
                    salir = false;
                    grabar();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no disponible");
                    mostrarCatalogo();
            } 
    }

    /**
     * Lee el estado actual del carrito de compras desde un archivo.
     * El estado del carrito se guarda en un archivo llamado "carrito.ser".
     */
    public void leer() {
        try {
            FileOutputStream fileOut = new FileOutputStream("carrito.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(carrito);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    /**
     * Guarda el estado actual del carrito de compras en un archivo.
     * El estado del carrito se guarda en un archivo llamado "carrito.ser".
     */
    public void grabar() {
        try {
            FileInputStream fileIn = new FileInputStream("carrito.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            carrito = (Carrito) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Grabado correctamente");
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("ERROR");
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("ERROR");
            c.printStackTrace();
            return;
        }

    }
}