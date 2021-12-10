package ru.netology.radioman;

public class Radio {

    private int quantityStations = 10;
    private int station = quantityStations - 1;
    private int currentStation;
    private int volume;

    public Radio() {
    }

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations;
        this.station = quantityStations - 1;
    }

    public int getStation() {
        return station;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation < station && currentStation >= 0) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
        return;
    }

    public void setPrevStation() {
        if (currentStation <= station && currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        if (currentStation == 0) {
            currentStation = station;
            return;
        } else {
            currentStation = 0;
        }
        return;

    }


    public void setUserStation(int userInstallation) {
        if (userInstallation >= 0 && userInstallation <= station) {
            currentStation = userInstallation;
        } else {
            currentStation = 0;
        }
    }

    public int getVolume() {

        return volume;
    }

    public void setVolume(int volume) {

        this.volume = volume;
    }

    public void setIncreaseVolume() {
        if (volume < 100 && volume >= 0) {
            volume = volume + 1;
            return;
        }
        if (volume == 100) {
            volume = volume;
            return;
        } else {
            volume = 0;
        }
        return;

    }

    public void setLowVolume() {
        if (volume <= 100 && volume > 0) {
            volume = volume - 1;
            return;
        }
        if (volume == 0) {
            volume = volume;
            return;
        } else {
            volume = 0;
        }
        return;
    }
}
