package com.kata.service;

import com.kata.domain.BerlinUhr;

import java.time.LocalTime;

public interface BerlinUhrService {

    LocalTime convertStringToTime(String time);

    BerlinUhr convertTimeToBerlinUhr(LocalTime localTime);

    String convertBerlinUhrToString (BerlinUhr berlinUhr);
}
