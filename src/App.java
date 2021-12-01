import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Board b1 = new Board();
        Scanner scan = new Scanner(System.in);


        System.out.println("Player 1 Enter Your Name");
        String name1 = scan.nextLine();
        Player player1 = new Player(name1, "X");

        System.out.println("Player 2 Enter Your Name");
        String name2 = scan.nextLine();
        Player player2 = new Player(name2, "O");

        Player currentPlayer = player1;
     
        boolean endGame = false;
        ArrayList<String> selectedBoxs =  b1.getSelectedBoxs();

        
        while(!endGame){
            b1.displayBoard();

            System.out.println(currentPlayer.getName() + " Your symbol is '"+ currentPlayer.getSymbol() +"' select your box");
            int box = scan.nextInt();
            

            // Check if a box is selected to avoid overwriting
            while(selectedBoxs.contains(String.valueOf(box))){
                System.out.println(currentPlayer.getName() + " the box you selected has been already selected select another box");
                box = scan.nextInt();
            }

            b1.selectedBox(box, currentPlayer);

            if(player1.checkWinner()){
                b1.displayBoard();
                System.out.println(currentPlayer.getName() + " Won");
                System.out.println(selectedBoxs);
                endGame = true;
            }else if(selectedBoxs.size() <= 8){
                if(currentPlayer == player1){
                    currentPlayer = player2;
                }else{
                    currentPlayer = player1;    
                }
            }else if(selectedBoxs.size() > 8){
                b1.displayBoard();
                System.out.println("Its a tie");
                endGame = true;
            }
            
        }


    }
}
