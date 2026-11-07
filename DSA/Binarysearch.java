
import java.util.*;

public class Binarysearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 5;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left <= right) {

            int mid = (right + left) / 2;

            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (found) {
            System.out.println("ELEMENT FOUND IN THE ARRAY");

        } else {
            System.out.println("ELEMENT NOT FOUND IN THE ARRAY");
        }

    }
}
