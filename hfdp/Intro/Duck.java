package hfdp.Intro;

public class Duck {
    FlyBehavior f ;
    QuackBehaviour q;
    public Duck(){

    }

    public void performFly(){
        f.fly();
    }
    public void performQuack(){
        q.quack();
    }
    public void setFlyBehavior(FlyBehavior f) {
        this.f = f;
    }
    public void setQuackBehavior(QuackBehaviour q) {
        this.q = q;
    }
}
