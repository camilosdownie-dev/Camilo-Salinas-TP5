/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10.tp5;

public class Ejercicio10TP5 {
    
    static float Buscarpromedio(int[][] Matriz, int semana){

float promedio = 0.0f;
int contador100 = 0 ;

for(int contador = 0 ; contador < 5 ; contador ++){

for(int contador2 = 0 ; contador2 < 7 ; contador2 ++){
promedio = promedio + Matriz[semana][contador2];
contador100 ++ ;

if(contador100 >= 31 )break;
}
}
promedio = promedio / 31 ;
return promedio;
}
    static int[] BuscarExtremos(int[][] Matriz){
        int[] Extremos = new int [4] ;
        Extremos[2] = 40 ;
        int contador20 = 0 ;      
        for(int contador3 = 0 ; contador3 < 5 ; contador3 ++){
            for(int contador4 = 0 ; contador4 < 7 ; contador4 ++){
                if(Extremos[0] < Matriz[contador3][contador4]){
                    Extremos[0] = Matriz[contador3][contador4];
                    Extremos[1] = contador4 ; 
                }
                if(Extremos[2] > Matriz[contador3][contador4]){
                Extremos[2] = Matriz[contador3][contador4];
                Extremos[3]= contador4 ;
                }
                contador20 ++ ;
                if(contador20 >= 31)break ;
            }
        }
        
        return Extremos ;
    }
    
    public static void main(String[] args) {
        int[][] Temperaturas = new int[5][7] ;
        
       Temperaturas = LlenarMatriz(Matriz = Temperatura, min = 7 , max = 30);
       
       float promedio = BuscarPromedio(Temperaturas, semana = 0) ;
      System.out.println("El promedio de la semana 0 es " + promedio);
      
      int[] Resultado = BuscarExtremos(Temperaturas);
      System.out.println("temperaura mas alta" + Resultado[0]);
      System.out.println("temperaura mas baja" + Resultado[2]);
      System.out.println("dia de temperaura mas alta" + Resultado[1]);
      System.out.println("dia de temperaura mas baja" + Resultado[3]);
      
       for(int i = 0 ; i < 5 ; i ++){
           for(int j = 0 ; j < 7 ; j ++){
               System.out.println(Temperaturas[i][j] + " ") ;
           }
           System.out.println();
       }
    }
    static int[][] LlenarMatriz(int)
}
