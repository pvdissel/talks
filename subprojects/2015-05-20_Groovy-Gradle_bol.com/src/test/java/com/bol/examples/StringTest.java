package com.bol.examples;

import org.junit.Test;

public class StringTest {

    @Test
    public void String() {
        // tag::slide[]
        int val = 2;
        assert "c".getClass() == String.class;
        assert false == "c${val}".equals("c2");
        assert true == ("c" + val).equals("c2");
        // end::slide[]
    }
}
