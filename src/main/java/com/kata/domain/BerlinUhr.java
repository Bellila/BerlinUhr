package com.kata.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BerlinUhr {

    private List<Lamp> row_1;
    private List<Lamp> row_2;
    private List<Lamp> row_3;
    private List<Lamp> row_4;

    public BerlinUhr() {
        this.row_1 = new ArrayList<Lamp>(4);
        this.row_2 = new ArrayList<Lamp>(4);
        this.row_3 = new ArrayList<Lamp>(11);
        this.row_4 = new ArrayList<Lamp>(4);
    }

    public BerlinUhr(List<Lamp> row_1, List<Lamp> row_2, List<Lamp> row_3, List<Lamp> row_4) {
        this.row_1 = row_1;
        this.row_2 = row_2;
        this.row_3 = row_3;
        this.row_4 = row_4;
    }

    public List<Lamp> getRow_1() {
        return row_1;
    }

    public void setRow_1(List<Lamp> row_1) {
        this.row_1 = row_1;
    }

    public List<Lamp> getRow_2() {
        return row_2;
    }

    public void setRow_2(List<Lamp> row_2) {
        this.row_2 = row_2;
    }

    public List<Lamp> getRow_3() {
        return row_3;
    }

    public void setRow_3(List<Lamp> row_3) {
        this.row_3 = row_3;
    }

    public List<Lamp> getRow_4() {
        return row_4;
    }

    public void setRow_4(List<Lamp> row_4) {
        this.row_4 = row_4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BerlinUhr berlinUhr = (BerlinUhr) o;
        return Objects.equals(row_1, berlinUhr.row_1) &&
                Objects.equals(row_2, berlinUhr.row_2) &&
                Objects.equals(row_3, berlinUhr.row_3) &&
                Objects.equals(row_4, berlinUhr.row_4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row_1, row_2, row_3, row_4);
    }

    @Override
    public String toString() {
        return "BerlinUhr{" +
                "row_1=" + row_1 +
                ", row_2=" + row_2 +
                ", row_3=" + row_3 +
                ", row_4=" + row_4 +
                '}';
    }
}
