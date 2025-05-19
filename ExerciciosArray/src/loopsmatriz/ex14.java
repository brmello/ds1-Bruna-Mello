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
public class ex14 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int[] n = new int[10];
        
        System.out.println("me diga um numero");
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt();
            
          
        }
        for(int j = 0; j <n.length;j++)
        {
            if(n[j]<5)
            {
                n[j]=5;
            }
        }
        
        for(int x = 0; x<n.length;x++)
        {
            System.out.println("os valores sao "+n[x]);
        }
    }    
}
