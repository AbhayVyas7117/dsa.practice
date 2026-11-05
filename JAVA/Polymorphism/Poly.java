package Polymorphism;
//using polymorphism in Java

class Shape {

    void draw() {
        System.out.println("this is shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("this is circle");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("this is square");
    }
}

public class Poly {

    public static void main(String[] args) {
        Shape S1;
        S1 = new Circle();
        S1.draw();
        S1 = new Square();
        S1.draw();

    }
}
