package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfElementsOfEachSubset {


    public static void main(String[] args){
        System.out.println();
        int[] arr = {5,2,1};
        // List<List<Integer>> fList = new ArrayList<>();
        List<Integer> sList = new ArrayList<>();
            int sum =0;
            fun(0,arr,sList,sum);
        
        
        for(int i=sList.size()-1; i>=0;i--){
            System.out.println(sList.get(i));
        }
    }
    
    public static void fun(int i , int[] arr,List<Integer> sList,int sum){
        if(i==arr.length){
            sList.add(sum);
            return;
        }
        
            
            fun(i+1, arr, sList,sum+arr[i]);
            
            fun(i+1, arr,sList , sum);
    }
    
}
