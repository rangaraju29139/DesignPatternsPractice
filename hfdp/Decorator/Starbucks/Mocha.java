package hfdp.Decorator.Starbucks;

public class Mocha extends CondimentDecorator{

    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Mocha ";
    }
    public double cost(){
        return this.beverage.cost() + 0.20;
    }
}
