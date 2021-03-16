package com.kata.service.impl;

import com.kata.domain.BerlinUhr;
import com.kata.domain.Lamp;
import com.kata.domain.enumeration.State;
import com.kata.service.BerlinUhrService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.Arrays;

@DisplayName("Berlin uhr service test")
class BerlinUhrServiceImplTest {

    private final String CORRECT_STRING_TIME = "10:00";
    private final LocalTime LOCAL_TIME = LocalTime.of(10, 00);

    @DisplayName("Convert String to time test")
    @Test
    public void convertStringToTimeShouldBeTrue() {
        BerlinUhrService berlinUhrService = new BerlinUhrServiceImpl();
        Assertions.assertTrue(berlinUhrService.convertStringToTime(CORRECT_STRING_TIME).equals(LOCAL_TIME));
    }

    @DisplayName("Convert time to berlin uhr")
    @Test
    public void convertTimeToBerlinUhrShouldBeTrue() {
        BerlinUhrService berlinUhrService = new BerlinUhrServiceImpl();
        BerlinUhr berlinUhr = new BerlinUhr(
                Arrays.asList(new Lamp(State.Y, 5), new Lamp(State.Y, 5), new Lamp(State.O, 0), new Lamp(State.O, 0)),
                Arrays.asList(new Lamp(State.O, 0), new Lamp(State.O, 0), new Lamp(State.O, 0), new Lamp(State.O, 0)),
                Arrays.asList(
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0),
                        new Lamp(State.O, 0)),
                Arrays.asList(new Lamp(State.O, 0), new Lamp(State.O, 0), new Lamp(State.O, 0), new Lamp(State.O, 0))
        );
        Assertions.assertTrue(berlinUhrService.convertTimeToBerlinUhr(LOCAL_TIME).equals(berlinUhr));
    }
}