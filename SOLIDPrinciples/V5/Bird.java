package SOLIDPrinciples.V5;

/**
 * v1 of this bird class eliminate the srp violation in the previous version
 * as the playSount mentod changes only when new bird is added but not when the bird particular sound is changed.
 */
public abstract class Bird {

    String name;
    String color;
    int weight;


    public Bird(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }


    abstract void eat(String name, String color, int weight);



}
