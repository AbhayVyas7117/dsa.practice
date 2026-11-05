package Inheritance;

class Vehicle { //parent class

    int wheels;
    String color;
    String brand;

    void run() {
        System.out.println("Vehicle is running");
    }

    void breaks() {
        System.out.println("Vehicle is breaking");
    }
}

class Car extends Vehicle { //child class

    void start() {
        System.out.println("car is starting");
    }

}

class Scooty extends Vehicle { //child class

    void stop() {
        System.out.println("Scooty is stoping");
    }
}

class Main {

    public static void main(String[] args) {
        Car c = new Car();
        c.wheels = 4;
        c.color = "White";
        c.brand = "vokswagen";
        System.out.println("Car has " + c.wheels + " wheeks");
        System.out.println("Car has" + c.color + "color");
        System.out.println("Car has" + c.brand + "brand");
        Scooty s = new Scooty();
        s.wheels = 2;
        s.color = "Grey";
        s.brand = "Activa";
        System.out.println("Scooty has " + s.wheels + "wheels");
        System.out.println("Scooty has " + s.color + "color");
        System.out.println("Scooty has " + s.brand + "brands");
        c.start();
        s.stop();
    }
}
