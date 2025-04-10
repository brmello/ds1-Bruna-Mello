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
public class ex18 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de numeros (N): ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("A quantidade de numeros deve ser maior que zero.");
        } else {
            
            double menor = Double.MAX_VALUE; 
            double maior = Double.MIN_VALUE; 
            double soma = 0;

            for (int i = 1; i <= N; i++) {
                System.out.print("Digite o " + i + "º numero: ");
                double numero = scanner.nextDouble();

                if (numero < menor) {
                    menor = numero;
                }

                if (numero > maior) {
                    maior = numero;
                }

                soma += numero;
            }

            System.out.println("Menor valor = " + menor);
            System.out.println("Maior valor = " + maior);
            System.out.println("Soma dos valores = " + soma);
        }

        scanner.close();
    }
}
