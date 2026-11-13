package Oops;

abstract class vehicle {

    public abstract void start();

    public void sound() {
        System.out.println("Beep...Beep");
    }
}

class BIke extends vehicle {

    @Override
    public void start() {
        System.out.println("Kick start");
    }
}

class TRain extends vehicle {

    @Override
    public void start() {
        System.out.println("Button start");
    }
}

public class Abstract {

    public static void main(String args[]) {

        BIke b = new BIke();

        b.start();
        b.sound();

        TRain t = new TRain();

        t.start();
        t.sound();
    }
}