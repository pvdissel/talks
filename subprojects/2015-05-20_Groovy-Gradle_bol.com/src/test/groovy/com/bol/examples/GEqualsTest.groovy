package com.bol.examples

import org.junit.Test

public class GEqualsTest {

    @Test
    public void String() {
        // tag::slide[]
        String a = new String("a")
        String b = new String("a")
        assert a == b
        assert true == a.equals(b)
        assert false == a.is(b)
        // end::slide[]
    }
}
