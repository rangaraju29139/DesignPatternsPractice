package hfdp.Factory.SimpleFactory.V1;

public class OrderPizza {
    public static void main(String[] args) {
           Pizza pizza = new Pizza();
           pizza.prepare();;
           pizza.bake();
           pizza.cut();
           pizza.box();
    }
}
