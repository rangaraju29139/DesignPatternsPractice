package DesignProblems.TicTakToe.Strategies.BotPlayingStrategies;

import DesignProblems.TicTakToe.Models.Board;
import DesignProblems.TicTakToe.Models.Cell;
import DesignProblems.TicTakToe.Models.Move;
import DesignProblems.TicTakToe.Models.Player;

public class EasyPlayingStrategy implements BotPlayingStrategy{

    public Move decideMove(Player player,Board board){
        Cell[][] cells = board.getCells();
//        int dimension = board.getDimensions();
        for(int i=0; i<cells.length; i++){
            for(int j=0; j<cells[i].length; j++){
                if(cells[i][j].getPlayer() == null){
                    Move move = new Move(player,i,j);
                    return move;
                }
            }
        }
        return null;

    }
}
