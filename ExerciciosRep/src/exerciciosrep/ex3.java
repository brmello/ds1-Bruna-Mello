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
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        do {
            System.out.print("Digite o segundo valor (maior que zero): ");
            valor2 = scanner.nextDouble();
            if (valor2 == 0) {
                System.out.println("VALOR INVALIDO! O segundo valor nao pode ser zero.");
            }
        } while (valor2 == 0);

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisao = " + resultado);

        scanner.close();
    }
}
