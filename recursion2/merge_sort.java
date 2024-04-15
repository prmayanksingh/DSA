package recursion2;

public class merge_sort {
    public static void mergeSort (int []arr, int si, int ei){
        // base case 
        if (si >= ei) return;

        // recursion part
        int mid = (si + ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // combining
        merge(arr, si, ei);
    }
    public static void merge (int []arr,int si, int ei){
        int mid = (si + ei)/2;

        int ans [] = new int[ei - si + 1];
        int i = si, j = mid+1,a = 0;
        //combining the two windows
        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                ans[a] = arr[i];
                i++;
                a++;
            }else{
                ans[a] = arr[j];
                j++;
                a++;
            }
        }
        while (i <= mid){
            ans[a] = arr[i];
            i++;
            a++;
        }
        while (j <= ei){
            ans[a] = arr[j];
            j++;
            a++;
        }
        // copy the ans arry to the main array
        for (int c = 0; c < ans.length; c++){
            arr[si+c] = ans[c];
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,13,4,1,3,6,28};
        mergeSort(arr, 0, arr.length -1);
        // printing the result
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
