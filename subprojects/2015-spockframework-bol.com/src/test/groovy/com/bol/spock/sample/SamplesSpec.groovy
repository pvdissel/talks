package com.bol.spock.sample

import spock.lang.Specification
import spock.lang.Unroll

class SamplesSpec extends Specification {
    // tag::slide1[]
    def 'A new stack is empty'() {
        def stack = new Stack()

        expect:
        stack.empty
    }
    // end::slide1[]

    // tag::slide2[]
    def 'Can push an element onto the stack'() {
        given: 'a new stack and element'
        def stack = new Stack()
        def element = 'push me'

        when: 'an element is pushed'
        stack.push(element)

        then: 'the stack has that element'
        !stack.empty
        stack.size() == 1
        stack.peek() == element
    }
    // end::slide2[]

    // tag::slide3[]
    def 'Pop from an empty stack throws EmptyStackException'() {
        def stack = new Stack()

        when:
        stack.pop()

        then:
        thrown(EmptyStackException)
        stack.empty
    }
    // end::slide3[]

    // tag::slide4[]
    def '''Pop from an empty stack throws EmptyStackException
           without a message'''() {
        def stack = new Stack()

        when:
        stack.pop()

        then:
        def e = thrown(EmptyStackException)
        !e.message
        stack.empty
    }
    // end::slide4[]

    // tag::slide5[]
    def 'Events are published to all subscribers'() {
        def subscriber1 = Mock(Subscriber)
        def subscriber2 = Mock(Subscriber)
        def publisher = new Publisher()
        publisher.add(subscriber1)
        publisher.add(subscriber2)

        when:
        publisher.fire("event")

        then:
        1 * subscriber1.receive("event")
        1 * subscriber2.receive(_ as String)
    }
    // end::slide5[]

    // tag::slide6[]
    @Unroll
    def 'The maximum of the numbers [#a] and [#b] is [#c]'() {
        expect:
        Math.max(a, b) == c

        where:
        a | b || c
        5 | 1 || 5
        3 | 9 || 9
    }
    // end::slide6[]

    // tag::slide7[]
    def 'Adding an item to a list increases the size by one'() {
        given: 'a list with one item'
        def names = ['Spock']

        when: 'adding one item to the list'
        names << 'Groovy'

        then: 'the list size increases by one'
        names.size() == old(names.size()) + 1
    }
    // end::slide7[]

    // tag::slide8[]
    def 'Subscriber thrown exception does not impact publisher'() {
        def subscriber1 = Mock(Subscriber)
        def subscriber2 = Mock(Subscriber)
        def publisher = new Publisher()
        publisher.add(subscriber1)
        publisher.add(subscriber1)
        publisher.add(subscriber2)

        when:
        publisher.fire('event')

        then:
        1 * subscriber1.receive('event')
        1 * subscriber1.receive(_) >> {
            throw new RuntimeException()
        }
        1 * subscriber2.receive(_ as String)
    }
    // end::slide8[]
}
