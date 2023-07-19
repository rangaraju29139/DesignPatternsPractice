package SOLIDPrinciples.V1;

/**
 * v1 of this bird class eliminate the srp violation in the previous version
 * as the playSount mentod changes only when new bird is added but not when the bird particular sound is changed.
 */
public class Bird  {

    String name;
    String color;
    int weight;


    public Bird(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void playSound(){
        if(name == "pigeon"){
            pigeonPlaySound();
        }else if(name == "sparrow"){
            sparrowPlaySound();
        }else if(name == "crow"){

            crowPlaySound();



        }
    }
    public void pigeonPlaySound(){
        System.out.println("playing pigeon sound");

    }
    public void sparrowPlaySound(){
        System.out.println("Playing sparrow sound");

    }
    public void crowPlaySound(){
        System.out.println("Playing crow sound");
    }

    public void eat(){
        System.out.println(name + "  is eating the food");
    }

    public void fly(){
        System.out.println(name + "is flying in the sky");
    }
}
