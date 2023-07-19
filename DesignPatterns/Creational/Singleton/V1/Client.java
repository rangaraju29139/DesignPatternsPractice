package DesignPatterns.Creational.Singleton.V1;

public class Client {

    public static void main(String[] args) {
        DbConnection c1 = new DbConnection("localhost", "localhost", "localhost");
        DbConnection c2 = new DbConnection("localhost", "localhost", "localhost");

    }

}
