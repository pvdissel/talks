package com.bol.examples

import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import org.junit.Test

class StringCharTest {

    @Test
    public void name() {
        // tag::slide[]
        // for single char strings, both are the same
        assert ((char) "c").class == Character
        assert ("c" as char).class == Character

        // for multi char strings they are not
        try {
            ((char) 'cx') == 'c'
            assert false: 'will fail - not castable'
        } catch (GroovyCastException e) {
        }
        assert ('cx' as char) == 'c'
        assert 'cx'.asType(char) == 'c'
        // end::slide[]
    }
}
