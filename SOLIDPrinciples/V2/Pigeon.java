package SOLIDPrinciples.V2;



public class Pigeon extends Bird{

    public Pigeon(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    void playSound(String name, String color, int weight) {
        System.out.println(name + "  is Playing the Sound");
    }

    @Override
    void eat(String name, String color, int weight) {
        System.out.println(name + "  is eating the food");

    }

    @Override
    void fly(String name, String color, int weight) {
        System.out.println(name + "is flying in the sky");
    }
}
