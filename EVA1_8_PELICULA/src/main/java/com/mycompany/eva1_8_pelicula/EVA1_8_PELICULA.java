/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_8_PELICULA {

    public static void main(String[] args) {
        //VARIABLES
       String nombre;
       String gen;
       int duracion;
       String cast;
       String clasificacion;
       
       //SCANNER
       
       Scanner captu;
       captu = new Scanner(System.in);
      
       //CAPTURAR
        System.out.println("Capture el nombre de la pelicula: ");
        nombre = captu.nextLine();
        
        System.out.println("Capture el genero de la pelicula: ");
        gen = captu.nextLine();
        
        System.out.println("Capture la duracion de la pelicula: ");
        duracion = captu.nextInt();
        captu.nextLine();
        
        System.out.println("Capture el reparto de la pelicula: ");
       cast = captu.nextLine();
       
        System.out.println("Capture la clasificacion de la pelicula: ");
        clasificacion = captu.nextLine();
        
        //DATOS CAPTURADOS
        System.out.println("--------------DATOS CAPTURADOS----------------");
        System.out.println(nombre);
        System.out.println(gen);
        System.out.println(duracion);
        System.out.println(cast);
        System.out.println(clasificacion);
    }
}
