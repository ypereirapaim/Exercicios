/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import model.Aluno;
import java.util.Scanner;

/**
 *
 * @author 181810146
 */
public class CadAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno juca = new Aluno("12312312312", "jubuileu", "masc", "51999999", 12312, 55, true, "VASDASD");
        System.out.println("Aluno: " + juca.toString());
        System.out.println("Nome: " + juca.getNome());
        //atualiza no user juca com nome comleto
        juca.setNome("Juca bala das candongas");
        System.out.print("Aluno: " + juca.toString());
        
        System.out.println("\n");

        Aluno pedro = new Aluno("1234341235143", "pedro", "masc", "5199999912334", 123122, 551, true, "VASqweqwDASD");
        System.out.println("Aluno: " + pedro.toString());
        System.out.println("Nome: " + pedro.getNome());
        pedro.setNome("pedro bala das candongas");
        System.out.print("Aluno: " + pedro.toString());

        //Criar novo objeto aluno com seus dados logo abaixo
        
        Aluno jair= new Aluno("23213", "321", "Jair Ferraz", "Masculino", 41, 8899, false, "Gravatai");
        System.out.println("Aluno: " + jair.toString());
        
        //Criar novo aluno leitura pelo console usando Scanner
        
        Scanner leia = new Scanner(System.in);
        
        String cpf, nome, sexo, telefone;
        int idade, matricula;
        boolean status;
        String endereco;
        System.out.print("Informe a matricula: ");
        matricula = leia.nextInt();
        leia.nextInt();
        System.out.print("Informe o cpf: ");
        cpf = leia.nextLine();
        System.out.print("Informe o nome: ");
        nome = leia.nextLine();
        System.out.print("Informe o sexo(M/F): ");
        sexo = leia.nextLine();
        System.out.print("Informe a idade: ");
        idade = leia.nextInt();
        leia.nextLine();
        System.out.print("Informe o telefone: ");
        telefone = leia.nextLine();
        System.out.print("Informe o endereço: ");
        endereco = leia.nextLine();
        System.out.print("Aluno Ativo? Digite: 1-Sim | 2-Não:");
        int valorStatus = leia.nextInt();
        if(valorStatus == 1){
          status = true;
        }else{
          status = false;  
        }
        Aluno aluno1 = new Aluno(cpf, nome, sexo, telefone, idade, matricula, status, endereco);
        System.out.println("Aluno 1: " + aluno1.toString());
    }//fim da main

}
