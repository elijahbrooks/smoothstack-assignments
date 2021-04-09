package com.ss.dayfour.assignmentthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author elijahbrooks
 */
class QueueListTest {

    @Test
    /**
     * testing constructor
     */
    void getInstance() {
        assertEquals(QueueList.getInstance(), QueueList.getInstance());
    }

    @Test
    /**
     * testing produce
     */
    void produce() throws InterruptedException {
        Integer size = QueueList.getInstance().getSize();
        QueueList.getInstance().produce();
        assertEquals(size + 1, QueueList.getInstance().getSize());
    }

    @Test
    /**
     * testing consume
     */
    void consume() throws InterruptedException {
        Integer size = QueueList.getInstance().getSize();
        QueueList.getInstance().consume();
        assertEquals(size - 1, QueueList.getInstance().getSize());
    }
}