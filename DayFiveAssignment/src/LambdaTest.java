import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @BeforeEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void isOdd() {
        Lambda.isOdd().accept(3);
        assertEquals("ODD", outContent.toString().trim());
    }

    @Test
    void isPrime() {
        Lambda.isPrime().accept(5);
        assertEquals("PRIME", outContent.toString().trim());
    }

    @Test
    void isPalindrome() {
        Lambda.isPalindrome().accept("racecar");
        assertEquals("PALINDROME", outContent.toString().trim());
    }
}