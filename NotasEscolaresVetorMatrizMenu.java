/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n21pj;

import java.util.Scanner;

/**
 *
 * @author 181810146
 */
public class NotasEscolaresVetorMatrizMenu {
//declaração global

    static Scanner leia = new Scanner(System.in);
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    public static void main(String[] args) {
        System.out.println(".:Sistema de Notas:.");
        System.out.print("Informe o núm. de alunos:");
        nAlunos = (int) leiaFloat();
        System.out.println("Quantas notas por alunos:");
        nAlunos = (int) leiaFloat();//inicializar vetor e matriz de notas
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];//inicializou vetor
        int opM;
        do {
            menu();

            opM = (int) leiaFloat();
            switch (opM) {
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                     System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                     System.out.println("Opção inválida, tente novamente!");
                    break;
            }//fim switch

        } while (opM != 0);

    }//fim main

    public static void menu() {

        System.out.println("Inserir Alunos e notas");
        System.out.println("2 - Imprimir Alunos e notas");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui:");

    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Erro: ");
            System.out.println("Corrija o valor inserido: ");
            return leiaFloat();
        }
    }

    private static void inserirAlunoNotas() {
    if(contAlunos < nAlunos){
        contAlunos++;
    
    }else{
     System.out.println("Não é possivel mais digitar alunos." + "\nNúm. Máximo de posições obtidas.");
    }    
    }

    private static void imprimirAlunosNotas() {
        
    }
}
