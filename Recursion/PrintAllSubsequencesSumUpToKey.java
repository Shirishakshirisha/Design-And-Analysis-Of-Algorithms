package Recursion;
import java.util.*;

public class PrintAllSubsequencesSumUpToKey {

    public static void main(String[] args){
        System.out.println();
        int[] arr = {8, 9, 1};
        // The initial sum is 0
        int key = 9;
        List<Integer> list = new ArrayList<>();
        
        // Pass the initial sum (0)
        fun(0, arr, 0, list, key); 
    }

    // Pass 'currentSum' by value (to be safe) or use the backtracking method below
    public static void fun(int i, int[] arr, int currentSum, List<Integer> list, int key) {
        int n = arr.length;
        
        // 1. Base Case: Reached the end of the array
        if (i == n) {
            if (currentSum == key) {
                System.out.println(list);
            }
            return;
        }

        // --- A. The 'TAKE' case (Include arr[i]) ---
        // 1. Add/Include the current element
        list.add(arr[i]);
        currentSum += arr[i]; 
        
        // 2. Recurse for the next index
        fun(i + 1, arr, currentSum, list, key);
        
        // 3. Backtrack: Reset the state for the 'DON'T TAKE' call
        // 💥 CRITICAL FIX 1: Subtract the value from the sum!
        currentSum -= arr[i]; 
        list.remove(list.size() - 1); // Reset the list
        
        
        // --- B. The 'DON'T TAKE' case (Exclude arr[i]) ---
        // The list and currentSum are already in the correct state (without arr[i])
        // We just move to the next index.
        fun(i + 1, arr, currentSum, list, key); 
        
        // Note on the 'early return' guard:
        // You removed this: if(sum == key){ System.out.println(list); return; }
        // The reason to remove it from the middle is because a subsequence
        // like [8, 1] might satisfy the sum, but if you return early, 
        // you might miss other valid subsequences like [9].
        // Checking only at the base case (i==n) ensures ALL paths are explored.
    }
}



















// package Recursion;
// import java.util.*;

// public class PrintAllSubsequencesSumUpToKey {
//     public static void main(String[] args){
//         System.out.println();
//         int[] arr = {8,9,1};
//         int sum=0;
//         int key =9;
//         List<Integer> list = new ArrayList<>();
//         fun(0,arr,sum,list, key);
//     }
//     public static void fun(int i , int[] arr, int sum , List<Integer> list , int key){
//         int n = arr.length;
//         if(i==n){
//             return;
//         }
//         if(sum ==key){
//             System.out.println(list);
//             return;
//         }
//         list.add(arr[i]);
//         sum+=arr[i];
        
//         fun(i+1, arr, sum, list, key);
//         list.remove(list.size()-1);
       
//         fun(i+1, arr, sum, list, key);
//     }
    
// }
