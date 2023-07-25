package hfdp.Intro;



public class Client {

    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.performFly();
        d.performQuack();

        Duck d1 = new ModelDuck();
        d1.performFly();
        d1.performQuack();


        Duck d2 = new RocketPoweredDuck();
        d2.performFly();
        d2.performQuack();
    }
}
