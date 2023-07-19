package SOLIDPrinciples.V2;

import SOLIDPrinciples.V2.Bird;
import  SOLIDPrinciples.V2.Pigeon;
import  SOLIDPrinciples.V2.Sparrow;
import  SOLIDPrinciples.V2.Crow;

public class Client  {
    public static void main(String[] args) {

        Pigeon p = new Pigeon("pigeon","white",1);
        Sparrow s = new Sparrow ("sparrow","black",1);
        Crow c = new Crow("crow","black",1);


        p.playSound("pigeon", "white",1);
        s.playSound("sparrow", "white",1);
        c.playSound("crow", "white",1);






    }
}
