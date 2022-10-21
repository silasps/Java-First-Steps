package ExDeFixacao.Funcionarios;

public class FuncionarioTerc extends Funcionario{

    private Double despesaAdicional;


    public FuncionarioTerc(String nome, Integer horas, Double valorPorHora) {
        super(nome, horas, valorPorHora);
        this.despesaAdicional = despesaAdicional;
    }
}
