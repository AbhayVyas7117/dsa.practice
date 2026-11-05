package leetcode;

import java.util.Arrays;

class Arrayexpert {
    public int[] productExceptSelf(int[] a) {

        int c = 0;
        int n = a.length;
        int in = -1;
        int mul = 1;

        for (int i = 0; i < n; i++) {

            if (a[i] == 0) {
                c++;
                in = i;
            } else {
                mul *= a[i];
            }
        }

        if (c > 1) {
            Arrays.fill(a, 0);
        }

        else if (c == 1) {
            Arrays.fill(a, 0);
            a[in] = mul;
        }

        else {
            for (int i = 0; i < n; i++) {
                a[i] = mul / a[i];
            }
        }

        return a;
    }
}