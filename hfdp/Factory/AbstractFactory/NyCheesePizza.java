package hfdp.Factory.AbstractFactory;


public class NyCheesePizza  extends Pizza {


    PizzaIngredientFactory pizzaIngredientFactory;

    public NyCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare(){
        System.out.println("preparation of ny cheese pizza");
        dough =  pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
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
