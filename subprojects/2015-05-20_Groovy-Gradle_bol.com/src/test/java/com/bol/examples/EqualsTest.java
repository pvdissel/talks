package com.bol.examples;

import org.junit.Test;

public class EqualsTest {

    @Test
    public void String() {
        // tag::slide[]
        String a = new String("a");
        String b = new String("a");
        assert a != b;
        assert a.equals(b) == true;
        // end::slide[]
    }
}
