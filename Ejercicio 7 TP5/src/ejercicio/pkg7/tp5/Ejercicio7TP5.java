/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg7.tp5;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejercicio7TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0 ;
        int numeros = 0 ;
        int promedio = 0 ;
      Scanner Lector = new Scanner(System.in);
        System.out.println("ingrese el largo de la matriz, luego el ancho");
         int filas = Lector.nextInt();
         int columnas = Lector.nextInt() ;
         int[][] i = new int[filas][columnas];
         
         
         System.out.println("ahora ingrese los valores para esta matriz");
         
         for(int contador3 = 0 ; contador3 < filas ; contador3 ++){
             
        for(int contador4 = 0 ; contador4 < columnas ; contador4 ++){
            System.out.println("ahora ingrese los valores para esta matriz " + contador3 + " " + contador4);
            i[contador3][contador4] = Lector.nextInt();
            
        }
    }
    for(int contador2 = 0 ; contador2 < filas ; contador2 ++){
        for(int contador3 = 0 ; contador3 < columnas ; contador3 ++){
            if(contador2 % 2 != 0){
                num = i[contador2][contador3] + num ;
                numeros ++ ;
            }
            if(contador3 % 2 != 0){
            num = i[contador2][contador3] + num ;
            numeros ++ ;
            }
        }
    }
    promedio = num % numeros ;
    System.out.println("El promedio de la suma de las posiciones impares es " + promedio ) ;
    }
}
