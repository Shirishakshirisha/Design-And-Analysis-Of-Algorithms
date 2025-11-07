import java.util.*;
public class CombinationSumOne {
    public static void main(String[] args){
        int[] arr = {1 , 2 , 3 , 4 , 5};
        int target = 7;
        List<List<Integer>> result  = combinationSum(arr , target);
        System.out.println(result);
    }
    public static List<List<Integer>> combinationSum(int[] arr , int target){
        List<List<Integer>> ans = new ArrayList<>();
        fun(0 , arr , target , ans , new ArrayList<>());
        return ans;
    }
    public static void fun(int index ,int[] arr , int target , List<List<Integer>> ans , List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(index == arr.length || target < 0){
            return;
        }
        // Include the current element
        ds.add(arr[index]);
        fun(index, arr, target - arr[index], ans, ds); // not index+1 because we can reuse same element
        ds.remove(ds.size()-1);
        // Exclude the current element
        fun(index+1, arr, target, ans, ds);
    }
}











// import java.util.*;
// public class CombinationSumOne {
//     public static void main(String[] args){
//         int[] arr = {1 , 2 , 3 , 4 , 5};
//         int target = 7;
//         List<List<Integer>> result  = combinationSum(arr , target);
//         System.out.println(result);
//     }
//     public static List<List<Integer>> combinationSum(int[] arr , int target){
//         List<List<Integer>> ans = new ArrayList<>();
//         fun(0 , arr , target , ans , new ArrayList<>());
//         return ans;

//     }
//     public static void fun(int index ,int[] arr , int target , List<List<Integer>> ans , List<Integer> ds){
//         if(index==arr.length){
//             if(target==0){
//                 ds.add(arr[index]);
//                 fun(index , arr , target-arr[index],ans , ds);
//                 ds.remove(ds.size()-1);
//             }
//         }
//     }

// }
