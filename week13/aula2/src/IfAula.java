public class IfAula {
    public static void main(String[] args) {
        int v = 10;
        boolean validacao = 10 == v; //salvar direto numa variavel

        System.out.println(validacao);

        if(10 == v){
            System.out.println("é 10");
        }

        String a = "Andre";
        if(a.equals("20")){
            System.out.println("acontece se a for igual a 20");
        }
        else if(a.equals("10")){
            System.out.println("acontece se a for igual a 10");
        }
        else {
            System.out.println("acontece se a for qualquer outra string");
        }
    }
}