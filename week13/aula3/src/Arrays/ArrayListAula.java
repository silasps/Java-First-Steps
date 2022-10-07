package Arrays;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListAula {
    public static void main(String[] args) {
        ArrayList<java.lang.String> listaNomes = new ArrayList<>(); //<> operador diamante
        listaNomes.add("Silas");
        listaNomes.add("Juvenal");
        listaNomes.add("Camila");
        listaNomes.add("Roger");
        listaNomes.add("Marcelo");
        listaNomes.add("Lucas");
        System.out.println(listaNomes);
        System.out.println("Tamanho da lista:"+listaNomes.size());

        listaNomes.remove(4);
        listaNomes.remove(2);
        listaNomes.remove(1);

        listaNomes.add(0, "Nunes");
        System.out.println(listaNomes);
        System.out.println("Tamanho da lista:"+listaNomes.size());

        Collection<java.lang.String> collection =  new ArrayList<>();
                collection.add("");
    }
}
