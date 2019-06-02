package com.bol.spock.sample

import spock.lang.Specification

// tag::slide[]
class FixtureMethods extends Specification {
    def setup() {}        // run before every feature method
    def cleanup() {}      // run after every feature method

    def setupSpec() {}    // run before the first feature method
    def cleanupSpec() {}  // run after the last feature method
}
// end::slide[]
