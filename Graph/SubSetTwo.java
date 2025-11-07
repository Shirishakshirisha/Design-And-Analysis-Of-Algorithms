import java.util.*;

//This program is about generating all unique subsets of a given array that may contain duplicates.
// It uses backtracking to explore all possible combinations while avoiding duplicates.
// The input array is first sorted to ensure that duplicates are adjacent, allowing for easy skipping of repeated elements.
//// The result is a list of lists, where each inner list represents a unique subset of the input array.
/// example input: {1, 1, 2, 3, 2, 3}
/// now at each step
/// // 1. It adds the current subset to the result list.
/// // 2. It iterates through the array starting from the current index.
/// // 3. For each element, it checks if it is a duplicate of the previous element (to avoid adding the same subset multiple times).
/// // If it is not a duplicate, it adds the element to the current subset and recursively calls the function to explore further subsets.
/// // After exploring, it removes the last added element to backtrack and explore other combinations.
public class SubSetTwo {
    public static void main(String[] args){
       int[] arr = {1,1,2,3,2,3};
       List<List<Integer>> list = subSetsWithDup(arr);
         System.out.println(list);
      
   }

   public static List<List<Integer>> subSetsWithDup(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);
       backtrack(result, new ArrayList<>(), nums, 0);
       return result;
   }

   public static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
       result.add(new ArrayList<>(tempList));
       for (int i = start; i < nums.length; i++) {
           if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
           tempList.add(nums[i]);
           backtrack(result, tempList, nums, i + 1);
           tempList.remove(tempList.size() - 1);
       }
   }

}
