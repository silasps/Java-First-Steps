import java.util.Scanner;
import java.util.ArrayList;

public class Ex04_HistCalculo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String perg = "sim";
        while(!perg.equals("fim") ) {
            Scanner in = new Scanner(System.in);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int a = in.nextInt();
            System.out.println("Digite outro número: ");
            int b = in.nextInt();
            System.out.println("O que você quer fazer com os números? digite\n1-somar" +
                    "\n2-subtrair" +
                    "\n3-multiplicar" +
                    "\n4-dividir");
            int c = in.nextInt();
            if (c == 1) {
                int result = a + b;
                System.out.println("o resultado é " + result);
                arrayList.add(String.valueOf(a) + "+" + String.valueOf(b) + "= " + String.valueOf(result));
                System.out.println(arrayList);
            } else if (c == 2) {
                int result = a - b;
                System.out.println("o resultado é " + result);
                arrayList.add(String.valueOf(a) + "-" + String.valueOf(b) + "= " + String.valueOf(result));
                System.out.println(arrayList);
            } else if (c == 3) {
                int result = a * b;
                System.out.println("o resultado é " + result);
                arrayList.add(String.valueOf(a) + "*" + String.valueOf(b) + "= " + String.valueOf(result));
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println(arrayList.get(i));
                }
            } else if (c == 4) {
                float result = a / b;
                System.out.println("o resultado é " + result);
                arrayList.add(String.valueOf(a) + "/" + String.valueOf(b) + "= " + String.valueOf(result));
                System.out.println(arrayList);
            }
            ;
            System.out.println("Quer continuar calculando?\n" +
                    "Escreva: " +
                    "\nSim para continuar" +
                    "\nfim para parar");
            perg = scanner.nextLine();
        }
    }
}
