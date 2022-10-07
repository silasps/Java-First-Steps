package Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 11;
        matrix[1][0] = 111;
        matrix[1][1] = 1111;
        for (int[] vetorInterno : matrix) {
            for (int valor : vetorInterno) {
                System.out.println(valor);
            }
        }

        for ( int linhas = 0; linhas < matrix.length; linhas++) {
            for (int colunas = 0; colunas < matrix[0].length; colunas++) {
                System.out.println(matrix[linhas][colunas]);
            }
        }
    }
}
