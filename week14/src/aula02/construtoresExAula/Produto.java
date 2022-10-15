//Classe Produto, nome, data vencimento, preço
//método verifica vencimento, retorna a data de vencimento
//2 construtores, 1 vazio e 1 com todos os atributos
package aula02.construtoresExAula;

public class Produto {
    String nome;
    String dataVencimento;
    Double preco;

    public Produto(){

    }
    public Produto(String nome, String dataVencimento, Double preco){
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.preco = preco;
    }

    public void validaDataVencimento(Integer mes, Integer ano){
        Integer mesData = Integer.parseInt(this.dataVencimento.substring(0,2));
        Integer anoData = Integer.parseInt(this.dataVencimento.substring(0,2));

        if(mesData > mes && anoData > ano){
            System.out.println("Dentro da validade");
        } else {
            System.out.println("Fora da validade");
        }
    }
}
