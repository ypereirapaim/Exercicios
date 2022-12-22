/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 181810146
 */
public class Aluno {

    private String cpf, nome, sexo, telefone;
    private int idade, matricula;
    private boolean status;
    private String endereco;

    public Aluno() {
    }
/**
 * Construtor com todos atributos
 * @param cpf
 * @param nome
 * @param sexo
 * @param telefone
 * @param idade
 * @param matricula
 * @param status
 * @param endereco 
 */
    public Aluno(String cpf, String nome, String sexo, String telefone, int idade, int matricula, boolean status, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
        this.matricula = matricula;
        this.status = status;
        this.endereco = endereco;
    }
     /**
      * Método que retorna o cpf do aluno
      * @return 
      */
    public String getCpf() {
        return cpf;
    }
    /**
     * Atribui matricula do aluno
     * @param cpf 
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + ", idade=" + idade + ", matricula=" + matricula + ", status=" + status + ", endereco=" + endereco + '}';
    }

}
