package com.ss.dayfour;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * test for LineClass
 * @author elijahbrooks
 */
public class LineTest {
    @Test
    /**
     * test getSlope() method
     */
    void getSlope(){
        Line line = new Line(2, 3, 4, 5);
        assertEquals(1, line.getSlope());
    }

    /**
     * test getDistance
     */
    @Test
    void getDistance(){
        Line line = new Line(5, 3, 4, 5);
        assertEquals(2.236, line.getDistance(), .001);
    }

    /**
     * test parallelTo
     */
    @Test
    void parallelTo(){
        Line line = new Line(2, 3, 4, 5);
        Line line2 = new Line(5, 3, 4, 5);

        assertEquals(false, line.parallelTo(line2));
    }
}
