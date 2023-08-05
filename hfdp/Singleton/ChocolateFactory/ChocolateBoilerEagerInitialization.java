package hfdp.Singleton.ChocolateFactory;




public class ChocolateBoilerEagerInitialization {
    private boolean empty;
    private boolean boiled;
    private ChocolateBoilerEagerInitialization chocolateBoiler;

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public ChocolateBoilerEagerInitialization(){
        empty = true;
        boiled = false;
    }

    public  ChocolateBoilerEagerInitialization getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoilerEagerInitialization();
        }
        return chocolateBoiler;
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

