/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_control_acceso;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EVA1_17_CONTROL_ACCESO {

    public static void main(String[] args) {
        String contra;
        String usuario;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cree su nombre de usuario");
        usuario = captu.nextLine();
        
        System.out.println("Cree su contrasena");
        contra = captu.nextLine();
        
        if (usuario.equals("sebas") && contra.equals("1234")) {
            System.out.println("bienvenido");
        } else {
            System.out.println("no");
        }
        
        
        
        
        
        
        
        
    }
}
