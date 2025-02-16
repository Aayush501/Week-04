package org.regex.modifystrings;

import org.junit.jupiter.api.Test;
import org.regex.LicensePlateNumber;

import static org.junit.jupiter.api.Assertions.*;

class MultipleSpaceReplacementTest {
    // testing the replaceSpaces method
    @Test
    public void replaceSpaces() {
        // performing the tests on multiple testcases
        String test1 = "My   name    is    Aayush" ;
        String test2 = "I am       a     Java developer" ;
        String test3 = "I    am an     engineer." ;

        // performing tests
        assertEquals("My name is Aayush", MultipleSpaceReplacement.replaceSpaces(test1));
        assertEquals("I am a Java developer", MultipleSpaceReplacement.replaceSpaces(test2));
        assertEquals("I am an engineer.", MultipleSpaceReplacement.replaceSpaces(test3));
    }
}