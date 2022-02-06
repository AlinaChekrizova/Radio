package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetStationCount() {
        Radio radio = new Radio (15);
        assertEquals(14, radio.getMaxStation());
    }
    @Test
    public void shouldSwitchNextStationWithConstructor() {
        Radio radio = new Radio (15);
        radio.setCurrentStation(11);
        assertEquals(12, radio.nextStation());
    }
    @Test
    public void shouldSwitchNextStationToMinWithConstructor() {
        Radio radio = new Radio (15);
        radio.setCurrentStation(15);
        assertEquals(0, radio.nextStation());
    }
    @Test
    public void shouldSwitchNextStationToMaxWithConstructor() {
        Radio radio = new Radio (15);
        radio.setCurrentStation(13);
        assertEquals(14, radio.nextStation());
    }
    @Test
    public void shouldSwitchPreviousStationWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(11);

        assertEquals(10, radio.previousStation());
        assertEquals(10, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMaxWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);

        assertEquals(14, radio.previousStation());
        assertEquals(14, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMinWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(1);

        assertEquals(0, radio.previousStation());
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void  shouldSwitchStationManuallyWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(5);

        assertEquals(13, radio.setCurrentStation(13));
        assertEquals(13, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyBelowMinWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(5);

        assertEquals(0, radio.setCurrentStation(-1));
        assertEquals(0, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyAboveMaxWithConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(5);

        assertEquals(14, radio.setCurrentStation(20));
        assertEquals(14, radio.getCurrentStation());

    }












    @Test
    public void shouldSwitchNextStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        assertEquals(0, radio.nextStation());
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        assertEquals(9, radio.nextStation());
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(6, radio.nextStation());
        assertEquals(6, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        assertEquals(9, radio.previousStation());
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        assertEquals(0, radio.previousStation());
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void shouldSwitchPreviousStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(4, radio.previousStation());
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void  shouldSwitchStationManually() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(9, radio.setCurrentStation(9));
        assertEquals(9, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(0, radio.setCurrentStation(-1));
        assertEquals(0, radio.getCurrentStation());

    }
    @Test
    public void  shouldSwitchStationManuallyAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(9, radio.setCurrentStation(10));
        assertEquals(9, radio.getCurrentStation());

    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        assertEquals(10, radio.increaseVolume());
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        assertEquals(100, radio.increaseVolume());
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        assertEquals(1, radio.decreaseVolume());
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldStayMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        assertEquals(0, radio.decreaseVolume());
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void  shouldSwitchVolumeManually() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        assertEquals(33, radio.setCurrentVolume(33));
        assertEquals(33, radio.getCurrentVolume());

    }
    @Test
    public void  shouldSwitchVolumeManuallyBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        assertEquals(0, radio.setCurrentVolume(-1));
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void  shouldSwitchVolumeManuallyAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        assertEquals(100, radio.setCurrentVolume(110));
        assertEquals(100, radio.getCurrentVolume());
    }
}