package exercicios.DevinHouse.entities;

import java.util.Scanner;

public class Pessoa{
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
    public void obterInformacoes(){
        Scanner nm = new Scanner(System.in);
        Scanner age = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        this.nome = nm.nextLine();
        System.out.print("Digite sua idade: ");
        this.nome = nm.nextLine();
    }
}
