package com.wmora.codegym.datastructures.linkedlists;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedList1Test {

    @Test
    public void removeDuplicatesTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(4);
        list.append(4);
        list.append(4);
        list.append(4);
        list.append(4);
        list.append(4);

        list.removeDuplicates();

        assertEquals("4", list.toString());
    }

    @Test
    public void removeDuplicatesTest2() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(3);
        list.append(4);
        list.append(4);
        list.append(1);
        list.append(2);
        list.append(4);

        list.removeDuplicates();

        assertEquals("1 2 3 4", list.toString());
    }

    @Test
    public void removeDuplicatesTest3() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);

        list.removeDuplicates();

        assertEquals("1", list.toString());
    }

}
