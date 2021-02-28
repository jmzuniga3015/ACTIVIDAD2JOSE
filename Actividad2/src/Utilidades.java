
import java.util.Scanner;

/*
 Juan conoce el precio de compra y de venta de unos de los productos de su tienda y requiere conocer cuál es su % de
utilidad. Desarrolle un programa en java que lo ayude con ese cálculo
 * @author josé zúñiga
Margen de utilidad bruta (porcentual) = utilidad bruta/ingresos totales x 100
 */
public class Utilidades {
    public static void main(String[] args){
        Scanner Utilidad= new Scanner(System.in);
        int UtilidadB, Ingreso, TotalUtilidad;
        
        System.out.println("INGRESE EL VALOR DE LA UTILIDAD::");
        UtilidadB= Utilidad.nextInt();
        System.out.println("\nINGRESE EL VALOR TOTAL DEL INGRESO DEL PRODUCTO::");
        Ingreso=Utilidad.nextInt();
        
        TotalUtilidad=(UtilidadB)/(Ingreso)*(100);
        
        System.out.println("EL PORCENTAJE DEL TOTAL DE LA UTILIDAD ES ::"+TotalUtilidad+"%");
        
        
        
    }
}
