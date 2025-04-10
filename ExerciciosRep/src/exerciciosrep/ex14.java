/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author CAMARGO
 */
public class ex14 {
     public static void main(String[] args) {

        int populacaoA = 80000;
        int populacaoB = 200000;

        double taxaCrescimentoA = 0.03; 
        double taxaCrescimentoB = 0.015; 

        int anos = 0; 

        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA); 
            populacaoB += (int) (populacaoB * taxaCrescimentoB); 
            anos++; 
        }

        System.out.println("Numero de anos necessarios: " + anos);
        System.out.println("Populacao final de A: " + populacaoA);
        System.out.println("Populacao final de B: " + populacaoB);
    }
}
