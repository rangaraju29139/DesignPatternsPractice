package hfdp.Intro;

public class RocketPoweredDuck extends Duck{
    public RocketPoweredDuck(){
        f = new FlyRocketPowered();
        q = new Quack();
    }
}
