package com.bol.spock.sample

import spock.lang.Specification

class HelperMethods extends Specification {
    def shop = new Shop()

    // tag::slide[]
    def 'Offered PC matches preferred configuration'() {
        when:
        def pc = shop.buyPc()

        then:
        matchesPreferredConfiguration(pc)
    }

    void matchesPreferredConfiguration(PC pc) {
        assert pc.vendor == 'Sunny'
        assert pc.clockRate >= 2333
        assert pc.ram >= 4096
        assert pc.os == 'Linux'
    }
    // end::slide[]
}

class Shop {
    PC buyPc() {
        new PC(
                vendor: "Sunny",
                clockRate: 2333,
                ram: 4096,
                os: "Linux",
        )
    }
}

class PC {
    String vendor
    int clockRate
    int ram
    String os
}
