package StringBuilder;


public class insert {
    public static void main(String[] args) {
        StringBuilder S= new StringBuilder("ghhueghjgduytdhgdyuuy");
        S.delete(2,6);
        S.insert(2,"tttt");
        System.out.println(S);
    }
}
