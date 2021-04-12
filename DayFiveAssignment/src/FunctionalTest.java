import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author elijahbrooks
 */
class FunctionalTest{

    /**
     * testing rightDigit method of Functional class
     */
    @Test
    void rightDigit() {
        Integer[] array = {1, 22, 93};
        Integer[] arrayExpected = {1, 2, 3};

        Integer[] array2 = {16, 8, 886, 8, 1};
        Integer[] array2Expected = {6, 8, 6, 8, 1};

        Integer[] array3 = {10, 0};
        Integer[] array3Expected = {0, 0};

        assertArrayEquals(arrayExpected, Functional.rightDigit(array));
        assertArrayEquals(array2Expected, Functional.rightDigit(array2));
        assertArrayEquals(array3Expected, Functional.rightDigit(array3));
    }

    /**
     * Testing doubling method of Functional Class
     */

    @Test
    void doubling() {
        Integer[] array = {1, 2, 3};
        Integer[] arrayExpected = {2, 4, 6};

        Integer[] array2 = {6, 8, 6, 8, -1};
        Integer[] array2Expected = {12, 16, 12, 16, -2};

        Integer[] array3 = {};
        Integer[] array3Expected = {};

        assertArrayEquals(arrayExpected, Functional.doubling(array));
        assertArrayEquals(array2Expected, Functional.doubling(array2));
        assertArrayEquals(array3Expected, Functional.doubling(array3));
    }

    /**
     * Testing noX method of Functional Class
     */
    @Test
    void noX() {

        String[] array = {"ax", "bb", "cx"};
        String[] arrayExpected = {"a", "bb", "c"};

        String[] array2 = {"xxax", "xbxbx", "xxcx"};
        String[] array2Expected = {"a", "bb", "c"};

        String[] array3 = {"x"};
        String[] array3Expected = {""};

        assertArrayEquals(arrayExpected, Functional.noX(array));
        assertArrayEquals(array2Expected, Functional.noX(array2));
        assertArrayEquals(array3Expected, Functional.noX(array3));

    }
}