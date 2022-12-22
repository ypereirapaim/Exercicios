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
public class CalcIMC {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float peso, alt, imc;
        String classificacao;

        System.out.println("calculadora de IMC");
        System.out.print("Digite seu peso: ");
        peso = leia.nextFloat();
        System.out.print("Digite sua altura ");
        alt = leia.nextFloat();
        imc = peso / (alt * alt);

        System.out.printf("Seu IMC é: %2f", imc);

        if (imc <= 18.5) {
            classificacao = "Abaixo do peso!";

        } else if (imc <= 24.9) {
            classificacao = "peso ideal";

        } else if (imc <= 29.9) {
            classificacao = "Levemente acima do peso!";

        } else if (imc <= 34.9) {
            classificacao = "Obesidade grau I!";

        } else if (imc <= 39.9) {
            classificacao = "Obesidade grau II!";

        } else {
            classificacao = "Obesidade grau III!";

        }
        System.out.println("\nSua Classificação é: " + classificacao);
    }
}
