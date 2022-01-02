import java.util.*;


public class Player{

    private String name;
    private String symbol;
    private ArrayList<String> playerNums= new ArrayList<String>();
    

    public Player(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    
    public void setNum(String playerNum){
         playerNums.add(playerNum);
    }
    
    public String getSymbol(){
        return symbol;
    }

    public String getName() {
        return name;
    }
    
    public boolean checkWinner(){

        boolean winner = false;

        List winningSeq1 = Arrays.asList("1","2","3");
        List winningSeq2 = Arrays.asList("4","5","6");
        List winningSeq3 = Arrays.asList("7","8","9");
        List winningSeq4 = Arrays.asList("1","4","7");
        List winningSeq5 = Arrays.asList("2","5","8");
        List winningSeq6 = Arrays.asList("3","6","9");
        List winningSeq7 = Arrays.asList("1","5","9");
        List winningSeq8 = Arrays.asList("3","5","7");

        List<List> winningNumList = new ArrayList<List>();
        winningNumList.add(winningSeq1);
        winningNumList.add(winningSeq2);
        winningNumList.add(winningSeq3);
        winningNumList.add(winningSeq4);
        winningNumList.add(winningSeq5);
        winningNumList.add(winningSeq6);
        winningNumList.add(winningSeq7);
        winningNumList.add(winningSeq8);

        for(int i = 0; i < winningNumList.size(); i++){
            List currentWinningList = winningNumList.get(i);
            if(playerNums.containsAll(currentWinningList)){
                winner = true;
            }
        }
        
        return winner;
    }
}

