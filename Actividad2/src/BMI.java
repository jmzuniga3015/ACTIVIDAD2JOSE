
import java.util.Scanner;

/*
Desarrolle un programa en java que calcule el índice de masa corporal BMI el cual está dado por la formula (pesoenKg
/ alturaenmetros*alturaenmetros)
 *
 * @author josé zúñiga
 */
public class BMI {
    public static void main (String[] args){
        Scanner Indice= new Scanner(System.in);
        float Peso, Altura, BMI;
        System.out.println("INGRESE EL PERO EN KILOGRAMOS:: ");
        Peso=Indice.nextFloat();
        System.out.println("INGRESE LA ALTURA EN METROS:: ");
        Altura=Indice.nextFloat();
        BMI=Peso/(Altura*Altura);
        System.out.println("\nSU INDICE DE MASA CORPORAL ES DE ::"+ BMI);
        
        
    }
    
}
