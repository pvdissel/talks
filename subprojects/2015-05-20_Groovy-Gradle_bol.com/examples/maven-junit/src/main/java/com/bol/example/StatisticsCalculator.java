package com.bol.example;

import java.util.Collections;
import java.util.List;

public class StatisticsCalculator {
    public CalcStats calc(List<Integer> input) {
        return new CalcStats(
                Collections.min(input),
                Collections.max(input),
                input.size(),
                input.stream().reduce(0, (a, b) -> a + b) / new Integer(input.size()).doubleValue()
        );
    }
}
