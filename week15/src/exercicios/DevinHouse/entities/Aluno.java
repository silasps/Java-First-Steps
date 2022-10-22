package exercicios.DevinHouse.entities;

public class Aluno extends Pessoa{
    private String curso;
    private Integer matricula;

    public Aluno (){
        super();
    }

    //Constructor
    public Aluno(String nome, Integer idade, String curso, Integer matricula){
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    //Getters
    public String getCurso() {
        return curso;
    }

    public Integer getMatricula() {
        return matricula;
    }

    //Setters
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    //Métodos
    @Override
    public void obterInformacoes(){

    }
}
