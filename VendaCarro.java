/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
import java.util.Scanner;

/**
 *
 * @author 181810146
 */
public class VendaCarro {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float valorDistribuidor, imp, custoFabrica, valorConsumidor;
        

        System.out.println(":::Calculadora de imposto sobre o carro:::");
        System.out.println("Digite o valor de fábrica: ");
        custoFabrica = leia.nextFloat();
        valorDistribuidor = custoFabrica * 0.28f;
        imp = custoFabrica *0.45f;
        valorConsumidor = custoFabrica + valorDistribuidor + imp;
        
        
        
    System.out.printf("O valor total do veiculo: %.2f\n" , valorConsumidor);
    /*o custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos
    (aplicados ao custo de fábrica).Supondo que o percentual
    do distribuidor seja 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fabrica de um carro, calcular
    e escrever o custo final ao consuimidor/
    */

   
     
     }
    
    
}
