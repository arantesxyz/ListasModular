package dev.arantes.education.listasmodular.lista1.EX2;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private int sexo;


    public Pessoa(String nome, String cpf, int idade, int sexo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean eMaiorDeIdade(){
        return this.idade >= 18;
    }
}
