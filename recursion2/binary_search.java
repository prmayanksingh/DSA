package recursion2;

public class binary_search {
    public static int binarySearch (int [] arr , int target,int si,int ei){
        // base case
        if (si > ei) return -1;

        // finding mid
        int mid = (si + ei) / 2;
        if (arr[mid] == target) return mid;
        
        // checking if the target element is greater or smaller than mid
        if (arr[mid] >= target) return binarySearch(arr, target, si, mid - 1);
        else return binarySearch(arr, target, mid + 1, ei);
    }
    public static int search (int [] arr, int target){
        return binarySearch(arr, target, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 3));
    }
}
