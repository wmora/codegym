package com.wmora.codegym.datastructures.linkedlists;

/**
 * Write code to remove duplicates from an unsorted linked list
 */
public class SinglyLinkedList {

    private Node head;

    public SinglyLinkedList() {
    }

    void append(int data) {
        Node tail = new Node(data);
        if (head == null) {
            head = tail;
            return;
        }
        Node n = head;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        n.setNext(tail);
    }

    /**
     * Removes all duplicates of this list
     */
    void removeDuplicates() {
        Node n = head;
        while (n != null) {
            remove(n, n.getData());
            n = n.getNext();
        }
    }

    /**
     * Removes all occurrences of data from the given node (exclusive)
     *
     * @param node
     * @param data
     */
    private void remove(Node node, int data) {
        if (node.getNext() == null) {
            return;
        }
        if (node.getNext().getData() == data) {
            node.setNext(node.getNext().getNext());
            remove(node, data);
        } else {
            remove(node.getNext(), data);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node n = head;
        while (n != null) {
            builder.append(n.getData());
            if (n.getNext() != null) {
                builder.append(" ");
            }
            n = n.getNext();
        }
        return builder.toString();
    }
}
