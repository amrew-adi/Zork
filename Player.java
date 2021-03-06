
public class Player {
  //Internal variables
  int health;
  int maxHealth;
  int attack;
  int defence;
  boolean blessed;
  
  //Constructor
  public Player(){
    maxHealth = 15;
    health = maxHealth;
    attack = 3;
    defence = 3;
    blessed = false;
  }
  //No need for "static" when not in main class
  public void increaseHealth(int healthBoost){
    health = health + healthBoost;
    //If, after the healthBoost, the health is greater than the max health, then the health will be set to max health
    if(health > maxHealth){
      health = maxHealth;
    }
  }
  
  public void diagnose(){
    if(health == maxHealth){
      System.out.println("You are in perfect condition.");
    }
    else if(health >= 8 && health <= 12){
      System.out.println("You are in good condition; mild injuries have been sustained.");
    }
    else if(health >= 4 && health <=8){
      System.out.println("You are in moderate condition. Eating food would be advised.");
    }
    else if(health > 0 && health <= 4){
      System.out.println("You are in critical condition. Eating food would be greatly advised.");
    }
  }
}
