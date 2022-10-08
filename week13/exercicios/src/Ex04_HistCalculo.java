import java.util.Scanner;
import java.util.ArrayList;

public class Ex04_HistCalculo {
    public static void main(String[] args) {
        String operacao = "working";
        while (!operacao.equals("fim")){

            //Entrada para receber os números
            Scanner entrada = new Scanner(System.in);
            Scanner operacaoin = new Scanner(System.in);
            double num1, num2, resultado = 0;

            System.out.println("Digite um número: ");
            num1 = entrada.nextDouble();
            System.out.println("Digite outro número: ");
            num2 = entrada.nextDouble();

            System.out.println("Selecione o número referente à operação: \n1 - Soma\n2 - Subtração\n3 - Divisão\n4 - Multiplicação");
//            operacao =

            //Entrada para receber a operação
            Scanner entrada2 = new Scanner(System.in);
            operacao = entrada2.nextLine();

            switch (operacao) {
                case "soma":
                    resultado = num1 + num2;
                    break;
                case "subtracao":
                    resultado = num1 - num2;
                    break;
                case "multiplicacao":
                    resultado = num1 * num2;
                    break;
                case "divisao":
                    resultado = num1 / num2;
                    break;
                case "Fim":
                    System.out.println("Fim de operação");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
            System.out.println(resultado);
        }while(!operacao.equals("Fim"));
    }
}
//    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        String perg = "sim";
//        while(!perg.equals("fim") ) {
//            Scanner in = new Scanner(System.in);
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Digite um número: ");
//            int a = in.nextInt();
//            System.out.println("Digite outro número: ");
//            int b = in.nextInt();
//            System.out.println("O que você quer fazer com os números? digite\n1-somar" +
//                    "\n2-subtrair" +
//                    "\n3-multiplicar" +
//                    "\n4-dividir");
//            int c = in.nextInt();
//            if (c == 1) {
//                int result = a + b;
//                System.out.println("o resultado é " + result);
//                arrayList.add(String.valueOf(a) + "+" + String.valueOf(b) + "= " + String.valueOf(result));
//                System.out.println(arrayList);
//            } else if (c == 2) {
//                int result = a - b;
//                System.out.println("o resultado é " + result);
//                arrayList.add(String.valueOf(a) + "-" + String.valueOf(b) + "= " + String.valueOf(result));
//                System.out.println(arrayList);
//            } else if (c == 3) {
//                int result = a * b;
//                System.out.println("o resultado é " + result);
//                arrayList.add(String.valueOf(a) + "*" + String.valueOf(b) + "= " + String.valueOf(result));
//                for (int i = 0; i < arrayList.size(); i++) {
//                    System.out.println(arrayList.get(i));
//                }
//            } else if (c == 4) {
//                float result = a / b;
//                System.out.println("o resultado é " + result);
//                arrayList.add(String.valueOf(a) + "/" + String.valueOf(b) + "= " + String.valueOf(result));
//                System.out.println(arrayList);
//            }
//            ;
//            System.out.println("Quer continuar calculando?\n" +
//                    "Escreva: " +
//                    "\nSim para continuar" +
//                    "\nfim para parar");
//            perg = scanner.nextLine();
//        }
//    }
