package recursion2;

public class print_keypad_combination {
    public static String [] singleDigit (int num){
        if (num == 0){
            String [] ans ={""};
            return ans;
        }else if (num == 1){
            String [] ans = {""};
            return ans;
        }else if (num == 2){
            String [] ans = {"a","b","c"};
            return ans;
        }else if (num == 3){
            String [] ans = {"d","e","f"};
            return ans;
        }else if (num == 4){
            String [] ans = {"g","h","i"};
            return ans;
        }else if (num == 5){
            String [] ans = {"j","k","l"};
            return ans;
        }else if (num == 6){
            String [] ans = {"m","n","o"};
            return ans;
        }else if (num == 7){
            String [] ans = {"p","q","r","s"};
            return ans;
        }else if (num == 8){
            String [] ans = {"t","u","v"};
            return ans;
        }else {
            String [] ans = {"w","x","y","z"};
            return ans;
        }
    }
    public static void keypadcombination (int n, String outputsofar){
        // base case
        if (n == 0){
            System.out.println(outputsofar);
            return ;
        }

        // which character to chosse
        String [] singleDig = singleDigit(n%10);
        keypadcombination(n/10, singleDig[0] + outputsofar);
        keypadcombination(n/10, singleDig[1] + outputsofar);
        keypadcombination(n/10, singleDig[2] + outputsofar);
        if (singleDig.length == 4){
            keypadcombination(n/10, singleDig[3] + outputsofar);
        }
    }
    public static void  printkeypad (int n){
        keypadcombination(n, "");
    }
    public static void main(String[] args) {
        printkeypad(234);
    }
}
