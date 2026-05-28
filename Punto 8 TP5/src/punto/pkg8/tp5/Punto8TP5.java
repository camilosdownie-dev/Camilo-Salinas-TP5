/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto.pkg8.tp5;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Punto8TP5 {

    public static void main(String[] args) {
Scanner Lector = new Scanner(System.in); 

       
        System.out.println("Ingrese una frase:");
        String frase = Lector.nextLine();

        String[] palabras = frase.split("\\s+");

       

        for(int contador = 0 ; contador < palabras.length ; contador++) {
            System.out.println(palabras[contador] + " --> " + palabras[contador].length());

        }

      
    
    }



    }
    

