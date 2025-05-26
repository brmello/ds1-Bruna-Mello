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

public class CarroEsportivo extends Carro {
    private int potencia;
    private boolean turbo;
    private String tipoDeTransmissao;
    private int numeroDePortas;

    public CarroEsportivo(String modelo, String cor, int ano, int velocidadeMaxima, 
                          String marca, int quilometragem, int potencia, boolean turbo, 
                          String tipoDeTransmissao, int numeroDePortas) {
        super(modelo, cor, ano, velocidadeMaxima, marca, quilometragem);
        this.potencia = potencia;
        this.turbo = turbo;
        this.tipoDeTransmissao = tipoDeTransmissao;
        this.numeroDePortas = numeroDePortas;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public String getTipoDeTransmissao() {
        return tipoDeTransmissao;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public String exibirInfo() {
        String info = super.exibirInfo() + "\n" +
                      "Potencia: " + potencia + " CV\n" +
                      "Turbo: " + (turbo ? "Ligado" : "Desligado") + "\n" +
                      "Tipo de Transmissao: " + tipoDeTransmissao + "\n" +
                      "Numero de Portas: " + numeroDePortas;
        return info;
    }
}



