package DesignProblems.TicTakToe;

import DesignProblems.TicTakToe.Exceptions.InvalidGameArgumentException;
import DesignProblems.TicTakToe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws InvalidGameArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++ welcome to the Tic Tac Toe Game ");


        System.out.println("What is the size of the board?");
        int dimensions = sc.nextInt();


        List<Player> players = new ArrayList<>();
        int numPlayers = dimensions-1;
        for(int i=0;i<numPlayers;i++) {
            System.out.println("what is the name of the player?");
            String name = sc.next();


            System.out.println("what is the symbol of the player?");
            char symbol = sc.next().charAt(0);

            Player p = null;
            System.out.println("Is it a Bot? (y/n)");

            boolean isBot = sc.next().equals("y");
            if(isBot){
                System.out.println("Enter the difficulty level in which the bot have to play (EASY/MEDIUM/HARD)");
                BotDifficultyLevel difficultyLevel = BotDifficultyLevel.valueOf(sc.next());
                p = new Bot(name,symbol,difficultyLevel);

            }else {
                p = new Player(name,symbol);

            }
            players.add(p);
        }


        Game game = Game.getBuilder().setDimensions(dimensions).setPlayers(players).build();

        while(game.getGameState().equals(GameState.INPROGRESS)){
            //DO SOMETHING

            System.out.println("Game looks like");
            game.display();

            System.out.println("press y for undo  and n for next move");
            boolean undoRequired = sc.next().equals("y");
            if(undoRequired){
                game.undo();
            }else{
                game.makeNextMove();

            }


        }

        if(game.getGameState().equals(GameState.END_IN_DRAW)){
            System.out.println("the game was ended in draw");
        }else{
            Player winner = game.getWinner();
            System.out.println("Game Winer is " + game.getWinner());
        }


    }
}
