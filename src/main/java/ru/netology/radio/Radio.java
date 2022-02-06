package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;

    public int currentVolume;
    public int maxVolume = 100;
    public int minVolume = 0;


    public Radio() {

    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public int getMinStation() {
        return minStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public int getMinVolume() {
        return minVolume;
    }



    public int nextStation() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
            return currentStation;
        }
        if (currentStation == getMaxStation()) {
            currentStation = getMinStation();
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
            return currentStation;
        }
        if (currentStation == getMinStation()) {
            currentStation = getMaxStation();
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
        if (currentVolume == getMinVolume()) {
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


