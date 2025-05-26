/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro1;

/**
 *
 * @author CAMARGO
 */
import javax.swing.JOptionPane;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private int velocidadeMaxima;
    private String marca;
    private int quilometragem;
    
    public Carro(String modelo, String cor, int ano, int velocidadeMaxima, String marca, int quilometragem) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.marca = marca;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuilometragem() {
        return quilometragem;
    }
    
    public String exibirInfo() {
        String info = "Marca: " + marca + "\n" +
                      "Modelo: " + modelo + "\n" +
                      "Cor: " + cor + "\n" +
                      "Ano: " + ano + "\n" +
                      "Velocidade Maxima: " + velocidadeMaxima + " km/h\n" +
                      "Quilometragem: " + quilometragem + " km";
        return info;
    }
}
