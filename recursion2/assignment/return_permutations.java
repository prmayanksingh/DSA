package recursion2.assignment;

public class return_permutations {
    public static String [] permutationOfString (String str, int k){
        // base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        // smaller ans
        String temp = str.substring(0, k) + str.substring( k + 1, str.length());
        String [] smallans = permutationOfString(temp , k);

        // adding the first char to the smallans
        for (int i = 0; i < smallans.length; i++){
            smallans[i] = str.charAt(k) + smallans[i];
        }


        // changing the first character of the string
        String [] smallans2 = {};
        if (str.length() >= 2){
            smallans2 = permutationOfString(str, k + 1);
        }

        // making the ans array
        String ans [] = new String[smallans.length + smallans2.length];
        for (int i = 0; i < smallans.length; i++){
            ans[i] = smallans[i];
        }
        for (int i = 0; i < smallans2.length; i++){
            ans[i + smallans.length] = smallans2[i];
        }

        return ans;
    }
    public static void main(String[] args) {
        String str = "abc";
        String [] ans = permutationOfString(str, 0);
        for (String i : ans){
            System.out.println(i);
        }
    }
}
