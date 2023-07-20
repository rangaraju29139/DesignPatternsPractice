package DesignPatterns.Creational.Factory;

abstract public class Database {
    String query;
    abstract String getQuery();
    public void execute(){
        System.out.println(getQuery());
    }
}
