package estructura;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

/**
 * La clase Carrito proporciona las funcionalidades que almacenan los productos con los que se interactúa en el catálogo.
 * Permite al programa almacenar los productos seleccionados por el usuario y mostrarlos en el carrito de compras.
 */
public class Carrito implements Serializable {
    
    ArrayList<Iphone> carrito = new ArrayList<>();
    ArrayList<Ipads> carrito2 = new ArrayList<>();
    ArrayList<Airpods> carrito3 = new ArrayList<>();
    transient Scanner lectorString = new Scanner(System.in);
    transient Scanner lector = new Scanner(System.in);
    int total = 0;
    boolean salida = true;
    
    /**
     * Añade un producto de la clase Iphone al carrito de compras.
     * @param iphone El producto de la clase Iphone que se añade al carrito.
     */
    public void addIphone(Iphone iphone)
    {   
        if(iphone.getModelo().equalsIgnoreCase("Iphone 15 pro"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            System.out.println("-> Plata");
            iphone.setColor(lectorString.nextLine());
            if(!iphone.getColor().equalsIgnoreCase("Negro")&&!iphone.getColor().equalsIgnoreCase("Blanco")&&!iphone.getColor().equalsIgnoreCase("Plata"))
            {
                System.out.println("Color no disponible");
                iphone.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 128 GB || 1219€");
                System.out.println("-> 256 GB || 1349€");
                System.out.println("-> 512 GB || 1599€");
                System.out.println("0) Volver al menú principal");
                iphone.setCapacidad(lector.nextInt());
                if(iphone.getCapacidad()!=128&&iphone.getCapacidad()!=256&&iphone.getCapacidad()!=512&&iphone.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    iphone.setCapacidad(0);
                }
                else
                {
                    if(iphone.getCapacidad()==128)
                    {
                        total=total+1219;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==256)
                    {
                        total=total+1349;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==512)
                    {
                        total=total+1599;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==0)
                    {
                        salida = false;
                    }
                }              
            }
        }
        else if(iphone.getModelo().equalsIgnoreCase("Iphone 15"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Amarillo");
            System.out.println("-> Azul");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            iphone.setColor(lectorString.nextLine());
            if(!iphone.getColor().equalsIgnoreCase("Negro")&&!iphone.getColor().equalsIgnoreCase("Azul")&&!iphone.getColor().equalsIgnoreCase("Amarillo")&&!iphone.getColor().equalsIgnoreCase("Blanco"))
            {
                System.out.println("Color no disponible");
                iphone.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 128 GB || 959€");
                System.out.println("-> 256 GB || 1089€");
                System.out.println("-> 512 GB || 1339€");
                System.out.println("0) Volver al menú principal");
                iphone.setCapacidad(lector.nextInt());
                if(iphone.getCapacidad()!=128&&iphone.getCapacidad()!=256&&iphone.getCapacidad()!=512&&iphone.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    iphone.setCapacidad(0);
                }
                else
                {
                    if(iphone.getCapacidad()==128)
                    {
                        total=total+959;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==256)
                    {
                        total=total+1089;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==512)
                    {
                        total=total+1339;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==0)
                    {
                        salida = false;
                    }                        
                }              
            }
        }
        else if(iphone.getModelo().equalsIgnoreCase("Iphone XR"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            System.out.println("-> Rojo");
            System.out.println("-> Azul");
            System.out.println("-> Amarillo");
            System.out.println("-> Morado");
            iphone.setColor(lectorString.nextLine());
            if(!iphone.getColor().equalsIgnoreCase("Negro")&&!iphone.getColor().equalsIgnoreCase("Azul")&&!iphone.getColor().equalsIgnoreCase("Amarillo")&&!iphone.getColor().equalsIgnoreCase("Blanco")&&!iphone.getColor().equalsIgnoreCase("Rojo")&&!iphone.getColor().equalsIgnoreCase("Morado"))
            {
                System.out.println("Color no disponible");
                iphone.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 64 GB  || 229€");
                System.out.println("-> 128 GB || 279€");
                System.out.println("0) Volver al menú principal");
                iphone.setCapacidad(lector.nextInt());
                if(iphone.getCapacidad()!=128&&iphone.getCapacidad()!=64&&iphone.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    iphone.setCapacidad(0);
                }
                else
                {
                    if(iphone.getCapacidad()==64)
                    {
                        total=total+229;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==128)
                    {
                        total=total+279;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==0)
                    {
                        salida = false;
                    }    
                }              
            }
        }
        else if(iphone.getModelo().equalsIgnoreCase("Iphone SE"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            iphone.setColor(lectorString.nextLine());
            if(!iphone.getColor().equalsIgnoreCase("Negro")&&!iphone.getColor().equalsIgnoreCase("Blanco"))
            {
                System.out.println("Color no disponible");
                iphone.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 64 GB   || 529€");
                System.out.println("-> 128 GB  || 599€");
                System.out.println("-> 256 GB  || 729€");
                System.out.println("0) Volver al menú principal");
                iphone.setCapacidad(lector.nextInt());
                if(iphone.getCapacidad()!=128&&iphone.getCapacidad()!=64&&iphone.getCapacidad()!=256&&iphone.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    iphone.setCapacidad(0);
                }
                else
                {
                    if(iphone.getCapacidad()==64)
                    {
                        total=total+529;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==128)
                    {
                        total=total+599;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==256)
                    {
                        total=total+729;
                        carrito.add(iphone);
                        System.out.println("Añadido correctamente");
                    }
                    else if(iphone.getCapacidad()==0)
                    {
                        salida = false;
                    }            
                }              
            }
        }
        else
        {
            System.out.println("Modelo no disponible");
        }
              
    }
    
    /**
     * Añade un producto de la clase Ipads al carrito de compras.
     * @param ipad El producto de la clase Ipads que se añade al carrito.
     */
    public void addIpad(Ipads ipad)
    {
        if(ipad.getModelo().equalsIgnoreCase("Ipad Pro"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Gris Espacial");
            System.out.println("-> Plata");
            ipad.setColor(lectorString.nextLine());
            if(!ipad.getColor().equalsIgnoreCase("Plata")&&!ipad.getColor().equalsIgnoreCase("Gris Espacial"))
            {
                System.out.println("Color no disponible");
                ipad.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 256 GB   || 1179€");
                System.out.println("-> 512 GB   || 1429€ ");
                System.out.println("-> 1024 GB  || 1929€");
                System.out.println("0) Volver al menú principal");

                ipad.setCapacidad(lector.nextInt());
                if(ipad.getCapacidad()!=1024&&ipad.getCapacidad()!=256&&ipad.getCapacidad()!=512&&ipad.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    ipad.setCapacidad(0);
                }
                else
                {
                    if(ipad.getCapacidad()==256)
                    {
                        total=total+1179;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==512)
                    {
                        total=total+1429;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==1024)
                    {
                        total=total+1929;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==0)
                    {
                        salida = false;
                    }                     
                }              
            }
        }
        else if(ipad.getModelo().equalsIgnoreCase("Ipad Mini"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            ipad.setColor(lectorString.nextLine());
            if(!ipad.getColor().equalsIgnoreCase("Negro")&&!ipad.getColor().equalsIgnoreCase("Blanco"))
            {
                System.out.println("Color no disponible");
                ipad.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 64 GB  || 649€");
                System.out.println("-> 256 GB || 849€");
                System.out.println("0) Volver al menú principal");
                ipad.setCapacidad(lector.nextInt());
                if(ipad.getCapacidad()!=64&&ipad.getCapacidad()!=256&&ipad.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    ipad.setCapacidad(0);
                }
                else
                {
                    if(ipad.getCapacidad()==64)
                    {
                        total=total+649;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==256)
                    {
                        total=total+849;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==0)
                    {
                        salida = false;
                    }   
                    
                }              
            }
        }
        else if(ipad.getModelo().equalsIgnoreCase("Ipad Air"))
        {
            System.out.println("Seleccione uno de los colores disponibles: ");
            System.out.println("-> Negro");
            System.out.println("-> Blanco");
            ipad.setColor(lectorString.nextLine());
            if(!ipad.getColor().equalsIgnoreCase("Negro")&&!ipad.getColor().equalsIgnoreCase("Blanco"))
            {
                System.out.println("Color no disponible");
                ipad.setColor(null);
            }
            else
            {
                System.out.println("Escoja la capacidad: ");
                System.out.println("-> 64 GB  || 769€");
                System.out.println("-> 256 GB || 969€");
                System.out.println("0) Volver al menú principal");
                

                ipad.setCapacidad(lector.nextInt());
                if(ipad.getCapacidad()!=256&&ipad.getCapacidad()!=64&&ipad.getCapacidad()!=0)
                {
                    System.out.println("Capacidad no disponible");
                    ipad.setCapacidad(0);
                }
                else
                {
                    if(ipad.getCapacidad()==64)
                    {
                        total=total+769;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==256)
                    {
                        total=total+969;
                        carrito2.add(ipad);
                        System.out.println("Añadido correctamente");
                    }
                    else if(ipad.getCapacidad()==0)
                    {
                        salida = false;
                    }  
                }              
            }
        }
        else
        {
            System.out.println("Modelo no disponible");
        }
    }
    
    /**
     * Añade un producto de la clase Airpods al carrito de compras.
     * @param airpods El producto de la clase Airpods que se añade al carrito.
     */
    public void addAirpods(Airpods airpods)
    {
        if(airpods.getModelo().equalsIgnoreCase("Airpods 3") || airpods.getModelo().equalsIgnoreCase("Airpods pro") || airpods.getModelo().equalsIgnoreCase("Airpods Max"))
        {
            if(airpods.getModelo().equalsIgnoreCase("Airpods 3"))
            {
                System.out.println("¿Quieres personalizarlos?");
                System.out.println("1) Si");
                System.out.println("2) No");
                System.out.println("0) Volver al menú principal");
                int opcion = lector.nextInt();
                if(opcion == 1)
                {
                    System.out.println("Introduzca el nombre personalizado:");
                    airpods.setPersonalizacion(lectorString.nextLine());
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +200;
                }
                else if(opcion == 2)
                {
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +200;
                }
                else if(opcion == 0)
                {
                    salida = false;
                }
            }
            else if(airpods.getModelo().equalsIgnoreCase("Airpods pro"))
            {
                System.out.println("¿Quieres personalizarlos?");
                System.out.println("1) Si");
                System.out.println("2) No");
                System.out.println("0) Volver al menú principal");
                int opcion = lector.nextInt();
                if(opcion == 1)
                {
                    System.out.println("Introduzca el nombre personalizado:");
                    airpods.setPersonalizacion(lectorString.nextLine());
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +279;
                }
                else if(opcion == 2)
                {
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +279;
                }
                else if(opcion == 0)
                {
                    salida = false;
                }
            }
            else if(airpods.getModelo().equalsIgnoreCase("Airpods Max"))
            {
                System.out.println("¿Quieres personalizarlos?");
                System.out.println("1) Si");
                System.out.println("2) No");
                System.out.println("0) Volver al menú principal");
                int opcion = lector.nextInt();
                if(opcion == 1)
                {
                    System.out.println("Introduzca el nombre personalizado:");
                    airpods.setPersonalizacion(lectorString.nextLine());
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +579;
                }
                else if(opcion == 2)
                {
                    carrito3.add(airpods);
                    System.out.println("Añadido correctamente");
                    total = total +579;
                }
                else if(opcion == 0)
                {
                    salida = false;
                }
            }         
        }
        else
        {
            System.out.println("Modelo no disponible");
        }
    } 
    
    /**
     * Muestra el carrito de compras con los productos añadidos.
     */
    public void mostrarCarrito()
    {
        System.out.println("CARRITO");
        System.out.println("-------------------------------");
        for(Iphone n : carrito)
        {
            System.out.println(n);
        }
        
        for(Ipads n : carrito2)
        {
            System.out.println(n);
        }
        
        for(Airpods n : carrito3)
        {
            System.out.println(n);
        }
        System.out.println("TOTAL: "+total+"€");
    }
    
    
    /**
     * Elimina un producto del carrito de compras.
     * @param iphone El producto de la clase Iphone que se elimina del carrito.
     * @param ipad El producto de la clase Ipads que se elimina del carrito.
     * @param airpods El producto de la clase Airpods que se elimina del carrito.
     */
    public void eliminarProducto(Iphone iphone, Ipads ipad, Airpods airpods)
    {
        System.out.println("¿Qué producto desea retirar de la cesta?");
        String productoEliminado = lectorString.nextLine();
        if(productoEliminado.equalsIgnoreCase(iphone.getModelo()))
        {
            for(int i = 0;i < carrito.size();i++)
            {
                Iphone iphone1 = carrito.get(i);
                if (productoEliminado.equalsIgnoreCase("Iphone 15 pro")&&iphone.getCapacidad()==128) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1219;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone 15 pro")&&iphone.getCapacidad()==256) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1349;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone 15 pro")&&iphone.getCapacidad()==512) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1599;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone 15")&&iphone.getCapacidad()==128) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 959;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone 15")&&iphone.getCapacidad()==256) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1089;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone 15")&&iphone.getCapacidad()==512) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1599;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone XR")&&iphone.getCapacidad()==64) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 229;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone XR")&&iphone.getCapacidad()==128) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 279;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone SE")&&iphone.getCapacidad()==64) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 529;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone SE")&&iphone.getCapacidad()==128) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 599;
                }
                else if (productoEliminado.equalsIgnoreCase("Iphone SE")&&iphone.getCapacidad()==256) 
                {
                    carrito.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 729;
                }
                else
                {
                    System.out.println("Producto no encontrado");
                }
            }
        }
        else if(productoEliminado.equalsIgnoreCase(ipad.getModelo()))
        {
            for(int i = 0;i < carrito2.size();i++)
            {
                Ipads ipad1 = carrito2.get(i);
                if (productoEliminado.equalsIgnoreCase("Ipad pro")&&ipad.getCapacidad()==256) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1179;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad pro")&&ipad.getCapacidad()==512) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1429;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad pro")&&ipad.getCapacidad()==1024) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 1929;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad mini")&&ipad.getCapacidad()==64) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 649;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad mini")&&ipad.getCapacidad()==256) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 849;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad air")&&ipad.getCapacidad()==64) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 769;
                }
                else if (productoEliminado.equalsIgnoreCase("Ipad air")&&ipad.getCapacidad()==256) 
                {
                    carrito2.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 969;
                }
                else
                {
                    System.out.println("Producto no encontrado");
                }              
            }
        }
        else if(productoEliminado.equalsIgnoreCase(airpods.getModelo()))
        {
            for(int i = 0;i < carrito3.size();i++)
            {
                Airpods airpods1 = carrito3.get(i);
                if (productoEliminado.equalsIgnoreCase("Airpods 3")) 
                {
                    carrito3.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 200;
                }
                else if (productoEliminado.equalsIgnoreCase("Airpods pro")) 
                {
                    carrito3.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 279;
                }
                else if (productoEliminado.equalsIgnoreCase("Airpods Max")) 
                {
                    carrito3.remove(i);
                    System.out.println("Producto eliminado correctamente");
                    System.out.println("");
                    total = total - 579;
                }
            }
        }
        else
        {
            System.out.println("Producto no encontrado");
        }        
    }   

    /**
     * Devuelve el valor del objeto.
     * @return El valor del objeto.
     */
    public String toString()
    {
        return carrito.toString() + carrito2.toString() + carrito3.toString();
    }
    
}
