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
public class ex15 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (numero de termos da serie de Fibonacci): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O valor de nao deve ser maior que zero.");
        } else {

            int termo1 = 1, termo2 = 1;

            System.out.println("Serie de Fibonacci ate o " + n + "º termo:");

            if (n >= 1) {
                System.out.print(termo1 + " ");
            }
            if (n >= 2) {
                System.out.print(termo2 + " ");
            }

            for (int i = 3; i <= n; i++) {
                int proximoTermo = termo1 + termo2;
                System.out.print(proximoTermo + " ");

                termo1 = termo2;
                termo2 = proximoTermo;
            }
        }

        scanner.close();
    }
}

