package com.bol.example

import spock.lang.Specification
import spock.lang.Unroll

class FizzBuzzTest extends Specification {

    @Unroll
    def "[#number] gives [Fizz] as it is a multiply of 3"() {
        List<String> result = new FizzBuzz().convert([number])

        expect:
        result.first() == 'Fizz'

        where:
        number << [3, 6, 9, 12, 18, 21]
    }

    @Unroll
    def "[#number] gives [Buzz] as it is a multiply of 5"() {
        List<String> result = new FizzBuzz().convert([number])

        expect:
        result.first() == 'Buzz'

        where:
        number << [5, 10, 20, 25, 35]
    }

    @Unroll
    def "[#number] gives [FizzBuzz] as it is a multiply of both 3 and 5"() {
        List<String> result = new FizzBuzz().convert([number])

        expect:
        result.first() == 'FizzBuzz'

        where:
        number << [15, 30, 45, 60, 75]
    }
}
