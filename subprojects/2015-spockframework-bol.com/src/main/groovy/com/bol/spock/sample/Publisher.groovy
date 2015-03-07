package com.bol.spock.sample

class Publisher {
    List<Subscriber> subscribers = []

    void add(Subscriber subscriber) {
        subscribers << subscriber
    }

    void fire(Object event) {
        subscribers.each {
            it.receive(event)
        }
    }
}
