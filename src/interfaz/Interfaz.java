package interfaz;
import estructura.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Interfaz {
    Iphone iphone = new Iphone();
    Ipads ipad = new Ipads();
    Airpods airpods = new Airpods();
    Carrito carrito = new Carrito();

    Scanner lector = new Scanner(System.in);
    Scanner lectorString = new Scanner(System.in);
    
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
                    System.exit(0);
                    break;
            } 
    }
