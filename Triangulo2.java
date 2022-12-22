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
public class Triangulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        int opM;

        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuario.");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente!");
                    break;

            }
        } while (opM != 0);

    }

    public static void menu() {
        System.out.println(".:VALIDA TRIÂNGUlO:.");
        System.out.println("1 - Verifica Triângulo");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui:");

    }//fim menu//

    public static void verTriangulo() {
        Scanner leia = new Scanner(System.in);
        int A, B, C;
        System.out.print("Digite um lado do triangulo: ");
        A = leia.nextInt();
        System.out.print("Digite o segundo lado do triangulo: ");
        B = leia.nextInt();
        System.out.print("Digite o terceiro lado do triangulo: ");
        C = leia.nextInt();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A == B) && (B == C)) {
                System.out.println("Estes valores formam um triangulo Equilatero.");

            } else {
                if ((A == B) || (A == C) || (B == C)) {
                    System.out.println("Estes valores formam um triangulo Isósceles.");
                } else {
                    System.out.println("Estes valores formam um triangulo Escaleno.");
                }
            }
        } else {
            System.out.println("Estes valores não formam um triangulo.");

        }
    }
}
