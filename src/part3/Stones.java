package part3;

import java.util.Scanner;

public class Stones {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(condition(sc.nextInt(),sc.nextInt())?"Win":"Loose");
    }

    public static boolean condition(int n, int m){
            return n%3 != m%3;
    }

}