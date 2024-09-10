/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_16_TIPO_HACIENDA {

    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tipo de persona F-----> FISICA,  M---> MORAL");
        tipo = captu.nextLine().charAt(0);
        
        if (tipo == 'F') {
            System.out.println("----------Eres una persona fisica-----------");
        } else {
            System.out.println("--------------Eres una persona moral------------");
        }
    }
}
