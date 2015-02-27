package com.bol.spock.sample;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BasicJUnitTest {

    @Test
    public void whenUsingJavaWithJUnitYouUseAsserts() {
        Minion style = new Minion();

        style.cute();

        Assert.assertTrue(style.isCute());
    }

    @Test
    public void whenUsingJavaWithJUnitYouWantToUseHamcrestAsserts() {
        Minion style = new Minion();

        style.cute();

        Assert.assertThat(style.isCute(), CoreMatchers.is(true));
    }

    @Test
    public void whenUsingJavaWithJUnitWithUseHamcrestAssertsYouStaticImport() {
        Minion style = new Minion();

        style.cute();

        assertThat(style.isCute(), is(true));
    }

    @Test
    public void whenUsingJavaWithJUnitYouOftenAddCommentsLike() {
        // given
        Minion style = new Minion();

        // when
        style.cute();

        // then
        assertThat(style.isCute(), is(true));
    }
}
