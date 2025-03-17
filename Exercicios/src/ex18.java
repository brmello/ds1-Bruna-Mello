/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex18 {
        
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();
        
        System.out.print("Digite o valor total das vendas: R$ ");
        double valorTotalVendas = scanner.nextDouble();
        
        System.out.print("Digite o salario fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o valor da comissao por carro vendido: R$ ");
        double comissaoPorCarro = scanner.nextDouble();
        
        double comissaoTotal = numCarrosVendidos * comissaoPorCarro;
        double comissaoPorVendas = 0.05 * valorTotalVendas; // 5% do valor total das vendas
        double salarioFinal = salarioFixo + comissaoTotal + comissaoPorVendas;
        
        System.out.printf("O salario final do vendedor e: R$ %.2f\n", salarioFinal);
        
        scanner.close();
    }
}
