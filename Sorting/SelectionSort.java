// package Sorting;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int[] arr= {5,6,1,3};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            // int min=arr[i];
            // for(int j=i+1; j<n; j++){
            //     if(min>arr[j]){
            //         int temp=min;
            //         min=arr[j];
            //         arr[j]=temp;
            //     }
            // }
            int minindex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;


        }
        System.out.println("The sorted array is :"+Arrays.toString(arr));
    }
    
}
