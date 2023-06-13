
package pkg8.cifranumeros;
import java.util.Scanner;

public class CifraNumeros{

  
  static int Numero;

    
    public static void main(String[] args) {
        
        Solicitar();
        Numero();
    
    }
    public static void Solicitar(){
        
  
        Scanner save =new Scanner(System.in);
        
        System.out.println("Numero:");
        //save datos
        Numero = save.nextInt();
    }
    public static void Numero(){
        if (Numero<=0)
        {
        System.out.println("Intenta con otro valor mayor a 0");  
        }
        if (Numero<9 && Numero>=1)
        {
        System.out.println("una cifra");  
        }
        if (Numero<=99 && Numero>=10)
        {
        System.out.println("dos cifras");  
        }
        if (Numero<=999 && Numero>=100)
        {
        System.out.println("tres cifras");  
        }
        if (Numero<=9999 && Numero>=1000)
        {
        System.out.println("cuatro cifras");  
        }
        if (Numero<=99999 && Numero>=10000)
        {
        System.out.println("cinco cifras");  
        }
     }
}