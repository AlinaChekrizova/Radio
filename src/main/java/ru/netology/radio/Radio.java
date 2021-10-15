package ru.netology.radio;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return 9;
    }

    public int getMinStation() {
        return 0;
    }


    public int nextStation() {
        if (currentStation < getMaxStation()) {
            currentStation = currentStation + 1;
        }
        if (currentStation == getMaxStation()) {
            currentStation = getMinStation();
        }
        return currentStation;
    }

    public int previousStation() {
        if (currentStation > getMinStation()) {
            currentStation = currentStation - 1;
        }
        if (currentStation == getMinStation()) {
            currentStation = getMaxStation();
        }
        return currentStation;
    }
    public int manualStation(int newStation) {
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
}

