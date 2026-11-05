package Inheritance;
//using inheritance, upcasting, downcasting, and the instanceof operator in Java.

class Animal {

    void checkup() {
        System.out.println("Animal should get regular checkup");
    }
}

class Dog extends Animal {

    void vaccine() {
        System.out.println("Tyson is scared of needles");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("My cat sings the song: meow meow meow");
    }
}

public class Vaccination {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.checkup();

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.vaccine();
        } else if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.meow();
        }
    }
}

