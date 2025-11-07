package Recursion;
import java.util.*;

public class PrintAllSubsets {
    public static void main(String[] args){
        System.out.println();
        int[] arr = {5,2,1};
        List<List<Integer>> fList = new ArrayList<>();
        
            fun(0,arr,fList,new ArrayList<Integer>());
        
        
        System.out.println(fList);
    }
    
    public static void fun(int i , int[] arr, List<List<Integer>> fList , ArrayList<Integer> list){
        if(i==arr.length){
            fList.add(new ArrayList<>(list));
            return;
        }
        
            list.add(arr[i]);
            fun(i+1, arr, fList, list);
            list.remove(list.size()-1);
            fun(i+1, arr, fList, list);
    }
}












// package Recursion;
// import java.util.*;

// public class PrintAllSubsets {
//     public static void main(String[] args){
//         System.out.println();
//         int[] arr = {5,2,1};
//         List<List<Integer>> fList = new ArrayList<>();
//         for(int i=0; i<arr.length; i++){
//             fun(i,arr,fList,new ArrayList<Integer>());
//         }
        
//         System.out.println(fList);
//     }
    
//     public static void fun(int i , int[] arr, List<List<Integer>> fList , ArrayList<Integer> list){
//         if(i==arr.length){
//             fList.add(new ArrayList<>(list));
//             return;
//         }
        
//             list.add(arr[i]);
//             fun(i+1, arr, fList, list);
//             list.remove(list.size()-1);
//             fList.add(new ArrayList<>(list));
            
        
//     }
// }
