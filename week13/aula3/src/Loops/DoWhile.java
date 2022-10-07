package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int numero = 5;
        do {
            System.out.println(numero);
            numero++;
        } while (numero < 20);

        String nome;
        Scanner scanner = new Scanner(System.in);
        do { //19
            nome = scanner.nextLine();
            System.out.println(nome);
        }while (!nome.equals("FIM"));
    }
}
