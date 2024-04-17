package recursion2.assignment;

public class check_ab {
    public static boolean checkAB (String str, int si){
        // base case
        if (si == str.length()) return true;

        // checking the first char
        if (str.charAt(si) == 'a'){
            si++;

            //checking if it reaches the end or not
            if (si == str.length()) return true;

            // if the next char is a
            if (str.charAt(si) == 'a') return checkAB(str, si);

            // checking that 'a' is followed by
            if(str.charAt(si) == 'b'){
                si++;

                // checking if it reaches the end or not
                if (si == str.length()) return false;

                if(str.charAt(si) == 'b'){
                    si++;
                    return checkAB(str, si);
                }else return false;

            }else return false;

        }else return false;
    }
    public static boolean checkAB (String str){
        return checkAB(str, 0);
    }
    public static void main(String[] args) {
        String str = "abbaaaa";
        System.out.println(checkAB(str));        
    }
}
