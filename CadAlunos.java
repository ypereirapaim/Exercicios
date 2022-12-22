package inf3n212pj;

import model.Aluno;
import java.util.Scanner;

public class CadAlunos {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Aluno juca = new Aluno(123, "321", "Juca Bala", "Floresta", "masculino", 23, "51993390663", true);
        System.out.println("Nome: " + juca.getNome());
        juca.setNome("Juca Bala das Candongas");
        System.out.println(juca.toString());
        Aluno cria = new Aluno(124, "456", "cria bala", "Floresta Sul", "masculino", 33, "51998664381", true);
        System.out.println("Nome: " + cria.getNome());
        cria.setNome("Juca Bala das Candongas");
        System.out.println(cria.toString());
        System.out.println("Crie seu aluno no sistema: ");
         int matricula;
         String cpf;
         String nome;
         String sexo;
         int idade;
         String telefone;
         boolean status;
         String endereco;
         System.out.println("Informe a matrícula: ");
         matricula = leia.nextInt();
         System.out.println("Informe o CPF: ");
         cpf = leia.nextLine();
         System.out.println("Informe o nome: ");
         nome = leia.nextLine();
         System.out.println("Informe o sexo(M/F): ");
         sexo = leia.nextLine();
         System.out.println("Informe a idade: ");
         idade = leia.nextInt();
         System.out.println("Informe o telefone: ");
         telefone = leia.nextLine();
         System.out.println("Informe o endereço: ");
         endereco = leia.nextLine();
         System.out.println("Deseja ativar o aluno(Sim/Não): ");
         String valorstatus;
         valorstatus = leia.nextLine();
         if(valorstatus=="Sim"){
             status = true;
         }else{
             status = false;
         }
    }

}
