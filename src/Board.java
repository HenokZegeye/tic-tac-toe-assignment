import java.util.*;

public class Board {
    private String[] num = {"1","2","3","4","5","6","7","8","9"};
    private ArrayList<String> selectedBoxs= new ArrayList<String>();

    public void displayBoard(){
        System.out.println("       |       |      ");
        System.out.println("   "+ num[0] +"   |   "+ num[1] +"   |   "+ num[2] +"   ");
        System.out.println("       |       |      ");
        System.out.println("-------+-------+-------");
        System.out.println("       |       |      ");
        System.out.println("   "+ num[3] +"   |   "+ num[4] +"   |   "+ num[5] +"   ");
        System.out.println("       |       |      ");
        System.out.println("-------+-------+-------");
        System.out.println("       |       |      ");
        System.out.println("   "+ num[6] +"   |   "+ num[7] +"   |   "+ num[8] +"   ");
        System.out.println("       |       |      ");
    }

    public void selectedBox(int box, Player player){
        switch(box){
            case 1: 
                player.setNum(num[0]);
                selectedBoxs.add(num[0]);
                num[0] = player.getSymbol();
                break;
            case 2: 
                player.setNum(num[1]);
                selectedBoxs.add(num[1]);
                num[1] = player.getSymbol();
                break;
            case 3: 
                player.setNum(num[2]);
                selectedBoxs.add(num[2]);
                num[2] = player.getSymbol();
                break;
            case 4: 
                player.setNum(num[3]);
                selectedBoxs.add(num[3]);  
                num[3] = player.getSymbol();
                break;
            case 5: 
                player.setNum(num[4]);
                selectedBoxs.add(num[4]);
                num[4] = player.getSymbol();
                break;
            case 6: 
                player.setNum(num[5]);
                selectedBoxs.add(num[5]);
                num[5] = player.getSymbol();
                break;
            case 7: 
                player.setNum(num[6]);
                selectedBoxs.add(num[6]);
                num[6] = player.getSymbol();
                break;
            case 8: 
                player.setNum(num[7]);
                selectedBoxs.add(num[7]);
                num[7] = player.getSymbol();
                break;
            case 9: 
                player.setNum(num[8]);
                selectedBoxs.add(num[8]);
                num[8] = player.getSymbol();
                break;
        }
    }

    public ArrayList<String> getSelectedBoxs() {
        return selectedBoxs;
    }
}