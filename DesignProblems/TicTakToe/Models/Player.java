package DesignProblems.TicTakToe.Models;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Move decideMove(Player player, Board board){
        Scanner sc = new Scanner(System.in);
        int row;
        int column;
        do{
            System.out.println("Enter the cell row which you want to make a next move");
             row  = sc.nextInt();
            System.out.println("Enter the cell Column which you want to make a next move");
             column = sc.nextInt();

        }while(!isValidMove(board,this,row,column));


        return new Move(this, row,column);
    }

    public boolean isValidMove(Board board,Player player, int row,int column){
                  int dimensions = board.getDimensions();
                  if(row< 0 || row>=board.getDimensions() || column<0 || column>=board.getDimensions()){
                      System.out.println("Invalid cell please enter the right column or row");
                      return false;
                  }else if(board.getCells()[row][column].getPlayer()!=null){
                      System.out.println("Invalid cell you are placing on already updated cell, kindly use the unused cell");
                      return false;
                  }
                  return true;
    }



}
