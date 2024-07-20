package StringBuilder;


public class append {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("gfdhgfdsg");
        s.append("tttttt");
        s.append(10);
        s.append(43.5);
        s.append('*');
        System.out.print(s);
        char[] ch={'a','b','c','d'};
        s.append(ch);
        System.out.print(s);
        
    }
}
