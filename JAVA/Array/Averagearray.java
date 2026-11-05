package Array;

public class Averagearray {

    public static void main(String[] args) {
        float[] arr = {1, 2, 3, 4, 5, 6};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = sum / arr.length;
        System.out.println("Average of the array is: " + average);
    }
}
