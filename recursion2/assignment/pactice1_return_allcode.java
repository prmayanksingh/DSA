package recursion2.assignment;

public class pactice1_return_allcode {
    public static String [] getCode (String str){
        // base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        // smalle ans
        String [] smallans = getCode(str.substring(1));
        char n = (char)((str.charAt(0) - '0') + 'a' - 1);

        for (int i = 0; i < smallans.length; i++){
            smallans[i] = n + smallans[i];
        }

        String [] smallans2 = {};
        if (str.length() >= 2){
            char n2 = (char)((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0') + 'a' - 1);
            if (n2 >= 'a' && n2 <= 'z'){
                smallans2 = getCode(str.substring(2));
            }
            for (int i = 0; i < smallans2.length; i++){
            smallans2[i] = n2 + smallans2[i];                
            }
        }
        // combining both the arrays
        String ans [] = new String[smallans.length + smallans2.length];
        for (int i = 0; i < smallans.length; i++){
            ans[i] = smallans[i];
        }
        for (int i = 0 ; i < smallans2.length; i++){
            ans [i + smallans.length] = smallans2[i];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        String [] ans = getCode("1123");
        for (String s : ans){
            System.out.println(s);
        }
    }
}
