package DesignProblems.TicTakToe.Models;

public class Move {
    private Player player;
    private Cell cell;
    private int row;
    private int column;

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

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Move(Player player, int row, int column) {
        this.player = player;
        this.row = row;
        this.column = column;
    }

}
