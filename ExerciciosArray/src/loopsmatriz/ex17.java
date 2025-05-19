/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loopsmatriz;

import java.util.Arrays;

/**
 *
 * @author CAMARGO
 */
public class ex17 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                         21,22,23,24,25,26,27,28,29,30};

        
        Arrays.sort(numeros);

        double mediana;
        int meio = numeros.length / 2;

        if (numeros.length % 2 == 0) {
            mediana = (numeros[meio - 1] + numeros[meio]) / 2.0;
        } 
        
        else { 
            mediana = numeros[meio];
        }

        System.out.println("A mediana é: " + mediana);
    }    
}
