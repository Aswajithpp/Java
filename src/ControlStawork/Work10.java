package ControlStawork;

public class Work10 {

    public static void main(String[] args) {

        // For loop - 24
        int num = 24;

        for (int i = 1; i <= 10; i++) {
            System.out.println("24 x " + i + " = " + (24 * i));
        }

        System.out.println();

        // While loop - 50
        num = 50;
        int i = 1;

        while (i <= 10) {
            System.out.println("50 x " + i + " = " + (50 * i));
            i++;
        }

        System.out.println();

        // Do-while loop - 29
        num = 29;
        i = 1;

        do {
            System.out.println("29 x " + i + " = " + (29 * i));
            i++;
        } while (i <= 10);
    }
}