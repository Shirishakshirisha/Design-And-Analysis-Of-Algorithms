import java.util.*;
public class SubSetOne {
    public static void main(String[] args){
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(1);
       arr.add(1);
       arr.add(2);
       arr.add(2);
       arr.add(3);
       arr.add(3);
       int n = arr.size();
       ArrayList<Integer> list = subsetSum(arr , n);
        System.out.println(list);
    }

    public static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        Collections.sort(arr);
        findSubsets(0, arr, n, 0, ans);
        Collections.sort(ans);
        return ans;
    }

    public static void findSubsets(int index, ArrayList<Integer> arr, int n, int sum, ArrayList<Integer> ans) {
        if (index == n) {
            ans.add(sum);
            return;
        }
        // Include the current element
        findSubsets(index + 1, arr, n, sum + arr.get(index), ans);
        
        // Exclude the current element
        findSubsets(index + 1, arr, n, sum, ans);
    }
    
}
