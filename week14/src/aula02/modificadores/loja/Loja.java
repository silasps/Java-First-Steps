package aula02.modificadores.loja;

import aula02.modificadores.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Loja {
        List<Produto> produtos = new ArrayList<>();
        private String donoLoja = "Andre";

        //void não tem retorno
        void adicionaProduto(Produto produto) {
                produtos.add(produto);
        }

// Modificador
        public Produto removeProdutoPorID(int id){ // Assinatura
                //produto não existe
                //produtos existe

                // corpo de execução do método
                Produto resultado = produtos.remove(id);

                //retorno, o mesmo tipo que o Tipo de Retorno
                return resultado;
        }

        private void printLoja(){
                System.out.println("Loja do " + donoLoja);
        }
}
