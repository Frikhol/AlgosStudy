package part4;

import java.util.Scanner;

public class MaxProductOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int big = sc.nextInt();
        int bigger = sc.nextInt();
        for (int i = 2; i < n; i++) {
            int cur = sc.nextInt();
            if(cur>=big) {
                big = cur;
                if(cur>=bigger){
                    big = bigger;
                    bigger = cur;
                }
            }
        }
        System.out.println((long)big*bigger);
    }
}
