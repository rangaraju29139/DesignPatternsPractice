package DesignProblems.TicTakToe.Models;

public class Cell {
    private int row;
    private int column;
    private Player player;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell(int row, int column, Player player) {
        this.row = row;
        this.column = column;
        this.player = player;
    }
    public Cell(){
        
    }



}
