/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um valor para n (maior que zero): ");
        int N = scanner.nextInt();

        if (N > 0) {

            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Valor invalido! n deve ser maior que zero.");
        }

        scanner.close();
    }
}
