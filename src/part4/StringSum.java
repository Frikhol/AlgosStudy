package part4;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        for (int i = 0;i<n;i++){
            System.out.print(line1.charAt(i));
            System.out.print(line2.charAt(i));
        }
    }
}
