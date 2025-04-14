/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsmatriz;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;
public class exemploaula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[4];
        String[] sobrenome = new String[4];
        String[] nomefinal = new String[4];
                
        for (int i = 0; i < nome.length; i++) 
        {
           System.out.println("Digite um nome:");
           nome[i] = scanner.nextLine();
        }
        
        for (int j = 0; j < sobrenome.length; j++) 
        {
           System.out.println("Digite um sobrenome: ");
           sobrenome[j] = scanner.nextLine();
        }
        
        for (int z = 0; z < nomefinal.length; z++) 
        {
         System.out.println("Seu nome: " + nome[z] + " " + sobrenome[z]);
        }
        
        scanner.close();
    }
}
