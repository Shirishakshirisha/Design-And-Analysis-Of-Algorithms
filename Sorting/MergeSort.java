import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] la = new int[n1];
        int[] ra = new int[n2];

        for(int i = 0; i < n1; i++) {
            la[i] = arr[l + i];
        }
        for(int i = 0; i < n2; i++) {
            ra[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2) {
            if(la[i] <= ra[j]) {
                arr[k++] = la[i++];
            } else {
                arr[k++] = ra[j++];
            }
        }
        while(i < n1) {
            arr[k++] = la[i++];
        }
        while(j < n2) {
            arr[k++] = ra[j++];
        }
    }
}

















// import java.util.*;
// public class MergeSort{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int[] arr=new int[n];
//         for(int i=0; i<n; i++)
//         {
//             arr[i]=in.nextInt();
//         }
//         MergeSort o = new MergeSort();
//         //n main, you call mergeSort(arr, 0, n);. The correct call 
//         // should be mergeSort(arr, 0, n - 1); because array indices
//         //  go from 0 to n-1.

//         int[] b = o.mergeSort(arr , 0 , n-1);
//     }
//     public int[] mergeSort(int[] arr , int l , int r){
//         int[] b = arr;
//         if(l < r){
//             int mid = l + (r - l) / 2;
//             mergeSort(arr, l, mid);
//             mergeSort(arr, mid + 1, r);
//             b = merge(arr, l, mid, r);
//         }
//         return b;
//     }
//     public int[] merge(int[] arr , int l , int mid , int r){
//         int n1 = mid;
//         int n2 = l-mid;
//         int[] la=new int[n1];
//         int[] ra = new int[n2];
        
//         for(int i=0;i<n1; i++){
//             la[i]=arr[l+i];
//         }
//         for(int i=0; i<n2; i++){
//             ra[i]=arr[mid+1+i];
//         }
//         int i=0, j=0 , k=l;
//         while(i<=n1 && j<n2){
//             if(la[i]>ra[j]){
//                 arr[k]=ra[j];
//                 k++;
//                 j++;
//             }
//             else{
//                 arr[k]=la[i];
//                 k++;
//                 i++;
//             }
//         }
//         while(i<n1){
//             arr[k]=la[i];
//             k++;
//             i++;
//         }
//         while(j<n2){
//             arr[k]=ra[j];
//             k++;
//             j++;
//         }

//         return arr;
//     }
// }