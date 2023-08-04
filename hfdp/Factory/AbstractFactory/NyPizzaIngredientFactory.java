package hfdp.Factory.AbstractFactory;

public class NyPizzaIngredient implements  PizzaIngredientFactory{

    public String createDough(){
        return "nyPizzaDoughIngredient";
    }
    public String createSauce(){
        return "nyPizzaSacuceIngredient";
    }

}
