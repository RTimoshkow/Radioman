package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int newCurrentStation) {
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation == 9 || newCurrentStation < 0 || newCurrentStation > 9) {
            currentStation = 0;
        }
    }

    public void setPrevStation(int newCurrentStation) {
        if (newCurrentStation <= 9 && newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation == 0) {
            currentStation = 9;
        }
        if (newCurrentStation < 0) {
            currentStation = 0;
        }
    }


    public void setUserStation(int userInstallation) {
        if (userInstallation >= 0 && userInstallation <= 9) {
            currentStation = userInstallation;
        } else {
            currentStation = 0;
        }
    }

    public int getVolume(){

        return volume;
    }

    public void setIncreaseVolume(int newVolume) {
        if (newVolume < 10){
            volume = newVolume + 1;
        }
        if (newVolume == 10){
            volume = newVolume;
        }
        if (newVolume > 10 || newVolume < 0){
            volume = 0;
        }
    }

    public void setLowVolume(int newVolume){
        if (newVolume <= 10){
            volume = newVolume - 1;
        }
        if (newVolume == 0){
            volume = newVolume;
        }
        if (newVolume > 10 || newVolume < 0){
            volume = 0;
        }
    }
}
