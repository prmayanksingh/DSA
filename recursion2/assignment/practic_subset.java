// package recursion2.assignment;

public class practic_subset {
    public static int [][] subsets (int []input,int si){
        // base case
        if (si == input.length){
            int [][] ans = new int[1][0];
            return ans;
        }

        // smaller problem
        int [][]smallpro = subsets(input, si + 1);
        int [][]ans = new int[smallpro.length * 2][];
        
        // copy the smallpro to ans
        for (int i = 0; i < smallpro.length; i++){
            ans[i] = new int[smallpro[i].length]; 
            for (int j = 0; j < smallpro[i].length; j++){
                ans [i][j] = smallpro[i][j];
            }
        }
        // adding the first element ans the copy
        for (int i = 0; i < smallpro.length; i++){
            ans[i + smallpro.length] = new int[smallpro[i].length + 1];             
            ans[i + smallpro.length][0] = input [si];
            for (int j = 1; j < smallpro[i].length + 1; j++){
                ans [i + smallpro.length][j] = smallpro[i][j - 1];
            }
        }

        return ans;
    }

    public static int [][] subsets (int []input){
        return subsets(input, 0);
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [][] ans = subsets(arr);
        for (int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }    
    }
}
