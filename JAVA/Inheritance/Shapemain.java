package Inheritance;

class Shape {

    void color() {
        System.out.println("the shape color is red");
    }
}

class Circle extends Shape {

    void round() {
        System.out.println("circle is filled with blue");
    }
}

class Shapemain {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.color();
        c.round();
    }
}
