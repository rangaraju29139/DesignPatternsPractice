package DesignPatterns.Creational.Singleton.V2;


/**
 * removing the constructor from the previous version as multiple instance are being created using the constructor
 *
 */
public class DbConnection {
    private static String url;
    private static String username;
    private static String password;


    private DbConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DbConnection getConnection(String url, String username, String password){
        DbConnection connection = new DbConnection(url, username, password);
        return connection;
    }


}
