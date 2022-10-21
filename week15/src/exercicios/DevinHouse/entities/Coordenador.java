package exercicios.DevinHouse.entities;

public class Coordenador extends Pessoa{
    private Integer quantidadeCursosCoord;

    public Coordenador(){
        super();
    }

    //Constructor
    public Coordenador(String nome, Integer idade, Integer quantidadeCursosCoord){
        super(nome, idade);
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    //Getters
    public Integer getQuantidadeCursosCoord() {
        return quantidadeCursosCoord;
    }

    //Setters
    public void setQuantidadeCursosCoord(Integer quantidadeCursosCoord) {
        this.quantidadeCursosCoord = quantidadeCursosCoord;
    }

    //Métodos
}
