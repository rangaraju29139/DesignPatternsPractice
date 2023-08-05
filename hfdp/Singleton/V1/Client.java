package hfdp.Singleton.V1;


public class Client {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();


        s1.singletonPrint();
        s2.singletonPrint();
        s3.singletonPrint();


    }



}
