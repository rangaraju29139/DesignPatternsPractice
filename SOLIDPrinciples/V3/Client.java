package SOLIDPrinciples.V3;

public class Client  {
    public static void main(String[] args) {

        Pigeon p = new Pigeon("pigeon","white",1);
        Sparrow s = new Sparrow("sparrow","black",1);
        Crow c = new Crow("crow","black",1);


        p.playSound();
        s.playSound();
        c.playSound();






    }
}
