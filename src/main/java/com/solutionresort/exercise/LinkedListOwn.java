package com.solutionresort.exercise;

public class LinkedListOwn<T> {

    private Node head;

    public LinkedListOwn() {
    }

    /**
     * Insert at the beginning of the linked list
     *
     * @param value
     * @return new head
     */
    public Node insert(T value) {

        Node newNode = new Node<>(value, head);

        head = newNode;

        return newNode;
    }

    public String toString() {

        int i = 0;
        String output = "";

        while (head != null) {

            output = output.concat("Link: " + i + ", Value: " + head.getValue() + "\n");
            head = head.getNext();

            i++;
        }

        return output;
    }
}
