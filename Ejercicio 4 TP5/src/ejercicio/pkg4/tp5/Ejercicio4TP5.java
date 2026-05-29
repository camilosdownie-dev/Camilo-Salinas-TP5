/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4.tp5;

import java.util.Scanner;

/**
 *
 * @author shpctac1006f
 */
public class Ejercicio4TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner Lector = new Scanner(System.in);
        System.out.println("ingrese el largo de la matriz, luego el ancho");
         int filas = Lector.nextInt();
         int columnas = Lector.nextInt() ;
         
         Lector.nextLine();
         String[][] i = new String[filas][columnas];  
         for(int contador = 0 ; contador < filas ; contador ++){
             for(int contador2 = 0 ; contador2 < columnas ; contador2 ++){
                 if(contador2 % 2 == 0 ){
                     System.out.println("ingrese un nombre");
                     i[contador][contador2] = Lector.nextLine();
                 }else{
                     System.out.println("ingrese un numero");
                     i[contador2][contador2] = Lector.nextLine();
                 }
             }
         }
    
             for(int contador = 0 ; contador < filas ; contador ++){
             for(int contador2 = 0 ; contador2 < columnas ; contador2 ++){
                 System.out.print(i[contador][contador2] + " ");
                 
             }
             System.out.println();
             }
    
    
    }
    
}
