package com.ss.dayfour.assignmentthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueListTest {

    @Test
    void getInstance() {
        assertEquals(QueueList.getInstance(), QueueList.getInstance());
    }

    @Test
    void produce() throws InterruptedException {
        Integer size = QueueList.getInstance().getSize();
        QueueList.getInstance().produce();
        assertEquals(size + 1, QueueList.getInstance().getSize());
    }

    @Test
    void consume() throws InterruptedException {
        Integer size = QueueList.getInstance().getSize();
        QueueList.getInstance().consume();
        assertEquals(size - 1, QueueList.getInstance().getSize());
    }
}