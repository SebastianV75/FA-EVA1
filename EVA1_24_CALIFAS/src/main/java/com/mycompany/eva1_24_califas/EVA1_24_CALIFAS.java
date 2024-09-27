/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_24_CALIFAS {

    public static void main(String[] args) {
        
        int califa;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Capture su calificacion: ");
        califa = captu.nextInt();
        captu.nextLine();
        
        if (califa>=90 && califa<=100) {
            System.out.println("Su calificacion es: A");
        } else if (califa>=80 && califa<=89){
            System.out.println("Su calificacion es: B");
        }else if (califa>=70 && califa<=79){
            System.out.println("Su calificacion es: C");
        }else if (califa>=60 && califa<=69){
            System.out.println("Su calificacion es: D");
        }else if (califa>=0 && califa<=59){
            System.out.println("Su calificacion es: F");
        } else { 
            System.out.println("Numero invalido");
        }
    }
}
