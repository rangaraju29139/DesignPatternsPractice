package hfdp.Factory.FactoryMethod.V1;



public class NyCheesePizza  extends Pizza{

    public void prepare(){
        System.out.println("preparatioon of ny cheese pizza");
    }
    public void bake(){
        System.out.println("baking the cheese ny pizza");
    }
    public void cut(){
        System.out.println("cutting the cheese ny pizza");
    }
    public void box(){
        System.out.println("packing the cheese ny pizza into a box");
    }


}
