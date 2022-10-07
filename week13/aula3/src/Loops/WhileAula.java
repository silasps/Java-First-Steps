package Loops;

import java.util.Scanner;

public class WhileAula {
    public static void main(String[] args) {
//        String nome = "a";
//        int numero = 10;
//        while(nome == "a"){ //n = b
//            System.out.println(nome);
//            System.out.println(numero);
//            numero++;
//            if(numero >= 20){
//                break;
//            }
//        }
//        System.out.println(nome);
//        System.out.println(numero);
//
//        System.out.println("-------------------------------");
//
//        int j = 0;
//        while(j < 20){ //n = b
//            System.out.println(j);
//            j +=1; // passo
//        }
//        System.out.println("Depois Loop "+j);

        String nome = "";
        while(!nome.equals("FIM")){ //n = b
            Scanner scanner = new Scanner(System.in);
            nome = scanner.nextLine();
        }
    }
}