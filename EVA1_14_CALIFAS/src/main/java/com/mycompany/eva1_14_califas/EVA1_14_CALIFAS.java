/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Captura tu calificacion: ");
        califa = captu.nextInt();
        
        if (califa>=70) {
            System.out.println("Felicidades, acreditaste");
        } else {
            System.out.println("NA. No acreditaste");
        }
    }
}
