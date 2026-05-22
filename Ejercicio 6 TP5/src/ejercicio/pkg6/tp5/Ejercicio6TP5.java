/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg6.tp5;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio6TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);    

    String[][] tabla = new String[3][3];
    for (int contador1 = 0 ; contador1 < 3 ; contador1 ++){
    for(int contador = 0 ; contador < 3 ; contador ++){
             if (contador == 0){
              System.out.println("ingrese el nombre del empleador");
               tabla[contador][contador1] = Lector.nextLine();
             }
             if (contador == 1){
              System.out.println("ingrese la edad del empleador");
               tabla[contador][contador1] = Lector.nextLine();
             }
             if (contador == 2){
              System.out.println("ingrese el sueldo del empleado");
               tabla[contador][contador1] = Lector.nextLine();
             }
      }
             }    
      
     System.out.println("Nombres Edad Sueldo "); 
    for (int contador2 = 0 ; contador2 < 3 ; contador2 ++){
        for(int contador3 = 0 ; contador3 < 3 ; contador3 ++){
             System.out.print(tabla[contador2][contador3] + " ");
        }
           System.out.println(" "); 
    }  
    
    }
    
}
