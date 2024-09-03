/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_operaciones;

/**
 *
 * @author alexv
 */
public class EVA1_9_OPERACIONES {

    public static void main(String[] args) {
        //OPERACIONES ARISTMETICAS
        //inicializacion de una variable
        int x = 10; //declaracion y asignacion
        int y = 5;
        //si necesitas muchas variables:
        int suma, resta, multi, div, pot, raiz;
        
        //SUMA Y RESTA
        suma= x+y; //operador de suma +
        System.out.println("la suma de x + y: ");
        System.out.println(suma);
        
        resta= x-y; //operador de resta -
        System.out.println("Resta de x - y: ");
        System.out.println(resta);
        
        //MULTIPLICAION
        
        multi = x * y; //operador de multiplicaion *
        System.out.println("La multiplicacion de x * y: ");
        System.out.println(multi);
        
        //DIVSION
        
        div = x/y; //operador de division /
        System.out.println("La division de x/y: ");
        System.out.println(div);
        x=5;
        y=2;
        div = x / y;
        System.out.println("Division de x / y: ");
        System.out.println(div);
        
        //division con numeros con punto flotante
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("division de val1 / val2");
        System.out.println(resu);
        
        
        
        
        
        
    }
}
