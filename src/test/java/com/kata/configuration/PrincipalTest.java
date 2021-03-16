package com.kata.configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Principal Test")
class PrincipalTest {

    @Test
    @DisplayName("Should be equals")
    public void shouldBeEquals() {
        String result = "Y Y O O \n" +
                        "Y O O O \n" +
                        "O O O O O O O O O O O \n" +
                        "Y O O O ";
        Principal principal = new Principal();
        Assertions.assertEquals(result, principal.run("11:01"));
    }

}