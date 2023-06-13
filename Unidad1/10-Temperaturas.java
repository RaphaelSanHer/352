package javaapplication22;

import java.util.Scanner;


    public class Temperaturas {
    public static double Temp;   
    public static void main(String[] args) {
      Temperatura();
      IF();
    }
    public static void Temperatura()
    {
   
    System.out.println("¿Cántos grados hay?");
    Scanner sc = new Scanner(System.in);
    Temp = sc.nextInt();      
    }
    public static void IF()
    {
        // frio
        if (Temp <=0 && Temp <=10 )
        {
             System.out.println("Clima Frio");
        }
        // frio medio
        if (Temp >=11 && Temp <=20 )
        {
             System.out.println("Clima nublado");
        }   
        //clima templado
        if (Temp >=21 && Temp <=30 )
        {
             System.out.println("Clima caluroso");
        }
        // calor
        if (Temp >=31 )
        {
             System.out.println("tropical mucho calor");
        }               
    }
}


