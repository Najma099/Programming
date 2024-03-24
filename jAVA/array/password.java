package array;


import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String l = sc.nextLine();
            String e = sc.nextLine();
            for (int j = 0; j< n; j++) {
                int li = l.charAt(i) - 'A';
                int ei = e.charAt(i) - 'A';
                int shifts = (ei - li + 26) % 26; 
                System.out.print(shifts + " ");
                }
            
            }
            System.out.println();
            sc.close();
        }
        
    }



