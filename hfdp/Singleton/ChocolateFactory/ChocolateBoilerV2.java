package hfdp.Singleton.ChocolateFactory;

public class ChocolateBoilerV2 {

    private boolean empty;
    private boolean boiled;

    private ChocolateBoilerV2 chocolateBoiler;

    private ChocolateBoilerV2(){
        empty = true;
        boiled = false;
    }

    public  boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
    public ChocolateBoilerV2 getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoilerV2();
        }
        return chocolateBoiler;
    }
    public void fill(){
        if(isBoiled()){
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
    public void performBoiling() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

}
