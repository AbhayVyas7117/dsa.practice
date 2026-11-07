package GFG;
// Sum of squares of first n natural numbers.
class Sum {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + (i * i);
        }

        return sum;
    }
}
