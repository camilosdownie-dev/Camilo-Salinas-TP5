/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg2.tp.pkg5;

/**
 *
 * @author ET20
 */
public class Ejercicio2TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int[][] i = new int[3][3];
   int filas = 0 ;
   
   i[0][0] = 1;
   i[0][1] = 5;
   i[1][0] = 2;
   i[1][1] = 4;
   i[2][0] = 1; 
   i[2][1] = 2;
   i[2][2] = 3;
   i[0][2] = 4;
   i[1][2] = 5;
   
   while (filas < 3){
       int columnas = 0 ;
      while (columnas < 3){
           System.out.print(i[filas][columnas] + " ");
           columnas ++ ;
      } 
      System.out.println(" ");
      filas ++ ;
   }
           
    }
    
}
