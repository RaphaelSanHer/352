
package pkg7.determinaretapas;


import java.util.Scanner;
public class 7-DeterminarEtapas {
static int Edad = 0;

        public static void main(String[] args) {
        Solicitar();
        Edades();
    }
        public static void Solicitar(){
        
           Scanner save =new Scanner(System.in);
           
           System.out.println("Colcar tu edad:");
           
           Edad = save.nextInt();
    }
        public static void Edades(){
        
        if (Edad<=9 && Edad >=0  )
        {
           System.out.println("Eres un infante");  
        }
   
        if (Edad<=14 && Edad>=10)
        {
           System.out.println("Eres un niño pequeño");  
        }
        if (Edad>=14 && Edad <=29)
        {
           System.out.println("Eres un adolecente");  
        }
        if (Edad>=30 && Edad <=79)
        {
           System.out.println("Adulto mayor");  
        }    
        if (Edad>=80)
        {
           System.out.println("Abuelito");  
        }    
    }
}
