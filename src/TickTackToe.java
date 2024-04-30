

//   #  #  #
//   #  #  #
//   #  #  #
public class TickTackToe {
    public static void main(String[] args){
        int turn = 0;
        int winner = -1;
        int[] board = new int[9];

        // Set every Place to -1
        for(int i = 0; i<board.length; i++){
            board[i] = -1;
        }

        TickTackToePlayer a = new TickTackToePlayer(0);
        TickTackToePlayer b = new TickTackToePlayer(1);
        TickTackToePlayer[] players = new TickTackToePlayer[2];
        players[0] = a;
        players[1] = b;

        // Actual Game Loop
        while(winner == -1){
            winner = CheckWinner(board);

            //Turns
            int turnField = players[turn].getTurn();
            if(players[turn].validTurn(board, turnField)){
                board[turnField] = players[turn].number;
                turn = (turn + 1) % 2;
            }
            printBoard(board);

        }

        if (winner == 0) {
            System.out.println("Winner is player 1");
        }
        if (winner == 1) {
            System.out.println("Winner is player 2");
        }

    }


                    //   #  #  #
                    //   #  #  #
                    //   #  #  #
    public static int CheckWinner(int[] board){
        int winner = -1;
        //Horizontal
        if (board[0] == board[1] && board[0] == board[2]) {
            winner = board[0];
        } else if (board[3] == board[4] && board[3] == board[5]) {
            winner = board[3];
        }
        else if (board[6] == board[7] && board[6] == board[8]) {
            winner = board[6];
        }

        // Vertical
        else if (board[0] == board[3] && board[0] == board[6]) {
            winner = board[0];
        }
        else if (board[1] == board[4] && board[1] == board[7]) {
            winner = board[1];
        }
        else if (board[2] == board[5] && board[2] == board[8]) {
            winner = board[2];
        }

        // Diagonal
        else if (board[0] == board[4] && board[0] == board[8]) {
            winner = board[0];
        }
        else if (board[2] == board[4] && board[2] == board[6]) {
            winner = board[2];
        }
        else{ winner = -1;}
        return winner;
        }



    public static void printBoard(int[] board){
        System.out.println(board[0] + " | " +board[1] + " | " +board[2]);
        System.out.println("____________");
        System.out.println(board[3] + " | " +board[4] + " | " +board[5]);
        System.out.println("____________");
        System.out.println(board[6] + " | " +board[7] + " | " +board[8]);
    }
}
