package recursion2.assignment;

public class stair_case {
    public static int starecase (int n){
        if (n < 0) return 0;
        if (n == 0|| n == 1) return 1;

        return starecase(n-1) + starecase(n-2) + starecase(n-3);
    }
    public static void main(String[] args) {
        System.out.println(starecase(4));
    }
}
