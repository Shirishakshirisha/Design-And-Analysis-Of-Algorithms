package SearchingTechniques;

public class BinarySearch {
    public static void main(String[] args){
        int[] data = {1,2,3,5,9};
        int target = 5;
        int index = binarySearch(data,target);
        System.out.println("Found at index:" + index);
    }
    public static int binarySearch(int[] arr, int key){
        int left =0, right=arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid] ==key)
                return mid;
            else if(arr[mid]<key)
                left = mid +1;
            else
                right = mid-1;
        }
        return -1;
    }
}
