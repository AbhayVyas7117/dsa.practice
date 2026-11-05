package java code;
// this code is about finding the factorial of number by using for loop 

import java.util.*;

class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int Fact = 1;
        for (int i = 1; i <= number; i++) {
            Fact = Fact * i;
        }
        System.out.println("the factorial of " + number + " is " + Fact + ".");
        sc.close();
    }
}
