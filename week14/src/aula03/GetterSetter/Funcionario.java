package aula03.GetterSetter;

public class Funcionario {
    //Atributos
    private String nome;
    private String funcional;
    private Double salario;
    private Double saldo;

    //Construtores

    //Construtor vazio ou Default
    Funcionario(){}

    //Construtor com parametros
    public Funcionario(String nome, String funcional, Double salario){
        this.nome = nome;
        this.funcional = funcional;
        this.salario = salario;
    }

    public Funcionario(String nome, String funcional){
        this.nome = nome;
        this.funcional = funcional;
    }

    //Métodos
//modificador/tipo / nome           / parametros
    public String adicionaValorNome(String novoNome){
        this.nome = novoNome;
        return this.nome;
    }

    public Double recebeSalario(){
        return saldo += salario;
    }

    public Double recebeSalario(Double bonus){
        saldo = saldo + salario + bonus;
        return saldo;
    }

    // getter and setters
    public String getNome() {
        return nome;
    }

    public String getFuncional() {
        return funcional;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
