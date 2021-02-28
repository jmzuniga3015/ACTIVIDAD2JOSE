
import java.util.Scanner;

/*
 . Escriba una aplicación que reciba tres valores decimales del usuario y muestre la suma, promedio, producto, cociente
y modulo. Los resultados se deben imprimir en formato decimal con dos cifras significativas.
 * @author josé zúñiga
 */
public class ValoresDecimales {
    public static void main(String[] args){
        Scanner Calculo= new Scanner(System.in);
        
        double Suma, Promedio, Producto, Modulo, Numero1,Numero2;
        int opccion ;
        
        System.out.println("INGRESE EL PRIMER NUMERO A EVALUAR:: ");
        Numero1=Calculo.nextDouble();
        System.out.println("\nINGRESE EL SEGUNDO NUMERO A EVALUAR::");
        Numero2=Calculo.nextDouble();
        
        System.out.println("INGRESE LA OPERACION A REALIZAR::\n1- SUMA\n2- PROMEDIO\n3- PRODUCTO\n4-MODULO\n");
        opccion=Calculo.nextInt();
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
                Modulo=Numero1/Numero2;
                System.out.println(" EL MODULO DE LOS NUMEROS ES ::"+Modulo);
                
                break;
            

            
        
    }
        
    }
    
}
