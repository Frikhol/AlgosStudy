package part3;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr,0,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(" ");
        }
    }

    public static void quickSort(int[] arr, int l, int r){
        if(l==r)
            return;
        int pivot = arr[l];
        int j = l;
        int i = l+1;
        while(i<r) {
            if (arr[i] <= pivot)
                swap(arr, i, ++j);
            i++;
        }
        swap(arr,l,j);
        quickSort(arr,l,j);
        quickSort(arr,j+1,r);
    }

    public static void swap(int[] arr,int i,int j){
        int buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
    }
}
