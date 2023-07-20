package DesignPatterns.Creational.Factory;

public class Client {
    public static void main(String[] args) {
       Database db = new MySqlDb();
        db.execute();
        db = new Mongodb();
        db.execute();
    }
}
