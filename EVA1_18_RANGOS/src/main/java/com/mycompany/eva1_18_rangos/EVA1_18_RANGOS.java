/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_18_RANGOS {

    public static void main(String[] args) {
        
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Captura tu calificacion: ");
        califa = captu.nextInt();
        
        if (califa>=0 && califa<=100) {
            System.out.println("Calificacion valida");
            
        } else {
            System.out.println("Calificacion Invalida");
        
        }
        
        
    }
}
