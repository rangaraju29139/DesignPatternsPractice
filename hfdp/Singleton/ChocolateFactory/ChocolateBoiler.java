package hfdp.Singleton.ChocolateFactory;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("filling the boiler...");
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            boiled = false;
        }
    }

}
