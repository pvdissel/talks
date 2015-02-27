package com.bol.spock.sample

import spock.lang.Specification

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

public class BasicSpock3Spec extends Specification {

    public void inGroovySemicolonsAreOptionalSoBeGone() {
        given:
        Minion style = new Minion()

        when:
        style.cute()

        then:
        assertThat(style.isCute(), is(true))
    }
}
