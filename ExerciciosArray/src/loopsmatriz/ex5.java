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
public class ex5 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos vetores voce deseja?");
        int variavel = entrada.nextInt();
        int[] n = new int[variavel];
        int cont_par = 0;
        int cont_imp = 0;
        for (int i = 0; i < n.length;i++)
        {
            System.out.println("me diga um numero");
            n[i] = entrada.nextInt(); 
            
            if(n[i]%2 == 0)
            {
                cont_par = cont_par +1;
            }
            else{
                cont_imp = cont_imp +1;
            }
        }
        System.out.println("Existem "+cont_par+" pares dentro de um vetor");
        System.out.println("Existem "+cont_imp+" impares dentro de um vetor");
    }
}
