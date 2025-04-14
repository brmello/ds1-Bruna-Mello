/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopsmatriz;

/**
 *
 * @author CAMARGO
 */

public class LoopsMatriz {
    
    public static void main(String[] args) {
        String[] nome = {" Volvo", " BMW", " Ford", " Mazda"};
        String[] sobrenome = {" da Silva", " dos Santos", " de Souza", " Borba"};
     
                
        for (int i = 0; i < nome.length; i++) 
       {
           System.out.println("Digite um nome:");
        }
        
        for (int j = 0; j < nome.length; j++) 
        {
           System.out.println(sobrenome[j]);
        }
        
        for (int z = 0; z < nome.length; z++) 
        {
         System.out.println("Seu nome: " + nome[z] + sobrenome[z]);
        }
    }   
}
