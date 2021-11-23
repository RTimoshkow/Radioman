package ru.netology.radioman;

public class Radio {
    private int quantityStations = 9;
    private int currentStation;
    private int volume;

    public Radio() {

    }

    public Radio(int quantityStations) {

        this.quantityStations = quantityStations;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {

        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation < quantityStations && currentStation >= 0) {
            currentStation = currentStation + 1;
            return;
        } else
            currentStation = 0;
        return;
    }

    public void setPrevStation() {
        if (currentStation <= quantityStations && currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        if (currentStation == 0) {
            currentStation = quantityStations;
            return;
        } else
            currentStation = 0;
        return;

    }


    public void setUserStation(int userInstallation) {
        if (userInstallation >= 0 && userInstallation <= quantityStations) {
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
        } else
            volume = 0;
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
        } else
            volume = 0;
        return;
    }

}
