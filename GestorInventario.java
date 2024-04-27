
package todocode.gestorinventario;

import java.util.Scanner;


public class GestorInventario {

    public static void main(String[] args) {
       String productos[] = new String[4];
       String productoBuscado = "";
       String respuestaComprar = "";
       int cant;
       int cantEntrada;
       int cantSalida;
       
       

       
       int i;
       boolean disponible;
       
       //teclado para los strings salida 
       Scanner teclado = new Scanner(System.in);
       //teclado para los numeros
       Scanner teclado2 = new Scanner(System.in);
       
       //Rellenar vector
       for (i=0;i<productos.length;i++){
           System.out.println("Ingrese un producto");
           productos[i] = teclado.nextLine();
       } 
      
        System.out.println("Que producto desea buscar");
        productoBuscado = teclado.nextLine();

        disponible = false;
        
         for (i=0;i<productos.length;i++){
             if(productos[i].equalsIgnoreCase(productoBuscado)){
                 disponible = true;
             }
       } 
         
       if(disponible == true){
           System.out.println("Disponible");
       } else{
           System.out.println("No disponible");
       }
       
       
       
       switch(productoBuscado){
           case "compresor": cant = 10;
           break;
           case "manometro": cant = 10;
           break;
           case "termostato": cant = 10;
           break;
           case "motor": cant = 10;
           break;
           case "capacitor": cant = 10;
           break;
           default: cant = 0;
       }
       
        System.out.println("Producto: " + productoBuscado);
        System.out.println("Cantidad: " + cant);
        
       
        
       String respuesta = "";
       while (cant>0 && !respuesta.equalsIgnoreCase("no")){
      
         while (cant>0 && !respuesta.equalsIgnoreCase("no")){
         
         System.out.println("Desea vender? ");
         respuesta = teclado.nextLine();     
         System.out.println("Cuantas unidades");
         cantSalida = teclado2.nextInt();
         cant = cant - cantSalida;
         System.out.println("Producto: " + productoBuscado);
         System.out.println("Cantidad: " + cant);
         
         
         if(cant==0){
              System.out.println("Desea comprar? ");
              respuestaComprar = teclado.nextLine(); 
         }
        }
        
       

        while(cant==0 && !respuestaComprar.equalsIgnoreCase("no")){
         
          System.out.println("Cuantas unidades");
          cantEntrada = teclado2.nextInt();
          cant = cant + cantEntrada;
          System.out.println("Producto: " + productoBuscado);
          System.out.println("Cantidad: " + cant);
          
          
         }
        
         
        
       }
       
       //ACTUALIZACION DE NUESTRO STOCK
       //PRIMERO DEBEMOS LISTAR NUESTRO STOCK
       //LISTAR LAS CANTIDADES
       
        

    } 
    
    

}
