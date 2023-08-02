package hfdp.Factory.SimpleFactory.V2;

public class OrderPizza {

           Pizza pizza;
          public  OrderPizza(String name){
               if(name == "cheese"){
                   pizza = new CheesePizza();
               }else if(name == "Greek"){
                   pizza = new GreekPizza();
               }
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();

           }


}
