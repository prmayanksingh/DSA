package recursion2;

public class quick_sort {
    public static void quickSort (int [] arr, int si, int ei){
        // base case
        if (si >= ei) return;

        // placing pivot at its position
        int pivotpos = pivotpos(arr, si, ei);

        // recursion part
        quickSort(arr, si, pivotpos - 1);
        quickSort(arr, pivotpos + 1, ei);
    }
    public static int pivotpos (int arr[], int si, int ei){
        // placing pivot at its position
        int pivotpos = si;
        int count = 0;
        for (int i = si + 1; i < arr.length; i++){
            if (arr[i] <= arr[pivotpos]) 
            count++;
        }
        int temp = arr[si + count];
        arr[si + count] = arr[pivotpos];
        arr[pivotpos] = temp;
        pivotpos = si + count;

        // ensuting left elements are smaller and right elements are greater to pivot
        int i = si;
        int j = ei;
        while (i < pivotpos && j > pivotpos){
            while(arr[i] <= arr[pivotpos]) i++;
            while (arr[j] > arr[pivotpos]) j--;
            if (i < pivotpos && j > pivotpos){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } 
        return pivotpos;
    }
    public static void main(String[] args) {
        int [] arr = {2,6,8,5,4,3};
        quickSort(arr, 0, arr.length - 1);
        
        // printing the sorted array
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
}
