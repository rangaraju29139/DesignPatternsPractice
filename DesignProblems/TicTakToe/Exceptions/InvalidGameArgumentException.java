package DesignProblems.TicTakToe.Exceptions;

public class InvalidGameArgumentException extends Exception{
    public InvalidGameArgumentException(String message){
        super(message);
        System.out.println("Error Message: "+ message);
    }

}
