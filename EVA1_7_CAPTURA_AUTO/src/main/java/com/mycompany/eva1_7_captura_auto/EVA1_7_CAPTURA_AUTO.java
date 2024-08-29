/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_7_CAPTURA_AUTO {

    public static void main(String[] args) {
        //VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        
        //SCANNER 
        
        Scanner captu;
       captu = new Scanner(System.in);
       
       //CAPTURAR
       
        System.out.println("Captura la marca del vehiculo: ");
        marca = captu.nextLine();
        System.out.println("Captura el modelo del carro: ");
        modelo = captu.nextLine();
        System.out.println("Captura el año del carro");
        year = captu.nextInt();
        System.out.println("Captura el precio del carro: ");
        precio = captu.nextDouble();
        
        //DATOS CAPTURADOS
        
        System.out.println("-----------------DATOS CAPTURADOS----------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
}
