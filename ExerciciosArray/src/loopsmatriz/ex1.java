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
public class ex1 {
      public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[10];
        
        for (int i = 0; i < n.length;i++)
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
