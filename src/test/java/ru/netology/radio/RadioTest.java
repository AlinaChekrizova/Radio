package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSwitchNextStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 0;

        int actual = radio.nextStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 9;

        int actual = radio.nextStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 6;

        int actual = radio.nextStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 9;

        int actual = radio.previousStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int expected = 0;

        int actual = radio.previousStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 4;

        int actual = radio.previousStation();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void  shouldSwitchStationManually() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.setCurrentStation(9);
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.setCurrentStation(-1);
        int expected = 0;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.setCurrentStation(10);
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentStation());

    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;

        int actual = radio.increaseVolume();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;

        int actual = radio.increaseVolume();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        int expected = 1;

        int actual = radio.decreaseVolume();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;

        int actual = radio.decreaseVolume();

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void  shouldSwitchVolumeManually() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int actual = radio.setCurrentVolume(9);
        int expected = 9;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());

    }
    @Test
    public void  shouldSwitchVolumeManuallyBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int actual = radio.setCurrentVolume(-1);
        int expected = 0;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    public void  shouldSwitchVolumeManuallyAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int actual = radio.setCurrentVolume(11);
        int expected = 10;

        assertEquals(expected, actual);
        assertEquals(expected, radio.getCurrentVolume());
    }
}