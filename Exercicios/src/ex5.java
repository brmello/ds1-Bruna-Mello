/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class ex5 {
    public static void main(String[] args) {
   
        int a = 26;
        int b = 78;

        System.out.println("Valores antes da troca:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        
        int temp = a; 
        a = b;       
        b = temp;   

        System.out.println("\nValores depois da troca:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
