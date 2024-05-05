package leetcode;

public class lar_pos_neg_inte {
    public static int findMaxK(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length; j++){
                if (j != i)
                if (nums[i] > 0){
                    if (nums[j]/-1 == nums[i] && nums[j]/-1 > ans){
                        ans = nums[i];
                    }
                }else{
                    if (nums[j] == nums[i]/-1 && nums[i]/-1 > ans){
                        ans = nums[j];
                    }
                }
            }
        }
        if (ans == 0) return -1;
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {-1,2,-3,3};
        System.out.println(findMaxK(arr));
    }
}
