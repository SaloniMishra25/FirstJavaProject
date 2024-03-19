import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNumber() {
        System.out.println("Guesser! Kindly guess the number");
        Scanner scan = new Scanner(System.in);
        int guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGussser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGusser() {
        Guesser g = new Guesser();
        numFromGussser = g.guessingNumber();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {
        if (numFromGussser == numFromPlayer1) {
            if (numFromGussser == numFromPlayer2 && numFromGussser == numFromPlayer3) {
                System.out.println("All are winners");
            } else if (numFromGussser == numFromPlayer2) {
                System.out.println("Player1 or Player2 are won the game");
            } else if (numFromGussser == numFromPlayer3) {
                System.out.println("Player1 or Player3  won the game");
            } else {
                System.out.println("Player1 won the game");
            }
        } else if (numFromGussser == numFromPlayer2) {
            if (numFromGussser == numFromPlayer3) {
                System.out.println("Player2 or Player3 are won the game");
            } else {
                System.out.println("Player2 won the game");
            }

        } else if (numFromGussser == numFromPlayer3) {

            System.out.println("Player3 won the match");

        } else {
            System.out.println("Sab ka sab galat hai. Aap game hargaye!!");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Start");
        Umpire u = new Umpire();
        u.collectNumFromGusser();
        u.collectNumFromPlayers();
        ;
        u.compare();
    }
}