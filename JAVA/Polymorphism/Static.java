package Polymorphism;
class Logger {

    static void method() {
        System.out.println("geetali loves sandwhich");
    }
}

class JSONLogger extends Logger {

    static void method() {
        System.out.println("geetali hates kalela");
    }
}

public class Static {

    public static void main(String[] args) {
        Logger L = new JSONLogger();
        L.method();

    }
}
