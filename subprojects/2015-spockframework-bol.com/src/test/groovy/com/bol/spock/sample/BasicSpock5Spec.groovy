package com.bol.spock.sample

import spock.lang.Specification

class BasicSpock5Spec extends Specification {

    def 'When using Groovy and Spock, tests read like well written prose'() {
        Minion style = new Minion()

        when:
        style.cute()

        then:
        style.isCute()
    }
}
