import java.util.*;

public class SetAula {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //O set só permite salvar ítens exclusivos. No código abaixo
        // só vai aparecer 1 "c
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("d2");
        list.add("d1");

        list.forEach(item -> System.out.println(item)); // outra forma de escrever (System.out::println)
        System.out.println(list.contains("c")+"\n---------------");

        //O HashSet imprime novamente, mas remove os duplicados e coloca em ordem
//        HashSet<String> hashSet = new HashSet<>(list);
//        hashSet.forEach(itemSet -> System.out.println(itemSet));

        Set<String> hashSet = new HashSet<>(list);
        hashSet.forEach(itemSet -> System.out.println(itemSet));

        TreeSet<String> treeSet= new TreeSet<>();
        Set<String> hSet = treeSet;
    }
}
