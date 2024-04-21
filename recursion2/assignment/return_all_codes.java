package recursion2.assignment;

public class return_all_codes {
    public static String [] getcode (String str){
        //base case
        if (str.length() == 0){
            String [] ans = {""};
            return ans;
        }

        // smaller problem
        String [] smallpro = getcode(str.substring(1));
        int t = str.charAt(0) - '0';
        char n = 'a' + 1 - 1;

        // adding the char n to the smallpro string array
        for (int i = 0; i < smallpro.length; i++){
            smallpro[i] = n + smallpro[i];
        }

        // giving recursion to solve from 2nd index
        String [] smallpro1 = getcode(str.substring(2));
        int t1 = (str.charAt(0)+str.charAt(1)) - '0';
        char n1 = 'a' + 11 - 1;

        // adding char n1 to the ans string array
        for (int i = 0; i < smallpro1.length; i++){
            smallpro1[i] = n1 + smallpro1[i];
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
        System.out.println(getcode("1123"));
    }
}
