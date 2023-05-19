
package v2trifiv;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class V2TRIFIV {

    public static void main(String[] args) {
        // declarar variables
        int numero, mult3, mult5;
        BufferedReader bufEntrada= new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Ingresa valor");
        numero = integer.parseInt(bufEntrada.readLine());
        
        mult3= numero % 3;
        mult5= numero % 5;
        //Salida de datos
            if(mult3 ==0 && mult5 == ){
                System.out.println("TRIFIV");
            } else if (mult3==0){
                System.out.println("TRI");
            } else if (mult5==0){
                System.out.println("Fiv");
            }
         if (mult3==0 && mult5==0){
             System.out.println("Trifiv");
         }
    }
}
    

