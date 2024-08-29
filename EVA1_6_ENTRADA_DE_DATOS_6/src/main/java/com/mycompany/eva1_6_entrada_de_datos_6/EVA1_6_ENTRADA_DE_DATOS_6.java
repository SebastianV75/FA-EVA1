/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entrada_de_datos_6;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_6_ENTRADA_DE_DATOS_6 {

    public static void main(String[] args) {
        
        String nombre;
        String curp;
        int edad;
        double promedio;
        
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner(System.in);
        
        //CAPTURAR
        System.out.println("Captura tu nombre completo: ");
        nombre = captu.nextLine();
        System.out.println("Captura la CURP: ");
        curp = captu.nextLine();
        System.out.println("Captura tu edad: ");
        edad = captu.nextInt();
        System.out.println("Captura tu promedio: ");
        promedio = captu.nextDouble();
        
        //IMPRESION
        System.out.println("-----------DATOS CAPTURADOS----------------");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
}
