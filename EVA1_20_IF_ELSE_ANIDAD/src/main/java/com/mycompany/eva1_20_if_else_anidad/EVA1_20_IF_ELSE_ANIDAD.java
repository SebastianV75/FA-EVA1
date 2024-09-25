/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_20_if_else_anidad;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_20_IF_ELSE_ANIDAD {

    public static void main(String[] args) {
        int dSem;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Elija el dia de la semana (1 - 7): ");
        dSem = captu.nextInt();
        captu.nextLine();
        
        if (dSem == 1) {
            System.out.println("Domingo");
        } else if( dSem == 2) {
            System.out.println("Lunes");
        } else if( dSem == 3) {
            System.out.println("Martes");
        }else if( dSem == 4) {
            System.out.println("Miercoles");
        }else if( dSem == 5) {
            System.out.println("Jueves");
        }else if( dSem == 6) {
            System.out.println("Viernes");
        }else if( dSem == 7) {
            System.out.println("Sabado");
        } else {
            System.out.println("Numero invalido");
        }
        
        
    }
}
