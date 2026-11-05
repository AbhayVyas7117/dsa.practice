package java code;
// this factorial method is different.

class Fact {

    static int f(int n) {
        if (n == 0) {
            return 1;
        }
        return f(n - 1) * n;
    }

    public static void main(String[] args) {
        System.out.println(f(2));
    }
}
