package part3;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
           array[i] = sc.nextInt();
        selectionSort(array,n);
    }

    public static void selectionSort(int[] array, int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(array[j]<array[i]){
                    int buf  = array[i];
                    array[i] = array[j];
                    array[j] = buf;
                }

            }
            System.out.print(array[i]);
            if(i<n-1) System.out.println(" ");
        }
    }
}
