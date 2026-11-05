package Polymorphism;
//interface

interface Vehicle {

    void start();

    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("The car starts");
    }

    public void stop() {
        System.out.println("The car stop");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("The bike starts");
    }

    public void stop() {
        System.out.println("The bike stop");
    }
}

class Inter {

    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        c.stop();
        b.start();
        b.stop();
    }
}
