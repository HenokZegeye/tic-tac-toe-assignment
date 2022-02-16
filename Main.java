package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Board board1 = new Board();
        Scanner accept = new Scanner(System.in);

        Player player1 = new Player('X');

        Player player2 = new Player('O');
        
        Player currentPlayer = player1;
     
        boolean playing = false;
        ArrayList<Character> takenGrid =  board1.getTakenGrid();

        
        while(!playing){
            board1.display();

            System.out.println("Your sign is "+ currentPlayer.getXOrO() +" select your grids");
            Character grids = (char) accept.nextInt();
            
            while(takenGrid.contains(Character.valueOf(grids))){
                System.out.println("The grids you selected has been already selected select another grids");
                grids = (char) accept.nextInt();
            }

            board1.takenGrids(grids, currentPlayer);

            if(player1.checkWinner()){
                board1.display();
                System.out.println("You've Won");
                System.out.println(takenGrid);
                playing = true;
            }
            else if(takenGrid.size() <= 8){
                if(currentPlayer == player1){
                    currentPlayer = player2;
                }
                else{
                    currentPlayer = player1;    
                }
            }
            else if(takenGrid.size() > 8){
                board1.display();
                System.out.println("Its a tie");
                playing = true;
            }
            
        }

        accept.close();

    }
}
