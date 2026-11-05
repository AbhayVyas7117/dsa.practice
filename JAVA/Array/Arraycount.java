package Array;

public class Countandsum {
    public static void main(String[] args) {
        int[] n = new int[213];
        int count = n.length;
        int sum = 0;

        for (int i = 0; i < 213; i++) {
            n[i] = i + 1;
            sum += n[i];
        }

        System.out.println("Count of numbers in the array is: " + count);
        System.out.println("Sum of numbers in the array is: " + sum);
    }
    
}
