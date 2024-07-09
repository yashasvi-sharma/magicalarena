/**
 * The Player class represents a player with attributes such as name, health, strength, and attack.
 */
public class Player {
    private String name;
    private int health;
    private int strength;
    private int attack;

    // This is a constructor for the `Player` class in Java. It initializes a new `Player` object with
    // the provided values for `name`, `health`, `strength`, and `attack`. The constructor sets the
    // instance variables of the `Player` object to the values passed as arguments when a new `Player`
    // object is created.
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

   /**
    * The `getName` function in Java returns the value of the `name` variable.
    * 
    * @return The `name` variable is being returned.
    */
    public String getName() {
        return name;
    }

   /**
    * The getHealth function in Java returns the health value.
    * 
    * @return The `health` variable is being returned.
    */
    public int getHealth() {
        return health;
    }

    /**
     * The function sets the health value of an object to the specified value.
     * 
     * @param health The `health` parameter is an integer value representing the health of an entity.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * The `getStrength` function in Java returns the strength value of an object.
     * 
     * @return The method `getStrength()` is returning the value of the `strength` variable.
     */
    public int getStrength() {
        return strength;
    }

   /**
    * The function "getAttack" in Java returns the value of the "attack" variable.
    * 
    * @return The `attack` value is being returned.
    */
    public int getAttack() {
        return attack;
    }
}