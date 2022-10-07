public class Calculo {
    public static void main(String[] args) {
        final int numeroFinal = 10; //constante
        int numero = 10; // variável
        System.out.println(numero);
        numero = numero + 1;
        System.out.println(numero);
        numero += 1;
        System.out.println(numero);
        numero++;
        System.out.println(numero);

        long numeroLong = 100000000000000L; // dobro do int
        long numeroLong2 = 1000L + numeroLong; // dobro do int
        System.out.println(numeroLong2);



        float numeroFloat = 10.10F;
        double numeroDouble = 10.001D; // dobro do float
        System.out.println(numeroDouble + numeroFloat);

        System.out.println(numeroDouble * numeroFloat);
        System.out.println("andre"+" nunes");


        int numeroInt = 42;
        int resultado = numeroInt/5; // o inteiro corta a parte decimal
        System.out.println("Resultado 1: " + resultado);

        double resultado2 = numeroInt / 5; // o inteiro corta a parte decimal e depois trasforma em double
        System.out.println("Resultado 2: "+resultado2);

        double resultado3 = (double) numeroInt / 5; // retorna a parte decimal
        System.out.println("Resultado 3: "+resultado3);

        int resultadoResto = 51 % 2; // retorna a parte decimal
        System.out.println("Resultado Resto: "+resultadoResto);

        System.out.println("maximo: "+Math.max(resultado3, resultado2));


    }
}
