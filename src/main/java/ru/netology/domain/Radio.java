package ru.netology.domain;

public class Radio {
    private int numberOfRadioStations = 10;
    private final int minRadioStationNumber = 0;
    private final int maxRadioStationNumber = numberOfRadioStations;
    private int currentRadioStation;
    private int numberVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;


    public Radio(int numberOfRadioStations, int currentVolume) {

        this.numberOfRadioStations = numberOfRadioStations;
        this.currentVolume = currentVolume;
    }


    public Radio() {
    }


    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void maxRadioStationNumber() {
        int number = numberOfRadioStations;
        if (currentRadioStation < maxRadioStationNumber) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStationNumber;
        }
    }

    public void MinRadioStationNumber() {
        if (currentRadioStation > minRadioStationNumber) {
            this.currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStationNumber;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStationNumber)
            return;
        if (currentRadioStation < minRadioStationNumber)
            return;
        this.currentRadioStation = currentRadioStation;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;
    }
}
