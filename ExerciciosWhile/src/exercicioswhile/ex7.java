/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioswhile;

/**
 *
 * @author vanme
 */
import java.util.Scanner;
public class ex7 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do lado do quadrado (1-20): ");
        int lado = scanner.nextInt();
        
        while (lado < 1 || lado > 20) {
            System.out.print("Tamanho invalido. Digite um valor entre 1 e 20: ");
            lado = scanner.nextInt();
        }
        
        int linha = 1;
        while (linha <= lado) {
            int coluna = 1;
            while (coluna <= lado) {
                System.out.print("*");
                coluna++;
            }
            System.out.println(); 
            linha++;
        }
        
        scanner.close();
    }
}
