package aula03.versaoInterface;

import aula03.versaoInterface.entities.Circulo;
import aula03.versaoInterface.entities.FormaAbstrata;
import aula03.versaoInterface.entities.Retangulo;
import aula03.versaoInterface.enums.Cor;

public class Main {
    public static void main(String[] args) {

        FormaAbstrata f1 = new Circulo(Cor.BLACK, 2.0);

        FormaAbstrata f2 = new Retangulo(Cor.WHITE, 3.0, 4.0);

        System.out.println("A cor do ciruculo é: " + f1.getCor());
        System.out.println("A área do ciruculo é: " + String.format("%.3f", f1.area()));
        System.out.println("A cor do retângulo é: " + f2.getCor());
        System.out.println("A área do retângulo é: " + String.format("%.3f", f2.area()));
    }
}
