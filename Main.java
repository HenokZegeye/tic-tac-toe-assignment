public class Main {
    public static void main(String[] args) {
        Tictactoe tic = new Tictactoe();
        tic.show();
        while(true){
            tic.playerOne();
            tic.playerTwo();
        }  
    }
}
