package DesignProblems.TicTakToe.Strategies.GameWinningStrategies;

import DesignProblems.TicTakToe.Models.Board;
import DesignProblems.TicTakToe.Models.Cell;
import DesignProblems.TicTakToe.Models.GameState;
import DesignProblems.TicTakToe.Models.Player;

public interface GameWinningStrategy {
    public GameState checkForWinner(Board board , Cell cell);
}
