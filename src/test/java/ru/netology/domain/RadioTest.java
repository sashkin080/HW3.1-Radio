package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void buttonNextRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation =0;
        int expected = 1;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.maxRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void highButtonNextRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation = 8;
        int expected = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.maxRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void overHighButtonNextRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation =9;
        int expected = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.maxRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    public void buttonPrevRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation = 1;
        int expected = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.MinRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void minButtonPrevRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation =0 ;
        int expected = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.MinRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void overMinButtonPrevRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation =9 ;
        int expected =8;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.MinRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStation());
    }



    @Test
    public void randomButtonRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation = 9;
        int expected = 9;
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void overMaxRandomButtonRadioStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected =0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void overMinRandomButtonRadioStationNumber() {
        Radio radio = new Radio();
        int currentRadioStation = -1;
        int expected =0;
        radio.setCurrentRadioStation(currentRadioStation);
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void buttonHighVolume() {
        Radio radio = new Radio();
        int currentVolume = 0 ;
        int expected = 1;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void maxButtonHighVolume() {
        Radio radio = new Radio();
        int currentVolume = 9 ;
        int expected = 10;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void overMaxButtonHighVolume() {
        Radio radio = new Radio();
        int currentVolume = 10 ;
        int expected = 10;
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    public void minButtonLowVolume() {
        Radio radio = new Radio();
        int currentVolume = 1 ;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void overMinButtonLowVolume() {
        Radio radio = new Radio();
        int currentVolume = 0 ;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void maxButtonLowVolume() {
        Radio radio = new Radio();
        int currentVolume = 10 ;
        int expected = 9;
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setButtonVolume() {
        Radio radio = new Radio();
        int currentVolume = 5 ;
        int expected = 5;
        radio.setCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setOverMaxButtonVolume() {
        Radio radio = new Radio();
        int currentVolume = 11 ;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setButtonOverMinVolume() {
        Radio radio = new Radio();
        int currentVolume = -1 ;
        int expected = 0;
        radio.setCurrentVolume(currentVolume);

        assertEquals(expected, radio.getCurrentVolume());
    }









}