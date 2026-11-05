package java code;

import java.util.*;

class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // this code is about even number 
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("THe number is odd");
        }
        // this code is about odd number 
        if (n % 2 != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }
    }
}
