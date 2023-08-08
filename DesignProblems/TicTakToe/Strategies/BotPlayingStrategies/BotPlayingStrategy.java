package DesignProblems.TicTakToe.Strategies.BotPlayingStrategies;

import DesignProblems.TicTakToe.Models.Board;
import DesignProblems.TicTakToe.Models.Move;
import DesignProblems.TicTakToe.Models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player,Board board);
}
