package com.kata.configuration;

import com.kata.domain.BerlinUhr;
import com.kata.domain.Lamp;
import com.kata.service.impl.BerlinUhrServiceImpl;

public class Principal {

    private BerlinUhrServiceImpl berlinUhrService = new BerlinUhrServiceImpl();

    public String run(String time) {
        BerlinUhr berlinUhr = berlinUhrService.
                convertTimeToBerlinUhr(
                        berlinUhrService.convertStringToTime(time)
                );
        StringBuilder result = new StringBuilder();
        for (Lamp lamp : berlinUhr.getRow_1()) {
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp : berlinUhr.getRow_2()) {
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp : berlinUhr.getRow_3()) {
            result.append(lamp.getState()).append(" ");
        }
        result.append("\n");
        for (Lamp lamp : berlinUhr.getRow_4()) {
            result.append(lamp.getState()).append(" ");
        }
        return result.toString();
    }
}
