/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author vanme
 */
import java.util.Scanner;
public class ex17 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial nao é definido para numeros negativos.");
        } else {

            long fatorial = 1; 
            System.out.print(numero + "! = ");

            for (int i = numero; i >= 1; i--) {
                fatorial *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(".");
                }
            }

            System.out.println(" = " + fatorial);
        }

        scanner.close();
    }
}
