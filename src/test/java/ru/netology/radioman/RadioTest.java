package ru.netology.radioman;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/nextStation.csv")
    public void shouldNextStation(String test, int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setNextStation(newCurrentStation);
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevStation.csv")
    public void shouldPrevStation(String test, int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setPrevStation(newCurrentStation);
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userChoise.csv")
    public void shouldUserStation(String test, int userInstallation, int expected) {
        Radio radio = new Radio();

        radio.setUserStation(userInstallation);
        int actual = radio.getUserStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolume.csv")
    public void shouldIncreaseVolume(String test, int newVolume, int expected){
        Radio radio = new Radio();

        radio.setIncreaseVolume(newVolume);
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lowVolume.csv")
    public void shouldLowVolume(String test, int newVolume, int expected){
        Radio radio = new Radio();

        radio.setLowVolume(newVolume);
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}