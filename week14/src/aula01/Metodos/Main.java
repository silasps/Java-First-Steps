package aula01.Metodos;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(3.1,7.3));

        calculadora.divisao(31.0, 312.123);
        calculadora.multiplicacao(123.12, 987.0);
        calculadora.subtracao(2319.13, 1444443.8);

        calculadora.printHistoricos();
    }
}
