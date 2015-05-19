package com.bol.examples

import org.junit.Test

class GStringTest {

    @Test
    public void GString() {
        // tag::slide[]
        def val = 2
        assert 'c'.class == String
        assert "c".class == String
        assert "c${val}".class in GString
        // end::slide[]
    }
}
