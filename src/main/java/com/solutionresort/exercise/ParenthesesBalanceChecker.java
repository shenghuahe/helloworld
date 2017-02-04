package com.solutionresort.exercise;

import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParenthesesBalanceChecker {

    private static final List<Character> PARENTHESES = Arrays.asList('{', '}', '[', ']', '(', ')');
    private static final Map<Character, Character> PARENTHESES_COUNTER_PART = Collections.unmodifiableMap(
        Stream.of(
            new SimpleEntry<>('}', '{'),
            new SimpleEntry<>(']', '['),
            new SimpleEntry<>(')', '(')
        ).collect(
            Collectors.toMap(
                SimpleEntry::getKey,
                SimpleEntry::getValue)
        )
    );

    public ParenthesesBalanceChecker() {
    }

    public boolean check(String code) {

        Stack<Character> stack = new Stack<>();

        code.chars()
            .mapToObj(i -> (char) i)
            .forEach(
                c -> {
                    if (PARENTHESES.contains(c)) {

                        if (stack.empty()) {
                            stack.add(c);
                        } else if (stack.peek().equals(PARENTHESES_COUNTER_PART.get(c))) {
                            stack.pop();
                        } else {
                            stack.add(c);
                        }
                    }
                }
            );

        return stack.isEmpty();
    }
}
