package aula03.GetterSetter;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario("Arthur", "81209371",4100.0);
        Funcionario funcionario2 = new Funcionario("Arnaldo", "81209371");
        Funcionario funcionario3 = new Funcionario("Silas", "81209371", 1928.10);
        Funcionario funcionario4 = new Funcionario("Mario", "81209371");

        funcionario.adicionaValorNome("Silas");

        System.out.println("Nome Funcionario: " + funcionario1.getNome());
        System.out.println("Nome Funcionario: " + funcionario2.getNome());
        System.out.println("Nome Funcionario: " + funcionario3.getNome());
        System.out.println("Nome Funcionario: " + funcionario4.getNome());
    }
}
