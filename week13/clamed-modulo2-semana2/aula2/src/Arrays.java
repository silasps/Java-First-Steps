import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        ArrayList<String> listaNomes2 = new ArrayList<>();


        for(int i = 0; i < 10; i++){
            //código que será executado 10 vezes
            // a variável i existe apenas dentro do for
        }
//        i //não existe nesse ponto

        int j = 0;
        while(j<10){
            j++;
            //executa 10 vezes por causa do valor de j
            // j existe antes do while
            // e é usado para controle da execução do loop
        }

        int k = 0;
        do{
            // vai executar 9 vezes
            // pois o do while sempre executa o código do loop
            // uma vez sem fazer a validação do loop
            k++;
            System.out.println(k);
        }while(k<10);
    }
}
