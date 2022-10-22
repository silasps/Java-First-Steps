package exercicios.DevinHouse.entities;

public class Mentor extends Pessoa{
    private String linguagemDeProgramacao;

    public Mentor(){
        super();
    }

    //Constructor
    public Mentor (String nome, Integer idade, String linguagemDeProgramacao){
        super(nome, idade);
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    //Getters
    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    //Setters
    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    //Métodos
    @Override
    public void obterInformacoes(String linguagemDeProgramacao){
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }
}
