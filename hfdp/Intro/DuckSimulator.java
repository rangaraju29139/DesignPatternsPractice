package hfdp.Intro;

public class DuckSimulator extends Duck{
    public static void main(String[] args) {
        Duck d = new ModelDuck();

        d.setFlyBehavior(new FlyRocketPowered());
        d.performFly();
        d.performQuack();
    }
}
