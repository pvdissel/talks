package com.bol.spock.sample

import org.junit.Test
import spock.lang.Specification

import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat

/**
 * Switched from .java to .groovy
 * Now is a Spock Specification
 */
public class BasicSpock1Spec extends Specification {

    @Test
    public void spockListensNotToTestAnnotation() {
        // given
        Minion style = new Minion();

        // when
        style.cute();

        // then
        assertThat(style.isCute(), is(true));
    }
}
