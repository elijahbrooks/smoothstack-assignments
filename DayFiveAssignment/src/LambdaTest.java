import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author elijahbrooks
 */
class LambdaTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    /**
     * Setup to grab outputted message
     */
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Cleans up to do multiple tests
     */
    @BeforeEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    /**
     * test for isOdd method of Lambda class
     */
    @Test
    void isOdd() {
        Lambda.isOdd().accept(3);
        assertEquals("ODD", outContent.toString().trim());
    }

    /**
     * test for isPrime method of Lambda Class
     */
    @Test
    void isPrime() {
        Lambda.isPrime().accept(5);
        assertEquals("PRIME", outContent.toString().trim());
    }

    /**
     * test for isPalindrome method of Lambda Class
     */
    @Test
    void isPalindrome() {
        Lambda.isPalindrome().accept("racecar");
        assertEquals("PALINDROME", outContent.toString().trim());
    }
}