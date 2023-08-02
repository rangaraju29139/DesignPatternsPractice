package hfdp.Factory.AbstractFactory.V1;



public class NyStylePizzaStore extends PizzaStore{

    Pizza pizza;
    public Pizza createPizza(String name){
        if(name.equals("cheese")){
            pizza = new NyCheesePizza();
        }else {
            pizza = new NyGreekPizza();
        }

        return pizza;

    }


}
