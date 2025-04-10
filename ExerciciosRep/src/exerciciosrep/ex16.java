/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrep;

/**
 *
 * @author vanme
 */
public class ex16 {
     public static void main(String[] args) {

        int termo1 = 0, termo2 = 1;

        System.out.println("Serie de Fibonacci ate que o valor seja maior que 500:");

        System.out.print(termo1 + " " + termo2 + " ");

        while (true) {
            int proximoTermo = termo1 + termo2;

            if (proximoTermo > 500) {
                break; 
            }

            System.out.print(proximoTermo + " ");

            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}