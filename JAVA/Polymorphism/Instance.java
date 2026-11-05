package Polymorphism;
// using instance of operator to check the type of object.

class Animal {

    void eat() {
        System.out.println("The animal is my cute little rambo who loves to eat lots of chiken");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("tyson do bowf bowf");
    }
}

public class Instance {

    public static void main(String[] args) {
        Dog D = new Dog();
        Animal A = D;
        A.eat();

        if (A instanceof Dog) {
            Dog d = (Dog) A;
            d.bark();
        }
    }
}

