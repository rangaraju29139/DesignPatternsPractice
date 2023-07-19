package DesignPatterns.Creational.Singleton.V3_Final;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * removing the constructor from the previous version as multiple instance are being created using the constructor
 *
 */
public class DbConnection {
    private static String url;
    private static String username;
    private static String password;

    private static DbConnection connection;



    private DbConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

/*   threadSafe v1:   using the Synchronized keyword
      public static synchronized DbConnection getConnection(String url, String username, String password){
        if(connection == null){
            connection = new DbConnection(url, username, password);
        }
        return connection;
    }*/

/*   Thread Safe version 2 : using the lock the specific critical section instead of keeping the entire method in blocking state
     public static  DbConnection getConnection(String url, String username, String password){

        Lock lock = new ReentrantLock();
        if(connection == null){
           lock.lock();
            connection = new DbConnection(url, username, password);
            lock.unlock();
        }
        return connection;
    }*/


    // Thread Safe final version using dual checking
    public static  DbConnection getConnection(String url, String username, String password) {

        Lock lock = new ReentrantLock();
        if (connection == null) {
            lock.lock();
            if (connection == null) {
                connection = new DbConnection(url, username, password);
            }

            lock.unlock();
        }
        return connection;
    }

}
