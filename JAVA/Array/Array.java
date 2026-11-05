package Array;
// using array to merge two arrays and sort them.

import java.util.*;

public class Array {

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 10};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int j = 0; j < arr1.length; j++) {
            arr3[i] = arr1[j];
            i++;
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i] = arr2[j];
            i++;
        }
        Arrays.sort(arr3);
        System.out.println("sorted array is:");
        for (int j = 0; j < arr3.length; j++) {
            System.out.println(arr3[j]);
        }

    }
}
