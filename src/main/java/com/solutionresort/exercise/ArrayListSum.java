package com.solutionresort.exercise;

import java.time.Instant;
import java.util.ArrayList;

public class ArrayListSum {

    public ArrayListSum() {
    }

    public void run() {
        Instant start = Instant.now();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        for (int i = 0; i < 1000000; i++) {
            arrayList.remove(i);
        }

        Instant end = Instant.now();

        System.out.println("Time Taken using ArrayList: " + (end.toEpochMilli() - start.toEpochMilli()));
    }
}
