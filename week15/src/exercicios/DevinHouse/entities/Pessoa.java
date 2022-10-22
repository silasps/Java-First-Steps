package exercicios.DevinHouse.entities;

import java.util.Scanner;

public abstract class Pessoa{
    private String nome;
    private Integer idade;

    //Método vazio
    public Pessoa(){

    }

    //Constructor
    public Pessoa(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
Scanner age = new Scanner(System.in);
    //Métodos
    public abstract void obterInformacoes();
}
