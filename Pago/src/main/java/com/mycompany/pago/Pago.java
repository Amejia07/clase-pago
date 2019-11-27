/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pago;

import java.util.Scanner;

/**
 *
 * @author porta
 */
public class Pago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      Scanner reader = new Scanner (System.in);
        
       System.out.println("Escriba su nombre: ");
       String nombre = reader.nextLine();
       
       System.out.println("Escriba sus apellidos: ");
       String apellidos = reader.nextLine();
        
       System.out.println("Digite su número de cedula: "); 
       String cedula = reader.nextLine();
       
        System.out.println("Digite su correo electronico: "); 
        String correo = reader.nextLine();
        
        System.out.println("Digite su número de telefono: ");
        String telefono = reader.nextLine();
        
        System.out.println("Digite el número de noches hospedado: ");
        String hospedaje = reader.nextLine();
        
        //inicializcion de ciclo 
      
        //se le pregunta al usuario si solicito servicios extras
        
         
    }//fin del main 
    
}//fin de la clase 
