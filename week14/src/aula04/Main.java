package aula04;

public class Main {
    public static void main(String[] args) {
        //
//        Calculadora calculadora = new Calculadora();
//        Integer resultado = calculadora.somar(1, 2);
//        System.out.println(resultado);
//        Double resultado2 = calculadora.somar(10.1, 20.2);
//        System.out.println(resultado2);

        //Métodos static não precisam de uma instância para serem executados
        Integer resultado = Calculadora.somar(1, 2);
        System.out.println(resultado);
        Double resultado2 = Calculadora.somar(10.1, 20.2);
        System.out.println(resultado2);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        Pessoa pessoa4 = new Pessoa();

        System.out.println(pessoa1.getContadorPessoa());

//        pessoa2.setEspecie("Homo-sapiens");
    }
}
