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
public class ex3 {
       public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        int maior_n = 0;
        int menor_n = Integer.MAX_VALUE;
        
        for (int i = 0; i < n.length;i++)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt(); 
            
            if(n[i]>maior_n)
                {
                    maior_n = n[i];
                    
                }
                if(n[i]<menor_n)
                {
                    menor_n = n[i];
                }
        }
        System.out.println(maior_n);
        System.out.println(menor_n);   
    }
}
