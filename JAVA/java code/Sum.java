package java code;
//finding sum using java.

class Output {

    public static void main(String[] args) {

        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < 10; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
