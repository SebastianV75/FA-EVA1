/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_meses;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_21_MESES {

    public static void main(String[] args) {
        int mes;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Elija el mes(1 - 12): ");
        mes = captu.nextInt();
        captu.nextLine();
        
        if (mes == 1) {
            System.out.println("Junio");
        } else if( mes == 2) {
            System.out.println("Febrero");
        } else if( mes == 3) {
            System.out.println("Marzo");
        }else if( mes == 4) {
            System.out.println("Abril");
        }else if( mes == 5) {
            System.out.println("Mayo");
        }else if( mes == 6) {
            System.out.println("Junio");
        }else if( mes == 7) {
            System.out.println("Julio");
        }else if( mes == 8) {
            System.out.println("Agosto");
        }else if( mes == 9) {
            System.out.println("Septiembre");
        }else if( mes == 10) {
            System.out.println("Octubre");
        }else if( mes == 11) {
            System.out.println("Noviembre");
        }else if( mes == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Numero invalido");
        }
        
        
    }
}
