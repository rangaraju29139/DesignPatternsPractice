package hfdp.Factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {

        PizzaStore store = new NyStylePizzaStore();

        store.purchasePizza("cheese");
        store.purchasePizza("Greek");



    }

}
