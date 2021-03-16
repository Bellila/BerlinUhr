package com.kata.service.impl;

import com.kata.domain.BerlinUhr;
import com.kata.domain.Lamp;
import com.kata.domain.enumeration.State;
import com.kata.service.BerlinUhrService;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class BerlinUhrServiceImpl implements BerlinUhrService {

    @Override
    public LocalTime convertStringToTime(String time) {
        return LocalTime.parse(time);
    }

    @Override
    public BerlinUhr convertTimeToBerlinUhr(LocalTime localTime) {
        BerlinUhr result = new BerlinUhr(
                getFirstRow(localTime),
                getSecondRow(localTime),
                getThirdRow(localTime),
                getFourthRow(localTime)
        );
        return result;
    }

    @Override
    public String convertBerlinUhrToString(BerlinUhr berlinUhr) {
        StringBuilder result = new StringBuilder();
        for (Lamp lamp: berlinUhr.getRow_1()){
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp: berlinUhr.getRow_2()){
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp: berlinUhr.getRow_3()){
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp: berlinUhr.getRow_4()){
            result.append(lamp.getState()).append(" ");
        }
        return result.toString();
    }

    private List<Lamp> getFirstRow(LocalTime localTime) {
        List<Lamp> result = new ArrayList<>();
        int numberOfLampsLit = getNumberOfLampsLitForFirstRow(localTime);
        for (int i = 1; i <= 4; i++) {
            if (i >= 0 && i <= numberOfLampsLit) {
                result.add(new Lamp(State.Y, 5));
            } else {
                result.add(new Lamp(State.O, 0));
            }
        }
        return result;
    }

    private List<Lamp> getSecondRow(LocalTime localTime) {
        List<Lamp> result = new ArrayList<>();
        int numberOfLampsLit = getNumberOfLampsLitForSecondRow(localTime);
        for (int i = 1; i <= 4; i++) {
            if (i >= 0 && i <= numberOfLampsLit) {
                result.add(new Lamp(State.Y, 1));
            } else {
                result.add(new Lamp(State.O, 0));
            }
        }
        return result;
    }

    private List<Lamp> getThirdRow(LocalTime localTime) {
        List<Lamp> result = new ArrayList<>();
        int numberOfLampsLit = getNumberOfLampsLitForThirdRow(localTime);
        for (int i = 1; i <= 11; i++) {
            if (i >= 0 && i <= numberOfLampsLit) {
                if (i % 3 != 0){
                    result.add(new Lamp(State.Y, 5));
                } else {
                    result.add(new Lamp(State.R, 5));
                }
            } else {
                result.add(new Lamp(State.O, 0));
            }
        }
        return result;
    }

    private List<Lamp> getFourthRow(LocalTime localTime) {
        List<Lamp> result = new ArrayList<>();
        int numberOfLampsLit = getNumberOfLampsLitForFourthRow(localTime);
        for (int i = 1; i <= 4; i++) {
            if (i >= 0 && i <= numberOfLampsLit) {
                result.add(new Lamp(State.Y, 1));
            } else {
                result.add(new Lamp(State.O, 0));
            }
        }
        return result;
    }

    private int getNumberOfLampsLitForFirstRow(LocalTime localTime) {
        return localTime.getHour() / 5;
    }

    private int getNumberOfLampsLitForSecondRow(LocalTime localTime) {
        return localTime.getHour() % 5;
    }

    private int getNumberOfLampsLitForThirdRow(LocalTime localTime) {
        return localTime.getMinute() / 5;
    }

    private int getNumberOfLampsLitForFourthRow(LocalTime localTime) {
        return localTime.getMinute() % 5;
    }
}
