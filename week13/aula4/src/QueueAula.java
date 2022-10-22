import java.util.PriorityQueue;

public class QueueAula {
    public static void main(String[] args) {
        PriorityQueue<String> integerQueue = new PriorityQueue<>(); //PriorityQueue remove em ordem
//        Queue<String> priorityQueue = new LinkedList<>(List.of("x", "y", "z"); //Array iniciando com valores

        integerQueue.add("b"); // primeiro item add ao fim da lista
        integerQueue.add("c"); // segundo item add ao fim da lista
        integerQueue.add("a"); // terceiro item add ao fim da lista

        //b, c, a  é a ordem de armazenamento
        //a, b, c  é a ordem de leitura
        String first = integerQueue.poll();
        String second = integerQueue.poll();
        String third = integerQueue.poll();

        System.out.println("first:" + first);
        System.out.println("second:" + second);
        System.out.println("third:" + third);
    }
}
