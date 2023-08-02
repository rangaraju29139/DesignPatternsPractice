package hfdp.Factory.PizzaStore.V3;

public class Client {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.purchasePizza("cheese");
        store.purchasePizza("Greek");

    }

}
