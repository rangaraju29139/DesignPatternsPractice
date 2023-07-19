package SOLIDPrinciples.V5;


public class Crow extends Bird implements Flyable, Soundable {

    public Crow(String name, String color, int weight) {
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
    public void eat(String name, String color, int weight) {
        System.out.println(name + "  is eating the food");

    }



}
