/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsmatriz;

import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class ex11 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        System.out.println("me diga um numero");
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt(); 
            
          
        }
    }   
}
