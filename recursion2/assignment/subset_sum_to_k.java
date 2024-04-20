package recursion2.assignment;


public class subset_sum_to_k {
    public static int [][] subsetsSum (int input[], int k, int si){
        // base case 
        if (si == input.length){
            if (k == 0) return new int[1][0];
            else return new int[0][0];
        }

        // recursion part
        int [][] include = subsetsSum(input, k-input[si], si + 1);
        int [][] notinclude = subsetsSum(input, k, si + 1);
        int [][] ans = new int[include.length + notinclude.length][];


        // copy the not included array to the ans array
        for (int i = 0; i < notinclude.length; i++){
            ans[i] = new int[notinclude[i].length];
            for (int j = 0; j < notinclude[i].length; j++){
                ans[i][j] = notinclude[i][j];
            }
        }
        // copy the included array to the ans array
        for (int i = 0; i < include.length; i++){
            ans[i + notinclude.length] = new int[include[i].length + 1];
            ans[i + notinclude.length][0] = input[si];
            for (int j = 1; j < include[i].length + 1; j++){
                ans[i + notinclude.length][j] = include[i][j-1];
            }
        } 
        return ans;
    }
    public static int [][] subsetsSum (int input[], int k){
        return subsetsSum(input, k, 0);
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [][] ans = subsetsSum(arr, 3);
        for (int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
