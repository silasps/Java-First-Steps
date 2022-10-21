package aula03.versaoHeranca;

import aula03.versaoHeranca.entities.Circulo;
import aula03.versaoHeranca.entities.Forma;
import aula03.versaoHeranca.entities.Retangulo;
import aula03.versaoHeranca.enums.Cor;

public class Main {
    public static void main(String[] args) {

        Forma f1 = new Circulo(Cor.BLACK, 2.0);

        Forma f2 = new Retangulo(Cor.WHITE, 3.0, 4.0);

        System.out.println("A cor do ciruculo é: " + f1.getCor());
        System.out.println("A área do ciruculo é: " + String.format("%.3f", f1.area()));
        System.out.println("A cor do retângulo é: " + f2.getCor());
        System.out.println("A área do retângulo é: " + String.format("%.3f", f2.area()));
    }
}
