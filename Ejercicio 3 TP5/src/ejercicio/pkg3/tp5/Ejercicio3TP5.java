/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg3.tp5;


import java.util.Scanner;
public class Ejercicio3TP5 {

  
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        System.out.println("ingrese el largo de la matriz, luego el ancho");
         int filas = Lector.nextInt();
         int columnas = Lector.nextInt() ;
         int[][] i = new int[filas][columnas];
         
         
         System.out.println("ahora ingrese los valores para esta matriz");
         //Lector.next();
         for(int contador3 = 0 ; contador3 < filas ; contador3 ++){
             
        for(int contador4 = 0 ; contador4 < columnas ; contador4 ++){
            System.out.println("ahora ingrese los valores para esta matriz " + contador3 + " " + contador4);
            i[contador3][contador4] = Lector.nextInt();
            
        }
    }
          for(int contador = 0 ; contador < filas ; contador ++){
        for(int contador2 = 0 ; contador2 < columnas ; contador2 ++){
            System.out.print(i[contador][contador2] + " ");2
        }
        System.out.println(" ");
    }
        
    }
    
}
