// The statement `import org.junit.Test;` is importing the `Test` class from the `org.junit` package.
// This class is typically used in JUnit test classes to define test methods. It is used to annotate
// methods that should be executed as tests by the JUnit test runner.
import org.junit.Test;
// The statement `import java.io.ByteArrayOutputStream;` is importing the `ByteArrayOutputStream` class
// from the `java.io` package. This class provides an output stream that writes data to a byte array.
// In the context of the code snippet provided, it is used to capture the output that would normally be
// printed to the console when running the `Main` class, allowing the test to verify the output
// produced by the program.
import java.io.ByteArrayOutputStream;
// The statement `import java.io.PrintStream;` is importing the `PrintStream` class from the `java.io`
// package. This class provides functionality to output data to various output streams, such as the
// console or a file. In the context of the code snippet provided, it is used to redirect the standard
// output stream (System.out) to capture the output produced by the `Main` class during testing.
import java.io.PrintStream;

// The statement `import static org.junit.Assert.assertTrue;` is importing the `assertTrue` method from
// the `Assert` class in the `org.junit` package statically. This allows you to use the `assertTrue`
// method directly in your code without specifying the class name `Assert` each time.
import static org.junit.Assert.assertTrue;

/**
 * This Java test class redirects and restores the standard output stream to capture and verify output
 * during the execution of the Main class.
 */
public class MainTest {
    private ByteArrayOutputStream out;
    private PrintStream originalOut;

    /**
     * The testMain function redirects the system output, runs the Main class main method, checks for
     * specific output messages, and then restores the system output.
     */
    @Test
    public void testMain() {
        redirectSystemOut();
        Main.main(new String[0]);
        restoreSystemOut();

        String output = out.toString();
        assertTrue("Players did not attack each other", output.contains("attacks"));
        assertTrue("Match did not end", output.contains("wins!"));
    }

    /**
     * The `redirectSystemOut` function redirects the standard output stream to a
     * `ByteArrayOutputStream`.
     */
    private void redirectSystemOut() {
        out = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(out));
    }

    /**
     * The `restoreSystemOut` function sets the standard output stream back to its original value.
     */
    private void restoreSystemOut() {
        System.setOut(originalOut);
    }
}