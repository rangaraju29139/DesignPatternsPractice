package hfdp.Factory.PizzaStore.V3;

public class PizzaStore {

           PizzaFactory factory;
           public PizzaStore(PizzaFactory factory) {
               this.factory = factory;
           }
          public void  purchasePizza(String name){
              this.factory = factory;
               Pizza pizza;

              System.out.println("====== got an order for " + name+ " pizza =====");

              pizza = factory.createPizza(name);

               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();

           }


}
