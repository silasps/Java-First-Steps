package aula02.construtoresExAula;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto produto1 = new Produto("Bala", "14/10/2022", 52.30);
        produto1.validaDataVencimento(10, 2022);
    }
}
