package Inheritance;
// overriding

class Human {

    void eat() {
        System.out.println("the Human is eating cake but he has diabetes ");
    }
}

class child extends Human {

    @Override
    void eat() {
        System.out.println("the child is eating icecream but he can get diabetes ");
    }
}

class Over {

    public static void main(String[] args) {
        Human h1 = new child();
        h1.eat();

    }
}
