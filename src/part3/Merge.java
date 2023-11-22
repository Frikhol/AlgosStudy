package part3;

import java.util.Scanner;

public class Merge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = readArray(sc);
        for (int i = 0; i < n-1; i++) {
            result = merge(result,readArray(sc));
        }
        n = result.length;
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if(i<n-1) System.out.print(" ");
        }
    }

    public static int[] readArray(Scanner sc){
       int m = sc.nextInt();
       int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] merge(int[] first, int[] second) {
        int n = first.length,m=second.length;
        int[] merged = new int[n+m];
        int i = 0,j=0;
        while(i+j < n+m) {
            if(i<n && j<m)
                merged[i+j] = first[i]<second[j]?first[i++]:second[j++];
            else if(i<n)
                merged[i+j] = first[i++];
            else
                merged[i+j] = second[j++];
        }
        return merged;
    }
}