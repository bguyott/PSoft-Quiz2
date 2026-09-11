package main;

public class HelloWorld {
    public static void main(String[] args) {
        printHello("John Doe");

        for (int i = 1; i <= 100; ++i) {
            System.out.println(i);
        }

    }

    private static void printHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
