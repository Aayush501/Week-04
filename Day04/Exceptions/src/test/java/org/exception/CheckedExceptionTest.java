package org.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckedExceptionTest {
    @Test
    void test() {
        assertEquals(14, 7+7);
    }
}