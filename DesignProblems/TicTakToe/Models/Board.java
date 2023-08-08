package DesignProblems.TicTakToe.Models;

public class Board {
     private Cell[][] cells;
     private int dimensions;

    public int getDimensions() {
        return dimensions;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Board(Cell[][] cells) {
        this.cells = cells;
    }
    public Board(int dimensions){
        cells = new Cell[dimensions][dimensions];
        this.dimensions = dimensions;
        for(int i = 0; i < dimensions; i++){
            for(int j = 0; j < dimensions; j++){
                cells[i][j] = new Cell();
            }
        }
    }
    public void display(){
        for(int i = 0; i < dimensions; i++){
            for(int j = 0; j < dimensions; j++){
                Cell currentCell = cells[i][j];
                if(currentCell.getPlayer() == null){
                    System.out.print("|" + " " + "|");
                }else{
                    System.out.print("|"+currentCell.getPlayer().getSymbol() + "|");
                }
            }
            System.out.println();
        }
    }

}
