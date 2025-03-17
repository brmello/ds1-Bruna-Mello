/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex21 {
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tipo de combustivel (A para Alcool, G para Gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0); 
        
        System.out.print("Digite o numero de litros vendidos: ");
        double litros = scanner.nextDouble(); 
        
        double precoPorLitro = 0.0;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoPorLitro = 2.90; // Preço do litro do álcool
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoPorLitro = 3.30; // Preço do litro da gasolina
        } else {
            System.out.println("Tipo de combustivel invalido!");
            scanner.close();
            return;
        }
        
        double valorTotal = litros * precoPorLitro;
        
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorTotal);
        
        scanner.close();
    }
}
