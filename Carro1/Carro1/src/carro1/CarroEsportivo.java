/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro1;

/**
 *
 * @author CAMARGO
 */
public class CarroEsportivo extends Carro {
    private int potencia;
    private boolean turbo;
    private String tipoDeTransmissao;
    private int numeroDePortas;

    // Construtor da classe filha
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

    // Método para exibir informações do carro esportivo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Potencia: " + potencia + " CV");
        System.out.println("Turbo: " + (turbo ? "Ligado" : "Desligado"));
        System.out.println("Tipo de Transmissao: " + tipoDeTransmissao);
        System.out.println("Numero de Portas: " + numeroDePortas);
    }
}


