package hfdp.Factory.AbstractFactory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;



    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    public String toString(){
        return this.name;
    }

}
