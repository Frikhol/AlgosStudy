package part3;

import java.util.Scanner;

public class CombinationsRepeat {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(combinations(sc.nextInt(),sc.nextInt()));
    }

    public static int fact(int n){
        int res = 1;
        if(n>0)
            res = fact(n-1)*n;
        return res;
    }

    public static int combinations(int n, int k){
        return fact(n+k-1)/(fact(n-1)*fact(k));
    }

}