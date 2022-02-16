package tictactoe;

import java.util.*;

public class Board {
    
    Character grid[] = {'1','2','3','4','5','6','7','8','9'};
    ArrayList<Character> takenGrid= new ArrayList<Character>();

    public Board(){
        
    }
    public void display(){
        System.out.println( grid[0] + "|" + grid[1] + "|" + grid[2] );
        System.out.println( grid[3] + "|" + grid[4] + "|" + grid[5] );
        System.out.println( grid[6] + "|" + grid[7] + "|" + grid[8] );
    }
    
    public void takenGrids(Character grids, Player player){
        switch(grids){
            case 1: 
                player.setPlayersSpot(grid[0]);
                takenGrid.add(grid[0]);
                grid[0] = player.getXOrO();
                break;
            case 2: 
                player.setPlayersSpot(grid[1]);
                takenGrid.add(grid[1]);
                grid[1] = player.getXOrO();
                break;
            case 3: 
                player.setPlayersSpot(grid[2]);
                takenGrid.add(grid[2]);
                grid[2] = player.getXOrO();
                break;
            case 4: 
                player.setPlayersSpot(grid[3]);
                takenGrid.add(grid[3]);  
                grid[3] = player.getXOrO();
                break;
            case 5: 
                player.setPlayersSpot(grid[4]);
                takenGrid.add(grid[4]);
                grid[4] = player.getXOrO();
                break;
            case 6: 
                player.setPlayersSpot(grid[5]);
                takenGrid.add(grid[5]);
                grid[5] = player.getXOrO();
                break;
            case 7: 
                player.setPlayersSpot(grid[6]);
                takenGrid.add(grid[6]);
                grid[6] = player.getXOrO();
                break;
            case 8: 
                player.setPlayersSpot(grid[7]);
                takenGrid.add(grid[7]);
                grid[7] = player.getXOrO();
                break;
            case 9: 
                player.setPlayersSpot(grid[8]);
                takenGrid.add(grid[8]);
                grid[8] = player.getXOrO();
                break;
        }
    }

    public ArrayList<Character> getTakenGrid() {
        return takenGrid;
    }



}
