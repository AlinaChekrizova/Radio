package ru.netology.radio;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMinStation() {
        return 0;
    }

    public int currentVolume;

    public int getCurrentVolume () {
        return currentVolume;
    }

    public int getMaxVolume () {
        return 10;
    }
    public int getMinVolume () {
        return 0;
    }



    public int nextStation() {
        if (currentStation == getMaxStation()) {
            currentStation = getMinStation();
            return currentStation;
        }
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation == getMinStation()) {
            currentStation = getMaxStation();
            return currentStation;
        }
        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }
    public int setCurrentStation(int newStation) {
        if (newStation > getMaxStation()) {
            this.currentStation = getMaxStation();
        }
        if (newStation < getMinStation()) {
            this.currentStation = getMinStation();
        }
        if (newStation >= getMinStation() && newStation <= getMaxStation()) {
            this.currentStation = newStation;
        }
        return this.currentStation;
    }


    /////////////////////////////////////////////


    public int increaseVolume() {
        if (currentVolume < getMaxVolume()) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }
    public int decreaseVolume() {
        if (currentVolume > getMinVolume()) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == getMinStation()) {
            currentVolume = getMinVolume();
        }
        return currentVolume;
    }
    public int setCurrentVolume(int newVolume) {
        if (newVolume > getMaxVolume()) {
            this.currentVolume = getMaxVolume();
        }
        if (newVolume < getMinVolume()) {
            this.currentVolume = getMinVolume();
        }
        if (newVolume >= getMinVolume() && newVolume <= getMaxVolume()) {
            this.currentVolume = newVolume;
        }
        return this.currentVolume;
    }

}


