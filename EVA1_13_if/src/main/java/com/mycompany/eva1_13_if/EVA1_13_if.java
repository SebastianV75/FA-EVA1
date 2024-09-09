/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_13_if {

    public static void main(String[] args) {
        int edad;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("capture su edad: ");
        edad = captu.nextInt();
        
        if (edad>=18) {
            System.out.println("Bienvenido, eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }
}
