/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex15 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario mensal atual do funcionario: ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = scanner.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.printf("O novo salario apos o reajuste e: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
