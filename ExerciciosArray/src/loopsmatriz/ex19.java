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
public class ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[10];
        int maiorV = valores[0];
        int segundMV = valores[0];

        for (int i = 0; i < valores.length; i++)
        {
            System.out.println("me diga um numero");
            valores[i] = entrada.nextInt();
        }
        for (int j = 0; j < valores.length; j++)
        {
            if (maiorV < valores[j])
            {
                maiorV = valores[j];
            }
            if (valores[j] > segundMV && valores[j] < maiorV)
            {
                segundMV = valores[j];
            }
        }
        System.out.println("o maior numero do vetor é "+maiorV+"e o segundo maior valor é "+segundMV);

    }    
}
