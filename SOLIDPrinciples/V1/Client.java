package SOLIDPrinciples.V1;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Bird("sparrow","black",1);
        Bird b2 = new Bird("pigeon","white",1);
        Bird b3 = new Bird("crow","black",1);


        b1.playSound();
        b2.playSound();
        b3.playSound();


        b1.fly();;
        b2.fly();;
        b3.fly();;

        b1.eat();
        b2.eat();
        b3.eat();;





    }
}
