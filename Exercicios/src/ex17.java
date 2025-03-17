/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fabrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        double custoDistribuidor = custoFabrica * 28 / 100;
        double custoImpostos = custoFabrica * 45 / 100;

        double custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        System.out.printf("O custo final ao consumidor e: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
