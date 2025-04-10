/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um valor inteiro entre 1 e 10: ");
            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Valor invalido! Digite um numero que esteja entre 1 e 10.");
            }
        } while (numero < 1 || numero > 10); 

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
    
