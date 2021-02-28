
import java.util.Scanner;

/*
Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga los números del usuario e imprima la
suma, producto, diferencia de los números.
 * @author josé zúñiga
 */
public class Valores {
     public static void main(String[] args){
        Scanner Calculo2= new Scanner(System.in);
        
        int Suma, Diferencia, Producto,Numero1,Numero2;
        int opccion ;
        
        System.out.println("INGRESE EL PRIMER NUMERO A EVALUAR:: ");
        Numero1=Calculo2.nextInt();
        System.out.println("\nINGRESE EL SEGUNDO NUMERO A EVALUAR::");
        Numero2=Calculo2.nextInt();
        
        System.out.println("INGRESE LA OPERACION A REALIZAR::\n1- SUMA\n2- PROMEDIO\n3- PRODUCTO\n4-MODULO\n");
        opccion=Calculo2.nextInt();
        switch (opccion){
            case 1:
                Suma=Numero1+Numero2;
                System.out.println(" LA SUMA DE LOS NUMEROS ES ::"+Suma);
                break;
            case 2:
               Producto=Numero1*Numero2;
                System.out.println(" LA PRODUCTO DE LOS NUMEROS ES ::"+Producto);
                break;
            case 3:
                Diferencia=Numero1-Numero2;
                System.out.println(" EL MODULO DE LOS NUMEROS ES ::"+Diferencia);
                
                break;
            

            
        
    }
        
    }
    
}
