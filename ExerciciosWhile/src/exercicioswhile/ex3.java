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
public class ex3 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int limite = scanner.nextInt();
        
        System.out.println("\nNumeros pares de 1 a " + limite + ":");
        int i = 1;
        while (i <= limite) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        
        System.out.println("\n\nNumeros impares de 1 a " + limite + ":");
        i = 1; 
        while (i <= limite) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        
        scanner.close();
    }
}
