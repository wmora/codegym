package com.wmora.codegym.datastructures.linkedlists;

class Node {

    private Node next;
    private int data;

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
