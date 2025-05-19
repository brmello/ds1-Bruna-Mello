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
public class ex12 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        
        float soma_n = 0;
        float media_n;
        System.out.println("me diga um numero");
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt(); 
            
          
        }
        for(int j=0;j<n.length;j++)
        {
            soma_n = n[j]+soma_n;
            
        }
        media_n = soma_n/n.length;
        System.out.println("a media é "+media_n);
        for (int e = 0;e < n.length;e++)
        {
            if (n[e] > media_n)
            {
                System.out.println("o numero "+n[e]+" e maior que a media");
            }
        }
        
    }    
}
