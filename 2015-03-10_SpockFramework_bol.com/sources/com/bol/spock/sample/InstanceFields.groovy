package com.bol.spock.sample

import spock.lang.Shared
import spock.lang.Specification

// tag::instance[]
class InstanceFields extends Specification {
    def obj = new ClassUnderSpecification()
    def coll = new Collaborator()
}
// end::instance[]

// tag::shared[]
class SharedFields extends Specification {
    @Shared
    def res = new VeryExpensiveResource()
}
// end::shared[]

// tag::static[]
class StaticFields extends Specification {
    static final PI = 3.141592654
}
// end::static[]

class ClassUnderSpecification {}

class Collaborator {}

class VeryExpensiveResource {}
