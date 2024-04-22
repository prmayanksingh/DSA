package recursion2.assignment;

public class practice {
    public static int countword (String str,int count){
        // base case
        if (str.length() == 0) return 0;

        // smaller problem
        int smallpro = countword(str.substring(1),count);

        // calculation
        int t = str.charAt(0);
        if (t >= 65 && t <= 90){
            for(int i = 1; i < str.length(); i++){
                if (str.charAt(i) == t + 32){
                    return smallpro + 1;
                }
            }
        }else{
            for (int i = 1; i < str.length(); i++){
                if (str.charAt(i) == t - 32){
                    return smallpro + 1;
                }
            }
        }
        return smallpro;
    }
    public static void main(String[] args) {
        String str = "aaAbcBC";
        System.out.println(countword(str, 0));
    }
}
