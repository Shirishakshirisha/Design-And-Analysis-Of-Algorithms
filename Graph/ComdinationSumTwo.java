import java.util.ArrayList;
import java.util.List;

public class ComdinationSumTwo {
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
        for(int i=index; i<arr.length; i++){
            if(i>index && arr[i]==arr[i-1])
            continue;
            if(arr[i]>target)
            break;
            ds.add(arr[i]);
            fun(i+1 , arr , target-arr[i] , ans , ds);
            ds.remove(ds.size()-1);
        }
    }
}
