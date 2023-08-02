package hfdp.Factory.AbstractFactory.V1;

public class
CheesePizza extends Pizza {

    public void prepare(){
        System.out.println("preparatioon of cheese pizza");
    }
    public void bake(){
        System.out.println("baking the cheese pizza");
    }
    public void cut(){
        System.out.println("cutting the cheese pizza");
    }
    public void box(){
        System.out.println("packing the cheese pizza into a box");
    }
}
