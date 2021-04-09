package com.ss.dayfour.assignmentone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author elijahbrooks
 */
class SingletonClassTest {
    @Test
    /**
     * test for singleton class
     */
    void getSingletonClass(){
        SingletonClass sc = SingletonClass.getInstance();
        assertEquals(sc, SingletonClass.getInstance());
    }
}