package timeSpaceComplexity;

public class dublicate_in_array {
    public static int findDublicate (int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int sum2 = ((arr.length -2) * (arr.length - 1))/2;
        return sum - sum2;
    } 
    public static void main(String[] args) {
        int [] arr = {2,1,0,4,3,4};
        System.out.println(findDublicate(arr));
    }
}
