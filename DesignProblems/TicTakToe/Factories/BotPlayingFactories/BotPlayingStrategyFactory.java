package DesignProblems.TicTakToe.Factories.BotPlayingFactories;

import DesignProblems.TicTakToe.Models.BotDifficultyLevel;
import DesignProblems.TicTakToe.Strategies.BotPlayingStrategies.BotPlayingStrategy;
import DesignProblems.TicTakToe.Strategies.BotPlayingStrategies.EasyPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
        switch(botDifficultyLevel){
            case EASY: return new EasyPlayingStrategy();

//            case MEDIUM: return new MediumPlayingStrategy();
//
//            case HARD: return new HardPlayingStrategy();

            default: return null;

        }
    }
}
