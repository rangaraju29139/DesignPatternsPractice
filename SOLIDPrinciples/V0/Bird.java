package SOLIDPrinciples.V0;

public class Bird {

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
            System.out.println("playing pigeon sound");
        }else if(name == "sparrow"){
            System.out.println("Playing sparrow sound");
        }else if(name == "crow"){
            System.out.println("Playing crow sound");
        }
    }

    public void eat(){
        System.out.println(name + "  is eating the food");
    }

    public void fly(){
        System.out.println(name + "is flying in the sky");
    }
}
