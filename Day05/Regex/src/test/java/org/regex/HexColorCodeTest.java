package org.regex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class HexColorCodeTest {
    // testing the isValidHexCode method for invalid hex codes
    @ParameterizedTest
    @ValueSource(strings = {"#abc123", "#123abc", "#A1B2C3"})
    public void isValidLicense_ValidTests(String test) {
        // defining a regex pattern to validate the Hex color code
        String regex = "^#[a-fA-F0-9]{6}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // performing test
        assertTrue(HexColorCode.isValidHexCode(test, pattern));
    }

    // testing the isValidHexCode method for invalid hex codes
    @ParameterizedTest
    @ValueSource(strings = {"#abc", "#123", "#ABC", "123", "ABC123", "123abc"})
    public void isValidLicense_InvalidTests(String test) {
        // defining a regex pattern to validate the Hex color code
        String regex = "^#[a-fA-F0-9]{6}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // performing test
        assertFalse(HexColorCode.isValidHexCode(test, pattern));
    }
}