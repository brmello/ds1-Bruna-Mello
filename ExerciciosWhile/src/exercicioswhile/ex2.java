/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioswhile;

/**
 *
 * @author vanme
 */
public class ex2 {
     public static void main(String[] args) {
        int numero = 1; 
        
        System.out.println("Numeros pares de 1 a 100:");
        
        while (numero <= 100) {
            
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero++; 
        }
    }
}
