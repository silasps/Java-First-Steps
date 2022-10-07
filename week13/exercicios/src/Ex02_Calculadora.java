import java.util.Scanner;

public class Ex02_Calculadora {
    public static void main(String[] args) {
        //Entrada para receber os números
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.println("Digite um número: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = entrada.nextDouble();

        System.out.println("Selecione a operação");

        //Entrada para receber a operação
        Scanner entrada2 = new Scanner(System.in);
        String operacao = entrada2.nextLine();

        switch (operacao){
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
            default:
                resultado = 0;
                System.out.println("Operação inválida");
        }
        System.out.println(resultado);

    }
}
