package leetcode;

public class reverse_prefix_of_word {
    public static String reversePrefix(String word, char ch) {
        int i = 0;
        while (i < word.length()){
            if (word.charAt(i) == ch){
                break;
            }
            i++;
        }
        if (i >= word.length()) return word;
        
        String str = word.substring(0, i + 1);
        String rev = "";
        for (int r = str.length() - 1 ; r >= 0; r--){
            rev += str.charAt(r);
        }
        return rev + word.substring(i + 1, word.length());
    }
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdef", 'd'));
    }
}
