package hfdp.Game;

public class Client {
    public static void main(String[] args) {
        Character c = new Character(new Ak47());
        c.performShooting();

        Character captain = new Captain();
        captain.performShooting();

        captain.setWeapon(new Granade());
        captain.performShooting();

    }
}
