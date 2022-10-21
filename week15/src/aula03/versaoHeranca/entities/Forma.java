package aula03.versaoHeranca.entities;

import aula03.versaoHeranca.enums.Cor;

public abstract class Forma {

    public Cor cor;

    public Forma(Cor cor) {

        this.cor = cor;

    }

    public Cor getCor() {

        return cor;

    }

    public void setCor(Cor cor) {

        this.cor = cor;

    }

    public abstract double area();


}
