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

public class Main {
    public static void main(String[] args) {
        // Recebendo dados do carro comum
        String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        String cor = JOptionPane.showInputDialog("Digite a cor do carro:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro:"));
        int velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima do carro:"));
        String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        int quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do carro:"));

        Carro carro = new Carro(modelo, cor, ano, velocidadeMaxima, marca, quilometragem);
        JOptionPane.showMessageDialog(null, carro.exibirInfo(), "Informações do Carro", JOptionPane.INFORMATION_MESSAGE);

        // Recebendo dados do carro esportivo
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro esportivo:");
        cor = JOptionPane.showInputDialog("Digite a cor do carro esportivo:");
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro esportivo:"));
        velocidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima do carro esportivo:"));
        marca = JOptionPane.showInputDialog("Digite a marca do carro esportivo:");
        quilometragem = Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem do carro esportivo:"));
        int potencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a potencia (CV) do carro esportivo:"));
        String turboStr = JOptionPane.showInputDialog("O carro esportivo tem turbo? (sim/não):");
        boolean turbo = turboStr.equalsIgnoreCase("sim");
        String tipoDeTransmissao = JOptionPane.showInputDialog("Digite o tipo de transmissao do carro esportivo:");
        int numeroDePortas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas do carro esportivo:"));

        CarroEsportivo esportivo = new CarroEsportivo(modelo, cor, ano, velocidadeMaxima, marca, quilometragem,
                                                      potencia, turbo, tipoDeTransmissao, numeroDePortas);
        JOptionPane.showMessageDialog(null, esportivo.exibirInfo(), "Informações do Carro Esportivo", JOptionPane.INFORMATION_MESSAGE);
    }
}


