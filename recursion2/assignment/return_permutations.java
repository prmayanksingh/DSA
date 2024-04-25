package recursion2.assignment;

public class return_permutations {
    public static int factorial (int n){
        int fac = 1;
        for (int i = 1; i <= n; i++){
            fac = fac * i;
        }
        return fac;
    }
    
    public static String [] permutationOfString (String str, int k){
        // base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }
        
        // creating the final ans array
        String [] ans = new String[factorial(str.length())];

        // smaller ans loop
        for(int i = 0; i < str.length(); i++){
            String temp = (str.substring(0, i)) + str.substring(i + 1, str.length());
            String [] smallans = permutationOfString(temp, k);
            for (int j = 0; j < smallans.length; j++){
                ans[k] = str.charAt(i) + smallans[j];
                k++;
            }
        }
        return ans;
    }

    public static String [] permutationOfString (String str){
        return permutationOfString(str, 0);
    }
    public static void main(String[] args) {
        String str = "abc";
        String [] ans = permutationOfString(str);
        for (String i : ans){
            System.out.println(i);
        }
    }
}
