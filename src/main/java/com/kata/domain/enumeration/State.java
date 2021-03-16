package com.kata.domain.enumeration;

import com.kata.configuration.exception.BerlinUhrException;
import com.kata.configuration.exception.ExceptionConstants;

import java.util.Arrays;
import java.util.Optional;

public enum State {

    Y("Y"),
    R("R"),
    O("O");

    private String value;

    State(String value) {
        this.value = value;
    }

    public static State get(String value) {

        Optional<State> optionalState = Arrays.stream(values())
                .filter(state -> state.value.equals(value))
                .findFirst();
        if (optionalState.isPresent()) {
            return optionalState.get();
        } else {
            throw new BerlinUhrException(ExceptionConstants.INVALID_STATE_VALUE);
        }
    }

    public static String getValue(State state) {
        return state.value;
    }

}
