package part3;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextInt();
        array = mergeSort(array,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if(i<n-1) System.out.print(" ");
        }
    }

    public static int[] mergeSort(int[] array, int l, int r) {
        if(l==r) {
            return array;
        }
        int mid = l + (r-l)/2;
        int[] left = mergeSort(array,l,mid);
        int[] right = mergeSort(array,mid+1,r);

        int[] result = new int[array.length];

        int lcur = l, rcur=mid+1;
        for(int i = l;i<=r;i++){
            if(lcur <= mid && rcur <= r){
                if(left[lcur]<right[rcur]) {
                    result[i] = left[lcur];
                    lcur++;
                } else {
                    result[i] = right[rcur];
                    rcur++;
                }
            } else if(lcur<=mid){
                result[i] = left[lcur];
                lcur++;
            } else {
                result[i] = right[rcur];
                rcur++;
            }
        }
        return result;
    }


}
