/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico.pkg1.tp5;

/**
 *
 * @author ET20
 */
public class Ejercico1TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] i = new int[2][2];
   
   i[0][0] = 4;
   i[0][1] = 5;
   i[1][0] = 3;
   i[1][1] = 2;
    for(int filas = 0 ; filas < 2 ; filas ++){
        for(int columnas = 0 ; columnas < 2 ; columnas ++){
            System.out.print(i[filas][columnas] + " ");
        }
        System.out.println(" ");
    }
   
   
  }
    }
    

