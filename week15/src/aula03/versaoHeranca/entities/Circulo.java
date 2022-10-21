package aula03.versaoHeranca.entities;

import aula03.versaoHeranca.enums.Cor;

public class Circulo extends Forma{

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
