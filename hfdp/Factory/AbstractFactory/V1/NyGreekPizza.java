package hfdp.Factory.AbstractFactory.V1;



public class NyGreekPizza extends Pizza{

    public void prepare(){
        System.out.println("preparatioon of ny Greek pizza");
    }
    public void bake(){
        System.out.println("baking the cheese ny Greek pizza");
    }
    public void cut(){
        System.out.println("cutting the cheese ny Greek pizza");
    }
    public void box(){
        System.out.println("packing the cheese ny pizza  Greek into a box");
    }
}
