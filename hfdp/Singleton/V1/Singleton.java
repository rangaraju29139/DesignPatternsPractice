package hfdp.Singleton.V1;

public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public  void singletonPrint(){
        System.out.println("I am a Singleton print method"+this.hashCode());
    }

//    public String toString(){
//        return
//    }


}
