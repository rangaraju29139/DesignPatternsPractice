package SOLIDPrinciples.V5;


public class Sparrow extends Bird implements Flyable, Soundable {

    public Sparrow(String name, String color, int weight) {
        super(name, color, weight);
    }

    public void playSound() {
        System.out.println(this.name + "  is Playing the Sound");
    }

    @Override
    public void fly() {
        Flyator f = new FastFlyator();
        f.makeFly();
    }
    @Override
    void eat(String name, String color, int weight) {
        System.out.println(name + "  is eating the food");

    }

}
