package recursion2;

public class remove_duplicates {
    public static String removeDublicates (String str){
        // base case 
        if (str.length() == 1) return str;

        // smaller problem 
        String ans = removeDublicates(str.substring(1));

        // calculation
        if (str.charAt(0) == str.charAt(1)) return ans;
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "aabccba";
        System.out.println(removeDublicates(str));
    }
}
