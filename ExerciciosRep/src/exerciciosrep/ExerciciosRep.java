/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class ExerciciosRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        
        int numero = entrada.nextInt();
        
        for (int i = 0; i <= numero; i++)
        {
            System.out.println("O seu numero e igual a: " + i);     
        }
    }
    
}
