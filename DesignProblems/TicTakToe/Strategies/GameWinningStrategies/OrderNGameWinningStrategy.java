package DesignProblems.TicTakToe.Strategies.GameWinningStrategies;

import DesignProblems.TicTakToe.Models.Board;
import DesignProblems.TicTakToe.Models.Cell;
import DesignProblems.TicTakToe.Models.GameState;

public class OrderNGameWinningStrategy implements GameWinningStrategy{


    public GameState checkForWinner(Board board, Cell currentCell){

        Cell[][] cells = board.getCells();

        int rowOfCurrentCell = currentCell.getRow();
        int columnOfCurrentCell = currentCell.getColumn();

       // check for row match
        boolean flag = true;
        for(int j=0;j<cells.length;j++){
            if (cells[rowOfCurrentCell][j].getPlayer() == null ||  cells[rowOfCurrentCell][j].getPlayer().equals(currentCell.getPlayer())){
               flag = false;
                break;
            }
        }

        if(flag == true){
            return  GameState.COMPLETED;
        }
        // check for column match
        flag = true;
        for(int i=0;i<cells.length;i++){
            if (cells[i][columnOfCurrentCell].getPlayer() == null ||  cells[i][columnOfCurrentCell].getPlayer().equals(currentCell.getPlayer())){
                flag = false;
                break;
            }
        }
        if(flag == true){
            return  GameState.COMPLETED;
        }



        // check for diagnol match


        // check if draw

        flag = true;
        for(int i = 0; i <cells.length;i++){
            for(int j=0;j<cells.length;j++){
                if(cells[i][j].getPlayer()==null){
                    flag=false;
                }
            }
        }
        if(flag==true){
            return GameState.END_IN_DRAW;
        }




//      board.display();
      return GameState.INPROGRESS;
    }
}
