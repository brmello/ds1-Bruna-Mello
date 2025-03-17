/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Digite o consumo do carro (em km/l): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite a distancia a ser percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o preco do litro de combustivel (em R$): ");
        double precoCombustivel = scanner.nextDouble();
    
        double custo = (distancia / consumo) * precoCombustivel;

        System.out.printf("O custo estimado com combustivel e: R$ %.2f%n", custo);

        scanner.close();
    }
}
