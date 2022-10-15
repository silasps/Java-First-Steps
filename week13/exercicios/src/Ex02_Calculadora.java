import java.util.Scanner;

public class Ex02_Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner oper = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao;

        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = entrada.nextDouble();
        System.out.println("Selecione o número referente à operação desejada: \n" +
                "1 - Soma\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão");
        operacao = oper.nextLine();

        switch (operacao) {
            case "1":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "2":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "3":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "4":
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;
        }
    }
}

//    //Entrada para receber os números
//    Scanner entrada = new Scanner(System.in);
//    double num1, num2, resultado;
//
//        System.out.println("Digite um número: ");
//                num1 = entrada.nextDouble();
//                System.out.println("Digite outro número: ");
//                num2 = entrada.nextDouble();
//
//                System.out.println("Selecione a operação");
//
//                //Entrada para receber a operação
//                Scanner entrada2 = new Scanner(System.in);
//                String operacao = entrada2.nextLine();
//
//                switch (operacao){
//                case "soma":
//                resultado = num1 + num2;
//                break;
//                case "subtracao":
//                resultado = num1 - num2;
//                break;
//                case "multiplicacao":
//                resultado = num1 * num2;
//                break;
//                case "divisao":
//                resultado = num1 / num2;
//                break;
//default:
//        resultado = 0;
//        System.out.println("Operação inválida");
//        }
//        System.out.println(resultado);