/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg5.tp5;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto5TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner Lector = new Scanner(System.in);    

String[][] tabla = new String[3][3];  
for (int contador1 = 0 ; contador1 < 3 ; contador1 ++){
 for (int contador = 0 ; contador < 3 ; contador ++){
   if (contador % 2 == 0 ){
       System.out.println("Ingrese un nombre");
   } else 
       System.out.println("ingrese un numero");
    tabla[contador][contador1] = Lector.nextLine();
}
}
  for(int contador3 = 0 ; contador3 < 3 ; contador3 ++){
        for(int contador2 = 0 ; contador2 < 3 ; contador2 ++){
            System.out.print(tabla[contador3][contador2] + " ");
        }
        System.out.println(" ");
    }
    }
}
