package com.bol.spock.sample

import spock.lang.Specification

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

public class BasicSpock2Spec extends Specification {

    public void spockOnlyFindsMethodsWithAThenLabelAsTest() {
        given:
        Minion style = new Minion();

        when:
        style.cute();

        then:
        assertThat(style.isCute(), is(true));
    }
}
