package com.ss.dayfour.assignmentone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonClassTest {
    @Test
    void getSingletonClass(){
        SingletonClass sc = SingletonClass.getInstance();
        assertEquals(sc, SingletonClass.getInstance());
    }
}