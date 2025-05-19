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
public class ex4 {
     public static void main(String args[]) {
        
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        for (int i = variavel-1;i >= 0; i--)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt(); 
            
        }
        for(int j = 0; j <n.length; j ++)
        {
            System.out.println(n[j]);
        }
    }   
}
