package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSwitchResetToMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;

        int actual = radio.nextStation();


        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        int expected = 4;

        int actual = radio.nextStation();


        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchResetToMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;

        int actual = radio.previousStation();

        assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        int expected = 5;

        int actual = radio.previousStation();

        assertEquals(expected, actual);
    }

    @Test
    public void  shouldSwitchStationManually() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.manualStation(9);
        int expected = 9;


        assertEquals(expected, actual);

    }
    @Test
    public void  shouldSwitchStationManuallyBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.manualStation(-1);
        int expected = 0;


        assertEquals(expected, actual);

    }
    @Test
    public void  shouldSwitchStationManuallyAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.manualStation(10);
        int expected = 9;


        assertEquals(expected, actual);

    }
}