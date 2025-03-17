/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex20 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de combustivel (Alcool ou Gasolina): ");
        String combustivel = scanner.nextLine().toLowerCase();
        
        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();
        
        double precoPorLitro = 0.0;
        double desconto = 0.0;

        if (combustivel.equals("alcool")) {
            precoPorLitro = 3.50;
            desconto = (litros <= 20) ? 0.03 : 0.05; 
        } else if (combustivel.equals("gasolina")) {
            precoPorLitro = 4.50; 
            desconto = (litros <= 20) ? 0.04 : 0.06; 
        } else {
            System.out.println("Tipo de combustivel invalido!");
            scanner.close();
            return;
        }

        double valorSemDesconto = litros * precoPorLitro;
        double valorDesconto = valorSemDesconto * desconto;
        double valorFinal = valorSemDesconto - valorDesconto;
        
        System.out.printf("Valor total a pagar: R$ %.2f\n", valorFinal);
        
        scanner.close();
    }
}
