package DesignProblems.TicTakToe.Models;

import DesignProblems.TicTakToe.Factories.BotPlayingFactories.BotPlayingStrategyFactory;
import DesignProblems.TicTakToe.Strategies.BotPlayingStrategies.BotPlayingStrategy;

import java.util.Scanner;

public class Bot extends Player{
   private BotDifficultyLevel botDifficultyLevel;

   private BotPlayingStrategy botPlayingStrategy;

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Bot(String name, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(name, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public Move decideMove(Board board){
        return this.botPlayingStrategy.decideMove(this,board);
    }
}
