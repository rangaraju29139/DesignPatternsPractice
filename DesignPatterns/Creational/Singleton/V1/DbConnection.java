package DesignPatterns.Creational.Singleton.V1;

public class DbConnection {
    private String url;
    private String username;
    private String password;


    public DbConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }


}
