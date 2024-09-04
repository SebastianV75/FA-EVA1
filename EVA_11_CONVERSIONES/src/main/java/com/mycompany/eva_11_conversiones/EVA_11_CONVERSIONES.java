/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA_11_CONVERSIONES {

    public static void main(String[] args) {
    //CONVERSIONES DE TEMPERATURA
    
    double C, F; //Declaracion de variables
    Scanner captu = new Scanner(System.in); //Scanner
    
        System.out.println("Captura los grados Farenheit");
        F = captu.nextDouble();
        
        C = (F-32)/1.8;
        
        System.out.println("-----Conversion a celcius: " + C + " -----------");
        
        //Conversion de celsius a fahrenheit
        System.out.println("Captura los datos de celsius: ");
        C = captu.nextDouble();
        
        F = (C*1.8)+32;
        
        System.out.println("Su temperatura en Fahrenhiet es: "+F);
        
    
    
    }
}
