package hfdp.Factory.AbstractFactory;


public class NyGreekPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NyGreekPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare(){
        System.out.println("preparation of Greek cheese pizza");
        dough =  pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
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
