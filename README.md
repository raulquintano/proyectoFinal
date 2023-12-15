# CATALOGO APPLE

Este programa simula el uso de un catálogo de productos de la marca Apple, donde usted puede añadir y eliminar los productos disponibles, además de visualizarlos en el carrito de compra.

## Estado del proyecto

Finalizado. Listo para su uso.

## Instalación

Clona el repositorio de este proyecto de GitHub y péguelo en el directorio que desee.
https://github.com/raulquintano/proyectoFinal.git


## Funcionamiento

Tras ejecutar el programa, se mostrará un menú por pantalla con los distintos productos disponibles (Iphone, Ipad y Airpods), además de un apartado de 'Carrito' el cual muestra los productos añadidos, y otro apartado de 'Gestionar carrito' el cual permite remover los productos añadidos que usted no quiera. 

Para acceder a cada apartado del menú, deberá pulsar una de las opciones disponibles (Números del 1 al 6), de lo contrario, se volverá a mostrar el menú con un mensaje de "Opción no disponible".

Pulsando 1, accederá al apartado de 'Iphones' donde tendrá 4 modelos disponibles. Escribiendo el modelo que desee, (si lo introdujo correctamente sin importar mayusculas y minusculas), se le pedirá que seleccione el color que le gusta tecleándolo en la interfaz, y finalmente deberá seleccionar la capacidad pulsando el número correspondiente. En este último apartado, si se arrepiente de querer añadir el Iphone, puede pulsar 'O' y volver al menú principal. También cabe destacar que se muestran los distintos precios dependiendo de la capacidad del dispositivo. 

Pulsando 2, accederá al apartado de 'Ipads', cuya funcionalidad es exactamente igual que la de 'Iphones'.

Pulsando 3, accederá al apartado de 'Airpods', donde tendrá 3 modelos disponibles. Escribiendo el modelo que desee, (si lo introdujo correctamente sin importar mayusculas y minusculas), se le preguntará si quiere personalizarlos (consiste en introducir un nombre personalizado para sus nuevos auriculares) o no, de modo que pulsando 1 se le pedirá que introduzca el nombre que usted quiera personalizar y pulsando 2 se añadirá su producto al carrito. De igual manera que en los anteriores apartados, si se arrepiente de querer comprar el producto, si pulsa '0' volverá al menú principal.

Pulsando 4, podrá visualizar el carrito mostrando todos los productos añadidos con sus distintos atributos (Modelo, color, capacidad, personalización si tiene...), además de mostrar el precio total de los productos de carrito.

Pulsando 5, podrá gestionar el carrito, de modo que puede eliminar el producto que desea del carrito (y por supuesto, resta su precio al total del carrito, ya que ha sido eliminado). Puede eliminar tantos como quiera.

Finalmente, pulsando 6, saldrá del programa, grabando toda la información procesada durante su ejecución mediante la serialización.

## Diagrama UMl

[UML](UMLCatalogo.png)
En este archivo se puede visualizar la estructura del programa

## Licencia

Este programa tiene una licencia Apache 2.0. Para ver la licencia completa entre al archivo [LICENSE](LICENSE)