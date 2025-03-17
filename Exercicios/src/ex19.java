/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex19 {
   
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0); 
        
        double pesoIdeal;
        
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            // Caso o sexo informado não seja válido
            System.out.println("Sexo inválido! Por favor, insira 'M' para masculino ou 'F' para feminino.");
            scanner.close();
            return;
        }
        
        System.out.printf("%s, seu peso ideal e: %.2f kg\n", nome, pesoIdeal);
        
        scanner.close();
    } 
}
