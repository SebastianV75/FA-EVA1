/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author alexv
 */
public class EVA1_5_ENTRADA_DE_DATOS {

    public static void main(String[] args) {
            String nombre;
        
        //CAPTURA DE DATOS DEL TECLADO:
        //Scanner --> herramienta (Clase)
        //Scanner: es un tipo de dato
        
            Scanner captu;  //incorporar la herramienta al codigo (java)
        
        //no existe, hay que crearla
        
            captu = new Scanner(System.in); //creamos la herramienta Scanner 
        
        //DARLE LA INTRODUCCION AL USUARIO
        
            System.out.println("Introduce tu nombre completo: ");
        
        //Capturar
        
        nombre = captu.nextLine(); //capturamos todo el texto
                                   //hasta que presiona "enter"
        
        //IMPRIMIR DATOS
        System.out.println("------------------DATOS CAPTURADOS-------------------");
        System.out.println(nombre);
        
    }
}
