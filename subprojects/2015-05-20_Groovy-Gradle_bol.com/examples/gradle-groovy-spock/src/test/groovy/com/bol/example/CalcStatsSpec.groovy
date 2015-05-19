package com.bol.example

import spock.lang.Specification
import spock.lang.Unroll

class CalcStatsSpec extends Specification {

    @Unroll
    def "Given a list of integers #input, return CalcStats [#expected]"() {
        StatisticsCalculator calc = new StatisticsCalculator()

        when:
        CalcStats stats = calc.calc(input)

        then:
        stats == expected
        Math.abs(stats.average - expected.average) <= 0.001

        where:
        input                  || expected
        [6, 9, 15, -2, 92, 11] || new CalcStats(-2, 92, 6, 21.833333)
        [1, 2, 3, 5, 7, 10]    || new CalcStats(1, 10, 6, 4.666666667)
        [-20, 0, 20]           || new CalcStats(-20, 20, 3, 0)
        []                     || new CalcStats(0, 0, 0, 0)
        null                   || new CalcStats(0, 0, 0, 0)
    }
}
