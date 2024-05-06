package timeSpaceComplexity;

public class array_intersection {
    public static void sort (int [] arr){
        int key = 0;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void intersection (int [] arr1, int[] arr2){
        sort(arr1);
        sort(arr2);
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }else if (arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr1 = {2,6,8,5,4,3,1};
        int [] arr2 = {2,3,4,7,1};
        intersection(arr1, arr2);
    }
}
