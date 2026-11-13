package Oops;

class Animal {

    String Color;

    public void eat() {
        System.out.println("Animal is eating ..");
    }
}

class Dog extends Animal {

    String breed = "pug";

    public void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog {

    int age = 1;

    public void play() {
        System.out.println("Puppy is playing");
    }
}

class Cat extends Animal {

    int age = 1;

    public void sound() {
        System.out.println("Meow ..");
    }
}

public class Work1 {

    public static void main(String[] args) {

        Cat c = new Cat();

        System.out.println("Cat Colour: " + (c.Color = "gray"));
        System.out.println("Cat Age: " + c.age);

        c.eat();
        c.sound();

        Dog d = new Dog();

        System.out.println("Dog Breed: " + d.breed);
        System.out.println("Dog Colour: " + (d.Color = "gray"));

        d.bark();
        d.eat();

        
        
//        Puppy ob = new Puppy();
//
//        System.out.println("Puppy Breed: " + ob.breed);
//        System.out.println("Puppy Color: " + (ob.Color = "black"));
//        System.out.println("Puppy Age: " + ob.age);
//
//        ob.bark();
//        ob.eat();
//        ob.play();
    }
}