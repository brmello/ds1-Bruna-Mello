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
public class ex13 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int[] n = new int[10];
        
        System.out.println("me diga um numero");
        for (int i = 0; i < n.length;i++)
        {
            n[i] = entrada.nextInt();
            
          
        }
        for (int e = 0; e < n.length; e++)
        {
            if (n[e]%3 == 0)
            {
                System.out.println("o numero "+n[e]+" e multiplo de 3");
                
            }
        }
    }
}