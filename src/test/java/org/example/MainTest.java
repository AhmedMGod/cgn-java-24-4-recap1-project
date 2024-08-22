package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void isThePassword8CharacterLong() {

        // GIVEN
        String expected = "12345678";

        // WHEN
        String actual = "87654321";

        // THEN
        assertEquals(expected.length(), actual.length());

    }

    @Test
    void isANumberInThePassword() {

        // GIVEN
        String expected = "123456789";

        // WHEN
        String actual = "987654321";

        // THEN
        assertEquals(String.valueOf(expected.contains("6")), String.valueOf(actual.contains("6")));

    }

    @Test
    void isThePasswordinUpperCase() {

        // GIVEN

        // WHEN

        // THEN

    }

    @Test
    void commonlyUsedPassword() {

        // GIVEN

        // WHEN

        // THEN

    }
}