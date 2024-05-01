// package recursion2.assignment;

public class return_all_codes {
    public static String [] getcode (String str){
        //base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        // smaller problem
        String [] smallpro = getcode(str.substring(1));
        char n = (char)('a' + (str.charAt(0) - '0') - 1);

        // adding the char n to the smallpro string array
        for (int i = 0; i < smallpro.length; i++){
            smallpro[i] = n + smallpro[i];
        }

        // giving recursion to solve from 2nd index
        String [] smallpro1 = {};
        if (str.length() >= 2){
            char n1 = (char)((str.charAt(0) - '0') * 10 + str.charAt(1) - '0' + 'a' - 1);
            if (n1 >= 'a' && n1 <= 'z'){
                smallpro1 = getcode(str.substring(2));
            }
            // adding char n1 to the smallpro1 string array
            for (int i = 0; i < smallpro1.length; i++){
                smallpro1[i] = n1 + smallpro1[i];
            }
        }

        // combining both smallpro ans smallpro1 String array
        String [] ans = new String[smallpro.length + smallpro1.length];
        for (int i = 0; i < smallpro.length; i++){
            ans[i] = smallpro[i];
        }
        for (int i = 0; i < smallpro1.length; i++){
            ans[i + smallpro.length] = smallpro1[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] ans = getcode("1123");
        for (String s : ans){
            System.out.println(s);
        }
    }
}
