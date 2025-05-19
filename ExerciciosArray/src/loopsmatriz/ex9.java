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
public class ex9 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        System.out.println("me diga um numero sem ser os que ficarao no vetor");
        int valor_limite = entrada.nextInt();
        for(int i=0;i<n.length;i++)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt();
         if(n[i]>valor_limite) {
             System.out.println("o numero "+n[i]+ " é maior que "+valor_limite);
         }  
        }
    }
}
