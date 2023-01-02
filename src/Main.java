import java.util.Scanner;

class Board {
    String[] board = {" "," "," "," "," "," "," "," "," "};
    int position;
    int count;

    void printBoard() {
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8] + " ");
    }

    boolean fillBoard() {
        if (board[position - 1].equals(" ")) {
            board[position - 1] = "markIt";
            count++;
            return true;
        } else {
            System.out.println("Choosed position is occupied, take another one...");
            return false;
        }
    }

    boolean checkWinner(String marked) {
        if (
                (board[0].equals(marked) && board[1].equals(marked) && board[2].equals(marked)) ||
                (board[3].equals(marked) && board[4].equals(marked) && board[5].equals(marked)) ||
                (board[6].equals(marked) && board[7].equals(marked) && board[8].equals(marked)) ||
                (board[0].equals(marked) && board[3].equals(marked) && board[6].equals(marked)) ||
                (board[1].equals(marked) && board[4].equals(marked) && board[7].equals(marked)) ||
                (board[2].equals(marked) && board[5].equals(marked) && board[8].equals(marked)) ||
                (board[0].equals(marked) && board[4].equals(marked) && board[8].equals(marked)) ||
                (board[2].equals(marked) && board[4].equals(marked) && board[6].equals(marked))
        ) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkDraw() {
        if (count == 9) {
            return true;
        } else {
            return false;
        }
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
    String message = "Enter Your position (1 - 9)";

    void play() {

    }

}

public class Main {

    public static void main(String[] args) {

        new Board().printBoard();
        Player player1 = new Player("X");
        Player player2 = new Player("O");

    }
}