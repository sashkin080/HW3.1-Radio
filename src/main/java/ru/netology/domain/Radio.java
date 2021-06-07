package ru.netology.domain;

public class Radio {
    private final int minRadioStationNumber = 0;
    private final int maxRadioStationNumber = 9;
    private int currentRadioStation;
    private final int minVolume = 0;
    private final int maxVolume = 10;
    private int currentVolume;

    public void maxRadioStationNumber() {
        if (currentRadioStation < maxRadioStationNumber) {
            currentRadioStation = currentRadioStation + 1;
        } else{
            currentRadioStation = minRadioStationNumber;
        }
    }

    public void MinRadioStationNumber() {
        if (currentRadioStation > minRadioStationNumber) {
            this.currentRadioStation = currentRadioStation - 1;
        }else {
            currentRadioStation = maxRadioStationNumber;
        }
    }

    public int getCurrentRadioStation(){
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int currentRadioStation){
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
