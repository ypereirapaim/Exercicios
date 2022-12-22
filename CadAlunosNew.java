package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aluno;

public class CadAlunosNew {

    static Scanner leia = new Scanner(System.in);
    static ArrayList<Aluno> alunos = new ArrayList<>();

    public static void main(String[] args) {
        int opM;
        do {
            menu();
            opM = leiaInt();
            switch (opM) {
                case 1:
                    cadAluno();
                    break;
                case 2:
                    break;
                case 3:
                    imprimeAlunos();
                    break;
                case 4:
                    deletarAluno();
                    break;
                case 5:
                    imprimeAlunosAtivos();
                    break;
                case 0:
                    System.out.println("APLICAÇÃO ENCERRADA!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE");
                    break;
            }
        } while (opM != 0);

    }//fim main

    public static void menu() {
        System.out.println(".: SISTEMA DE ALUNOS :.");
        System.out.println(" 1 - Cadastras Aluno");
        System.out.println(" 2 - Editar Aluno");
        System.out.println(" 3 - Imprimir Todos Alunos");
        System.out.println(" 4 - Deletar Aluno/Inativar");
        System.out.println(" 5 - Imprimir Alunos Ativos");
        System.out.println(" 0 - Sair");
        System.out.print("Digite Aqui: ");
    }//fim menu

    public static void cadAluno() {
        System.out.println("Cadastro de Aluno");
        System.out.print("Digite o CPF do aluno: ");
        String cpf = leia.next();
        if (!verCPF(cpf)) {//"!" serve para negar o retorno do verCPF()
            System.out.print("Digite a matricula: ");
            int matricula = leiaInt();
            System.out.print("Informe seu Nome: ");
            String nome = leia.next();
            System.out.print("Informe seu Genero: ");
            String sexo = leia.next();
            System.out.print("Informe sua Idade: ");
            int idade = leiaInt();
            System.out.print("Informe seu Telefone: ");
            String telefone = leia.next();
            System.out.print("Informe seu Endereço: ");
            String endereco = leia.next();
            boolean status = true;
            Aluno a = new Aluno(matricula, cpf, nome, endereco, sexo, idade, telefone, status);
            alunos.add(a);
        } else {
            System.out.println(cpf + " Já Está Cadastrado!");                     
                if (!getAluno(cpf).isStatus()) {            
                    System.out.println("Aluno Inativado");
                  
                }
                int opM;
                System.out.println("Deseja ativar");
                System.out.print("Digite: ");
                opM = leia.nextInt();
                if(opM == 1){
                    System.out.println(getAluno(cpf).setStatus(true));
                    
                }
                
            
        }

    }//fim cadAluno

    public static boolean verCPF(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }//fim verCPF

    public static int leiaInt() {
        try {
            return leia.nextInt();
        } catch (Exception e) {
            System.out.print("Valor inserido inválido, tente novamente: ");
            return leiaInt();
        }
    }//fim leiaInt()

    public static void imprimeAlunos() {
        System.out.println("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista Vazia!");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.toString());
            }
        }
    }

    public static Aluno getAluno(String cpf) {
        for (Aluno aluno : alunos) {
            if (aluno.getCpf().equals(cpf)) {
                return aluno;
            }
        }
        return null;
    }//fim getAluno

    public static void deletarAluno() {
        System.out.println("Deletar Aluno/Inativar");
        System.out.print("Informe seu CPF: ");
        String cpf = leia.next();
        if (verCPF(cpf)) {
            System.out.println(" 1 - deletar\n 2 - Inativar");
            System.out.println("Digite Abaixo:");
            int op = leiaInt();
            if (op == 1) {
                System.out.print("Digite: ");
                alunos.remove(getAluno(cpf));
                System.out.println("Aluno com CPF " + cpf + " deletado com sucesso! ");
            } else if (op == 2) {
                System.out.print("Digite: ");
                getAluno(cpf).setStatus(false);
                System.out.println("Aluno " + getAluno(cpf).getNome() + "Inativado");
            }
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public static void imprimeAlunosAtivos() {
        System.out.println("Lista de Alunos");
        if (alunos.isEmpty()) {
            System.out.println("Lista Vazia!");
        } else {
            for (Aluno aluno : alunos) {
                if (aluno.isStatus()) {
                    System.out.println(aluno.toString());
                }

            }
        }
    }
}//fim class
