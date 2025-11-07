package Recursion;
import java.util.*;

import java.util.ArrayList;

public class PrintAllSubsequence {
    public static void main(String[] args){
        System.out.println();
        int[] arr = {5,3,2,1};
        List<Integer> list = new ArrayList<>();
        int count = fun(0,arr,list);
        System.out.println(count);
    }


    //Print all subsequence

    // public static void fun(int i, int[] arr, List<Integer> list){
    //     int n = arr.length;
    //     if(i==n){
    //         System.out.println(list);
    //         return;
    //     }
    //     list.add(arr[i]);
    //     fun(i+1, arr, list);
    //     list.remove(list.size()-1);
    //     fun(i+1, arr, list);
    // }



// count the number of subsequences in the given array

        public static int fun(int i, int[] arr, List<Integer> list){
       
        int n = arr.length;
        if(i==n){
            System.out.println(list);
            return 1;
        }
        list.add(arr[i]);
        int left = fun(i+1, arr, list);
        list.remove(list.size()-1);
        int right = fun(i+1, arr, list);
        return left +right;
    }
}
