package org.regex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class LicensePlateNumberTest {
    // testing the isValidLicensePlateNumber method for valid license plate numbers
    @ParameterizedTest
    @ValueSource(strings = {"AB1234", "CD3456", "EF5678"})
    public void isValidLicensePlateNumber_ValidTest(String test) {
        // defining a regex pattern to validate the license plate number
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // performing the tests
        assertTrue(LicensePlateNumber.isValidLicensePlateNumber(test, pattern));
    }

    // testing the isValidLicensePlateNumber method for invalid license plate numbers
    @ParameterizedTest
    @ValueSource(strings = {"A01234", "CD34AB", "5678AB"})
    public void isValidLicensePlateNumber_InvalidTest(String test) {
        // defining a regex pattern to validate the license plate number
        String regex = "^[A-Z]{2}[0-9]{4}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        // performing the tests
        assertFalse(LicensePlateNumber.isValidLicensePlateNumber(test, pattern));
    }
}