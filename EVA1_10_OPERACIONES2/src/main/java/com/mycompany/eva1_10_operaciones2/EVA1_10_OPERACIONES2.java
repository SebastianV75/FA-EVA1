/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_operaciones2;

/**
 *
 * @author alexv
 */
public class EVA1_10_OPERACIONES2 {

    public static void main(String[] args) {
        //CONCATENACION CADENAS:
        //OPERADOR DE CONCATENACION +
        //Mismo simbolo con diferentes usos:
        //sobrecarga de operadores
        String nombre = "Sebastian";
        String apellido = "Valenzuela";
        String nomComp;
        
        //CONCATENAR
        nomComp = nombre + " " +  apellido;
        System.out.println(nomComp);
        
        //imprimir los datos: 
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Apellido del usuario: " + apellido);
        System.out.println("Nombre completo: " + nomComp);
    }
}
