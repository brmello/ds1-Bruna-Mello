/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro1;

/**
 *
 * @author CAMARGO
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fusca", "Azul", 1980, 90, "Volkswagen", 50000);
        carro.exibirInfo();

        System.out.println();

        CarroEsportivo esportivo = new CarroEsportivo("SF90", "Vermelha", 2019, 350, 
                                                       "Ferrari", 20000, 600, true, 
                                                       "Automatica", 2);
        esportivo.exibirInfo();
    }
}


