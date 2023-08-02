package hfdp.Factory.AbstractFactory.V1;

public class Client {
    public static void main(String[] args) {

        PizzaStore store = new NyStylePizzaStore();

        store.purchasePizza("cheese");
        store.purchasePizza("Greek");



    }

}
