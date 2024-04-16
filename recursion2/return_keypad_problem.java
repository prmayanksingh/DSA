package recursion2;

public class return_keypad_problem {
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
    public static String [] returnsubsequences (int num){
        // base case
        if (num == 0){
            String ans[] = {""};
            return ans;
        }

        // smaller problem
        String [] smallans = returnsubsequences(num/10);
        String [] last = singleDigit(num % 10);
        String [] ans = new String[last.length * smallans.length];
        
        // final part
        int k = 0;
        for (int i = 0; i < smallans.length; i++){
            for (int j = 0; j < last.length; j++){
                ans[k] = smallans[i] + last[j];
                k++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String [] ans = returnsubsequences(234);
        for (int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
