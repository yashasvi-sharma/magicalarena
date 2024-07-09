/**
 * The Main class creates two players and initiates a match in a MagicalArena.
 */
public class Main {
    // This Java code snippet is the main entry point of the program. It creates an instance of the
    // `MagicalArena` class and initiates a match between two players. The `main` method creates two
    // players using the `createPlayer` method with specified attributes like name, health, strength,
    // and attack values. These players are then passed to the `MagicalArena` constructor to set up the
    // match. Finally, the `playMatch` method is called on the `arena` object to start the match.
    public static void main(String[] args) {
        // The code snippet `MagicalArena arena = new MagicalArena(createPlayer("Player A", 50, 5, 10),
        // createPlayer("Player B", 100, 10, 5));` is creating an instance of the `MagicalArena` class
        // named `arena`. It is initializing a match between two players by calling the `createPlayer`
        // method twice to create two player objects with specific attributes such as name, health,
        // strength, and attack values. These player objects are then passed as arguments to the
        // constructor of the `MagicalArena` class to set up the match between them.
        MagicalArena arena = new MagicalArena(
                createPlayer("Player A", 50, 5, 10),
                createPlayer("Player B", 100, 10, 5)
        );
        arena.playMatch();
    }

    /**
     * The function creates a new Player object with the specified name, health, strength, and attack
     * values.
     * 
     * @param name The name of the player.
     * @param health The "health" parameter represents the initial health points of the player. It
     * indicates how much damage the player can sustain before being defeated.
     * @param strength The strength parameter typically represents the physical power or ability of the
     * player in a game. It can affect how much damage the player can deal in combat situations or how
     * well they can perform certain actions that require physical prowess.
     * @param attack The `attack` parameter typically represents the attack power or damage that a
     * player can inflict on opponents in a game. It is an important attribute that determines how
     * effective a player is in combat situations.
     * @return A new instance of the `Player` class with the provided `name`, `health`, `strength`, and
     * `attack` values is being returned.
     */
    private static Player createPlayer(String name, int health, int strength, int attack) {
        return new Player(name, health, strength, attack);
    }
}