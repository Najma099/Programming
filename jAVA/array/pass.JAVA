//import java.util.Scanner;
//
//public class Pass {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            sc.nextLine();
//            String l = sc.nextLine();
//            String e = sc.nextLine();
//            StringBuilder k = new StringBuilder();
//            for (int j = 0; j < n; j++) {
//                int li = l.charAt(j) - 'A';
//                int ei = e.charAt(j) - 'A';
//                int shifts = (ei - li + 26) % 26;
//                k.append(shifts).append(" ");
//            }
//            System.out.println(k.toString().trim());
//        }
//        sc.close();
//    }
//}