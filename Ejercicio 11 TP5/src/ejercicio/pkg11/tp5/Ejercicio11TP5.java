/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11.tp5;

import java.util.Scanner;

/**
 *
 * @author shpctac1006f
 */
public class Ejercicio11TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Lector = new Scanner(System.in);
      System.out.println("seleccione una opcion");
      System.out.println("1 = sumar");
      System.out.println("2 = restar");
      System.out.println("3 = multiplicar");
      int opcion = Lector.nextInt();
      System.out.println("ingrese la cant de filas y columnas");
      int N = Lector.nextInt();
      
      int[][] A = new int[N][N];
      
      int[][] B = new int[N][N];
      
      int[][] C = new int[N][N];
      
      for(int i = 0 ; i < N ; i ++){
          for(int j = 0 ; j < N ; j++ ){
              System.out.println("ingrese el elemento de matriz A " + i + " , " + j);
              A[i][j] = Lector.nextInt();
          }
      }
         for(int i = 0 ; i < N ; i ++){
          for(int j = 0 ; j < N ; j++ ){
              System.out.println("ingrese el elemento de matriz B " + i + " , " + j);
              A[i][j] = Lector.nextInt();
          }
      }
      switch(opcion){
          case 1 -> {
              for(int i = 0 ; i < N ; i ++){
                  for(int j = 0 ; j < N ; j++ ){
                      C[i][j] = A[i][j] + B[i][j];
                  }
              } }
          case 2 -> {
              for(int i = 0 ; i < N ; i ++){
                  for(int j = 0 ; j < N ; j++ ){
                      C[i][j] = A[i][j] - B[i][j];
                  }
              } }
          case 3 -> {
              for(int i = 0 ; i < N ; i ++){
                  for(int j = 0 ; j < N ; j++ ){
                      C[i][j] = A[i][j] * B[i][j];
                  }
              } }
    }      
      
         for(int i = 0 ; i < N ; i ++){
             for(int j = 0 ; j < N ; j++ ){
             System.out.print(C[i][j] + " " );
             }
             System.out.println();
          }
    }
    
}
