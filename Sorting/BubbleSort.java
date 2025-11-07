


// Best Case: O(n) — This occurs when the array is already sorted. 
// The swapped flag ensures the algorithm stops after one pass.
// Average and Worst Case: O(n²) — This happens when the array is .
// in reverse order or unsorted, requiring nested loops.
// Space Complexity:

// O(1) — Bubble Sort is an in-place sorting algorithm. 
// It only uses a constant amount of extra space (for variables like temp and swapped).














// package Sorting;
// import java.util.Arrays;

// public class BubbleSort {
//     public static void main(String[] args){
//         // int n= 4;
//         int[] arr= {5,6,1,3};
//         int n=arr.length;
//         for(int i=0; i<n-1; i++){
//             
           

//                 for(int j=0; j<n-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     
//                 }
//             
//         }
//         System.out.println(Arrays.toString(arr));
       
//     }
    
// }
// }




// package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        // int n= 4;
        int[] arr= {5,6,1,3};
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
           

                for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            if(!swapped){
                break; // If no two elements were swapped, the array is sorted
            }
            
        }
        System.out.println(Arrays.toString(arr));
       
    }
    
}
}
