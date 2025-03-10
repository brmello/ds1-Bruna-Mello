/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class ex3 {

    /**
     * 
     */
    public static void main(String[] args) {
        // TODO code applicacion logic here
        
        String vendedor = "Leonardo";
        float fixo = 3500;
        float vendas = 10000;
        float porcentagem = 0.15f;
        float comissao = vendas * porcentagem;
        float salariofinal = comissao + fixo;
          System.out.println(vendedor + " recebe " + fixo + " de salario fixo, mas o seu salario no final do mes sera " + salariofinal);
        
    }
}
