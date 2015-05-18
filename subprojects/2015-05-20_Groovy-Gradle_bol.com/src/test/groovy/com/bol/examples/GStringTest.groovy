package com.bol.examples

import org.junit.Test

class GStringTest {

    @Test
    public void GString() {
        // tag::slide[]
        def val = 2
        assert 'c'.getClass() == String
        assert "c".getClass() == String
        assert "c${val}".getClass() in GString
        // end::slide[]
    }
}
