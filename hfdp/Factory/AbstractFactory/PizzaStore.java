package hfdp.Factory.AbstractFactory;

public abstract class PizzaStore {

          public void  purchasePizza(String name){

               Pizza pizza;

              System.out.println("====== got an order for " + name+ " pizza =====");

              pizza = createPizza(name);

               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();

           }
           public abstract Pizza createPizza(String name);


}
