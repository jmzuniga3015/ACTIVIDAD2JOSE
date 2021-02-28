
import java.util.Scanner;

/*
Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras,
toneladas.
 * @author josé zúñiga
 */
public class CambioDeKilo {
    public static void main(String[] args){
        Scanner Convierte= new Scanner(System.in);
        float Peso, Gramo, Libra, Tonelada;
        int opccion;

        System.out.println("INGRESE EL PESO EN KILOS ::");
        Peso= Convierte.nextFloat();
        System.out.println("\nSELECCIONE UNA DE LAS OPCIONES PARA CONVERTIR\n 1- GRAMOS\n2-LIBRAS\n3-TONELADAS");
        opccion= Convierte.nextInt();
        
        switch (opccion){
            case 1:
                Gramo=(Peso*1000)/1;
                System.out.println("\nEL PESO EN GRAMOS ES ::"+Gramo);
                break;
            case 2:
                Libra=(Peso*220462)/1;
                System.out.println("\nEL PESO EN LIBRAS ES::"+Libra);
                break;
            case 3:
                Tonelada=(Peso*0001)/1;
                System.out.println("\nEL PESO EN TONELADAS ES ::"+Tonelada); 
                break;
            
        
    }
        
        
       
        
        
        
        
    }
}
