import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static List<String> permutationOfString(String str, int k) {
        // base case
        if (str.length() == 0) {
            List<String> result = new ArrayList<>();
            result.add(""); // return a list with one empty string
            return result;
        }

        // creating the final ans list
        List<String> ans = new ArrayList<>();

        // smaller ans loop
        
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(0, i) + str.substring(i + 1);
            List<String> smallans = permutationOfString(temp, k);
            for (String s : smallans) {
                ans.add(str.charAt(i) + s);
            }
        }
        return ans;
    }

    public static List<String> permutationOfString(String str) {
        return permutationOfString(str, 0);
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> ans = permutationOfString(str);
        for (String i : ans) {
            System.out.println(i);
        }
    }
}


