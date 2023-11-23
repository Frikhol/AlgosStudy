package part4;

import java.util.Arrays;

public class MaxThreeProduct {
    public static void main(String[] args) {
        int testCount = 0;
        while (true) {
            int n = (int) (Math.random() * 1000 + 3);
            int[] arr = randInput(n);
            long res1 = findMax(arr, n);
            long res2 = brutForce(arr, n);
            System.out.println("Test № "+testCount);
            if (res1 != res2)
                System.out.println("[ERROR] n = " + n + "\nres1: " + res1 + "\nres2: " + res2 + "\nArray: " + Arrays.toString(arr));
            testCount++;
//          else
//              System.out.println("OK n =" + n);
        }
    }

    static long findMax(int[] arr, int n) {
        int pos1 = Integer.MIN_VALUE;
        int pos2 = Integer.MIN_VALUE;
        int pos3 = Integer.MIN_VALUE;
        int neg1 = Integer.MAX_VALUE;
        int neg2 = Integer.MAX_VALUE;
        boolean hasZero = false;
        int negCount = 0;
        int posCount = 0;
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            if (cur == 0 && !hasZero)
                hasZero = true;
            if (cur > 0) {
                posCount++;
            }
            if (cur >= pos3) {
                pos3 = cur;
                if (cur >= pos2) {
                    pos3 = pos2;
                    pos2 = cur;
                    if (cur >= pos1) {
                        pos2 = pos1;
                        pos1 = cur;
                    }
                }
            }
            if (cur < 0) {
                negCount++;
                if (cur <= neg2) {
                    neg2 = cur;
                    if (cur <= neg1) {
                        neg2 = neg1;
                        neg1 = cur;
                    }
                }
            }
        }
        long res1 = (long) pos1 * pos2 * pos3;
        long res2;
        if (negCount > 1 && posCount > 0)
            res2 = (long) neg1 * neg2 * pos1;
        else res2 = Long.MIN_VALUE;
        long res = Math.max(res1, res2);
        if (res < 0 && hasZero)
            res = 0;
        return res;
    }

    static long brutForce(int[] arr, int n) {
        long max = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && i != k && k != j) {
                        long res = (long) arr[i] * arr[j] * arr[k];
                        if (res > max)
                            max = res;
                    }
                }
            }
        }
        return max;
    }

    static int[] randInput(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) ((int) (Math.random() * 4E5) - 2E5);
        return arr;
    }


}
