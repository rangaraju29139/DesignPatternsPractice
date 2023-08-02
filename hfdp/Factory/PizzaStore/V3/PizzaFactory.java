package hfdp.Factory.PizzaStore.V3;

public class PizzaFactory {

    Pizza pizza;
    public Pizza createPizza(String name){
        if(name.equals("cheese")){
            pizza = new CheesePizza();
        }else {
            pizza = new GreekPizza();
        }

        return pizza;

    }

}
