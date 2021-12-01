import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[]args){
        
        char[][] gameBoard = {{'[', ' ', '|', ' ', '|', ' ', ']'},
        {'[', ' ', '|', ' ', '|', ' ', ']'},
        {'[', ' ', '|', ' ', '|', ' ', ']'}};

        extracted(gameBoard);
        
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Position taken!! Enter a new correct position");
                playerPos = scan.nextInt();
            }
            
        placePiece(gameBoard, playerPos, "player");
        String result = checkWinner();


        result = checkWinner();
        if(result.length() > 0){
            System.out.println(result);
            extracted(gameBoard);

            break;
        }

        Random rand = new Random();
        int cpuPos = rand.nextInt(9) + 1;
        while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)){
            cpuPos = rand.nextInt(9) + 1;  
  
        }

        placePiece(gameBoard, cpuPos, "cpu");
        extracted(gameBoard);

        result = checkWinner();
        if(result.length() > 0){
            System.out.println(result);
            break;
            }   
        }
    }

    private static void extracted(char[][] gameBoard) {
        printGameBoard(gameBoard);
    }

    public  static void printGameBoard(char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user){

        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        } else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch(pos) {
            case 1:
                gameBoard[0][1] = symbol;
                break;
            case 2:
                gameBoard[0][3] = symbol;
                break;
            case 3:
                gameBoard[0][5] = symbol;
                break;
            case 4:
                gameBoard[1][1] = symbol;
                break;
            case 5:
                gameBoard[1][3] = symbol;
                break;
            case 6:
                gameBoard[1][5] = symbol;
                break;
            case 7:
                gameBoard[2][1] = symbol;
                break;
            case 8:
                gameBoard[2][3] = symbol;
                break;
            case 9:
                gameBoard[2][5] = symbol;
                break;
            default:
                break;
        }
    }

    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftColumn = Arrays.asList(1, 4, 7);
        List midColumn = Arrays.asList(2, 5, 8);
        List rightColumn = Arrays.asList(3, 6, 9);
        List diagonalX = Arrays.asList(1, 5, 9);
        List diagonalY = Arrays.asList(3, 5, 7);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);
        winning.add(leftColumn);
        winning.add(midColumn);
        winning.add(rightColumn);
        winning.add(diagonalX);
        winning.add(diagonalY);

        for(List l : winning){
            if(cpuPositions.containsAll(l)){
                return "CPU wins!!";
            } else if(playerPositions.containsAll(l)){
                return "You won!!";
            } else if(playerPositions.size() + cpuPositions.size() == 9){
                return "No winners,it's a draw! play again";

            }
        }
        return "";
    }
}
