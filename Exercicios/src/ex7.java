/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
     import java.util.Scanner;
public class ex7 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Digite a distancia da viagem (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o consumo do carro com gasolina (em km/l): ");
        double consumoGasolina = scanner.nextDouble();

        System.out.print("Digite o consumo do carro com alcool (em km/l): ");
        double consumoAlcool = scanner.nextDouble();

        System.out.print("Digite o preco da gasolina (em R$/litro): ");
        double precoGasolina = scanner.nextDouble();

        System.out.print("Digite o preco do alcool (em R$/litro): ");
        double precoAlcool = scanner.nextDouble();

        System.out.print("Digite o tipo de combustivel (1 para gasolina, 2 para álcool): ");
        int tipoCombustivel = scanner.nextInt();

    
        double custoTotal = 0;
        if (tipoCombustivel == 1) {
            custoTotal = (distancia / consumoGasolina) * precoGasolina;
            System.out.printf("O custo estimado com gasolina e: R$ %.2f%n", custoTotal);
        } else if (tipoCombustivel == 2) {
            custoTotal = (distancia / consumoAlcool) * precoAlcool;
            System.out.printf("O custo estimado com alcool e: R$ %.2f%n", custoTotal);
        } else {
            System.out.println("Tipo de combustivel invalido!");
        }

        scanner.close();
    }
}
