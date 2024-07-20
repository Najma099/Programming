package recursion;



public class sum {
    public static int sum (int N) {
        if(N == 1)
            return 1;
        else
            return N +sum(N-1);
    }
    public static void main(String[] args) {
        int a = 5;
        System.out.print(sum(a));
    }
}
