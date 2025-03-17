/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ex14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o numero de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o numero de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o numero de votos validos: ");
        int votosValidos = scanner.nextInt();

        double percentualBrancos = (double) votosBrancos / totalEleitores * 100;
        double percentualNulos = (double) votosNulos / totalEleitores * 100;
        double percentualValidos = (double) votosValidos / totalEleitores * 100;

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos validos: %.2f%%\n", percentualValidos);

        scanner.close();
    }
}
