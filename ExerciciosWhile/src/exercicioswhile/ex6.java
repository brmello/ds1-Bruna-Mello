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
public class ex6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        double maior = Double.NEGATIVE_INFINITY;
        double segundoMaior = Double.NEGATIVE_INFINITY;
        
        System.out.println("Digite 10 numeros:");

        while (contador <= 10) {
            System.out.print("Numero " + contador + ": ");
            double numero = scanner.nextDouble();
            
            if (numero > maior) {
                segundoMaior = maior;
                maior = numero;
            } else if (numero > segundoMaior) {
                segundoMaior = numero;
            }
            
            contador++;
        }
        
        System.out.println("\nOs dois maiores numeros digitados foram:");
        System.out.println("Primeiro maior: " + maior);
        System.out.println("Segundo maior: " + segundoMaior);
        
        scanner.close();
    }

}
