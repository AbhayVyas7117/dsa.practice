package java code;
// finding reverse of a string using java.

import java.util.*;

class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("The reverse of the string is:" + rev);
        sc.close();

    }
}