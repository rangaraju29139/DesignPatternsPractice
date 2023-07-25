package hfdp.Game;

public class Character {
   WeaponBehaviors w;

   public Character(){
       System.out.println("default constructor of Character");
   }
   public Character(WeaponBehaviors w){
    this.w = w;
   }

   public void setWeapon(WeaponBehaviors w){
       this.w = w;
   }
   public void performShooting(){
       w.shoot();
   }

}
