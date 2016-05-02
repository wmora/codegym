package com.wmora.codegym.datastructures.linkedlists;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedList2Test {

    private SinglyLinkedList linkedList;

    @Before
    public void doBefore() {
        linkedList = new SinglyLinkedList();
    }

    @Test
    public void getNthToLastElementTest() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        Node secondToLast = linkedList.getNthToLast(2);

        assertEquals(4, secondToLast.getData());
    }

    @Test
    public void sizeTest() {
        assertEquals(0, linkedList.size());
    }

    @Test
    public void sizeTest2() {
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(1);

        assertEquals(3, linkedList.size());
    }

    @Test
    public void getTest() {
        linkedList.append(54);
        linkedList.append(32);

        assertEquals(54, linkedList.get(0).getData());
        assertEquals(32, linkedList.get(1).getData());
    }
}
