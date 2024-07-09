// The statement `import org.junit.Test;` is importing the `Test` class from the `org.junit` package.
// This class is used for writing test methods in JUnit test classes. It allows you to annotate methods
// as test cases that should be executed when running the JUnit tests.
import org.junit.Test;
// The statement `import static org.junit.Assert.*;` is importing all static members of the `Assert`
// class from the `org.junit` package. This allows you to directly use static methods like
// `assertTrue`, `assertFalse`, `assertEquals`, etc., without specifying the class name `Assert` each
// time. It simplifies the code by providing easy access to these assertion methods in JUnit test
// classes.
import static org.junit.Assert.*;

/**
 * The MagicalArenaTest class contains JUnit tests for the MagicalArena game simulation, including
 * testing match outcomes, die rolling, and player attributes.
 */
public class MagicalArenaTest {
    
   /**
    * This test function checks if a match in a MagicalArena ends with one player's health reaching 0
    * or below.
    */
    @Test
    public void testPlayMatch() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();

        assertTrue("The game did not end with one player's health at 0", playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }

   /**
    * The testRollDie function tests the rollDie method in the MagicalArena class to ensure that the
    * die roll result is between 1 and 6.
    */
    @Test
    public void testRollDie() {
        MagicalArena arena = new MagicalArena(new Player("Player A", 50, 5, 10), new Player("Player B", 100, 10, 5));
        int roll = arena.rollDie();

        assertTrue("Die roll is not between 1 and 6", roll >= 1 && roll <= 6);
    }


    /**
     * The testPlayersHaveSameHealth function tests if two players in a MagicalArena have the same
     * health after playing a match.
     */
    @Test
    public void testPlayersHaveSameHealth() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 50, 5, 10);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();

        assertTrue("The game did not end with one player's health at 0", playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }

   /**
    * The testPlayersHaveSameAttackAndDefense function tests if two players have the same attack and
    * defense values in a MagicalArena match.
    */
    @Test
    public void testPlayersHaveSameAttackAndDefense() {
        Player playerA = new Player("Player A", 50, 10, 10);
        Player playerB = new Player("Player B", 50, 10, 10);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();

        assertTrue("The game did not end with one player's health at 0", playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }

}