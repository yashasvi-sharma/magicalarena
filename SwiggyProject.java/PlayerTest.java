
// The line `import org.junit.Test;` in Java is importing the `Test` annotation from the `org.junit`
// package. This annotation is used in JUnit test classes to mark methods as test cases that should be
// executed by the test runner.
import org.junit.Test;
// The line `import static org.junit.Assert.*;` in Java is used to import all static methods from the
// `Assert` class in the `org.junit` package. This allows you to directly use static assertion methods
// like `assertEquals`, `assertTrue`, `assertFalse`, etc., without having to prefix them with the class
// name `Assert`.
import static org.junit.Assert.*;

/**
 * The `PlayerTest` class contains test methods to validate the getters, setters, and behavior of the
 * `Player` class in Java.
 */
public class PlayerTest {
    
/**
 * The testGettersAndSetters function tests the getters and setters of a Player class in Java.
 */
    @Test
    public void testGettersAndSetters() {
        Player player = new Player("Player A", 50, 5, 10);

        // Test initial values
        assertEquals("Player A", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());

        // Test setters
        player.setHealth(20);
        assertEquals(20, player.getHealth());

    }

/**
 * The testNegativeHealth function tests setting a negative health value for a player object in Java.
 */
    @Test
    public void testNegativeHealth() {
        Player player = new Player("Player A", 50, 5, 10);

        player.setHealth(-10);
        assertEquals(-10, player.getHealth());
    }

/**
 * This test case checks if a player's health can be set to zero.
 */
    @Test
    public void testZeroHealth() {
        Player player = new Player("Player A", 50, 5, 10);

        player.setHealth(0);
        assertEquals(0, player.getHealth());
    }

/**
 * The testUpdateHealth function tests the setHealth method of the Player class in Java.
 */
    @Test
    public void testUpdateHealth() {
        Player player = new Player("Player A", 50, 5, 10);

        player.setHealth(30);
        assertEquals(30, player.getHealth());

        player.setHealth(60);
        assertEquals(60, player.getHealth());
    }

// This part of the code is a test method named `testHealthBoundaryValues` within the `PlayerTest`
// class. It is testing the behavior of the `setHealth` method of the `Player` class when extreme
// boundary values are passed as arguments.
    @Test
    public void testHealthBoundaryValues() {
        Player player = new Player("Player A", 50, 5, 10);

        player.setHealth(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, player.getHealth());

        player.setHealth(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, player.getHealth());
    }

    

}
