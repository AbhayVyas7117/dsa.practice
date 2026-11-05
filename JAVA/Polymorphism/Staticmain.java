package Polymorphism;
// using static keyword to access the static variable and method of another class.

class Student {

    static int roll = 68;

    static void display() {
        System.out.println("Branch is CSE");
    }
}

class Staticmain {

    public static void main(String[] args) {
        System.out.println(Student.roll);
        Student.display();
        System.out.println("Name is Ananya");
    }
}
