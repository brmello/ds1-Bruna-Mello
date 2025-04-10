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
public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero de alunos na turma: ");
        int numeroAlunos = scanner.nextInt();
        
        while (numeroAlunos <= 0) {
            System.out.print("Número invalido. Digite um numero maior que zero: ");
            numeroAlunos = scanner.nextInt();
        }
        
        double somaNotas = 0;
        int contador = 1;
        
        System.out.println("Digite as notas dos alunos:");
        
        while (contador <= numeroAlunos) {
            System.out.print("Nota do aluno " + contador + ": ");
            double nota = scanner.nextDouble();

            while (nota < 0 || nota > 10) {
                System.out.print("Nota invalida. Digite um valor entre 0 e 10: ");
                nota = scanner.nextDouble();
            }
            
            somaNotas += nota;
            contador++;
        }
        
   
        double media = somaNotas / numeroAlunos;
        System.out.printf("\nA media da turma =  %.2f ", media);
        
        scanner.close();
    }
}
