package com.bol.spock.sample

import spock.lang.Specification

class BasicSpock6Spec extends Specification {

    def "Don't need the [when:/then:]? Use [expect:] instead"() {
        Minion style = new Minion()

        expect:
        style.isCute()
    }
}
