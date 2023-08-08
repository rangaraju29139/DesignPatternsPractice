package DesignProblems.TicTakToe.Models;

import DesignProblems.TicTakToe.Exceptions.InvalidGameArgumentException;
import DesignProblems.TicTakToe.Strategies.GameWinningStrategies.GameWinningStrategy;
import DesignProblems.TicTakToe.Strategies.GameWinningStrategies.OrderNGameWinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class Game {
  private Board board;
  private List<Player> players;

  private int turn;
  private List<Move> moves;
  private GameState gameState;
  Player winner;

  GameWinningStrategy gameWinningStrategy = new OrderNGameWinningStrategy();

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    private Game(int dimensions, List<Player> players) {
           this.board = new Board(dimensions);
           this.players = players;
           this.winner = null;
           this.gameState = GameState.INPROGRESS;
           this.turn = 0;
           this.moves = new ArrayList<>();


    }

    public void display(){
        this.board.display();
    }
    public void undo(){

    }
    public void makeNextMove(){
        Player currPlayer = this.players.get(turn);

        Move moveChoosen = currPlayer.decideMove(currPlayer,board);
        Cell cell = board.getCells()[moveChoosen.getRow()][moveChoosen.getColumn()];
        cell.setPlayer(currPlayer);
        moves.add(moveChoosen);
        display();

        // some logic for checking if we have won or still is in progress.
        GameState newGameState = this.gameWinningStrategy.checkForWinner(board,cell);
        if(newGameState.equals(GameState.COMPLETED )) {
            this.setWinner(cell.getPlayer());
            this.gameState = GameState.COMPLETED;

            System.out.println("Player : "+ this.getWinner() + " won the game ");
            display();

        }else if(newGameState.equals(GameState.END_IN_DRAW)){
            this.winner = null;
            this.gameState = GameState.END_IN_DRAW;
            this.display();
        }else{
            turn = (turn + 1)% players.size();
//        display();
            makeNextMove();

        }




    }
    public void replay(){

    }

    private static GameBuilder instance;

    public static GameBuilder getBuilder(){
        if(instance ==null){

           instance = new GameBuilder();
        }
        return instance;

    }


    public static class GameBuilder{
        private int dimensions;
        private List<Player> players;

        public GameBuilder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public boolean isValid() throws InvalidGameArgumentException {
            if(dimensions < 3){
                throw new InvalidGameArgumentException(" the dimensions must be greater than or equal to 3");
            }
            HashSet<Character> uniqueSymbol = new HashSet<Character>();
            for(Player player: players){
                if(uniqueSymbol.contains(player.getSymbol())){
                    throw new InvalidGameArgumentException("the Symbol of players must be unique");

                }else{
                    uniqueSymbol.add(player.getSymbol());
                }
            }
            if (players.size() != dimensions - 1) {
                throw new InvalidGameArgumentException("the number of players must be (dimensions -1)");
            }
            return true;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build() throws InvalidGameArgumentException {
            try{
                isValid();

                /* Alternate way to implemnt the the build function
                Game game = new Game();
                game.setBoard(new Board(dimensions));
                game.setPlayers(players);
                game.setTurn(0);
                game.setMoves(new ArrayList<>());
                game.setGameState(GameState.INPROGRESS);
                game.setWinner(null);
*/

                // but here the initialization is moved to constructor of game class.
                // the setter is not needed in the below case the setters are not being
                // done at the constructor level.
                Game game = new Game(dimensions,players);
                return game;
            }catch(InvalidGameArgumentException ex ){
                throw ex;
            }

        }

    }

}
