package Polymorphism;
// this code is about interface in java.

interface Dog {

    void sound();
}

interface Cat {

    void sound();
}

class Puppy implements Cat, Dog {

    public void sound() {
        System.out.println("puppy says cutely woof!!");
    }
}

class Kitten implements Cat, Dog {

    public void sound() {
        System.out.println("kitten says meow!!");
    }
}

class Main {

    public static void main(String[] args) {
        Puppy p = new Puppy();
        Kitten k = new Kitten();
        p.sound();
        k.sound();
    }
}
