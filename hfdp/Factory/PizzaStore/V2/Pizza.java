package hfdp.Factory.PizzaStore.V1;

public class Pizza {
    String name="";
    String description="sample description";


    public void prepare(){
        System.out.println("preparatioon of pizza");
    }
    public void bake(){
        System.out.println("baking the pizza");
    }
    public void cut(){
        System.out.println("cutting the pizza");
    }
    public void box(){
        System.out.println("packing the pizza into a box");
    }

}
