package Arrays;

public class ArrayAula {
    public static void main(String[] args) {
        int[] arrayNumero = new int[10]; //definicao do tamanhho do array
        //      índice  valor
        arrayNumero[0] = 1;
        arrayNumero[1] = 2;
        arrayNumero[2] = 3;
        arrayNumero[3] = 4;
        arrayNumero[4] = 5;
        arrayNumero[5] = 6;
        arrayNumero[6] = 7;
        arrayNumero[7] = 8;
        arrayNumero[8] = 24;
        arrayNumero[9] = 123;

        System.out.println("Tamanho do vetor: "+ arrayNumero.length);
        for (int valor : arrayNumero) {
            System.out.println(valor);
        }
//        System.out.println(Arrays.toString(arrayNumero));
    }
}
