package Arrays;

import java.util.LinkedList;

public class LinkedListAula {
    public static void main(String[] args) {
        LinkedList<java.lang.String> listaComanda = new LinkedList<>();
        listaComanda.addFirst("Carne Loka");
        listaComanda.addFirst("Picanha");
        listaComanda.addFirst("Prato Especial");
        listaComanda.addFirst("Macarrão Salsicha");
        listaComanda.addFirst("Pizza 4 queijos");
        listaComanda.addFirst("Nigirí");

        int tamanho = listaComanda.size();
        //preparação
        for(int i=0; i < tamanho; i++){
            System.out.println("Pedido Preparao: " + listaComanda.pollLast());
        }
        System.out.println("Lista: " + listaComanda);

    }

}