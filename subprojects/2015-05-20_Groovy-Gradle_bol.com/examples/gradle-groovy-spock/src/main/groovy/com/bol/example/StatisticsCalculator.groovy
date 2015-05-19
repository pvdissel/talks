package com.bol.example

class StatisticsCalculator {
    CalcStats calc(List<Integer> input) {
        if (!input) {
            return new CalcStats(0, 0, 0, 0)
        }
        new CalcStats(
                input.min(),
                input.max(),
                input.size(),
                input.sum() / input.size()
        )
    }
}
