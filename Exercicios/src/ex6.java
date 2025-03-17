/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
   import java.util.Scanner;
public class ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a distancia da viagem (em km): ");
        int distancia = scanner.nextInt();

        System.out.print("Digite o consumo medio do carro (em km/l): ");
        int consumoMedio = scanner.nextInt();

        System.out.print("Digite o preço do combustivel (em R$/litro): ");
        int precoCombustivel = scanner.nextInt();

    
        int custoTotal = (distancia / consumoMedio) * precoCombustivel;


        System.out.println("O custo estimado com combustivel e: R$ " + custoTotal);

        scanner.close();
    }
}
