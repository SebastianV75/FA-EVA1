/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_12_FORMULAS {

    public static void main(String[] args) {
        
        //variables
        double V, t, a, d;
        
        //Scanner setup
        Scanner captu = new Scanner(System.in);
        
        
        //Captura de datos
        System.out.println("Capture el valor de la velocidad inicial: ");
        V =  captu.nextDouble();
        System.out.println("Capture el valor del tiempo en segundos: ");
        t = captu.nextDouble();
        System.out.println("Capture el valor de la aceleracion: ");
        a = captu.nextDouble();
        
        //Recopilacion de datos
        d = (V * t)+ ((a *(t * t))/2.0);
        
        //Resultado
        System.out.println("------Distancia es igual a: " + d);
                
    }
}
