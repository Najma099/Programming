
import java.util.Scanner;
class Guesser{
    int gnum;
    int guessingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser, please guess a number!");
        gnum = sc.nextInt();
        return gnum;
    }
}

class Player{
    int pnum;
    int predictingNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player, Please predict a number !");
        pnum = sc.nextInt();
        return pnum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectingNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectingNumFromPlayer(){
        Player p1 = new Player ();
        Player p2 = new Player ();
        Player p3 = new Player ();

        numFromPlayer1 = p1.predictingNum();
        numFromPlayer1 = p2.predictingNum();
        numFromPlayer3 = p3.predictingNum();
    }

    void comparing(){
        if(numFromPlayer1==numFromGuesser){
            System.out.println("Player1 WON THE GAME");
        }
        if(numFromPlayer2==numFromGuesser) {
            System.out.println("Player2 WON THE GAME");
        }
        if(numFromPlayer3==numFromGuesser) {
            System.out.println("Player3 WON THE GAME");
        }
        else{
            System.out.println("GAME LOST, TRY AGAIN!");
        }
    }

}

public class GuesserGmaesApp {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectingNumFromGuesser();
        u.collectingNumFromPlayer();
        u.comparing();
    }
}
