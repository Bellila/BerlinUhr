package com.kata.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("String time validator test")
class StringTimeValidatorTest {

    @Test
    @DisplayName("Should be true")
    public void shouldBeTrue() {
        Assertions.assertTrue(StringTimeValidator.validate("10:10"));
    }

    @Test
    @DisplayName("Should be false")
    public void shouldBeFalse() {
        Assertions.assertFalse(StringTimeValidator.validate("30:10"));
    }

}