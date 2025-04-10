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
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1;
        do {
            System.out.print("Digite a nota da primeira avaliacao (0 a 10): ");
            nota1 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("VALOR INVALIDO!  Apenas notas de 0 a 10.");
            }
        } while (nota1 < 0 || nota1 > 10);

        double nota2;
        do {
            System.out.print("Digite a nota da segunda avaliacao (0 a 10): ");
            nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("VALOR INVALIDO!  Apenas notas de 0 a 10.");
            }
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno = " + media);

        scanner.close();
    }  
}
