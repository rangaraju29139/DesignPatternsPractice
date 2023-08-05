package hfdp.Singleton.ChocolateFactory;

public class ChocolateBoilerSynchronized {
    private boolean empty;
    private boolean boiled;
    private ChocolateBoilerSynchronized chocolateBoilerSynchronized;

    private  ChocolateBoilerSynchronized(){
        empty = true;;
        boiled = false;
    }

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
    public synchronized ChocolateBoilerSynchronized getInstance(){
        if(chocolateBoilerSynchronized == null){
            chocolateBoilerSynchronized = new ChocolateBoilerSynchronized();
        }
        return chocolateBoilerSynchronized;
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

    public void perfromHeating(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
}
