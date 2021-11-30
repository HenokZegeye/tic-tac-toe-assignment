import java.util.Scanner;

public class Tictactoe{
    public Tictactoe(){}


    String grid[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    Scanner scan = new Scanner(System.in);

    public void show(){
        System.out.println("---------");
        System.out.println("|" + grid[0] + "|" + "|" + grid[1] + "|" + "|" + grid[2] + "|");
        System.out.println("|" + grid[3] + "|" + "|" + grid[4] + "|" + "|" + grid[5] + "|");
        System.out.println("|" + grid[6] + "|" + "|" + grid[7] + "|" + "|" + grid[8] + "|");
        System.out.println("---------");
    }

    
    public void playerOne(){
            System.out.println("PLAYER ONE'S TURN");
            System.out.println("MAKE YOUR MOVE");

            int user = scan.nextInt();
            if (user > 8 || grid[user] == "X" || grid[user] == "O"){
                System.out.println("Invalid move!");
                playerOne();
            }else{
                grid[user] = "X";
                show();
            }
            winner();
    }

    public void playerTwo(){
            System.out.println("PLAYER TWO'S TURN");
            System.out.println("MAKE YOUR MOVE");

            int user = scan.nextInt();
            if (user > 8 || grid[user] == "X" || grid[user] == "O"){
                System.out.println("Invalid move!");
                playerTwo();
            }else{
                grid[user] = "O";
                show();
            }
            winner();
    }

    public void winner(){
        if(grid[0] == "X" && grid[1] == "X" && grid[2] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[3] == "X" && grid[4] == "X" && grid[5] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[6] == "X" && grid[7] == "X" && grid[8] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[2] == "X" && grid[5] == "X" && grid[8] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[0] == "X" && grid[3] == "X" && grid[6] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[1] == "X" && grid[4] == "X" && grid[7] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[0] == "X" && grid[4] == "X" && grid[8] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[6] == "X" && grid[4] == "X" && grid[2] == "X"){
            System.out.println("PLAYER ONE WINS!!!");
            System.exit(0);
        }

        else if(grid[0] == "O" && grid[1] == "O" && grid[2] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[3] == "O" && grid[4] == "O" && grid[5] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[6] == "O" && grid[7] == "O" && grid[8] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[2] == "O" && grid[5] == "O" && grid[8] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[0] == "O" && grid[3] == "O" && grid[6] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[1] == "O" && grid[4] == "O" && grid[7] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[0] == "O" && grid[4] == "O" && grid[8] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }

        else if(grid[6] == "O" && grid[4] == "O" && grid[2] == "O"){
            System.out.println("PLAYER TWO WINS!!!");
            System.exit(0);
        }
    }

}