
package Recursion;
import java.util.*;
public class PrintAllPermutatiosOfStringOrArray {
    public static void main(String[] args){
        System.out.println();
        int[] arr = {1,2,3};
        List<List<Integer>> fList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
         fun(0,arr,fList,new ArrayList<>());
        }
        System.out.println(fList);
    }

    private static void fun(int i, int[] arr, List<List<Integer>> fList, ArrayList list) {
        if(i==arr.length){
            if(list.size()==arr.length  && !fList.contains(list)){
                fList.add(new ArrayList(list));
            }
            return;
        }
        for(int j=0; j<arr.length; j++){
            if(!list.contains(arr[j])){
                list.add(arr[j]);
                fun(i+1, arr, fList, list);
                list.remove(list.size()-1);
                fun(i+1, arr, fList, list);
            }
        }
  
  
    }
    
}
