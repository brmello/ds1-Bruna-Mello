/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex9 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distancia da viagem (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo do carro (em km/l): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o preco do combustivel (em R$/litro): ");
        double precoCombustivel = scanner.nextDouble();

        double litrosNecessarios = distancia / consumo;

        System.out.printf("Serão necessarios %.2f litros de combustivel.%n", litrosNecessarios);
        System.out.printf("O custo estimado com combustivel e: R$ %.2f%n", litrosNecessarios * precoCombustivel);

        scanner.close();
    }
}
