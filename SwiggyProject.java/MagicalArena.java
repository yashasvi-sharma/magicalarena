/**
 * The `MagicalArena` class simulates a match between two players by taking turns attacking and
 * defending until one player's health reaches zero.
 */
public class MagicalArena {
    private Player playerA;
    private Player playerB;

    // The `public MagicalArena(Player playerA, Player playerB)` constructor in the `MagicalArena`
    // class is initializing the `playerA` and `playerB` instance variables of the class with the
    // Player objects passed as arguments to the constructor. This allows the `MagicalArena` object to
    // have references to the two players involved in the match, which are needed for simulating the
    // match in the `playMatch()` method.
    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    /**
     * The `playMatch` function simulates a match between two players, alternating between attacking
     * and defending until one player's health drops to zero.
     */
    public void playMatch() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            int attackRoll = rollDie();
            int defendRoll = rollDie();

            int attackDamage = attacker.getAttack() * attackRoll;
            int defendStrength = defender.getStrength() * defendRoll;

            int damageDealt = Math.max(0, attackDamage - defendStrength);
            defender.setHealth(defender.getHealth() - damageDealt);

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damageDealt + " damage. " + defender.getName() + " health: " + defender.getHealth());

            // Switch roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.getHealth() <= 0) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("Player A wins!");
        }
    }

    /**
     * The function "rollDie" returns a random integer between 1 and 6, simulating the roll of a
     * six-sided die.
     * 
     * @return A random integer between 1 and 6, inclusive.
     */
    int rollDie() {
        return (int) (Math.random() * 6) +1;
    }
}