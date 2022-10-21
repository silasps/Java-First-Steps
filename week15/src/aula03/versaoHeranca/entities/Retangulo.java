package aula03.versaoHeranca.entities;

import aula03.versaoHeranca.enums.Cor;

public class Retangulo extends Forma {

    private Double largura;
    private Double altura;

    public Retangulo (Cor cor, Double largura, Double altura){

        super(cor);

        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area(){
        return largura * altura;
    }
}
