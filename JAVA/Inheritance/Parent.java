package Inheritance;

class P {

    void name() {
        System.out.println("my name is ananya");
    }
}

class C extends P {

    void surname() {
        System.out.println("My name is ananya gurjar");
    }
}

class GC extends C {

    void nickname() {
        System.out.println("no one ");
    }
}

public class Parent {

    public static void main(String[] args) {
        GC GC1 = new GC();
        GC1.name();
        GC1.surname();
        GC1.nickname();
    }
}
