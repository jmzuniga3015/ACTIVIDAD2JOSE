
import java.util.Scanner;

/*
 Escriba un programa en Java que le solicite al usuario el valor del radio de una circunferencia y calcule su longitud y
área. Imprima los resultados (con dos números decimales)

 * @author josé zúñiga
 */
public class Circunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Circunferencia= new Scanner(System.in);
        double r,l;
        
        System.out.println("INGRESE EL RADIO DE LA CIRCUNFERENCIA");
        r=Circunferencia.nextDouble();
        l=2*Math.PI*r;
        
        System.out.println("LA LONGITUD DE LA CIRCUNFERENCIA ES "+l);
        
        
    }
    
}
