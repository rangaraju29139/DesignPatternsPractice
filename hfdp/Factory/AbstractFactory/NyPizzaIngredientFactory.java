package hfdp.Factory.AbstractFactory;

public class NyPizzaIngredientFactory implements  PizzaIngredientFactory{

    public String createDough(){
        return "nyPizzaDoughIngredient";
    }
    public String createSauce(){
        return "nyPizzaSacuceIngredient";
    }

}
