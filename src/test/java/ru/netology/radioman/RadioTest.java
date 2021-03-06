package ru.netology.radioman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/nextStation.csv")
    public void shouldSwitchToNextStation(String test, int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newCurrentStation);
        radio.setNextStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/prevStation.csv")
    public void shouldSwitchToPrevStation(String test, int newCurrentStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(newCurrentStation);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userChoise.csv")
    public void shouldSettingUserStation(String test, int userInstallation, int expected) {
        Radio radio = new Radio();

        radio.setUserStation(userInstallation);
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/increaseVolume.csv")
    public void shouldIncreaseVolume(String test, int newVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(newVolume);
        radio.setIncreaseVolume();
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/lowVolume.csv")
    public void shouldLowerVolume(String test, int newVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(newVolume);
        radio.setLowVolume();
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}