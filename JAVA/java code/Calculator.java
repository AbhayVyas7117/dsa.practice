package java code;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator C1 = new Calculator();
        System.out.println(C1.add(5, 9));
        System.out.println(C1.add(5, 9, 10));
        System.out.println(C1.add(5.5, 9.5));
    }
}

