package part4;

import java.util.Scanner;

public class MaxPairwiseProductConter {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        for (int n = 2; n < 10; n++) {
            if(n==2) System.out.println("No");
            else {
                int count = 1;
                System.out.println(n);
                for (int i = 1; i < n; i++) {
                    count+=countIfs(n,i-1,i);
                    //System.out.print(" " + i);
                }
                if(count>1.5*n)
                    System.out.println("Yes");
                else
                    System.out.println("No");
                System.out.println(count);
            }
        }
    }

    public static int countIfs(int m1,int m2,int cur){
        int count = 0;
        if(cur>m1){
            count++;
        } else if(cur > m2)
            count+=2;
        return count;
    }
}

