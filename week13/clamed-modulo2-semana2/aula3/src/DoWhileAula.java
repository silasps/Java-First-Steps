import java.util.Objects;
import java.util.Scanner;

public class DoWhileAula {
    public static void main(String[] args) {
//        int numero = 5;
//        do { //19
//            numero++;
//            System.out.println(numero); // 20
//        }while (numero < 20); // 19 , 20

        String nome;
        Scanner scanner = new Scanner(System.in);
        do { //19
            nome = scanner.nextLine();
            System.out.println(nome);
        }while (!nome.equals("FIM"));
    }

}
