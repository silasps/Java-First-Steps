package aula01.Metodos;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    List<Double> historicoResultados = new ArrayList<>();

    public Double soma(Double numero1, Double numero2) {
        Double resultado = numero1 + numero2;
        System.out.println("Soma Realizada!!");
        historicoResultados.add(resultado);
        return resultado;
    }

    public Double subtracao(Double numero1, Double numero2) {
        Double resultado = numero1 - numero2;
        historicoResultados.add(resultado);
        return resultado;
    }

    public Double multiplicacao(Double numero1, Double numero2) {
        Double resultado = numero1 * numero2;
        historicoResultados.add(resultado);
        return resultado;
    }

    public Double divisao(Double numero1, Double numero2) {
        Double resultado = numero1 / numero2;
        historicoResultados.add(resultado);
        return resultado;
    }

    public void printHistoricos() {
        historicoResultados.forEach(r -> System.out.println(r));

        for (Double resultado : historicoResultados) {
            System.out.println("O resultado foi: " + resultado);
        }

        for (int i=0; i<historicoResultados.size(); i++) {
            System.out.println("O resultado da conta " + (i+1) + " foi " + historicoResultados.get(i));
        }
    }


}
