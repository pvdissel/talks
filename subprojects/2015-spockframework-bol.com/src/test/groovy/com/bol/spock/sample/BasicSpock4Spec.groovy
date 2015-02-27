package com.bol.spock.sample

import spock.lang.Specification

public class BasicSpock4Spec extends Specification {

    public void spockAutoAssertsEveryLineAfterTheThenLabel() {
        given:
        Minion style = new Minion()

        when:
        style.cute()

        then:
        style.isCute()
    }
}
