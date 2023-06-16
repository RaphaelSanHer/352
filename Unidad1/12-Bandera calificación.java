
package javaapplication25;

import java.util.Scanner;
public class JavaApplication25 {

    
    public static void main(String[] args) {
        
        Scanner save = new Scanner(System.in);
        int NNOTAS, NAPROBADOS=0, NREPROBADOS=0;
        double[] notas;
        double suma = 0, promedio, max, min;
        
        System.out.print("¿Cuantas notas colocaras?: ");
        NNOTAS = save.nextInt();
        notas = new double[NNOTAS];

        System.out.println("Ingrese un total de: " + NNOTAS + " notas");
        for(int i=0; i<notas.length; i++){
            System.out.print("Nota "+ (i+1) + ": ");
            notas[i] = save.nextDouble();
        }
        System.out.println("Las Notas a evaluar: ");
        for (double nota : notas) {
            System.out.print(nota + "   ");
        }

//nota mas alta
        max = notas[0];
        for (int i=0; i<notas.length; i++) {
            if(notas[i] > max){
                max = notas[i];
            }
        }
        //comprar alumnos reprobados
        for (double nota : notas) {
            if(nota >= 6) {
                NAPROBADOS++;
            } else {
                NREPROBADOS++;
            }
        }
 System.out.println("Total de alumnos reprobados: " + NREPROBADOS);

    }
}