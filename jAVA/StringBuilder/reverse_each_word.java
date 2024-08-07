package StringBuilder;


import java.util.Scanner;

public class reverse_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder S = new StringBuilder(sc.nextLine());
        int n = S.length();
        int i = 0;
        int j = 0;
        while (j < n) {
            if (S.charAt(j) != ' ') 
            {
                j++;
            } 
            else
            {
                reverse(S, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(S, i, j - 1);
        System.out.println(S);
        sc.close();
    }

    public static void reverse(StringBuilder S, int i, int j) {
        while (i < j) {
            char temp = S.charAt(i);
            S.setCharAt(i, S.charAt(j));
            S.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
