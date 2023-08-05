package hfdp.Singleton.ChocolateFactory;

public class ChocolateBoilerDualNullChecking {
    private volatile  static ChocolateBoilerDualNullChecking chocolateBoiler;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerDualNullChecking(){
        empty = true;
        boiled = false;
    }
    public ChocolateBoilerDualNullChecking getInstance(){
        if(chocolateBoiler == null){   // null checking 1
            synchronized (ChocolateBoilerDualNullChecking.class){
                if(chocolateBoiler == null){   // null checking 2
                    chocolateBoiler = new ChocolateBoilerDualNullChecking();
                }
            }
        }
        return chocolateBoiler;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
        }
    }
    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
