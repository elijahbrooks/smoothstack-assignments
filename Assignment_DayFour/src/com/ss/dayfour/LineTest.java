package com.ss.dayfour;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LineTest {
    @Test
    void getSlope(){
        Line line = new Line(2, 3, 4, 5);
        assertEquals(1, line.getSlope());
    }

    @Test
    void getDistance(){
        Line line = new Line(5, 3, 4, 5);
        assertEquals(2.236, line.getDistance(), .001);
    }

    @Test
    void parallelTo(){
        Line line = new Line(2, 3, 4, 5);
        Line line2 = new Line(5, 3, 4, 5);

        assertEquals(false, line.parallelTo(line2));
    }
}
