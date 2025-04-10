/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioswhile;

/**
 *
 * @author vanme
 */
import java.util.Scanner;
public class ex5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        double maior = Double.MIN_VALUE;
        
        System.out.println("Digite 10 numeros:");
        
        while (contador <= 10) {
            System.out.print("Numero " + contador + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > maior) {
                maior = numero;
            }
            
            contador++;
        }
        
        System.out.println("\nO maior numero digitado foi: " + maior);
        scanner.close();
    }
}
