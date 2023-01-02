import java.util.Scanner;

class Board {
    String[] board = {" "," "," "," "," "," "," "," "," "};

    void printBoard() {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " ");
    }
}

class Player {
    Scanner scanner = new Scanner(System.in);
    String name;
    String mark;

    Player(String mark) {
        this.mark = mark;
        if (mark == "X") {
            System.out.println("Player1 is choosed \"X\", please enter Your name: ");
            name = scanner.next();
        } else {
            System.out.println("Player2 is choosed \"O\", please enter Your name: ");
            name = scanner.next();
        }
    }
}

class Game {

}

public class Main {

    public static void main(String[] args) {

        new Board().printBoard();
        Player player1 = new Player("X");
        Player player2 = new Player("O");

    }
}