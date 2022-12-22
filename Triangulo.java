package inf3n212pj;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    verTriangulo();
                    break;
                case 0:
                    System.out.println("Aplicação Encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;

            }
        } while (opM != 0);
    }

    public static void menu() {
        System.out.println("Válida Triangulo");
        System.out.println(" 1 - verifica Triangulo");
        System.out.println(" 0 - Sair");
        System.out.print("Digite Aqui:");
    }

    public static void verTriangulo() {
        Scanner leia = new Scanner(System.in);
        int A, B, C;
        System.out.println("Digite um lado do triângulo: ");
        A = leia.nextInt();
        System.out.println("Digite o segundo lado do triângulo:");
        B = leia.nextInt();
        System.out.println("Digite o terceiro lado do triângulo:");
        C = leia.nextInt();
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
        } else if ((A == B) && (B == C)) {
            System.out.println("Os valores formam um triângulo Equilátero!");
        } else if ((A == B) || (A == C) || (B == C)) {
            System.out.println("Os valores formam um triângulo Isósceles!");
        } else {
            System.out.println("Os valores formam um triângulo Escaleno!");
        }
    }
}
