package Inheritance;

class Student {

    String name;
    int rollno;
    int marks;
}

class Studentmain {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ananya";
        s1.rollno = 25068;
        s1.marks = 75;
        System.out.println("s1.name:" + s1.name);
        System.out.println("s1.rollno:" + s1.rollno);
        System.out.println("s1.marks:" + s1.marks);
        Student s2 = new Student();
        s2.name = "Tanisi";
        s2.rollno = 25040;
        s2.marks = 80;
        System.out.println("s2.name:" + s2.name);
        System.out.println("s2.rollno:" + s2.rollno);
        System.out.println("s2.marks:" + s2.marks);
    }
}
