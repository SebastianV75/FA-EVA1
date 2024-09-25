/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_19_operador_or;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_19_OPERADOR_OR {

    public static void main(String[] args) {
        
        int km, mes;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Capture el numero de kilometros que lleva el vehiculo");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Capture el mes de uso que lleva el vehiculo");
        mes = captu.nextInt();
        captu.nextLine();
        
        if (km>=5000|| mes>=6) {
            System.out.println("TIenes que hacer el cambio de aceite!!");
        } else {
            System.out.println("Aun no se necesita el cambio de aceite");
        }
        
        
        
    }
}
