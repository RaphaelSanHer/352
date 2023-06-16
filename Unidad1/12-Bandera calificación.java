
package javaapplication25;

import java.util.Scanner;

public class BanderaCalificacion {
    static int calificacion1, calificacion2, calificacion3, calificacion4, calificacion5;
    
    public static void main(String[] args) {
        pedirCalificaciones();
        calificacionReprobada(calificacion1, calificacion2, calificacion3, calificacion4, calificacion5);
    }
    
    public static void pedirCalificaciones() {
        Scanner save = new Scanner(System.in);
        
        System.out.println("la calificación 1:");
        calificacio1 = save.nextInt();
        
        System.out.println("la calificación 2:");
        calificacion2 = save.nextInt();
        
        System.out.println("la calificación 3:");
        calificacion3 = save.nextInt();
        
        System.out.println(" la calificación 4:");
        calificacion4 = save.nextInt();
        
        System.out.println("la calificación 5:");
        calificacion5 = save.nextInt();
    }
    
    public static void calificacionReprobada(int c1, int c2, int c3, int c4, int c5) {
        boolean bandera1,bandera2,bandera3,bandera4,bandera5;
        
        bandera1 = (calificacion1 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera1);
        
        bandera2 = (calificacion2 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera2);
        
        bandera3 = (calificacion3 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera3);
        
        bandera4 = (calificacion4 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera4);
        
        bandera5 = (calificacion5 <= 5);
        System.out.println("Calificación reprobatoria: " + bandera5);
    }
}
