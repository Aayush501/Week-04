package org.regex;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ValidateAUsernameTest {
    // method to test the validateUsername method on valid usernames
    @ParameterizedTest
    @ValueSource(strings = {"aayush_123", "userAK_123", "User123_Ashu", "Iam_User_AKS"})
    public void validateUsernameValidNames(String test) {
        // defining a regex pattern to validate the username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        assertTrue(ValidateAUsername.isValidLicenseUsername(test, pattern));
    }

    // method to test the validateUsername method on invalid usernames
    @ParameterizedTest
    @ValueSource(strings = {"1aayush_123", "_userAK_123", "User123_Aayush_Shrivastav"})
    public void validateUsernameInValidNames(String test) {
        // defining a regex pattern to validate the username
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        // compiling the regex pattern
        Pattern pattern = Pattern.compile(regex);

        assertFalse(ValidateAUsername.isValidLicenseUsername(test, pattern));
    }
}