package timeSpaceComplexity;

public class find_unique_element {
    public static int findUnique (int [] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++){
            unique = unique ^ arr[i];
        } 
        return unique;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,6,3,6,2};
        System.out.println(findUnique(arr));
    }
}
