package java code;
// this code was about using if and else if condition to find out the grade of students.java

import java.util.*;

class Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n < 30) {
            System.out.println("D");
        } else if (n < 50) {
            System.out.println("C");
        } else if (n < 70) {
            System.out.println("B");
        } else if (n < 90) {
            System.out.println("A");
        } else {
            System.out.println("A+");
        }
        sc.close();
    }
}
