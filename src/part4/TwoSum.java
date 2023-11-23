package part4;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int max = Math.max(n,m);
        int dif = n-m;
        System.out.println(max);
        for (int i = 0; i < max+1; i++) {
            int res = 0;
            if(i>=dif)
                res+=sc.nextInt();
            if(dif>0)
                res+=arr[i];
            else if(i>=-dif)
                res+=arr[i+dif];
            System.out.print(res);
            if(i<max) System.out.print(" ");
        }
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
