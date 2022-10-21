package aula03.versaoInterface.entities;

import aula03.versaoInterface.enums.Cor;

public class Circulo extends FormaAbstrata {

    private Double raio;

    public Circulo(Cor cor, Double raio){
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * raio * raio;
    }
}
