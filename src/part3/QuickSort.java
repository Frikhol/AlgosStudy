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
        quickSort(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i<n-1) System.out.print(" ");
        }
    }

    public static void quickSort(int[] arr, int l, int r){
        if(l>=r)
            return;
        int p = part(arr,l,r);
        quickSort(arr,l,p);
        quickSort(arr,p+1,r);
    }

    public static int part(int [] arr, int l, int r){
        int pivot = arr[(r+l) / 2];
        int i = l;
        int j = r;
        while(true) {
            while(i<=r && arr[i] < pivot)
                i++;
            while(j>=l && arr[j] > pivot)
                j--;
            if(i>=j)
                break;
            swap(arr,i++,j--);
        }
        return j;
    }

    public static void swap(int[] arr,int i,int j){
        int buf = arr[i];
        arr[i] = arr[j];
        arr[j] = buf;
    }
}
