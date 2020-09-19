package com.programming;

public class FibonacciNumber {
    public FibonacciNumber() {
        super();
    }
    //recursive way time complexity :2^n, space complexity:
    public int findNthFibocciNumber(int i) throws Exception {
        if (i < 0) {
            throw new Exception("Provide Valid Number");
        }
        /*
        //time:O(2^n) space:O(N) Its equal to depth of tree
        if (i == 0 || i == 1) {
            return i;
        } else {
            return findNthFibocciNumber(i - 1) + findNthFibocciNumber(i - 2);
        }
*/

        /*
        //time:O(N) space:O(1)
        
        int k = 2; //calculating if i>=2 otherwise returning N
        int prev = 0;
        int cur = 1;
        int c = i;
        while (k <= i) {
            c = prev + cur;
            prev = cur;
            cur = c;
            ++k;
        }
        return c;
*/
        //time:O(N) space:O(N)
        int a[] = new int[i + 1];
        a[0] = 0;
        if (i >= 1) {
            a[1] = 1;
        }

        for (int j = 2; j <= i; j++) {
            a[j] = a[j - 2] + a[j - 1];
        }

        return a[i];

    }
}
