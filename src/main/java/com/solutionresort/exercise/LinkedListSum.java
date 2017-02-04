package com.solutionresort.exercise;

import java.time.Instant;
import java.util.LinkedList;

public class LinkedListSum {

    public LinkedListSum() {
    }

    public void run() {
        Instant start = Instant.now();

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.addFirst(i);
        }

        for (int i = 0; i < 1000000; i++) {
            linkedList.remove();
        }

        Instant end = Instant.now();

        System.out.println("Time Taken using LinkedList: " + (end.toEpochMilli() - start.toEpochMilli()));
    }
}
