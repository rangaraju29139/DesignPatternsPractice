package hfdp.Factory.AbstractFactory;

public class
CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare(){
        System.out.println("preparatioon of cheese pizza");
         dough =  pizzaIngredientFactory.createDough();
         sauce = pizzaIngredientFactory.createSauce();
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
