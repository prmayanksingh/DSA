package recursion2;

public class replace_char {
    public static String replaceChar (String str, char c1, char c2){
        // base case
        if (str.length() == 0) return "";

        // smaller problem 
        String ans = replaceChar(str.substring(1),c1,c2);

        // calculation
        if(str.charAt(0) == c1) return c2 + ans;
        return str.charAt(0) + ans;
    }
    public static void main(String[] args) {
        String str = "abacd";
        System.out.println(replaceChar(str, 'a', 'x'));
    }
}
