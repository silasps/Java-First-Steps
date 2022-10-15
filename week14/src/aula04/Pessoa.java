package aula04;

public class Pessoa {

    private static int contadorPessoa;
    private static String especie = "humana";

    Pessoa(){
        contadorPessoa++;
    }

    public static Integer getContadorPessoa() {
        return contadorPessoa;
    }

    public static String getEspecie() {
        return especie;
    }
}
