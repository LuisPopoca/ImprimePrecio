package imprimeprecioc;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner 
 * Este programa calcula e imprime la cantidad de una orden de compra.
 *
 */
public class ImprimePrecioC {
    Scanner stdIn = new Scanner(System.in);
            


    public static void main(String[] args) {
         double precio=0; // precio de compra del artículo
         int cant=0; // número de artículos comprados
        
        ImprimePrecioC in = new ImprimePrecioC();
        in . In(precio, cant);
        
        
        

    }
    public void In(double precio, int cant){
                System.out.print("Precio de compra del artículo: ");
        precio = stdIn.nextDouble();
        System.out.print("Cantidad: ");
        cant = stdIn.nextInt();
        System.out.println("Total de orden de compra = $" + precio * cant);
        
    }

}
