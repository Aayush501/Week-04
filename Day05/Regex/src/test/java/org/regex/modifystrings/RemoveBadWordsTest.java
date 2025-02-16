package org.regex.modifystrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveBadWordsTest {
    // testing the replaceSpaces method
    @Test
    public void removeBadWord() {
        // performing the tests on multiple testcases
        String test1 = "That guy is really stupid" ;
        String test2 = "That's damn wrong" ;

        // performing tests
        assertEquals("That guy is really ****", RemoveBadWords.removeBadWord(test1));
        assertEquals("That's **** wrong", RemoveBadWords.removeBadWord(test2));
    }}