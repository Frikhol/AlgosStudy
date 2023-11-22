package part3;

import java.util.Scanner;

public class Lomuto {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        partition(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(" ");
        }
    }

    public static void partition(int[] arr, int n){
        if(n==1)
            return;
        int pivot = arr[0];
        int j = 0;
        int i = 1;
        while(i<n) {
            if (arr[i] <= pivot)
                swap(arr, i, ++j);
            i++;
        }
        swap(arr,0,j);
    }

    public static void swap(int[] arr,int i,int j){
        int buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
    }

}
