package aula01.Atributos;

public class Pessoa {
    String nome;
    Integer idade;
    String paisOrigem;

    @Override // serve para printar atributos dentro de uma classe
    public String toString() {
        return "Atributos.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", paisOrigem='" + paisOrigem + '\'' +
                '}';
    }
}
