package java code;
// this codde is for finding largest number b/w two numbers 

import java.util.*;

class Largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A is largest number");
        } else if (b > a) {
            System.out.println("B is Largest number");
        } else {
            System.out.println("Both are equal");
        }
    }
}
