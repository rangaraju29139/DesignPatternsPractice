package hfdp.Factory.AbstractFactory;


public class NyStylePizzaStore extends PizzaStore {

    Pizza pizza;
    PizzaIngredientFactory pizzaIngredientFactory = new NyPizzaIngredientFactory();

    public Pizza createPizza(String name){
        if(name.equals("cheese")){
            //implemntations of abstract factory here
            pizza = new NyCheesePizza(pizzaIngredientFactory);
            pizza.setName(name);
        }else {
            pizza = new NyGreekPizza(pizzaIngredientFactory);
            pizza.setName(name);

        }

        return pizza;

    }


}
