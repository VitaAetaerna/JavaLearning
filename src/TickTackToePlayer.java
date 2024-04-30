import java.util.Scanner;

public class TickTackToePlayer {
    int number;
    Scanner scanner = new Scanner(System.in);

    public int getTurn(){
        System.out.println("Player " + number + "'s turn");
        int input = scanner.nextInt();
        if (input < 9 && input >= 0) {
            return input;
        }
        System.out.println("Invalid");
        return getTurn();
    }

    public boolean validTurn(int[] board, int turn){
        if(board[turn] == -1) {
            return true;
        }
        System.out.println("Invalid");
        return false;
    }

    public TickTackToePlayer(int number){
        this.number = number;
    }
}
