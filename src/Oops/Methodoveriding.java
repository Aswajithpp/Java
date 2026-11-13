package Oops;

class Birds {
    public void sound() {
        System.out.println("Tweet...");
    }
}

class Duck extends Birds {
    public void sound() {
        System.out.println("Quack...Quack...");
    }
}

public class Methodoveriding {
    public static void main(String[] args) {

        Duck d = new Duck();
        d.sound();

    }
}