package Oops;

public class Methodoverloading {

    public static void add() {
        int num1 = 10, num2 = 20;
        System.out.println("Sum " + (num1 + num2));
    }

    public static void add(int num1, float num2) {
        float sum = num1 + num2;
        System.out.println("Sum =" + sum);
    }

    public static void add(float num1, int num2) {
        float sum = num1 + num2;
        System.out.println("Sum =" + sum);
    }

    public static void add(int num1, float num2, int num3) {
        float sum = num1 + num2 + num3;
        System.out.println("Sum =" + sum);
    }

    public static void add(int num1, int num2) {
        float sum = num1 + num2;
        System.out.println("Sum =" + sum);
    }

    public static void main(String[] args) {

        add();
        add(2, 4.48f, 10);

    }
}