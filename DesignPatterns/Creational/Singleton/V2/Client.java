package DesignPatterns.Creational.Singleton.V2;


/**
 * Still multiple instances are being created as the getConnection is creating new Instance every time.
 */
public class Client {

    public static void main(String[] args) {

        // removing the constructor calling as only one constructor has to be created
//        DbConnection c1 = new DbConnection("localhost", "localhost", "localhost");
//        DbConnection c2 = new DbConnection("localhost", "localhost", "localhost");

        DbConnection c1  =  DbConnection.getConnection("localhost", "localhost", "localhost");
        DbConnection c2  =  DbConnection.getConnection("localhost", "localhost", "localhost");
        DbConnection c3  =  DbConnection.getConnection("localhost", "localhost", "localhost");


        System.out.println("Hash code of c1: "+c1.toString());
        System.out.println("Hash code of c2: "+c2.toString());
        System.out.println("Hash code of c3: "+c3.toString());

    }

}
