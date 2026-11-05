package Inheritance;
// single inheritance.
// this is the use of single inheritance.

class Anime {

    void fav() {
        System.out.println("love me love me not is my fav romcom anime.. the best romcom anime");
    }
}

class Naruto extends Anime {

    void female() {
        System.out.println("best female character in naruto is Sakura");
    }
}

public class Main {

    public static void main(String[] args) {
        Anime a = new Anime();
        a.fav();
        Naruto n = new Naruto();
        n.female();
    }
}
