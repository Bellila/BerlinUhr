package com.kata.domain;

import com.kata.domain.enumeration.State;

import java.util.Objects;

public class Lamp {

    private State state;
    private int value;

    public Lamp() {
        this.state = State.O;
        this.value = 0;
    }

    public Lamp(State state, int value) {
        this.state = state;
        this.value = value;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lamp lamp = (Lamp) o;
        return value == lamp.value &&
                state == lamp.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, value);
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "state=" + state +
                ", value=" + value +
                '}';
    }
}
