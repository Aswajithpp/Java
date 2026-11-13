package Oops;

class SuperClass {

    public SuperClass(String name) {
        System.out.println(name);
    }
}

public class SuperKeyword_Constructor extends SuperClass {

    public SuperKeyword_Constructor() {

        super("Arun");

        String name = "Anupama";
        System.out.println(name);
    }

    public static void main(String[] args) {

        SuperKeyword_Constructor obj = new SuperKeyword_Constructor();

    }
}