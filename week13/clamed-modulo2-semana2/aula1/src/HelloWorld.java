public class HelloWorld {
    public static void main(String[] args) {
        // início do programa
        System.out.println("Hello World");

        char a = 'a';
        boolean b = false;

         a = 10;
        System.out.println(a);
        System.out.println(b);
    }
}

///         2^4 = 16

///  16 8 4 2 1
///  0  0 0 0 0  000 - 0
///  0  0 0 0 1  000 - 1
///  0  0 0 1 0  000 - 2
///  0  0 0 1 1  000 - 3
///  0  0 1 0 0  000 - 4
///  1  1 1 1 1  111 - 31

///  16 8 4 2 1
///   0 1 1 0 0 = 12

//                2^-3
///  16 8 4 2 1  0,5  0,25  0,125
///  0  0 0 0 0  0    1     0 - 0,25
///  0  0 0 0 1  1    1     1 - 1,875 ~ 1,9
///  0  0 0 1 0  0    0     0 - 2
///  0  0 0 1 1  0    0     0 - 3
///  0  0 1 0 0  0    0     0 - 4
///  1  1 1 1 1  111 - 31