package recursion2;

public class print_subsequences {
    public static String [] findSubsequences (String str){
        // base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        // smaller problem 
        String smallans [] = findSubsequences(str.substring(1));
        String ans [] = new String[2 * smallans.length];

        // copying the array
        for (int i = 0; i < smallans.length; i++){
            ans [i] = smallans[i];
        }
        // adding the first char to and then copy
        for (int i = 0; i < smallans.length; i++){
            ans[i + smallans.length] = str.charAt(0) + smallans[i];
        }
        
        // returning answer
        return ans;
    }
    public static void main(String[] args) {
        String str = "xyz";
        String [] ans = findSubsequences(str);
        for (int i = 0;i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
