package hfdp.Factory.PizzaStore.V3;

public class GreekPizza extends Pizza {

    public void prepare(){
        System.out.println("preparation of Greek pizza");
    }
    public void bake(){
        System.out.println("baking the Greek pizza");
    }
    public void cut(){
        System.out.println("cutting the Greek pizza");
    }
    public void box(){
        System.out.println("packing the Greek pizza into a box");
    }
}
