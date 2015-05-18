package com.bol.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalcStatsTest {

    private List<Integer> input;
    private int min;
    private int max;
    private int count;
    private double avg;

    public CalcStatsTest(List<Integer> input, int min, int max, int count, double avg) {
        this.input = input;
        this.min = min;
        this.max = max;
        this.count = count;
        this.avg = avg;
    }

    @Test
    public void GivenAListOfIntegersReturnCalcStats() {
        // when
        StatisticsCalculator calc = new StatisticsCalculator();
        CalcStats stats = calc.calc(input);

        // then
        assertEquals(min, stats.getMinimum());
        assertEquals(max, stats.getMaximum());
        assertEquals(count, stats.getCount());
        assertEquals(avg, stats.getAverage(), 0.001);
    }

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(
                new Object[][]{
                        {Arrays.asList(6, 9, 15, -2, 92, 11), -2, 92, 6, 21.833333},
                        {Arrays.asList(1, 2, 3, 5, 7, 10), 1, 10, 6, 4.666666667},
                        {Arrays.asList(-20, 0, 20), -20, 20, 3, 0},
                }
        );
    }
}
