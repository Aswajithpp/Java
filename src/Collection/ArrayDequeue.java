package Collection;

import java.util.ArrayDeque;

public class ArrayDequeue {

    public static void main(String[] args) {

        ArrayDeque<String> ob = new ArrayDeque<String>();

        ob.add("Hello");
        ob.add("Good");
        ob.add("java");
        ob.add("Abc");

        System.out.println(ob);

        System.out.println("First element = " + ob.peekFirst());
        System.out.println("Last element = " + ob.peekLast());

        ob.poll();
        System.out.println(ob);

        ob.pollFirst();
        System.out.println(ob);

        ob.pollLast();
        System.out.println(ob);
    }
}